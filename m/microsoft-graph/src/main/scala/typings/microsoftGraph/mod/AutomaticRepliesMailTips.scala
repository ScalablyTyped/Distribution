package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticRepliesMailTips extends StObject {
  
  // The automatic reply message.
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  // The language that the automatic reply message is in.
  var messageLanguage: js.UndefOr[NullableOption[LocaleInfo]] = js.native
  
  // The date and time that automatic replies are set to end.
  var scheduledEndTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The date and time that automatic replies are set to begin.
  var scheduledStartTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
}
object AutomaticRepliesMailTips {
  
  @scala.inline
  def apply(): AutomaticRepliesMailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesMailTips]
  }
  
  @scala.inline
  implicit class AutomaticRepliesMailTipsMutableBuilder[Self <: AutomaticRepliesMailTips] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: NullableOption[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageLanguage(value: NullableOption[LocaleInfo]): Self = StObject.set(x, "messageLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageLanguageNull: Self = StObject.set(x, "messageLanguage", null)
    
    @scala.inline
    def setMessageLanguageUndefined: Self = StObject.set(x, "messageLanguage", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = StObject.set(x, "message", null)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setScheduledEndTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledEndTimeNull: Self = StObject.set(x, "scheduledEndTime", null)
    
    @scala.inline
    def setScheduledEndTimeUndefined: Self = StObject.set(x, "scheduledEndTime", js.undefined)
    
    @scala.inline
    def setScheduledStartTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStartTimeNull: Self = StObject.set(x, "scheduledStartTime", null)
    
    @scala.inline
    def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
  }
}
