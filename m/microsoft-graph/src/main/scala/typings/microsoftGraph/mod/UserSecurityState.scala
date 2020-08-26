package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSecurityState extends js.Object {
  // AAD User object identifier (GUID) - represents the physical/multi-account user entity.
  var aadUserId: js.UndefOr[String] = js.native
  // Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
  var accountName: js.UndefOr[String] = js.native
  // NetBIOS/Active Directory domain of user account (that is, domain/account format).
  var domainName: js.UndefOr[String] = js.native
  // For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
  var emailRole: js.UndefOr[EmailRole] = js.native
  // Indicates whether the user logged on through a VPN.
  var isVpn: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var logonDateTime: js.UndefOr[String] = js.native
  // User sign-in ID.
  var logonId: js.UndefOr[String] = js.native
  // IP Address the sign-in request originated from.
  var logonIp: js.UndefOr[String] = js.native
  // Location (by IP address mapping) associated with a user sign-in event by this user.
  var logonLocation: js.UndefOr[String] = js.native
  // Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
  var logonType: js.UndefOr[LogonType] = js.native
  // Active Directory (on-premises) Security Identifier (SID) of the user.
  var onPremisesSecurityIdentifier: js.UndefOr[String] = js.native
  /**
    * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[String] = js.native
  /**
    * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power,
    * administrator.
    */
  var userAccountType: js.UndefOr[UserAccountSecurityType] = js.native
  // User sign-in name - internet format: (user account name)@(user account DNS domain name).
  var userPrincipalName: js.UndefOr[String] = js.native
}

object UserSecurityState {
  @scala.inline
  def apply(): UserSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSecurityState]
  }
  @scala.inline
  implicit class UserSecurityStateOps[Self <: UserSecurityState] (val x: Self) extends AnyVal {
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
    def setAadUserId(value: String): Self = this.set("aadUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAadUserId: Self = this.set("aadUserId", js.undefined)
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setEmailRole(value: EmailRole): Self = this.set("emailRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailRole: Self = this.set("emailRole", js.undefined)
    @scala.inline
    def setIsVpn(value: Boolean): Self = this.set("isVpn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVpn: Self = this.set("isVpn", js.undefined)
    @scala.inline
    def setLogonDateTime(value: String): Self = this.set("logonDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogonDateTime: Self = this.set("logonDateTime", js.undefined)
    @scala.inline
    def setLogonId(value: String): Self = this.set("logonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogonId: Self = this.set("logonId", js.undefined)
    @scala.inline
    def setLogonIp(value: String): Self = this.set("logonIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogonIp: Self = this.set("logonIp", js.undefined)
    @scala.inline
    def setLogonLocation(value: String): Self = this.set("logonLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogonLocation: Self = this.set("logonLocation", js.undefined)
    @scala.inline
    def setLogonType(value: LogonType): Self = this.set("logonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogonType: Self = this.set("logonType", js.undefined)
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: String): Self = this.set("onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremisesSecurityIdentifier: Self = this.set("onPremisesSecurityIdentifier", js.undefined)
    @scala.inline
    def setRiskScore(value: String): Self = this.set("riskScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRiskScore: Self = this.set("riskScore", js.undefined)
    @scala.inline
    def setUserAccountType(value: UserAccountSecurityType): Self = this.set("userAccountType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserAccountType: Self = this.set("userAccountType", js.undefined)
    @scala.inline
    def setUserPrincipalName(value: String): Self = this.set("userPrincipalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPrincipalName: Self = this.set("userPrincipalName", js.undefined)
  }
  
}

