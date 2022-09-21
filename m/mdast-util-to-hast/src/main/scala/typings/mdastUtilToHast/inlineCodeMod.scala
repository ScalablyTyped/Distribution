package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.InlineCode
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineCodeMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/inline-code", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inlineCode(h: H, node: InlineCode_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineCode")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type InlineCode_ = InlineCode
}
