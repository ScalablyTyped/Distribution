package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Strong
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strongMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/strong", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def strong(h: H, node: Strong_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("strong")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Strong_ = Strong
}
