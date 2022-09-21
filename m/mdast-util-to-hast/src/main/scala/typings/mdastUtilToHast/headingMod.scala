package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Heading
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headingMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/heading", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def heading(h: H, node: Heading_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("heading")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Heading_ = Heading
}
