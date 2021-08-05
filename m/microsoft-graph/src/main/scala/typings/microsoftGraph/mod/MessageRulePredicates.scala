package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageRulePredicates extends StObject {
  
  /**
    * Represents the strings that should appear in the body of an incoming message in order for the condition or exception to
    * apply.
    */
  var bodyContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents the strings that should appear in the body or subject of an incoming message in order for the condition or
    * exception to apply.
    */
  var bodyOrSubjectContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents the categories that an incoming message should be labeled with in order for the condition or exception to
    * apply.
    */
  var categories: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Represents the specific sender email addresses of an incoming message in order for the condition or exception to apply.
  var fromAddresses: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  // Indicates whether an incoming message must have attachments in order for the condition or exception to apply.
  var hasAttachments: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Represents the strings that appear in the headers of an incoming message in order for the condition or exception to
    * apply.
    */
  var headerContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * The importance that is stamped on an incoming message in order for the condition or exception to apply: low, normal,
    * high.
    */
  var importance: js.UndefOr[NullableOption[Importance]] = js.undefined
  
  // Indicates whether an incoming message must be an approval request in order for the condition or exception to apply.
  var isApprovalRequest: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be automatically forwarded in order for the condition or exception to apply.
  var isAutomaticForward: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be an auto reply in order for the condition or exception to apply.
  var isAutomaticReply: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be encrypted in order for the condition or exception to apply.
  var isEncrypted: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be a meeting request in order for the condition or exception to apply.
  var isMeetingRequest: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be a meeting response in order for the condition or exception to apply.
  var isMeetingResponse: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be a non-delivery report in order for the condition or exception to apply.
  var isNonDeliveryReport: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether an incoming message must be permission controlled (RMS-protected) in order for the condition or
    * exception to apply.
    */
  var isPermissionControlled: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be a read receipt in order for the condition or exception to apply.
  var isReadReceipt: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be S/MIME-signed in order for the condition or exception to apply.
  var isSigned: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether an incoming message must be a voice mail in order for the condition or exception to apply.
  var isVoicemail: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Represents the flag-for-action value that appears on an incoming message in order for the condition or exception to
    * apply. The possible values are: any, call, doNotForward, followUp, fyi, forward, noResponseNecessary, read, reply,
    * replyToAll, review.
    */
  var messageActionFlag: js.UndefOr[NullableOption[MessageActionFlag]] = js.undefined
  
  /**
    * Indicates whether the owner of the mailbox must not be a recipient of an incoming message in order for the condition or
    * exception to apply.
    */
  var notSentToMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Represents the strings that appear in either the toRecipients or ccRecipients properties of an incoming message in
    * order for the condition or exception to apply.
    */
  var recipientContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents the strings that appear in the from property of an incoming message in order for the condition or exception
    * to apply.
    */
  var senderContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents the sensitivity level that must be stamped on an incoming message in order for the condition or exception to
    * apply. The possible values are: normal, personal, private, confidential.
    */
  var sensitivity: js.UndefOr[NullableOption[Sensitivity]] = js.undefined
  
  /**
    * Indicates whether the owner of the mailbox must be in the ccRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentCcMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the owner of the mailbox must be the only recipient in an incoming message in order for the condition
    * or exception to apply.
    */
  var sentOnlyToMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Represents the email addresses that an incoming message must have been sent to in order for the condition or exception
    * to apply.
    */
  var sentToAddresses: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.undefined
  
  /**
    * Indicates whether the owner of the mailbox must be in the toRecipients property of an incoming message in order for the
    * condition or exception to apply.
    */
  var sentToMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Indicates whether the owner of the mailbox must be in either a toRecipients or ccRecipients property of an incoming
    * message in order for the condition or exception to apply.
    */
  var sentToOrCcMe: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Represents the strings that appear in the subject of an incoming message in order for the condition or exception to
    * apply.
    */
  var subjectContains: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  /**
    * Represents the minimum and maximum sizes (in kilobytes) that an incoming message must fall in between in order for the
    * condition or exception to apply.
    */
  var withinSizeRange: js.UndefOr[NullableOption[SizeRange]] = js.undefined
}
object MessageRulePredicates {
  
