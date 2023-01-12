package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailFileAssessmentRequest
  extends StObject
     with ThreatAssessmentRequest {
  
  // Base64 encoded .eml email file content. The file content cannot fetch back because it isn't stored.
  var contentData: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for mail routed to its destination. Possible values are: none, mailFlowRule, safeSender, blockedSender,
    * advancedSpamFiltering, domainAllowList, domainBlockList, notInAddressBook, firstTimeSender, autoPurgeToInbox,
    * autoPurgeToJunk, autoPurgeToDeleted, outbound, notJunk, junk.
    */
  var destinationRoutingReason: js.UndefOr[NullableOption[MailDestinationRoutingReason]] = js.undefined
  
  // The mail recipient whose policies are used to assess the mail.
  var recipientEmail: js.UndefOr[String] = js.undefined
}
object EmailFileAssessmentRequest {
  
  inline def apply(): EmailFileAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailFileAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailFileAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setContentData(value: String): Self = StObject.set(x, "contentData", value.asInstanceOf[js.Any])
    
    inline def setContentDataUndefined: Self = StObject.set(x, "contentData", js.undefined)
    
    inline def setDestinationRoutingReason(value: NullableOption[MailDestinationRoutingReason]): Self = StObject.set(x, "destinationRoutingReason", value.asInstanceOf[js.Any])
    
    inline def setDestinationRoutingReasonNull: Self = StObject.set(x, "destinationRoutingReason", null)
    
    inline def setDestinationRoutingReasonUndefined: Self = StObject.set(x, "destinationRoutingReason", js.undefined)
    
    inline def setRecipientEmail(value: String): Self = StObject.set(x, "recipientEmail", value.asInstanceOf[js.Any])
    
    inline def setRecipientEmailUndefined: Self = StObject.set(x, "recipientEmail", js.undefined)
  }
}
