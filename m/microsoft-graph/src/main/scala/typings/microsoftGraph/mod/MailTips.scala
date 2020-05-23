package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MailTips extends js.Object {
  // Mail tips for automatic reply if it has been set up by the recipient.
  var automaticReplies: js.UndefOr[AutomaticRepliesMailTips] = js.undefined
  // A custom mail tip that can be set on the recipient's mailbox.
  var customMailTip: js.UndefOr[String] = js.undefined
  /**
    * Whether the recipient's mailbox is restricted, for example, accepting messages from only a predefined list of senders,
    * rejecting messages from a predefined list of senders, or accepting messages from only authenticated senders.
    */
  var deliveryRestricted: js.UndefOr[Boolean] = js.undefined
  // The email address of the recipient to get mailtips for.
  var emailAddress: js.UndefOr[EmailAddress] = js.undefined
  // Errors that occur during the getMailTips action.
  var error: js.UndefOr[MailTipsError] = js.undefined
  // The number of external members if the recipient is a distribution list.
  var externalMemberCount: js.UndefOr[Double] = js.undefined
  /**
    * Whether sending messages to the recipient requires approval. For example, if the recipient is a large distribution list
    * and a moderator has been set up to approve messages sent to that distribution list, or if sending messages to a
    * recipient requires approval of the recipient's manager.
    */
  var isModerated: js.UndefOr[Boolean] = js.undefined
  // The mailbox full status of the recipient.
  var mailboxFull: js.UndefOr[Boolean] = js.undefined
  // The maximum message size that has been configured for the recipient's organization or mailbox.
  var maxMessageSize: js.UndefOr[Double] = js.undefined
  /**
    * The scope of the recipient. Possible values are: none, internal, external, externalPartner, externalNonParther. For
    * example, an administrator can set another organization to be its 'partner'. The scope is useful if an administrator
    * wants certain mailtips to be accessible to certain scopes. It's also useful to senders to inform them that their
    * message may leave the organization, helping them make the correct decisions about wording, tone and content.
    */
  var recipientScope: js.UndefOr[RecipientScopeType] = js.undefined
  // Recipients suggested based on previous contexts where they appear in the same message.
  var recipientSuggestions: js.UndefOr[js.Array[Recipient]] = js.undefined
  // The number of members if the recipient is a distribution list.
  var totalMemberCount: js.UndefOr[Double] = js.undefined
}

object MailTips {
  @scala.inline
  def apply(
    automaticReplies: AutomaticRepliesMailTips = null,
    customMailTip: String = null,
    deliveryRestricted: js.UndefOr[Boolean] = js.undefined,
    emailAddress: EmailAddress = null,
    error: MailTipsError = null,
    externalMemberCount: js.UndefOr[Double] = js.undefined,
    isModerated: js.UndefOr[Boolean] = js.undefined,
    mailboxFull: js.UndefOr[Boolean] = js.undefined,
    maxMessageSize: js.UndefOr[Double] = js.undefined,
    recipientScope: RecipientScopeType = null,
    recipientSuggestions: js.Array[Recipient] = null,
    totalMemberCount: js.UndefOr[Double] = js.undefined
  ): MailTips = {
    val __obj = js.Dynamic.literal()
    if (automaticReplies != null) __obj.updateDynamic("automaticReplies")(automaticReplies.asInstanceOf[js.Any])
    if (customMailTip != null) __obj.updateDynamic("customMailTip")(customMailTip.asInstanceOf[js.Any])
    if (!js.isUndefined(deliveryRestricted)) __obj.updateDynamic("deliveryRestricted")(deliveryRestricted.get.asInstanceOf[js.Any])
    if (emailAddress != null) __obj.updateDynamic("emailAddress")(emailAddress.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(externalMemberCount)) __obj.updateDynamic("externalMemberCount")(externalMemberCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isModerated)) __obj.updateDynamic("isModerated")(isModerated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mailboxFull)) __obj.updateDynamic("mailboxFull")(mailboxFull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessageSize)) __obj.updateDynamic("maxMessageSize")(maxMessageSize.get.asInstanceOf[js.Any])
    if (recipientScope != null) __obj.updateDynamic("recipientScope")(recipientScope.asInstanceOf[js.Any])
    if (recipientSuggestions != null) __obj.updateDynamic("recipientSuggestions")(recipientSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(totalMemberCount)) __obj.updateDynamic("totalMemberCount")(totalMemberCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailTips]
  }
}

