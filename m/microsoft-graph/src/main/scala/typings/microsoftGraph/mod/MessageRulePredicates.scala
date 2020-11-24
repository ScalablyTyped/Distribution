package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageRulePredicates extends js.Object {
  
  /**
    * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to
    * apply.
    */
  var bodyContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or
    * exception to apply.
    */
  var bodyOrSubjectContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Represents the categories that an incoming message should be labeled with in order for the condition or exception to
    * apply.
    */
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
  var fromAddresses: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  // Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to
    * apply.
    */
  var headerContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal,
    * high.
    */
  var importance: js.UndefOr[NullableOption[Importance]] = js.native
  
  // Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
  var isApprovalRequest: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
  var isAutomaticForward: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
  var isAutomaticReply: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
  var isEncrypted: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
  var isMeetingRequest: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
  var isMeetingResponse: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
  var isNonDeliveryReport: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or
    * exception to apply.
    */
  var isPermissionControlled: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
  var isReadReceipt: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
  var isSigned: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
  var isVoicemail: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to
    * apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply,
    * replyToAll, review.
    */
  var messageActionFlag: js.UndefOr[NullableOption[MessageActionFlag]] = js.native
  
  /**
    * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or
    * exception to apply.
    */
  var notSentToMe: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in
    * order for the condition or exception to apply.
    */
  var recipientContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Represents the strings that appear in the from property of an incoming message in order for the condition or exception
    * to apply.
    */
  var senderContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to
    * apply. The possible values are: normal, personal, private, confidential.
    */
  var sensitivity: js.UndefOr[NullableOption[Sensitivity]] = js.native
  
  /**
    * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentCcMe: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition
    * or exception to apply.
    */
  var sentOnlyToMe: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception
    * to apply.
    */
  var sentToAddresses: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  /**
    * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentToMe: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming
    * message in order for the condition or exception to apply.
    */
  var sentToOrCcMe: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to
    * apply.
    */
  var subjectContains: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the
    * condition or exception to apply.
    */
  var withinSizeRange: js.UndefOr[NullableOption[SizeRange]] = js.native
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
    def setBodyContains(value: NullableOption[js.Array[String]]): Self = this.set("bodyContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyContains: Self = this.set("bodyContains", js.undefined)
    
    @scala.inline
    def setBodyContainsNull: Self = this.set("bodyContains", null)
    
    @scala.inline
    def setBodyOrSubjectContainsVarargs(value: String*): Self = this.set("bodyOrSubjectContains", js.Array(value :_*))
    
    @scala.inline
    def setBodyOrSubjectContains(value: NullableOption[js.Array[String]]): Self = this.set("bodyOrSubjectContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyOrSubjectContains: Self = this.set("bodyOrSubjectContains", js.undefined)
    
    @scala.inline
    def setBodyOrSubjectContainsNull: Self = this.set("bodyOrSubjectContains", null)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: NullableOption[js.Array[String]]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
    @scala.inline
    def setCategoriesNull: Self = this.set("categories", null)
    
    @scala.inline
    def setFromAddressesVarargs(value: Recipient*): Self = this.set("fromAddresses", js.Array(value :_*))
    
    @scala.inline
    def setFromAddresses(value: NullableOption[js.Array[Recipient]]): Self = this.set("fromAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddresses: Self = this.set("fromAddresses", js.undefined)
    
    @scala.inline
    def setFromAddressesNull: Self = this.set("fromAddresses", null)
    
    @scala.inline
    def setHasAttachments(value: NullableOption[Boolean]): Self = this.set("hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasAttachments: Self = this.set("hasAttachments", js.undefined)
    
    @scala.inline
    def setHasAttachmentsNull: Self = this.set("hasAttachments", null)
    
    @scala.inline
    def setHeaderContainsVarargs(value: String*): Self = this.set("headerContains", js.Array(value :_*))
    
    @scala.inline
    def setHeaderContains(value: NullableOption[js.Array[String]]): Self = this.set("headerContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderContains: Self = this.set("headerContains", js.undefined)
    
    @scala.inline
    def setHeaderContainsNull: Self = this.set("headerContains", null)
    
    @scala.inline
    def setImportance(value: NullableOption[Importance]): Self = this.set("importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportance: Self = this.set("importance", js.undefined)
    
    @scala.inline
    def setImportanceNull: Self = this.set("importance", null)
    
    @scala.inline
    def setIsApprovalRequest(value: NullableOption[Boolean]): Self = this.set("isApprovalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsApprovalRequest: Self = this.set("isApprovalRequest", js.undefined)
    
    @scala.inline
    def setIsApprovalRequestNull: Self = this.set("isApprovalRequest", null)
    
    @scala.inline
    def setIsAutomaticForward(value: NullableOption[Boolean]): Self = this.set("isAutomaticForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAutomaticForward: Self = this.set("isAutomaticForward", js.undefined)
    
    @scala.inline
    def setIsAutomaticForwardNull: Self = this.set("isAutomaticForward", null)
    
    @scala.inline
    def setIsAutomaticReply(value: NullableOption[Boolean]): Self = this.set("isAutomaticReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAutomaticReply: Self = this.set("isAutomaticReply", js.undefined)
    
    @scala.inline
    def setIsAutomaticReplyNull: Self = this.set("isAutomaticReply", null)
    
    @scala.inline
    def setIsEncrypted(value: NullableOption[Boolean]): Self = this.set("isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsEncrypted: Self = this.set("isEncrypted", js.undefined)
    
    @scala.inline
    def setIsEncryptedNull: Self = this.set("isEncrypted", null)
    
    @scala.inline
    def setIsMeetingRequest(value: NullableOption[Boolean]): Self = this.set("isMeetingRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMeetingRequest: Self = this.set("isMeetingRequest", js.undefined)
    
    @scala.inline
    def setIsMeetingRequestNull: Self = this.set("isMeetingRequest", null)
    
    @scala.inline
    def setIsMeetingResponse(value: NullableOption[Boolean]): Self = this.set("isMeetingResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMeetingResponse: Self = this.set("isMeetingResponse", js.undefined)
    
    @scala.inline
    def setIsMeetingResponseNull: Self = this.set("isMeetingResponse", null)
    
    @scala.inline
    def setIsNonDeliveryReport(value: NullableOption[Boolean]): Self = this.set("isNonDeliveryReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsNonDeliveryReport: Self = this.set("isNonDeliveryReport", js.undefined)
    
    @scala.inline
    def setIsNonDeliveryReportNull: Self = this.set("isNonDeliveryReport", null)
    
    @scala.inline
    def setIsPermissionControlled(value: NullableOption[Boolean]): Self = this.set("isPermissionControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPermissionControlled: Self = this.set("isPermissionControlled", js.undefined)
    
    @scala.inline
    def setIsPermissionControlledNull: Self = this.set("isPermissionControlled", null)
    
    @scala.inline
    def setIsReadReceipt(value: NullableOption[Boolean]): Self = this.set("isReadReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadReceipt: Self = this.set("isReadReceipt", js.undefined)
    
    @scala.inline
    def setIsReadReceiptNull: Self = this.set("isReadReceipt", null)
    
    @scala.inline
    def setIsSigned(value: NullableOption[Boolean]): Self = this.set("isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSigned: Self = this.set("isSigned", js.undefined)
    
    @scala.inline
    def setIsSignedNull: Self = this.set("isSigned", null)
    
    @scala.inline
    def setIsVoicemail(value: NullableOption[Boolean]): Self = this.set("isVoicemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVoicemail: Self = this.set("isVoicemail", js.undefined)
    
    @scala.inline
    def setIsVoicemailNull: Self = this.set("isVoicemail", null)
    
    @scala.inline
    def setMessageActionFlag(value: NullableOption[MessageActionFlag]): Self = this.set("messageActionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageActionFlag: Self = this.set("messageActionFlag", js.undefined)
    
    @scala.inline
    def setMessageActionFlagNull: Self = this.set("messageActionFlag", null)
    
    @scala.inline
    def setNotSentToMe(value: NullableOption[Boolean]): Self = this.set("notSentToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotSentToMe: Self = this.set("notSentToMe", js.undefined)
    
    @scala.inline
    def setNotSentToMeNull: Self = this.set("notSentToMe", null)
    
    @scala.inline
    def setRecipientContainsVarargs(value: String*): Self = this.set("recipientContains", js.Array(value :_*))
    
    @scala.inline
    def setRecipientContains(value: NullableOption[js.Array[String]]): Self = this.set("recipientContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientContains: Self = this.set("recipientContains", js.undefined)
    
    @scala.inline
    def setRecipientContainsNull: Self = this.set("recipientContains", null)
    
    @scala.inline
    def setSenderContainsVarargs(value: String*): Self = this.set("senderContains", js.Array(value :_*))
    
    @scala.inline
    def setSenderContains(value: NullableOption[js.Array[String]]): Self = this.set("senderContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderContains: Self = this.set("senderContains", js.undefined)
    
    @scala.inline
    def setSenderContainsNull: Self = this.set("senderContains", null)
    
    @scala.inline
    def setSensitivity(value: NullableOption[Sensitivity]): Self = this.set("sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitivity: Self = this.set("sensitivity", js.undefined)
    
    @scala.inline
    def setSensitivityNull: Self = this.set("sensitivity", null)
    
    @scala.inline
    def setSentCcMe(value: NullableOption[Boolean]): Self = this.set("sentCcMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentCcMe: Self = this.set("sentCcMe", js.undefined)
    
    @scala.inline
    def setSentCcMeNull: Self = this.set("sentCcMe", null)
    
    @scala.inline
    def setSentOnlyToMe(value: NullableOption[Boolean]): Self = this.set("sentOnlyToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentOnlyToMe: Self = this.set("sentOnlyToMe", js.undefined)
    
    @scala.inline
    def setSentOnlyToMeNull: Self = this.set("sentOnlyToMe", null)
    
    @scala.inline
    def setSentToAddressesVarargs(value: Recipient*): Self = this.set("sentToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSentToAddresses(value: NullableOption[js.Array[Recipient]]): Self = this.set("sentToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentToAddresses: Self = this.set("sentToAddresses", js.undefined)
    
    @scala.inline
    def setSentToAddressesNull: Self = this.set("sentToAddresses", null)
    
    @scala.inline
    def setSentToMe(value: NullableOption[Boolean]): Self = this.set("sentToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentToMe: Self = this.set("sentToMe", js.undefined)
    
    @scala.inline
    def setSentToMeNull: Self = this.set("sentToMe", null)
    
    @scala.inline
    def setSentToOrCcMe(value: NullableOption[Boolean]): Self = this.set("sentToOrCcMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentToOrCcMe: Self = this.set("sentToOrCcMe", js.undefined)
    
    @scala.inline
    def setSentToOrCcMeNull: Self = this.set("sentToOrCcMe", null)
    
    @scala.inline
    def setSubjectContainsVarargs(value: String*): Self = this.set("subjectContains", js.Array(value :_*))
    
    @scala.inline
    def setSubjectContains(value: NullableOption[js.Array[String]]): Self = this.set("subjectContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectContains: Self = this.set("subjectContains", js.undefined)
    
    @scala.inline
    def setSubjectContainsNull: Self = this.set("subjectContains", null)
    
    @scala.inline
    def setWithinSizeRange(value: NullableOption[SizeRange]): Self = this.set("withinSizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithinSizeRange: Self = this.set("withinSizeRange", js.undefined)
    
    @scala.inline
    def setWithinSizeRangeNull: Self = this.set("withinSizeRange", null)
  }
}
