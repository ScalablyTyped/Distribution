package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.Days
import typings.officeJs.Office.MailboxEnums.Month
import typings.officeJs.Office.MailboxEnums.WeekNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the properties of the recurrence.
  * 
  * @remarks
  * [Api set: Mailbox 1.7]
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://learn.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Compose or Read
  */
trait RecurrenceProperties extends StObject {
  
  /**
    * Represents the day of the month.
    */
  var dayOfMonth: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the day of the week or type of day, for example, weekend day vs weekday.
    */
  var dayOfWeek: js.UndefOr[Days | String] = js.undefined
  
  /**
    * Represents the set of days for this recurrence. Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var days: js.UndefOr[js.Array[Days | String]] = js.undefined
  
  /**
    * Represents your chosen first day of the week otherwise the default is the value in the current user's settings. 
    * Valid values are: 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', and 'Sun'.
    */
  var firstDayOfWeek: js.UndefOr[Days | String] = js.undefined
  
  /**
    * Represents the period between instances of the same recurring series.
    */
  var interval: Double
  
  /**
    * Represents the month.
    */
  var month: js.UndefOr[Month | String] = js.undefined
  
  /**
    * Represents the number of the week in the selected month e.g., 'first' for first week of the month.
    */
  var weekNumber: js.UndefOr[WeekNumber | String] = js.undefined
}
object RecurrenceProperties {
  
  inline def apply(interval: Double): RecurrenceProperties = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurrenceProperties]
  }
  
  extension [Self <: RecurrenceProperties](x: Self) {
    
    inline def setDayOfMonth(value: Double): Self = StObject.set(x, "dayOfMonth", value.asInstanceOf[js.Any])
    
    inline def setDayOfMonthUndefined: Self = StObject.set(x, "dayOfMonth", js.undefined)
    
    inline def setDayOfWeek(value: Days | String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    inline def setDays(value: js.Array[Days | String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
    
    inline def setDaysVarargs(value: (Days | String)*): Self = StObject.set(x, "days", js.Array(value*))
    
    inline def setFirstDayOfWeek(value: Days | String): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Month | String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    inline def setWeekNumber(value: WeekNumber | String): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
