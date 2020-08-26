package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailAssessmentRequest extends ThreatAssessmentRequest {
  /**
    * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender,
    * advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox,
    * autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
    */
  var destinationRoutingReason: js.UndefOr[MailDestinationRoutingReason] = js.native
  // The resource URI of the mail message for assessment.
  var messageUri: js.UndefOr[String] = js.native
  // The mail recipient whose policies are used to assess the mail.
  var recipientEmail: js.UndefOr[String] = js.native
}

object MailAssessmentRequest {
  @scala.inline
  def apply(): MailAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailAssessmentRequest]
  }
  @scala.inline
  implicit class MailAssessmentRequestOps[Self <: MailAssessmentRequest] (val x: Self) extends AnyVal {
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
    def setDestinationRoutingReason(value: MailDestinationRoutingReason): Self = this.set("destinationRoutingReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationRoutingReason: Self = this.set("destinationRoutingReason", js.undefined)
    @scala.inline
    def setMessageUri(value: String): Self = this.set("messageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageUri: Self = this.set("messageUri", js.undefined)
    @scala.inline
    def setRecipientEmail(value: String): Self = this.set("recipientEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientEmail: Self = this.set("recipientEmail", js.undefined)
  }
  
}

