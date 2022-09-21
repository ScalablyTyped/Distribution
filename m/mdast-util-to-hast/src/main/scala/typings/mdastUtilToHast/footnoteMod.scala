package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Footnote
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footnoteMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/footnote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def footnote(h: H, node: Footnote_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("footnote")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Footnote_ = Footnote
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
