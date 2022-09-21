package typings.mdastUtilToHast

import typings.hast.mod.ElementContent
import typings.mdast.mod.ImageReference
import typings.mdastUtilToHast.libMod.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageReferenceMod {
  
  @JSImport("mdast-util-to-hast/lib/handlers/image-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageReference(h: H, node: ImageReference_): js.UndefOr[ElementContent | js.Array[ElementContent] | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageReference")(h.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ElementContent | js.Array[ElementContent] | Null]]
  
  type Handler = typings.mdastUtilToHast.libMod.Handler
  
  type ImageReference_ = ImageReference
  
  type Properties = typings.hast.mod.Properties
}
