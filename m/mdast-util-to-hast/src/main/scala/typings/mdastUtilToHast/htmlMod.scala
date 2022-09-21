package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.HTML
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def html(h: H, node: HTML_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type HTML_ = HTML
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
}
