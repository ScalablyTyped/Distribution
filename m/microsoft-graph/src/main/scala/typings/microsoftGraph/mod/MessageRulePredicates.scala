package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageRulePredicates extends js.Object {
  /**
    * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to
    * apply.
    */
  var bodyContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or
    * exception to apply.
    */
  var bodyOrSubjectContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the categories that an incoming message should be labeled with in order for the condition or exception to
    * apply.
    */
  var categories: js.UndefOr[js.Array[String]] = js.native
  // Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
  var fromAddresses: js.UndefOr[js.Array[Recipient]] = js.native
  // Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to
    * apply.
    */
  var headerContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal,
    * high.
    */
  var importance: js.UndefOr[Importance] = js.native
  // Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
  var isApprovalRequest: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
  var isAutomaticForward: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
  var isAutomaticReply: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
  var isEncrypted: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
  var isMeetingRequest: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
  var isMeetingResponse: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
  var isNonDeliveryReport: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or
    * exception to apply.
    */
  var isPermissionControlled: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
  var isReadReceipt: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
  var isSigned: js.UndefOr[Boolean] = js.native
  // Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
  var isVoicemail: js.UndefOr[Boolean] = js.native
  /**
    * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to
    * apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply,
    * replyToAll, review.
    */
  var messageActionFlag: js.UndefOr[MessageActionFlag] = js.native
  /**
    * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or
    * exception to apply.
    */
  var notSentToMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in
    * order for the condition or exception to apply.
    */
  var recipientContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the strings that appear in the from property of an incoming message in order for the condition or exception
    * to apply.
    */
  var senderContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to
    * apply. The possible values are: normal, personal, private, confidential.
    */
  var sensitivity: js.UndefOr[Sensitivity] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentCcMe: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition
    * or exception to apply.
    */
  var sentOnlyToMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception
    * to apply.
    */
  var sentToAddresses: js.UndefOr[js.Array[Recipient]] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentToMe: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming
    * message in order for the condition or exception to apply.
    */
  var sentToOrCcMe: js.UndefOr[Boolean] = js.native
  /**
    * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to
    * apply.
    */
  var subjectContains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the
    * condition or exception to apply.
    */
  var withinSizeRange: js.UndefOr[SizeRange] = js.native
}

