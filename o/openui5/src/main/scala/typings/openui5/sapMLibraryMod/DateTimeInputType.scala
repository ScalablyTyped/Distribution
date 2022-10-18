package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DateTimeInputType extends StObject
@JSImport("sap/m/library", "DateTimeInputType")
@js.native
object DateTimeInputType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DateTimeInputType & String] = js.native
  
  /**
    * @deprecated (since 1.22.0) - Instead, use dedicated `sap.m.DatePicker` control.
    *
    * An input control for specifying a date value. The user can select a month, day of the month, and year.
    */
  @js.native
  sealed trait Date
    extends StObject
       with DateTimeInputType
  /* "Date" */ val Date: typings.openui5.sapMLibraryMod.DateTimeInputType.Date & String = js.native
  
  /**
    * @deprecated (since 1.32.8) - Instead, use dedicated `sap.m.DatePicker` and `sap.m.TimePicker` controls.
    *
    * An input control for specifying a date and time value. The user can select a month, day of the month,
    * year, and time of day.
    */
  @js.native
  sealed trait DateTime
    extends StObject
       with DateTimeInputType
  /* "DateTime" */ val DateTime: typings.openui5.sapMLibraryMod.DateTimeInputType.DateTime & String = js.native
  
  /**
    * @deprecated (since 1.32.8) - Instead, use dedicated `sap.m.TimePicker` control.
    *
    * An input control for specifying a time value. The user can select the hour, minute, and optionally AM
    * or PM.
    */
  @js.native
  sealed trait Time
    extends StObject
       with DateTimeInputType
  /* "Time" */ val Time: typings.openui5.sapMLibraryMod.DateTimeInputType.Time & String = js.native
}
