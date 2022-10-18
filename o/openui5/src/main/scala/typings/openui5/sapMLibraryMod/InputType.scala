package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InputType extends StObject
@JSImport("sap/m/library", "InputType")
@js.native
object InputType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InputType & String] = js.native
  
  /**
    * @deprecated (since 1.9.1) - Please use dedicated {@link sap.m.DatePicker} to create date input.
    *
    * An input control for specifying a date value. The user can select a month, day of the month, and year.
    */
  @js.native
  sealed trait Date
    extends StObject
       with InputType
  /* "Date" */ val Date: typings.openui5.sapMLibraryMod.InputType.Date & String = js.native
  
  /**
    * @deprecated (since 1.9.1) - Please use dedicated {@link sap.m.DateTimePicker} control to create date-time
    * input.
    *
    * An input control for specifying a date and time value. The user can select a month, day of the month,
    * year, and time of day.
    */
  @js.native
  sealed trait Datetime
    extends StObject
       with InputType
  /* "Datetime" */ val Datetime: typings.openui5.sapMLibraryMod.InputType.Datetime & String = js.native
  
  /**
    * @deprecated (since 1.9.1) - Please use dedicated {@link sap.m.DateTimePicker} control create date-time
    * input.
    *
    * An input control for specifying a date and time value where the format depends on the locale.
    */
  @js.native
  sealed trait DatetimeLocale
    extends StObject
       with InputType
  /* "DatetimeLocale" */ val DatetimeLocale: typings.openui5.sapMLibraryMod.InputType.DatetimeLocale & String = js.native
  
  /**
    * A text field for specifying an email address. Brings up a keyboard optimized for email address entry.
    */
  @js.native
  sealed trait Email
    extends StObject
       with InputType
  /* "Email" */ val Email: typings.openui5.sapMLibraryMod.InputType.Email & String = js.native
  
  /**
    * @deprecated (since 1.9.1) - There is no cross-platform support. Please do not use this Input type.
    *
    * An input control for selecting a month.
    */
  @js.native
  sealed trait Month
    extends StObject
       with InputType
  /* "Month" */ val Month: typings.openui5.sapMLibraryMod.InputType.Month & String = js.native
  
  /**
    * A text field for specifying a number. Brings up a number pad keyboard. Specifying an input type of \d*
    * or [0-9]* is equivalent to using this type.
    */
  @js.native
  sealed trait Number
    extends StObject
       with InputType
  /* "Number" */ val Number: typings.openui5.sapMLibraryMod.InputType.Number & String = js.native
  
  /**
    * Password input where the user entry cannot be seen.
    */
  @js.native
  sealed trait Password
    extends StObject
       with InputType
  /* "Password" */ val Password: typings.openui5.sapMLibraryMod.InputType.Password & String = js.native
  
  /**
    * A text field for specifying a phone number. Brings up a phone pad keyboard.
    */
  @js.native
  sealed trait Tel
    extends StObject
       with InputType
  /* "Tel" */ val Tel: typings.openui5.sapMLibraryMod.InputType.Tel & String = js.native
  
  /**
    * default (text)
    */
  @js.native
  sealed trait Text
    extends StObject
       with InputType
  /* "Text" */ val Text: typings.openui5.sapMLibraryMod.InputType.Text & String = js.native
  
  /**
    * @deprecated (since 1.9.1) - Please use dedicated {@link sap.m.TimePicker} control to create time input.
    *
    * An input control for specifying a time value. The user can select the hour, minute, and optionally AM
    * or PM.
    */
  @js.native
  sealed trait Time
    extends StObject
       with InputType
  /* "Time" */ val Time: typings.openui5.sapMLibraryMod.InputType.Time & String = js.native
  
  /**
    * A text field for specifying a URL. Brings up a keyboard optimized for URL entry.
    */
  @js.native
  sealed trait Url
    extends StObject
       with InputType
  /* "Url" */ val Url: typings.openui5.sapMLibraryMod.InputType.Url & String = js.native
  
  /**
    * @deprecated (since 1.9.1) - There is no cross-platform support. Please do not use this Input type.
    *
    * An input control for selecting a week.
    */
  @js.native
  sealed trait Week
    extends StObject
       with InputType
  /* "Week" */ val Week: typings.openui5.sapMLibraryMod.InputType.Week & String = js.native
}
