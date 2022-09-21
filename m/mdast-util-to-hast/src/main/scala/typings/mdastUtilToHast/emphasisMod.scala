package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Emphasis
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emphasisMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/emphasis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def emphasis(h: H, node: Emphasis_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasis")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Emphasis_ = Emphasis
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
