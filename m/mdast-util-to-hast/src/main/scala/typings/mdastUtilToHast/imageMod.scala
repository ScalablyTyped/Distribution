package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.Image
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def image(h: H, node: Image_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("image")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type Image_ = Image
  
  type Properties = typings.hast.mod.Properties
}
