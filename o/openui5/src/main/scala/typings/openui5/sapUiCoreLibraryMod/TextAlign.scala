package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlign extends StObject
@JSImport("sap/ui/core/library", "TextAlign")
@js.native
object TextAlign extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextAlign & String] = js.native
  
  /**
    * Locale-specific positioning at the beginning of the line.
    */
  @js.native
  sealed trait Begin
    extends StObject
       with TextAlign
  /* "Begin" */ val Begin: typings.openui5.sapUiCoreLibraryMod.TextAlign.Begin & String = js.native
  
  /**
    * Centered text alignment.
    */
  @js.native
  sealed trait Center
    extends StObject
       with TextAlign
  /* "Center" */ val Center: typings.openui5.sapUiCoreLibraryMod.TextAlign.Center & String = js.native
  
  /**
    * Locale-specific positioning at the end of the line.
    */
  @js.native
  sealed trait End
    extends StObject
       with TextAlign
  /* "End" */ val End: typings.openui5.sapUiCoreLibraryMod.TextAlign.End & String = js.native
  
  /**
    * @since 1.26.0
    *
    * Sets no text align, so the browser default is used.
    */
  @js.native
  sealed trait Initial
    extends StObject
       with TextAlign
  /* "Initial" */ val Initial: typings.openui5.sapUiCoreLibraryMod.TextAlign.Initial & String = js.native
  
  /**
    * Hard option for left alignment.
    */
  @js.native
  sealed trait Left
    extends StObject
       with TextAlign
  /* "Left" */ val Left: typings.openui5.sapUiCoreLibraryMod.TextAlign.Left & String = js.native
  
  /**
    * Hard option for right alignment.
    */
  @js.native
  sealed trait Right
    extends StObject
       with TextAlign
  /* "Right" */ val Right: typings.openui5.sapUiCoreLibraryMod.TextAlign.Right & String = js.native
}
