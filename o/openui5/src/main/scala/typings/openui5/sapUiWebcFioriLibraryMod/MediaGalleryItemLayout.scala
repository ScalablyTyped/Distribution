package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaGalleryItemLayout extends StObject
@JSImport("sap/ui/webc/fiori/library", "MediaGalleryItemLayout")
@js.native
object MediaGalleryItemLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaGalleryItemLayout & String] = js.native
  
  /**
    * Recommended to use when the item contains an image.
    *  When a thumbnail is selected, it makes the corresponding enlarged content appear in a square display
    * area.
    */
  @js.native
  sealed trait Square
    extends StObject
       with MediaGalleryItemLayout
  /* "Square" */ val Square: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryItemLayout.Square & String = js.native
  
  /**
    * Recommended to use when the item contains video content.
    *  When a thumbnail is selected, it makes the corresponding enlarged content appear in a wide display area
    * (stretched to fill all of the available width) for optimal user experiance.
    */
  @js.native
  sealed trait Wide
    extends StObject
       with MediaGalleryItemLayout
  /* "Wide" */ val Wide: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryItemLayout.Wide & String = js.native
}
