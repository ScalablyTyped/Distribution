package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Link
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/link", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def link(h: H, node: Link_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Link_ = Link
  
  type Properties = typings.hast.mod.Properties
}
