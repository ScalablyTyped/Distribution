package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailTips extends StObject {
  
  // Mail tips for automatic reply if it has been set up by the recipient.
  var automaticReplies: js.UndefOr[NullableOption[AutomaticRepliesMailTips]] = js.native
  
  // A custom mail tip that can be set on the recipient's mailbox.
  var customMailTip: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders,
    * rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
    */
  var deliveryRestricted: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The email address of the recipient to get mailtips for.
  var emailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.native
  
  // Errors that occur during the getMailTips action.
  var error: js.UndefOr[NullableOption[MailTipsError]] = js.native
  
  // The number of external members if the recipient is a distribution list.
  var externalMemberCount: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list
    * and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a
    * recipient requires approval of the recipient's manager.
    */
  var isModerated: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The mailbox full status of the recipient.
  var mailboxFull: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // The maximum message size that has been configured for the recipient's organization or mailbox.
  var maxMessageSize: js.UndefOr[NullableOption[Double]] = js.native
  
  /**
    * The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For
    * example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator
    * wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their
    * message may leave the organization, helping them make the correct decisions about wording, tone and content.
    */
  var recipientScope: js.UndefOr[NullableOption[RecipientScopeType]] = js.native
  
  // Recipients suggested based on previous contexts where they appear in the same message.
  var recipientSuggestions: js.UndefOr[NullableOption[js.Array[Recipient]]] = js.native
  
  // The number of members if the recipient is a distribution list.
  var totalMemberCount: js.UndefOr[NullableOption[Double]] = js.native
}
object MailTips {
  
  @scala.inline
  def apply(): MailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTips]
  }
  
  @scala.inline
  implicit class MailTipsMutableBuilder[Self <: MailTips] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticReplies(value: NullableOption[AutomaticRepliesMailTips]): Self = StObject.set(x, "automaticReplies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticRepliesNull: Self = StObject.set(x, "automaticReplies", null)
    
    @scala.inline
    def setAutomaticRepliesUndefined: Self = StObject.set(x, "automaticReplies", js.undefined)
    
    @scala.inline
    def setCustomMailTip(value: NullableOption[String]): Self = StObject.set(x, "customMailTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMailTipNull: Self = StObject.set(x, "customMailTip", null)
    
    @scala.inline
    def setCustomMailTipUndefined: Self = StObject.set(x, "customMailTip", js.undefined)
    
    @scala.inline
    def setDeliveryRestricted(value: NullableOption[Boolean]): Self = StObject.set(x, "deliveryRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryRestrictedNull: Self = StObject.set(x, "deliveryRestricted", null)
    
    @scala.inline
    def setDeliveryRestrictedUndefined: Self = StObject.set(x, "deliveryRestricted", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setError(value: NullableOption[MailTipsError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExternalMemberCount(value: NullableOption[Double]): Self = StObject.set(x, "externalMemberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalMemberCountNull: Self = StObject.set(x, "externalMemberCount", null)
    
    @scala.inline
    def setExternalMemberCountUndefined: Self = StObject.set(x, "externalMemberCount", js.undefined)
    
    @scala.inline
    def setIsModerated(value: NullableOption[Boolean]): Self = StObject.set(x, "isModerated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsModeratedNull: Self = StObject.set(x, "isModerated", null)
    
    @scala.inline
    def setIsModeratedUndefined: Self = StObject.set(x, "isModerated", js.undefined)
    
    @scala.inline
    def setMailboxFull(value: NullableOption[Boolean]): Self = StObject.set(x, "mailboxFull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailboxFullNull: Self = StObject.set(x, "mailboxFull", null)
    
    @scala.inline
    def setMailboxFullUndefined: Self = StObject.set(x, "mailboxFull", js.undefined)
    
    @scala.inline
    def setMaxMessageSize(value: NullableOption[Double]): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSizeNull: Self = StObject.set(x, "maxMessageSize", null)
    
    @scala.inline
    def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
    
    @scala.inline
    def setRecipientScope(value: NullableOption[RecipientScopeType]): Self = StObject.set(x, "recipientScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientScopeNull: Self = StObject.set(x, "recipientScope", null)
    
    @scala.inline
    def setRecipientScopeUndefined: Self = StObject.set(x, "recipientScope", js.undefined)
    
    @scala.inline
    def setRecipientSuggestions(value: NullableOption[js.Array[Recipient]]): Self = StObject.set(x, "recipientSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSuggestionsNull: Self = StObject.set(x, "recipientSuggestions", null)
    
    @scala.inline
    def setRecipientSuggestionsUndefined: Self = StObject.set(x, "recipientSuggestions", js.undefined)
    
    @scala.inline
    def setRecipientSuggestionsVarargs(value: Recipient*): Self = StObject.set(x, "recipientSuggestions", js.Array(value :_*))
    
    @scala.inline
    def setTotalMemberCount(value: NullableOption[Double]): Self = StObject.set(x, "totalMemberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMemberCountNull: Self = StObject.set(x, "totalMemberCount", null)
    
    @scala.inline
    def setTotalMemberCountUndefined: Self = StObject.set(x, "totalMemberCount", js.undefined)
  }
}
