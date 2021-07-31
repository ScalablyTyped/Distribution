package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShiftActivity extends StObject {
  
  // Customer defined code for the shiftActivity. Required.
  var code: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the shiftActivity. Required.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The end date and time for the shiftActivity. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Required.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the microsoft.graph.user should be paid for the activity during their shift. Required.
  var isPaid: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * The start date and time for the shiftActivity. The Timestamp type represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Required.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var theme: js.UndefOr[ScheduleEntityTheme] = js.undefined
}
object ShiftActivity {
  
  @scala.inline
  def apply(): ShiftActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShiftActivity]
  }
  
  @scala.inline
  implicit class ShiftActivityMutableBuilder[Self <: ShiftActivity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: NullableOption[String]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeNull: Self = StObject.set(x, "code", null)
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setIsPaid(value: NullableOption[Boolean]): Self = StObject.set(x, "isPaid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPaidNull: Self = StObject.set(x, "isPaid", null)
    
    @scala.inline
    def setIsPaidUndefined: Self = StObject.set(x, "isPaid", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    @scala.inline
    def setTheme(value: ScheduleEntityTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
