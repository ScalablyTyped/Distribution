package typings.openui5.sapUiWebcMainLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarSelectionMode extends StObject
@JSImport("sap/ui/webc/main/library", "CalendarSelectionMode")
@js.native
object CalendarSelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalendarSelectionMode & String] = js.native
  
  /**
    * Several dates can be selected
    */
  @js.native
  sealed trait Multiple
    extends StObject
       with CalendarSelectionMode
  /* "Multiple" */ val Multiple: typings.openui5.sapUiWebcMainLibraryMod.CalendarSelectionMode.Multiple & String = js.native
  
  /**
    * A range defined by a start date and an end date can be selected
    */
  @js.native
  sealed trait Range
    extends StObject
       with CalendarSelectionMode
  /* "Range" */ val Range: typings.openui5.sapUiWebcMainLibraryMod.CalendarSelectionMode.Range & String = js.native
  
  /**
    * Only one date can be selected at a time
    */
  @js.native
  sealed trait Single
    extends StObject
       with CalendarSelectionMode
  /* "Single" */ val Single: typings.openui5.sapUiWebcMainLibraryMod.CalendarSelectionMode.Single & String = js.native
}
