package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalendarAppointmentRoundWidth extends StObject
@JSImport("sap/ui/unified/library", "CalendarAppointmentRoundWidth")
@js.native
object CalendarAppointmentRoundWidth extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalendarAppointmentRoundWidth & String] = js.native
  
  /**
    * Visually rounds the appointment to half a column.
    */
  @js.native
  sealed trait HalfColumn
    extends StObject
       with CalendarAppointmentRoundWidth
  /* "HalfColumn" */ val HalfColumn: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentRoundWidth.HalfColumn & String = js.native
  
  /**
    * No rounding is used.
    */
  @js.native
  sealed trait None
    extends StObject
       with CalendarAppointmentRoundWidth
  /* "None" */ val None: typings.openui5.sapUiUnifiedLibraryMod.CalendarAppointmentRoundWidth.None & String = js.native
}
