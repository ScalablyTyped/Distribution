package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends Entity {
  // The URL user can use to redeem their invitation. Read-Only
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
    if (id != null) __obj.updateDynamic("id")(id)
    if (inviteRedeemUrl != null) __obj.updateDynamic("inviteRedeemUrl")(inviteRedeemUrl)
    if (inviteRedirectUrl != null) __obj.updateDynamic("inviteRedirectUrl")(inviteRedirectUrl)
    if (invitedUser != null) __obj.updateDynamic("invitedUser")(invitedUser)
    if (invitedUserDisplayName != null) __obj.updateDynamic("invitedUserDisplayName")(invitedUserDisplayName)
    if (invitedUserEmailAddress != null) __obj.updateDynamic("invitedUserEmailAddress")(invitedUserEmailAddress)
    if (invitedUserMessageInfo != null) __obj.updateDynamic("invitedUserMessageInfo")(invitedUserMessageInfo)
    if (invitedUserType != null) __obj.updateDynamic("invitedUserType")(invitedUserType)
    if (!js.isUndefined(sendInvitationMessage)) __obj.updateDynamic("sendInvitationMessage")(sendInvitationMessage)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Invitation]
  }
}