object MessageRulePredicates {
  @scala.inline
  def apply(): MessageRulePredicates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRulePredicates]
  }
  @scala.inline
  implicit class MessageRulePredicatesOps[Self <: MessageRulePredicates] (val x: Self) extends AnyVal {
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
    def setBodyContainsVarargs(value: String*): Self = this.set("bodyContains", js.Array(value :_*))
    @scala.inline
    def setBodyContains(value: js.Array[String]): Self = this.set("bodyContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyContains: Self = this.set("bodyContains", js.undefined)
    @scala.inline
    def setBodyOrSubjectContainsVarargs(value: String*): Self = this.set("bodyOrSubjectContains", js.Array(value :_*))
    @scala.inline
    def setBodyOrSubjectContains(value: js.Array[String]): Self = this.set("bodyOrSubjectContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyOrSubjectContains: Self = this.set("bodyOrSubjectContains", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setFromAddressesVarargs(value: Recipient*): Self = this.set("fromAddresses", js.Array(value :_*))
    @scala.inline
    def setFromAddresses(value: js.Array[Recipient]): Self = this.set("fromAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromAddresses: Self = this.set("fromAddresses", js.undefined)
    @scala.inline
    def setHasAttachments(value: Boolean): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    @scala.inline
    def setHeaderContainsVarargs(value: String*): Self = this.set("headerContains", js.Array(value :_*))
    @scala.inline
    def setHeaderContains(value: js.Array[String]): Self = this.set("headerContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderContains: Self = this.set("headerContains", js.undefined)
    @scala.inline
    def setImportance(value: Importance): Self = this.set("importance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    @scala.inline
    def setIsApprovalRequest(value: Boolean): Self = this.set("isApprovalRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsApprovalRequest: Self = this.set("isApprovalRequest", js.undefined)
    @scala.inline
    def setIsAutomaticForward(value: Boolean): Self = this.set("isAutomaticForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutomaticForward: Self = this.set("isAutomaticForward", js.undefined)
    @scala.inline
    def setIsAutomaticReply(value: Boolean): Self = this.set("isAutomaticReply", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAutomaticReply: Self = this.set("isAutomaticReply", js.undefined)
    @scala.inline
    def setIsEncrypted(value: Boolean): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    @scala.inline
    def setIsMeetingRequest(value: Boolean): Self = this.set("isMeetingRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMeetingRequest: Self = this.set("isMeetingRequest", js.undefined)
    @scala.inline
    def setIsMeetingResponse(value: Boolean): Self = this.set("isMeetingResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMeetingResponse: Self = this.set("isMeetingResponse", js.undefined)
    @scala.inline
    def setIsNonDeliveryReport(value: Boolean): Self = this.set("isNonDeliveryReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNonDeliveryReport: Self = this.set("isNonDeliveryReport", js.undefined)
    @scala.inline
    def setIsPermissionControlled(value: Boolean): Self = this.set("isPermissionControlled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPermissionControlled: Self = this.set("isPermissionControlled", js.undefined)
    @scala.inline
    def setIsReadReceipt(value: Boolean): Self = this.set("isReadReceipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsReadReceipt: Self = this.set("isReadReceipt", js.undefined)
    @scala.inline
    def setIsSigned(value: Boolean): Self = this.set("isSigned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSigned: Self = this.set("isSigned", js.undefined)
    @scala.inline
    def setIsVoicemail(value: Boolean): Self = this.set("isVoicemail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVoicemail: Self = this.set("isVoicemail", js.undefined)
    @scala.inline
    def setMessageActionFlag(value: MessageActionFlag): Self = this.set("messageActionFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageActionFlag: Self = this.set("messageActionFlag", js.undefined)
    @scala.inline
    def setNotSentToMe(value: Boolean): Self = this.set("notSentToMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotSentToMe: Self = this.set("notSentToMe", js.undefined)
    @scala.inline
    def setRecipientContainsVarargs(value: String*): Self = this.set("recipientContains", js.Array(value :_*))
    @scala.inline
    def setRecipientContains(value: js.Array[String]): Self = this.set("recipientContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientContains: Self = this.set("recipientContains", js.undefined)
    @scala.inline
    def setSenderContainsVarargs(value: String*): Self = this.set("senderContains", js.Array(value :_*))
    @scala.inline
    def setSenderContains(value: js.Array[String]): Self = this.set("senderContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderContains: Self = this.set("senderContains", js.undefined)
    @scala.inline
    def setSensitivity(value: Sensitivity): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    @scala.inline
    def setSentCcMe(value: Boolean): Self = this.set("sentCcMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentCcMe: Self = this.set("sentCcMe", js.undefined)
    @scala.inline
    def setSentOnlyToMe(value: Boolean): Self = this.set("sentOnlyToMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentOnlyToMe: Self = this.set("sentOnlyToMe", js.undefined)
    @scala.inline
    def setSentToAddressesVarargs(value: Recipient*): Self = this.set("sentToAddresses", js.Array(value :_*))
    @scala.inline
    def setSentToAddresses(value: js.Array[Recipient]): Self = this.set("sentToAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentToAddresses: Self = this.set("sentToAddresses", js.undefined)
    @scala.inline
    def setSentToMe(value: Boolean): Self = this.set("sentToMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentToMe: Self = this.set("sentToMe", js.undefined)
    @scala.inline
    def setSentToOrCcMe(value: Boolean): Self = this.set("sentToOrCcMe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentToOrCcMe: Self = this.set("sentToOrCcMe", js.undefined)
    @scala.inline
    def setSubjectContainsVarargs(value: String*): Self = this.set("subjectContains", js.Array(value :_*))
    @scala.inline
    def setSubjectContains(value: js.Array[String]): Self = this.set("subjectContains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubjectContains: Self = this.set("subjectContains", js.undefined)
    @scala.inline
    def setWithinSizeRange(value: SizeRange): Self = this.set("withinSizeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithinSizeRange: Self = this.set("withinSizeRange", js.undefined)
  }
  
}

