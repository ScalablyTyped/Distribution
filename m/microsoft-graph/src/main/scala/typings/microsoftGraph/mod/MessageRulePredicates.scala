package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageRulePredicates extends StObject {
  
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
  implicit class MessageRulePredicatesMutableBuilder[Self <: MessageRulePredicates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodyContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "bodyContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyContainsNull: Self = StObject.set(x, "bodyContains", null)
    
    @scala.inline
    def setBodyContainsUndefined: Self = StObject.set(x, "bodyContains", js.undefined)
    
    @scala.inline
    def setBodyContainsVarargs(value: String*): Self = StObject.set(x, "bodyContains", js.Array(value :_*))
    
    @scala.inline
    def setBodyOrSubjectContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "bodyOrSubjectContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyOrSubjectContainsNull: Self = StObject.set(x, "bodyOrSubjectContains", null)
    
    @scala.inline
    def setBodyOrSubjectContainsUndefined: Self = StObject.set(x, "bodyOrSubjectContains", js.undefined)
    
    @scala.inline
    def setBodyOrSubjectContainsVarargs(value: String*): Self = StObject.set(x, "bodyOrSubjectContains", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setFromAddresses(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "fromAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressesNull: Self = StObject.set(x, "fromAddresses", null)
    
    @scala.inline
    def setFromAddressesUndefined: Self = StObject.set(x, "fromAddresses", js.undefined)
    
    @scala.inline
    def setFromAddressesVarargs(value: Recipient*): Self = StObject.set(x, "fromAddresses", js.Array(value :_*))
    
    @scala.inline
    def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    @scala.inline
    def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    @scala.inline
    def setHeaderContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "headerContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderContainsNull: Self = StObject.set(x, "headerContains", null)
    
    @scala.inline
    def setHeaderContainsUndefined: Self = StObject.set(x, "headerContains", js.undefined)
    
    @scala.inline
    def setHeaderContainsVarargs(value: String*): Self = StObject.set(x, "headerContains", js.Array(value :_*))
    
    @scala.inline
    def setImportance(value: NullableOption[Importance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    @scala.inline
    def setIsApprovalRequest(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsApprovalRequestNull: Self = StObject.set(x, "isApprovalRequest", null)
    
    @scala.inline
    def setIsApprovalRequestUndefined: Self = StObject.set(x, "isApprovalRequest", js.undefined)
    
    @scala.inline
    def setIsAutomaticForward(value: NullableOption[Boolean]): Self = StObject.set(x, "isAutomaticForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomaticForwardNull: Self = StObject.set(x, "isAutomaticForward", null)
    
    @scala.inline
    def setIsAutomaticForwardUndefined: Self = StObject.set(x, "isAutomaticForward", js.undefined)
    
    @scala.inline
    def setIsAutomaticReply(value: NullableOption[Boolean]): Self = StObject.set(x, "isAutomaticReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAutomaticReplyNull: Self = StObject.set(x, "isAutomaticReply", null)
    
    @scala.inline
    def setIsAutomaticReplyUndefined: Self = StObject.set(x, "isAutomaticReply", js.undefined)
    
    @scala.inline
    def setIsEncrypted(value: NullableOption[Boolean]): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEncryptedNull: Self = StObject.set(x, "isEncrypted", null)
    
    @scala.inline
    def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    @scala.inline
    def setIsMeetingRequest(value: NullableOption[Boolean]): Self = StObject.set(x, "isMeetingRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeetingRequestNull: Self = StObject.set(x, "isMeetingRequest", null)
    
    @scala.inline
    def setIsMeetingRequestUndefined: Self = StObject.set(x, "isMeetingRequest", js.undefined)
    
    @scala.inline
    def setIsMeetingResponse(value: NullableOption[Boolean]): Self = StObject.set(x, "isMeetingResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeetingResponseNull: Self = StObject.set(x, "isMeetingResponse", null)
    
    @scala.inline
    def setIsMeetingResponseUndefined: Self = StObject.set(x, "isMeetingResponse", js.undefined)
    
    @scala.inline
    def setIsNonDeliveryReport(value: NullableOption[Boolean]): Self = StObject.set(x, "isNonDeliveryReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNonDeliveryReportNull: Self = StObject.set(x, "isNonDeliveryReport", null)
    
    @scala.inline
    def setIsNonDeliveryReportUndefined: Self = StObject.set(x, "isNonDeliveryReport", js.undefined)
    
    @scala.inline
    def setIsPermissionControlled(value: NullableOption[Boolean]): Self = StObject.set(x, "isPermissionControlled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPermissionControlledNull: Self = StObject.set(x, "isPermissionControlled", null)
    
    @scala.inline
    def setIsPermissionControlledUndefined: Self = StObject.set(x, "isPermissionControlled", js.undefined)
    
    @scala.inline
    def setIsReadReceipt(value: NullableOption[Boolean]): Self = StObject.set(x, "isReadReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReadReceiptNull: Self = StObject.set(x, "isReadReceipt", null)
    
    @scala.inline
    def setIsReadReceiptUndefined: Self = StObject.set(x, "isReadReceipt", js.undefined)
    
    @scala.inline
    def setIsSigned(value: NullableOption[Boolean]): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSignedNull: Self = StObject.set(x, "isSigned", null)
    
    @scala.inline
    def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    @scala.inline
    def setIsVoicemail(value: NullableOption[Boolean]): Self = StObject.set(x, "isVoicemail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVoicemailNull: Self = StObject.set(x, "isVoicemail", null)
    
    @scala.inline
    def setIsVoicemailUndefined: Self = StObject.set(x, "isVoicemail", js.undefined)
    
    @scala.inline
    def setMessageActionFlag(value: NullableOption[MessageActionFlag]): Self = StObject.set(x, "messageActionFlag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageActionFlagNull: Self = StObject.set(x, "messageActionFlag", null)
    
    @scala.inline
    def setMessageActionFlagUndefined: Self = StObject.set(x, "messageActionFlag", js.undefined)
    
    @scala.inline
    def setNotSentToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "notSentToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotSentToMeNull: Self = StObject.set(x, "notSentToMe", null)
    
    @scala.inline
    def setNotSentToMeUndefined: Self = StObject.set(x, "notSentToMe", js.undefined)
    
    @scala.inline
    def setRecipientContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "recipientContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientContainsNull: Self = StObject.set(x, "recipientContains", null)
    
    @scala.inline
    def setRecipientContainsUndefined: Self = StObject.set(x, "recipientContains", js.undefined)
    
    @scala.inline
    def setRecipientContainsVarargs(value: String*): Self = StObject.set(x, "recipientContains", js.Array(value :_*))
    
    @scala.inline
    def setSenderContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "senderContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderContainsNull: Self = StObject.set(x, "senderContains", null)
    
    @scala.inline
    def setSenderContainsUndefined: Self = StObject.set(x, "senderContains", js.undefined)
    
    @scala.inline
    def setSenderContainsVarargs(value: String*): Self = StObject.set(x, "senderContains", js.Array(value :_*))
    
    @scala.inline
    def setSensitivity(value: NullableOption[Sensitivity]): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSensitivityNull: Self = StObject.set(x, "sensitivity", null)
    
    @scala.inline
    def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    @scala.inline
    def setSentCcMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentCcMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentCcMeNull: Self = StObject.set(x, "sentCcMe", null)
    
    @scala.inline
    def setSentCcMeUndefined: Self = StObject.set(x, "sentCcMe", js.undefined)
    
    @scala.inline
    def setSentOnlyToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentOnlyToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentOnlyToMeNull: Self = StObject.set(x, "sentOnlyToMe", null)
    
    @scala.inline
    def setSentOnlyToMeUndefined: Self = StObject.set(x, "sentOnlyToMe", js.undefined)
    
    @scala.inline
    def setSentToAddresses(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "sentToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentToAddressesNull: Self = StObject.set(x, "sentToAddresses", null)
    
    @scala.inline
    def setSentToAddressesUndefined: Self = StObject.set(x, "sentToAddresses", js.undefined)
    
    @scala.inline
    def setSentToAddressesVarargs(value: Recipient*): Self = StObject.set(x, "sentToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSentToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentToMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentToMeNull: Self = StObject.set(x, "sentToMe", null)
    
    @scala.inline
    def setSentToMeUndefined: Self = StObject.set(x, "sentToMe", js.undefined)
    
    @scala.inline
    def setSentToOrCcMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentToOrCcMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentToOrCcMeNull: Self = StObject.set(x, "sentToOrCcMe", null)
    
    @scala.inline
    def setSentToOrCcMeUndefined: Self = StObject.set(x, "sentToOrCcMe", js.undefined)
    
    @scala.inline
    def setSubjectContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "subjectContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectContainsNull: Self = StObject.set(x, "subjectContains", null)
    
    @scala.inline
    def setSubjectContainsUndefined: Self = StObject.set(x, "subjectContains", js.undefined)
    
    @scala.inline
    def setSubjectContainsVarargs(value: String*): Self = StObject.set(x, "subjectContains", js.Array(value :_*))
    
    @scala.inline
    def setWithinSizeRange(value: NullableOption[SizeRange]): Self = StObject.set(x, "withinSizeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithinSizeRangeNull: Self = StObject.set(x, "withinSizeRange", null)
    
    @scala.inline
    def setWithinSizeRangeUndefined: Self = StObject.set(x, "withinSizeRange", js.undefined)
  }
}
