package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaGalleryMenuHorizontalAlign extends StObject
@JSImport("sap/ui/webc/fiori/library", "MediaGalleryMenuHorizontalAlign")
@js.native
object MediaGalleryMenuHorizontalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaGalleryMenuHorizontalAlign & String] = js.native
  
  /**
    * Displays the menu on the left side of the target.
    */
  @js.native
  sealed trait Left
    extends StObject
       with MediaGalleryMenuHorizontalAlign
  /* "Left" */ val Left: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuHorizontalAlign.Left & String = js.native
  
  /**
    * Displays the menu on the right side of the target.
    */
  @js.native
  sealed trait Right
    extends StObject
       with MediaGalleryMenuHorizontalAlign
  /* "Right" */ val Right: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuHorizontalAlign.Right & String = js.native
}
