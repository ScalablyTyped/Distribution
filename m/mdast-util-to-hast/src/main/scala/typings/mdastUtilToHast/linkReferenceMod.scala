package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.LinkReference
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkReferenceMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/link-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def linkReference(h: H, node: LinkReference_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("linkReference")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type LinkReference_ = LinkReference
  
  type Properties = typings.hast.mod.Properties
}
