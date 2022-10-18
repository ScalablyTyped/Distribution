package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarAppointmentHeight extends StObject
@JSImport("sap/ui/unified/library", "CalendarAppointmentHeight")
@js.native
object CalendarAppointmentHeight extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalendarAppointmentHeight & String] = js.native
  
  /**
    * Automatic display mode.
    */
  @js.native
  sealed trait Automatic
    extends StObject
       with CalendarAppointmentHeight
  /* "Automatic" */ val Automatic: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight.Automatic & String = js.native
  
  /**
    * HalfSize display mode.
    */
  @js.native
  sealed trait HalfSize
    extends StObject
       with CalendarAppointmentHeight
  /* "HalfSize" */ val HalfSize: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight.HalfSize & String = js.native
  
  /**
    * Large display mode.
    */
  @js.native
  sealed trait Large
    extends StObject
       with CalendarAppointmentHeight
  /* "Large" */ val Large: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight.Large & String = js.native
  
  /**
    * Regular display mode.
    */
  @js.native
  sealed trait Regular
    extends StObject
       with CalendarAppointmentHeight
  /* "Regular" */ val Regular: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentHeight.Regular & String = js.native
}
