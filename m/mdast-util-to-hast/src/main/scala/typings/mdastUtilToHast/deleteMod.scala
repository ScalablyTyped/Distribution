package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deleteMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/delete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strikethrough(h: H, node: Delete): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("strikethrough")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Delete = typings.mdast.mod.Delete
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
