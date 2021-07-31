package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FollowupFlag extends StObject {
  
  // The date and time that the follow-up was finished.
  var completedDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  /**
    * The date and time that the follow up is to be finished. Note: To set the due date, you must also specify the
    * startDateTime; otherwise, you will get a 400 Bad Request response.
    */
  var dueDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
  
  // The status for follow-up for an item. Possible values are notFlagged, complete, and flagged.
  var flagStatus: js.UndefOr[NullableOption[FollowupFlagStatus]] = js.undefined
  
  // The date and time that the follow-up is to begin.
  var startDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.undefined
}
object FollowupFlag {
  
  @scala.inline
  def apply(): FollowupFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FollowupFlag]
  }
  
  @scala.inline
  implicit class FollowupFlagMutableBuilder[Self <: FollowupFlag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeNull: Self = StObject.set(x, "completedDateTime", null)
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setDueDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "dueDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDueDateTimeNull: Self = StObject.set(x, "dueDateTime", null)
    
    @scala.inline
    def setDueDateTimeUndefined: Self = StObject.set(x, "dueDateTime", js.undefined)
    
    @scala.inline
    def setFlagStatus(value: NullableOption[FollowupFlagStatus]): Self = StObject.set(x, "flagStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagStatusNull: Self = StObject.set(x, "flagStatus", null)
    
    @scala.inline
    def setFlagStatusUndefined: Self = StObject.set(x, "flagStatus", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
