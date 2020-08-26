package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailTips extends js.Object {
  // Mail tips for automatic reply if it has been set up by the recipient.
  var automaticReplies: js.UndefOr[AutomaticRepliesMailTips] = js.native
  // A custom mail tip that can be set on the recipient's mailbox.
  var customMailTip: js.UndefOr[String] = js.native
  /**
    * Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders,
    * rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
    */
  var deliveryRestricted: js.UndefOr[Boolean] = js.native
  // The email address of the recipient to get mailtips for.
  var emailAddress: js.UndefOr[EmailAddress] = js.native
  // Errors that occur during the getMailTips action.
  var error: js.UndefOr[MailTipsError] = js.native
  // The number of external members if the recipient is a distribution list.
  var externalMemberCount: js.UndefOr[Double] = js.native
  /**
    * Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list
    * and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a
    * recipient requires approval of the recipient's manager.
    */
  var isModerated: js.UndefOr[Boolean] = js.native
  // The mailbox full status of the recipient.
  var mailboxFull: js.UndefOr[Boolean] = js.native
  // The maximum message size that has been configured for the recipient's organization or mailbox.
  var maxMessageSize: js.UndefOr[Double] = js.native
  /**
    * The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For
    * example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator
    * wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their
    * message may leave the organization, helping them make the correct decisions about wording, tone and content.
    */
  var recipientScope: js.UndefOr[RecipientScopeType] = js.native
  // Recipients suggested based on previous contexts where they appear in the same message.
  var recipientSuggestions: js.UndefOr[js.Array[Recipient]] = js.native
  // The number of members if the recipient is a distribution list.
  var totalMemberCount: js.UndefOr[Double] = js.native
}

object MailTips {
  @scala.inline
  def apply(): MailTips = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MailTips]
  }
  @scala.inline
  implicit class MailTipsOps[Self <: MailTips] (val x: Self) extends AnyVal {
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
    def setAutomaticReplies(value: AutomaticRepliesMailTips): Self = this.set("automaticReplies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticReplies: Self = this.set("automaticReplies", js.undefined)
    @scala.inline
    def setCustomMailTip(value: String): Self = this.set("customMailTip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomMailTip: Self = this.set("customMailTip", js.undefined)
    @scala.inline
    def setDeliveryRestricted(value: Boolean): Self = this.set("deliveryRestricted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryRestricted: Self = this.set("deliveryRestricted", js.undefined)
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    @scala.inline
    def setError(value: MailTipsError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExternalMemberCount(value: Double): Self = this.set("externalMemberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalMemberCount: Self = this.set("externalMemberCount", js.undefined)
    @scala.inline
    def setIsModerated(value: Boolean): Self = this.set("isModerated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsModerated: Self = this.set("isModerated", js.undefined)
    @scala.inline
    def setMailboxFull(value: Boolean): Self = this.set("mailboxFull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailboxFull: Self = this.set("mailboxFull", js.undefined)
    @scala.inline
    def setMaxMessageSize(value: Double): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessageSize: Self = this.set("maxMessageSize", js.undefined)
    @scala.inline
    def setRecipientScope(value: RecipientScopeType): Self = this.set("recipientScope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientScope: Self = this.set("recipientScope", js.undefined)
    @scala.inline
    def setRecipientSuggestionsVarargs(value: Recipient*): Self = this.set("recipientSuggestions", js.Array(value :_*))
    @scala.inline
    def setRecipientSuggestions(value: js.Array[Recipient]): Self = this.set("recipientSuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientSuggestions: Self = this.set("recipientSuggestions", js.undefined)
    @scala.inline
    def setTotalMemberCount(value: Double): Self = this.set("totalMemberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalMemberCount: Self = this.set("totalMemberCount", js.undefined)
  }
  
}

