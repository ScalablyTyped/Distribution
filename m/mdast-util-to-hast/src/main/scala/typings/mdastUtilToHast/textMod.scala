package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Text
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def text(h: H, node: Text_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Text_ = Text
}
