package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends Entity {
  // The URL user can use to redeem his invitation. Read-Only
  var inviteRedeemUrl: js.UndefOr[String] = js.undefined
  // The URL user should be redirected to once the invitation is redeemed. Required.
  var inviteRedirectUrl: js.UndefOr[String] = js.undefined
  // The user created as part of the invitation creation. Read-Only
  var invitedUser: js.UndefOr[User] = js.undefined
  // The display name of the user being invited.
  var invitedUserDisplayName: js.UndefOr[String] = js.undefined
  // The email address of the user being invited. Required.
  var invitedUserEmailAddress: js.UndefOr[String] = js.undefined
  /**
    * Additional configuration for the message being sent to the invited user, including customizing message text, language
    * and cc recipient list.
    */
  var invitedUserMessageInfo: js.UndefOr[InvitedUserMessageInfo] = js.undefined
  /**
    * The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company
    * administrator.
    */
  var invitedUserType: js.UndefOr[String] = js.undefined
  // Indicates whether an email should be sent to the user being invited or not. The default is false.
  var sendInvitationMessage: js.UndefOr[Boolean] = js.undefined
  // The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
  var status: js.UndefOr[String] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(
    id: String = null,
    inviteRedeemUrl: String = null,
    inviteRedirectUrl: String = null,
    invitedUser: User = null,
    invitedUserDisplayName: String = null,
    invitedUserEmailAddress: String = null,
    invitedUserMessageInfo: InvitedUserMessageInfo = null,
    invitedUserType: String = null,
    sendInvitationMessage: js.UndefOr[Boolean] = js.undefined,
    status: String = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inviteRedeemUrl != null) __obj.updateDynamic("inviteRedeemUrl")(inviteRedeemUrl.asInstanceOf[js.Any])
    if (inviteRedirectUrl != null) __obj.updateDynamic("inviteRedirectUrl")(inviteRedirectUrl.asInstanceOf[js.Any])
    if (invitedUser != null) __obj.updateDynamic("invitedUser")(invitedUser.asInstanceOf[js.Any])
    if (invitedUserDisplayName != null) __obj.updateDynamic("invitedUserDisplayName")(invitedUserDisplayName.asInstanceOf[js.Any])
    if (invitedUserEmailAddress != null) __obj.updateDynamic("invitedUserEmailAddress")(invitedUserEmailAddress.asInstanceOf[js.Any])
    if (invitedUserMessageInfo != null) __obj.updateDynamic("invitedUserMessageInfo")(invitedUserMessageInfo.asInstanceOf[js.Any])
    if (invitedUserType != null) __obj.updateDynamic("invitedUserType")(invitedUserType.asInstanceOf[js.Any])
    if (!js.isUndefined(sendInvitationMessage)) __obj.updateDynamic("sendInvitationMessage")(sendInvitationMessage.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
}

