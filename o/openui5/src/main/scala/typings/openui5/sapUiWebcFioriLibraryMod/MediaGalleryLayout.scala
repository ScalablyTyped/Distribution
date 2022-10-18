package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaGalleryLayout extends StObject
@JSImport("sap/ui/webc/fiori/library", "MediaGalleryLayout")
@js.native
object MediaGalleryLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaGalleryLayout & String] = js.native
  
  /**
    * The layout is determined automatically.
    */
  @js.native
  sealed trait Auto
    extends StObject
       with MediaGalleryLayout
  /* "Auto" */ val Auto: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryLayout.Auto & String = js.native
  
  /**
    * Displays the layout as a horizontal split between the thumbnails list and the selected image.
    */
  @js.native
  sealed trait Horizontal
    extends StObject
       with MediaGalleryLayout
  /* "Horizontal" */ val Horizontal: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryLayout.Horizontal & String = js.native
  
  /**
    * Displays the layout as a vertical split between the thumbnails list and the selected image.
    */
  @js.native
  sealed trait Vertical
    extends StObject
       with MediaGalleryLayout
  /* "Vertical" */ val Vertical: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryLayout.Vertical & String = js.native
}
