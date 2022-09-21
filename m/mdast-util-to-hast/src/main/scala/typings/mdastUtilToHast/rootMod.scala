package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Root
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/root", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def root(h: H, node: Root_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("root")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Root_ = Root
}
