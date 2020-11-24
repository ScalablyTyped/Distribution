package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutomaticRepliesSetting extends js.Object {
  
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
  implicit class AutomaticRepliesSettingOps[Self <: AutomaticRepliesSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExternalAudience(value: NullableOption[ExternalAudienceScope]): Self = this.set("externalAudience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAudience: Self = this.set("externalAudience", js.undefined)
    
    @scala.inline
    def setExternalAudienceNull: Self = this.set("externalAudience", null)
    
    @scala.inline
    def setExternalReplyMessage(value: NullableOption[String]): Self = this.set("externalReplyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalReplyMessage: Self = this.set("externalReplyMessage", js.undefined)
    
    @scala.inline
    def setExternalReplyMessageNull: Self = this.set("externalReplyMessage", null)
    
    @scala.inline
    def setInternalReplyMessage(value: NullableOption[String]): Self = this.set("internalReplyMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalReplyMessage: Self = this.set("internalReplyMessage", js.undefined)
    
    @scala.inline
    def setInternalReplyMessageNull: Self = this.set("internalReplyMessage", null)
    
    @scala.inline
    def setScheduledEndDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("scheduledEndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledEndDateTime: Self = this.set("scheduledEndDateTime", js.undefined)
    
    @scala.inline
    def setScheduledEndDateTimeNull: Self = this.set("scheduledEndDateTime", null)
    
    @scala.inline
    def setScheduledStartDateTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("scheduledStartDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledStartDateTime: Self = this.set("scheduledStartDateTime", js.undefined)
    
    @scala.inline
    def setScheduledStartDateTimeNull: Self = this.set("scheduledStartDateTime", null)
    
    @scala.inline
    def setStatus(value: NullableOption[AutomaticRepliesStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
