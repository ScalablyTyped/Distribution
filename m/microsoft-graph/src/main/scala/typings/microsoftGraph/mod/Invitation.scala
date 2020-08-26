package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invitation extends Entity {
  // The URL user can use to redeem his invitation. Read-Only
  var inviteRedeemUrl: js.UndefOr[String] = js.native
  // The URL user should be redirected to once the invitation is redeemed. Required.
  var inviteRedirectUrl: js.UndefOr[String] = js.native
  // The user created as part of the invitation creation. Read-Only
  var invitedUser: js.UndefOr[User] = js.native
  // The display name of the user being invited.
  var invitedUserDisplayName: js.UndefOr[String] = js.native
  /**
    * The email address of the user being invited. Required. The following special characters are not permitted in the email
    * address:Tilde (~)Exclamation point (!)Number sign (#)Dollar sign ($)Percent (%)Circumflex (^)Ampersand (&amp;)Asterisk
    * (*)Parentheses (( ))Plus sign (+)Equal sign (=)Brackets ([ ])Braces ({ })Backslash (/)Slash mark (/)Pipe (/|)Semicolon
    * (;)Colon (:)Quotation marks (')Angle brackets (&amp;lt; &amp;gt;)Question mark (?)Comma (,)However, the following
    * exceptions apply:A period (.) or a hyphen (-) is permitted anywhere in the user name, except at the beginning or end of
    * the name.An underscore (_) is permitted anywhere in the user name. This includes at the beginning or end of the name.
    */
  var invitedUserEmailAddress: js.UndefOr[String] = js.native
  /**
    * Additional configuration for the message being sent to the invited user, including customizing message text, language
    * and cc recipient list.
    */
  var invitedUserMessageInfo: js.UndefOr[InvitedUserMessageInfo] = js.native
  /**
    * The userType of the user being invited. By default, this is Guest. You can invite as Member if you are a company
    * administrator.
    */
  var invitedUserType: js.UndefOr[String] = js.native
  // Indicates whether an email should be sent to the user being invited or not. The default is false.
  var sendInvitationMessage: js.UndefOr[Boolean] = js.native
  // The status of the invitation. Possible values: PendingAcceptance, Completed, InProgress, and Error
  var status: js.UndefOr[String] = js.native
}

object Invitation {
  @scala.inline
  def apply(): Invitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Invitation]
  }
  @scala.inline
  implicit class InvitationOps[Self <: Invitation] (val x: Self) extends AnyVal {
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
    def setInviteRedeemUrl(value: String): Self = this.set("inviteRedeemUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteRedeemUrl: Self = this.set("inviteRedeemUrl", js.undefined)
    @scala.inline
    def setInviteRedirectUrl(value: String): Self = this.set("inviteRedirectUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInviteRedirectUrl: Self = this.set("inviteRedirectUrl", js.undefined)
    @scala.inline
    def setInvitedUser(value: User): Self = this.set("invitedUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedUser: Self = this.set("invitedUser", js.undefined)
    @scala.inline
    def setInvitedUserDisplayName(value: String): Self = this.set("invitedUserDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedUserDisplayName: Self = this.set("invitedUserDisplayName", js.undefined)
    @scala.inline
    def setInvitedUserEmailAddress(value: String): Self = this.set("invitedUserEmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedUserEmailAddress: Self = this.set("invitedUserEmailAddress", js.undefined)
    @scala.inline
    def setInvitedUserMessageInfo(value: InvitedUserMessageInfo): Self = this.set("invitedUserMessageInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedUserMessageInfo: Self = this.set("invitedUserMessageInfo", js.undefined)
    @scala.inline
    def setInvitedUserType(value: String): Self = this.set("invitedUserType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvitedUserType: Self = this.set("invitedUserType", js.undefined)
    @scala.inline
    def setSendInvitationMessage(value: Boolean): Self = this.set("sendInvitationMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendInvitationMessage: Self = this.set("sendInvitationMessage", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

