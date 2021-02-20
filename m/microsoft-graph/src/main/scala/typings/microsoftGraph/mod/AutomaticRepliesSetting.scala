package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticRepliesSetting extends StObject {
  
  /**
    * The set of audience external to the signed-in user's organization who will receive the ExternalReplyMessage, if Status
    * is AlwaysEnabled or Scheduled. The possible values are: none, contactsOnly, all.
    */
  var externalAudience: js.UndefOr[NullableOption[ExternalAudienceScope]] = js.native
  
  // The automatic reply to send to the specified external audience, if Status is AlwaysEnabled or Scheduled.
  var externalReplyMessage: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The automatic reply to send to the audience internal to the signed-in user's organization, if Status is AlwaysEnabled
    * or Scheduled.
    */
  var internalReplyMessage: js.UndefOr[NullableOption[String]] = js.native
  
  // The date and time that automatic replies are set to end, if Status is set to Scheduled.
  var scheduledEndDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The date and time that automatic replies are set to begin, if Status is set to Scheduled.
  var scheduledStartDateTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // Configurations status for automatic replies. The possible values are: disabled, alwaysEnabled, scheduled.
  var status: js.UndefOr[NullableOption[AutomaticRepliesStatus]] = js.native
}
object AutomaticRepliesSetting {
  
  @scala.inline
  def apply(): AutomaticRepliesSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutomaticRepliesSetting]
  }
  
  @scala.inline
  implicit class AutomaticRepliesSettingMutableBuilder[Self <: AutomaticRepliesSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalAudience(value: NullableOption[ExternalAudienceScope]): Self = StObject.set(x, "externalAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalAudienceNull: Self = StObject.set(x, "externalAudience", null)
    
    @scala.inline
    def setExternalAudienceUndefined: Self = StObject.set(x, "externalAudience", js.undefined)
    
    @scala.inline
    def setExternalReplyMessage(value: NullableOption[String]): Self = StObject.set(x, "externalReplyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalReplyMessageNull: Self = StObject.set(x, "externalReplyMessage", null)
    
    @scala.inline
    def setExternalReplyMessageUndefined: Self = StObject.set(x, "externalReplyMessage", js.undefined)
    
    @scala.inline
    def setInternalReplyMessage(value: NullableOption[String]): Self = StObject.set(x, "internalReplyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInternalReplyMessageNull: Self = StObject.set(x, "internalReplyMessage", null)
    
    @scala.inline
    def setInternalReplyMessageUndefined: Self = StObject.set(x, "internalReplyMessage", js.undefined)
    
    @scala.inline
    def setScheduledEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledEndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledEndDateTimeNull: Self = StObject.set(x, "scheduledEndDateTime", null)
    
    @scala.inline
    def setScheduledEndDateTimeUndefined: Self = StObject.set(x, "scheduledEndDateTime", js.undefined)
    
    @scala.inline
    def setScheduledStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = StObject.set(x, "scheduledStartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStartDateTimeNull: Self = StObject.set(x, "scheduledStartDateTime", null)
    
    @scala.inline
    def setScheduledStartDateTimeUndefined: Self = StObject.set(x, "scheduledStartDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[AutomaticRepliesStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
