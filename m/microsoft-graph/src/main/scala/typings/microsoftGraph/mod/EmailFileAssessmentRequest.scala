package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailFileAssessmentRequest extends ThreatAssessmentRequest {
  
  // Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored.
  var contentData: js.UndefOr[String] = js.native
  
  /**
    * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender,
    * advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox,
    * autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
    */
  var destinationRoutingReason: js.UndefOr[NullableOption[MailDestinationRoutingReason]] = js.native
  
  // The mail recipient whose policies are used to assess the mail.
  var recipientEmail: js.UndefOr[String] = js.native
}
object EmailFileAssessmentRequest {
  
  @scala.inline
  def apply(): EmailFileAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFileAssessmentRequest]
  }
  
  @scala.inline
  implicit class EmailFileAssessmentRequestOps[Self <: EmailFileAssessmentRequest] (val x: Self) extends AnyVal {
    
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
    def setContentData(value: String): Self = this.set("contentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentData: Self = this.set("contentData", js.undefined)
    
    @scala.inline
    def setDestinationRoutingReason(value: NullableOption[MailDestinationRoutingReason]): Self = this.set("destinationRoutingReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationRoutingReason: Self = this.set("destinationRoutingReason", js.undefined)
    
    @scala.inline
    def setDestinationRoutingReasonNull: Self = this.set("destinationRoutingReason", null)
    
    @scala.inline
    def setRecipientEmail(value: String): Self = this.set("recipientEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientEmail: Self = this.set("recipientEmail", js.undefined)
  }
}
