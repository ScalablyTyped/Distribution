package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a date and time in the local client's time zone. Read mode only.
  *
  * @remarks
  *
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
trait LocalClientTime extends StObject {
  
  /**
    * Integer value representing the day of the month.
    */
  var date: Double
  
  /**
    * Integer value representing the hour on a 24-hour clock.
    */
  var hours: Double
  
  /**
    * Integer value representing the milliseconds.
    */
  var milliseconds: Double
  
  /**
    * Integer value representing the minutes.
    */
  var minutes: Double
  
  /**
    * Integer value representing the month, beginning with 0 for January to 11 for December.
    */
  var month: Double
  
  /**
    * Integer value representing the seconds.
    */
  var seconds: Double
  
  /**
    * Integer value representing the number of minutes difference between the local time zone and UTC.
    */
  var timezoneOffset: Double
  
  /**
    * Integer value representing the year.
    */
  var year: Double
}
object LocalClientTime {
  
  inline def apply(
    date: Double,
    hours: Double,
    milliseconds: Double,
    minutes: Double,
    month: Double,
    seconds: Double,
    timezoneOffset: Double,
    year: Double
  ): LocalClientTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], milliseconds = milliseconds.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], timezoneOffset = timezoneOffset.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalClientTime]
  }
  
  extension [Self <: LocalClientTime](x: Self) {
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffset(value: Double): Self = StObject.set(x, "timezoneOffset", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
