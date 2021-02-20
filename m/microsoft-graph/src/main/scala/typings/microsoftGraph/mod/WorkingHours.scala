package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkingHours extends StObject {
  
  // The days of the week on which the user works.
  var daysOfWeek: js.UndefOr[NullableOption[js.Array[DayOfWeek]]] = js.native
  
  // The time of the day that the user stops working.
  var endTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The time of the day that the user starts working.
  var startTime: js.UndefOr[NullableOption[String]] = js.native
  
  // The time zone to which the working hours apply.
  var timeZone: js.UndefOr[NullableOption[TimeZoneBase]] = js.native
}
object WorkingHours {
  
  @scala.inline
  def apply(): WorkingHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkingHours]
  }
  
  @scala.inline
  implicit class WorkingHoursMutableBuilder[Self <: WorkingHours] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaysOfWeek(value: NullableOption[js.Array[DayOfWeek]]): Self = StObject.set(x, "daysOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaysOfWeekNull: Self = StObject.set(x, "daysOfWeek", null)
    
    @scala.inline
    def setDaysOfWeekUndefined: Self = StObject.set(x, "daysOfWeek", js.undefined)
    
    @scala.inline
    def setDaysOfWeekVarargs(value: DayOfWeek*): Self = StObject.set(x, "daysOfWeek", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: NullableOption[String]): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: NullableOption[String]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTimeZone(value: NullableOption[TimeZoneBase]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
