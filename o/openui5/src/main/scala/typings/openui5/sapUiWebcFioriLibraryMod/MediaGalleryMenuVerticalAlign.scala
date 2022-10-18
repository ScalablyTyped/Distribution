package typings.openui5.sapUiWebcFioriLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaGalleryMenuVerticalAlign extends StObject
@JSImport("sap/ui/webc/fiori/library", "MediaGalleryMenuVerticalAlign")
@js.native
object MediaGalleryMenuVerticalAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MediaGalleryMenuVerticalAlign & String] = js.native
  
  /**
    * Displays the menu at the bottom of the reference control.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with MediaGalleryMenuVerticalAlign
  /* "Bottom" */ val Bottom: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuVerticalAlign.Bottom & String = js.native
  
  /**
    * Displays the menu at the top of the reference control.
    */
  @js.native
  sealed trait Top
    extends StObject
       with MediaGalleryMenuVerticalAlign
  /* "Top" */ val Top: typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryMenuVerticalAlign.Top & String = js.native
}
