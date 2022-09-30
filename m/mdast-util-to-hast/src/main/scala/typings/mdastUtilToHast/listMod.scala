package typings.mdastUtilToHast

import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def list(h: H, node: List_): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[Element]
  
  type Element = typings.hast.mod.Element
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type List_ = typings.mdast.mod.List
  
  type Properties = typings.hast.mod.Properties
}
