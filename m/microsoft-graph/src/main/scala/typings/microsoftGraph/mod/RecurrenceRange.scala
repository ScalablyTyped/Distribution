package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecurrenceRange extends StObject {
  
  /**
    * The date to stop applying the recurrence pattern. Depending on the recurrence pattern of the event, the last occurrence
    * of the meeting may not be this date. Required if type is endDate.
    */
  var endDate: js.UndefOr[NullableOption[String]] = js.native
  
  // The number of times to repeat the event. Required and must be positive if type is numbered.
  var numberOfOccurrences: js.UndefOr[Double] = js.native
  
  // Time zone for the startDate and endDate properties. Optional. If not specified, the time zone of the event is used.
  var recurrenceTimeZone: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date to start applying the recurrence pattern. The first occurrence of the meeting may be this date or later,
    * depending on the recurrence pattern of the event. Must be the same value as the start property of the recurring event.
    * Required.
    */
  var startDate: js.UndefOr[NullableOption[String]] = js.native
  
  // The recurrence range. The possible values are: endDate, noEnd, numbered. Required.
  var `type`: js.UndefOr[NullableOption[RecurrenceRangeType]] = js.native
}
object RecurrenceRange {
  
  @scala.inline
  def apply(): RecurrenceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecurrenceRange]
  }
  
  @scala.inline
  implicit class RecurrenceRangeMutableBuilder[Self <: RecurrenceRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndDate(value: NullableOption[String]): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setNumberOfOccurrences(value: Double): Self = StObject.set(x, "numberOfOccurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfOccurrencesUndefined: Self = StObject.set(x, "numberOfOccurrences", js.undefined)
    
    @scala.inline
    def setRecurrenceTimeZone(value: NullableOption[String]): Self = StObject.set(x, "recurrenceTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecurrenceTimeZoneNull: Self = StObject.set(x, "recurrenceTimeZone", null)
    
    @scala.inline
    def setRecurrenceTimeZoneUndefined: Self = StObject.set(x, "recurrenceTimeZone", js.undefined)
    
    @scala.inline
    def setStartDate(value: NullableOption[String]): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setType(value: NullableOption[RecurrenceRangeType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
