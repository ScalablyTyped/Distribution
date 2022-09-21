package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Blockquote
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blockquoteMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/blockquote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blockquote(h: H, node: Blockquote_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("blockquote")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Blockquote_ = Blockquote
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
