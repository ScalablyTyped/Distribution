package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Code
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def code(h: H, node: Code_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("code")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Code_ = Code
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Properties = typings.hast.mod.Properties
}
