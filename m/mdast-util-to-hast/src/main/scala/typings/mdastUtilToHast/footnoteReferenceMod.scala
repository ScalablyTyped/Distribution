package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.FootnoteReference
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footnoteReferenceMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/footnote-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def footnoteReference(h: H, node: FootnoteReference_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("footnoteReference")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type FootnoteReference_ = FootnoteReference
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
