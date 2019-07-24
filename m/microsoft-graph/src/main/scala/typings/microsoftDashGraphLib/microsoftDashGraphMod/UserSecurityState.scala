package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSecurityState extends js.Object {
  // AAD User object identifier (GUID) - represents the physical/multi-account user entity.
  var aadUserId: js.UndefOr[java.lang.String] = js.undefined
  // Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
  var accountName: js.UndefOr[java.lang.String] = js.undefined
  // NetBIOS/Active Directory domain of user account (that is, domain/account format).
  var domainName: js.UndefOr[java.lang.String] = js.undefined
  // For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
  var emailRole: js.UndefOr[EmailRole] = js.undefined
  // Indicates whether the user logged on through a VPN.
  var isVpn: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var logonDateTime: js.UndefOr[java.lang.String] = js.undefined
  // User sign-in ID.
  var logonId: js.UndefOr[java.lang.String] = js.undefined
  // IP Address the sign-in request originated from.
  var logonIp: js.UndefOr[java.lang.String] = js.undefined
  // Location (by IP address mapping) associated with a user sign-in event by this user.
  var logonLocation: js.UndefOr[java.lang.String] = js.undefined
  // Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
  var logonType: js.UndefOr[LogonType] = js.undefined
  // Active Directory (on-premises) Security Identifier (SID) of the user.
  var onPremisesSecurityIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power,
    * administrator.
    */
  var userAccountType: js.UndefOr[UserAccountSecurityType] = js.undefined
  // User sign-in name - internet format: (user account name)@(user account DNS domain name).
  var userPrincipalName: js.UndefOr[java.lang.String] = js.undefined
}

object UserSecurityState {
  @scala.inline
  def apply(
    aadUserId: java.lang.String = null,
    accountName: java.lang.String = null,
    domainName: java.lang.String = null,
    emailRole: EmailRole = null,
    isVpn: js.UndefOr[scala.Boolean] = js.undefined,
    logonDateTime: java.lang.String = null,
    logonId: java.lang.String = null,
    logonIp: java.lang.String = null,
    logonLocation: java.lang.String = null,
    logonType: LogonType = null,
    onPremisesSecurityIdentifier: java.lang.String = null,
    riskScore: java.lang.String = null,
    userAccountType: UserAccountSecurityType = null,
    userPrincipalName: java.lang.String = null
  ): UserSecurityState = {
    val __obj = js.Dynamic.literal()
    if (aadUserId != null) __obj.updateDynamic("aadUserId")(aadUserId)
    if (accountName != null) __obj.updateDynamic("accountName")(accountName)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (emailRole != null) __obj.updateDynamic("emailRole")(emailRole)
    if (!js.isUndefined(isVpn)) __obj.updateDynamic("isVpn")(isVpn)
    if (logonDateTime != null) __obj.updateDynamic("logonDateTime")(logonDateTime)
    if (logonId != null) __obj.updateDynamic("logonId")(logonId)
    if (logonIp != null) __obj.updateDynamic("logonIp")(logonIp)
    if (logonLocation != null) __obj.updateDynamic("logonLocation")(logonLocation)
    if (logonType != null) __obj.updateDynamic("logonType")(logonType)
    if (onPremisesSecurityIdentifier != null) __obj.updateDynamic("onPremisesSecurityIdentifier")(onPremisesSecurityIdentifier)
    if (riskScore != null) __obj.updateDynamic("riskScore")(riskScore)
    if (userAccountType != null) __obj.updateDynamic("userAccountType")(userAccountType)
    if (userPrincipalName != null) __obj.updateDynamic("userPrincipalName")(userPrincipalName)
    __obj.asInstanceOf[UserSecurityState]
  }
}

