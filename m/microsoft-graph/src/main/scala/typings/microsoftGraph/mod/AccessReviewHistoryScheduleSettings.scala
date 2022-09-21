package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewHistoryScheduleSettings extends StObject {
  
  /**
    * Detailed settings for recurrence using the standard Outlook recurrence object. Note: Only dayOfMonth, interval, and
    * type (weekly, absoluteMonthly) properties are supported. Use the property startDate on recurrenceRange to determine the
    * day the review starts. Required.
    */
  var recurrence: js.UndefOr[PatternedRecurrence] = js.undefined
  
  /**
    * A duration string in ISO 8601 duration format specifying the lookback period of the generated review history data. For
    * example, if a history definition is scheduled to run on the 1st of every month, the reportRange is P1M. In this case,
    * on the first of every month, access review history data will be collected containing only the previous month's review
    * data. Note: Only years, months, and days ISO 8601 properties are supported. Required.
    */
  var reportRange: js.UndefOr[String] = js.undefined
}
object AccessReviewHistoryScheduleSettings {
  
  inline def apply(): AccessReviewHistoryScheduleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewHistoryScheduleSettings]
  }
  
  extension [Self <: AccessReviewHistoryScheduleSettings](x: Self) {
    
    inline def setRecurrence(value: PatternedRecurrence): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
    
    inline def setReportRange(value: String): Self = StObject.set(x, "reportRange", value.asInstanceOf[js.Any])
    
    inline def setReportRangeUndefined: Self = StObject.set(x, "reportRange", js.undefined)
  }
}