  inline def apply(): MessageRulePredicates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageRulePredicates]
  }
  
  extension [Self <: MessageRulePredicates](x: Self) {
    
    inline def setBodyContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "bodyContains", value.asInstanceOf[js.Any])
    
    inline def setBodyContainsNull: Self = StObject.set(x, "bodyContains", null)
    
    inline def setBodyContainsUndefined: Self = StObject.set(x, "bodyContains", js.undefined)
    
    inline def setBodyContainsVarargs(value: String*): Self = StObject.set(x, "bodyContains", js.Array(value :_*))
    
    inline def setBodyOrSubjectContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "bodyOrSubjectContains", value.asInstanceOf[js.Any])
    
    inline def setBodyOrSubjectContainsNull: Self = StObject.set(x, "bodyOrSubjectContains", null)
    
    inline def setBodyOrSubjectContainsUndefined: Self = StObject.set(x, "bodyOrSubjectContains", js.undefined)
    
    inline def setBodyOrSubjectContainsVarargs(value: String*): Self = StObject.set(x, "bodyOrSubjectContains", js.Array(value :_*))
    
    inline def setCategories(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    inline def setFromAddresses(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "fromAddresses", value.asInstanceOf[js.Any])
    
    inline def setFromAddressesNull: Self = StObject.set(x, "fromAddresses", null)
    
    inline def setFromAddressesUndefined: Self = StObject.set(x, "fromAddresses", js.undefined)
    
    inline def setFromAddressesVarargs(value: Recipient*): Self = StObject.set(x, "fromAddresses", js.Array(value :_*))
    
    inline def setHasAttachments(value: NullableOption[Boolean]): Self = StObject.set(x, "hasAttachments", value.asInstanceOf[js.Any])
    
    inline def setHasAttachmentsNull: Self = StObject.set(x, "hasAttachments", null)
    
    inline def setHasAttachmentsUndefined: Self = StObject.set(x, "hasAttachments", js.undefined)
    
    inline def setHeaderContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "headerContains", value.asInstanceOf[js.Any])
    
    inline def setHeaderContainsNull: Self = StObject.set(x, "headerContains", null)
    
    inline def setHeaderContainsUndefined: Self = StObject.set(x, "headerContains", js.undefined)
    
    inline def setHeaderContainsVarargs(value: String*): Self = StObject.set(x, "headerContains", js.Array(value :_*))
    
    inline def setImportance(value: NullableOption[Importance]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceNull: Self = StObject.set(x, "importance", null)
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
    
    inline def setIsApprovalRequest(value: NullableOption[Boolean]): Self = StObject.set(x, "isApprovalRequest", value.asInstanceOf[js.Any])
    
    inline def setIsApprovalRequestNull: Self = StObject.set(x, "isApprovalRequest", null)
    
    inline def setIsApprovalRequestUndefined: Self = StObject.set(x, "isApprovalRequest", js.undefined)
    
    inline def setIsAutomaticForward(value: NullableOption[Boolean]): Self = StObject.set(x, "isAutomaticForward", value.asInstanceOf[js.Any])
    
    inline def setIsAutomaticForwardNull: Self = StObject.set(x, "isAutomaticForward", null)
    
    inline def setIsAutomaticForwardUndefined: Self = StObject.set(x, "isAutomaticForward", js.undefined)
    
    inline def setIsAutomaticReply(value: NullableOption[Boolean]): Self = StObject.set(x, "isAutomaticReply", value.asInstanceOf[js.Any])
    
    inline def setIsAutomaticReplyNull: Self = StObject.set(x, "isAutomaticReply", null)
    
    inline def setIsAutomaticReplyUndefined: Self = StObject.set(x, "isAutomaticReply", js.undefined)
    
    inline def setIsEncrypted(value: NullableOption[Boolean]): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    inline def setIsEncryptedNull: Self = StObject.set(x, "isEncrypted", null)
    
    inline def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    inline def setIsMeetingRequest(value: NullableOption[Boolean]): Self = StObject.set(x, "isMeetingRequest", value.asInstanceOf[js.Any])
    
    inline def setIsMeetingRequestNull: Self = StObject.set(x, "isMeetingRequest", null)
    
    inline def setIsMeetingRequestUndefined: Self = StObject.set(x, "isMeetingRequest", js.undefined)
    
    inline def setIsMeetingResponse(value: NullableOption[Boolean]): Self = StObject.set(x, "isMeetingResponse", value.asInstanceOf[js.Any])
    
    inline def setIsMeetingResponseNull: Self = StObject.set(x, "isMeetingResponse", null)
    
    inline def setIsMeetingResponseUndefined: Self = StObject.set(x, "isMeetingResponse", js.undefined)
    
    inline def setIsNonDeliveryReport(value: NullableOption[Boolean]): Self = StObject.set(x, "isNonDeliveryReport", value.asInstanceOf[js.Any])
    
    inline def setIsNonDeliveryReportNull: Self = StObject.set(x, "isNonDeliveryReport", null)
    
    inline def setIsNonDeliveryReportUndefined: Self = StObject.set(x, "isNonDeliveryReport", js.undefined)
    
    inline def setIsPermissionControlled(value: NullableOption[Boolean]): Self = StObject.set(x, "isPermissionControlled", value.asInstanceOf[js.Any])
    
    inline def setIsPermissionControlledNull: Self = StObject.set(x, "isPermissionControlled", null)
    
    inline def setIsPermissionControlledUndefined: Self = StObject.set(x, "isPermissionControlled", js.undefined)
    
    inline def setIsReadReceipt(value: NullableOption[Boolean]): Self = StObject.set(x, "isReadReceipt", value.asInstanceOf[js.Any])
    
    inline def setIsReadReceiptNull: Self = StObject.set(x, "isReadReceipt", null)
    
    inline def setIsReadReceiptUndefined: Self = StObject.set(x, "isReadReceipt", js.undefined)
    
    inline def setIsSigned(value: NullableOption[Boolean]): Self = StObject.set(x, "isSigned", value.asInstanceOf[js.Any])
    
    inline def setIsSignedNull: Self = StObject.set(x, "isSigned", null)
    
    inline def setIsSignedUndefined: Self = StObject.set(x, "isSigned", js.undefined)
    
    inline def setIsVoicemail(value: NullableOption[Boolean]): Self = StObject.set(x, "isVoicemail", value.asInstanceOf[js.Any])
    
    inline def setIsVoicemailNull: Self = StObject.set(x, "isVoicemail", null)
    
    inline def setIsVoicemailUndefined: Self = StObject.set(x, "isVoicemail", js.undefined)
    
    inline def setMessageActionFlag(value: NullableOption[MessageActionFlag]): Self = StObject.set(x, "messageActionFlag", value.asInstanceOf[js.Any])
    
    inline def setMessageActionFlagNull: Self = StObject.set(x, "messageActionFlag", null)
    
    inline def setMessageActionFlagUndefined: Self = StObject.set(x, "messageActionFlag", js.undefined)
    
    inline def setNotSentToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "notSentToMe", value.asInstanceOf[js.Any])
    
    inline def setNotSentToMeNull: Self = StObject.set(x, "notSentToMe", null)
    
    inline def setNotSentToMeUndefined: Self = StObject.set(x, "notSentToMe", js.undefined)
    
    inline def setRecipientContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "recipientContains", value.asInstanceOf[js.Any])
    
    inline def setRecipientContainsNull: Self = StObject.set(x, "recipientContains", null)
    
    inline def setRecipientContainsUndefined: Self = StObject.set(x, "recipientContains", js.undefined)
    
    inline def setRecipientContainsVarargs(value: String*): Self = StObject.set(x, "recipientContains", js.Array(value :_*))
    
    inline def setSenderContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "senderContains", value.asInstanceOf[js.Any])
    
    inline def setSenderContainsNull: Self = StObject.set(x, "senderContains", null)
    
    inline def setSenderContainsUndefined: Self = StObject.set(x, "senderContains", js.undefined)
    
    inline def setSenderContainsVarargs(value: String*): Self = StObject.set(x, "senderContains", js.Array(value :_*))
    
    inline def setSensitivity(value: NullableOption[Sensitivity]): Self = StObject.set(x, "sensitivity", value.asInstanceOf[js.Any])
    
    inline def setSensitivityNull: Self = StObject.set(x, "sensitivity", null)
    
    inline def setSensitivityUndefined: Self = StObject.set(x, "sensitivity", js.undefined)
    
    inline def setSentCcMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentCcMe", value.asInstanceOf[js.Any])
    
    inline def setSentCcMeNull: Self = StObject.set(x, "sentCcMe", null)
    
    inline def setSentCcMeUndefined: Self = StObject.set(x, "sentCcMe", js.undefined)
    
    inline def setSentOnlyToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentOnlyToMe", value.asInstanceOf[js.Any])
    
    inline def setSentOnlyToMeNull: Self = StObject.set(x, "sentOnlyToMe", null)
    
    inline def setSentOnlyToMeUndefined: Self = StObject.set(x, "sentOnlyToMe", js.undefined)
    
    inline def setSentToAddresses(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "sentToAddresses", value.asInstanceOf[js.Any])
    
    inline def setSentToAddressesNull: Self = StObject.set(x, "sentToAddresses", null)
    
    inline def setSentToAddressesUndefined: Self = StObject.set(x, "sentToAddresses", js.undefined)
    
    inline def setSentToAddressesVarargs(value: Recipient*): Self = StObject.set(x, "sentToAddresses", js.Array(value :_*))
    
    inline def setSentToMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentToMe", value.asInstanceOf[js.Any])
    
    inline def setSentToMeNull: Self = StObject.set(x, "sentToMe", null)
    
    inline def setSentToMeUndefined: Self = StObject.set(x, "sentToMe", js.undefined)
    
    inline def setSentToOrCcMe(value: NullableOption[Boolean]): Self = StObject.set(x, "sentToOrCcMe", value.asInstanceOf[js.Any])
    
    inline def setSentToOrCcMeNull: Self = StObject.set(x, "sentToOrCcMe", null)
    
    inline def setSentToOrCcMeUndefined: Self = StObject.set(x, "sentToOrCcMe", js.undefined)
    
    inline def setSubjectContains(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "subjectContains", value.asInstanceOf[js.Any])
    
    inline def setSubjectContainsNull: Self = StObject.set(x, "subjectContains", null)
    
    inline def setSubjectContainsUndefined: Self = StObject.set(x, "subjectContains", js.undefined)
    
    inline def setSubjectContainsVarargs(value: String*): Self = StObject.set(x, "subjectContains", js.Array(value :_*))
    
    inline def setWithinSizeRange(value: NullableOption[SizeRange]): Self = StObject.set(x, "withinSizeRange", value.asInstanceOf[js.Any])
    
    inline def setWithinSizeRangeNull: Self = StObject.set(x, "withinSizeRange", null)
    
    inline def setWithinSizeRangeUndefined: Self = StObject.set(x, "withinSizeRange", js.undefined)
  }
}
