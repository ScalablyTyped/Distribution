package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSecurityState extends StObject {
  
  // AAD User object identifier (GUID) - represents the physical/multi-account user entity.
  var aadUserId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Account name of user account (without Active Directory domain or DNS domain) - (also called mailNickName).
  var accountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // NetBIOS/Active Directory domain of user account (that is, domain/account format).
  var domainName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // For email-related alerts - user account's email 'role'. Possible values are: unknown, sender, recipient.
  var emailRole: js.UndefOr[NullableOption[EmailRole]] = js.undefined
  
  // Indicates whether the user logged on through a VPN.
  var isVpn: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Time at which the sign-in occurred. The Timestamp type represents date and time information using ISO 8601 format and
    * is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
    */
  var logonDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User sign-in ID.
  var logonId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // IP Address the sign-in request originated from.
  var logonIp: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Location (by IP address mapping) associated with a user sign-in event by this user.
  var logonLocation: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Method of user sign in. Possible values are: unknown, interactive, remoteInteractive, network, batch, service.
  var logonType: js.UndefOr[NullableOption[LogonType]] = js.undefined
  
  // Active Directory (on-premises) Security Identifier (SID) of the user.
  var onPremisesSecurityIdentifier: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Provider-generated/calculated risk score of the user account. Recommended value range of 0-1, which equates to a
    * percentage.
    */
  var riskScore: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * User account type (group membership), per Windows definition. Possible values are: unknown, standard, power,
    * administrator.
    */
  var userAccountType: js.UndefOr[NullableOption[UserAccountSecurityType]] = js.undefined
  
  // User sign-in name - internet format: (user account name)@(user account DNS domain name).
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserSecurityState {
  
  @scala.inline
  def apply(): UserSecurityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSecurityState]
  }
  
  @scala.inline
  implicit class UserSecurityStateMutableBuilder[Self <: UserSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAadUserId(value: NullableOption[String]): Self = StObject.set(x, "aadUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAadUserIdNull: Self = StObject.set(x, "aadUserId", null)
    
    @scala.inline
    def setAadUserIdUndefined: Self = StObject.set(x, "aadUserId", js.undefined)
    
    @scala.inline
    def setAccountName(value: NullableOption[String]): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setDomainName(value: NullableOption[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setEmailRole(value: NullableOption[EmailRole]): Self = StObject.set(x, "emailRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRoleNull: Self = StObject.set(x, "emailRole", null)
    
    @scala.inline
    def setEmailRoleUndefined: Self = StObject.set(x, "emailRole", js.undefined)
    
    @scala.inline
    def setIsVpn(value: NullableOption[Boolean]): Self = StObject.set(x, "isVpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVpnNull: Self = StObject.set(x, "isVpn", null)
    
    @scala.inline
    def setIsVpnUndefined: Self = StObject.set(x, "isVpn", js.undefined)
    
    @scala.inline
    def setLogonDateTime(value: NullableOption[String]): Self = StObject.set(x, "logonDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonDateTimeNull: Self = StObject.set(x, "logonDateTime", null)
    
    @scala.inline
    def setLogonDateTimeUndefined: Self = StObject.set(x, "logonDateTime", js.undefined)
    
    @scala.inline
    def setLogonId(value: NullableOption[String]): Self = StObject.set(x, "logonId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonIdNull: Self = StObject.set(x, "logonId", null)
    
    @scala.inline
    def setLogonIdUndefined: Self = StObject.set(x, "logonId", js.undefined)
    
    @scala.inline
    def setLogonIp(value: NullableOption[String]): Self = StObject.set(x, "logonIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonIpNull: Self = StObject.set(x, "logonIp", null)
    
    @scala.inline
    def setLogonIpUndefined: Self = StObject.set(x, "logonIp", js.undefined)
    
    @scala.inline
    def setLogonLocation(value: NullableOption[String]): Self = StObject.set(x, "logonLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonLocationNull: Self = StObject.set(x, "logonLocation", null)
    
    @scala.inline
    def setLogonLocationUndefined: Self = StObject.set(x, "logonLocation", js.undefined)
    
    @scala.inline
    def setLogonType(value: NullableOption[LogonType]): Self = StObject.set(x, "logonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogonTypeNull: Self = StObject.set(x, "logonType", null)
    
    @scala.inline
    def setLogonTypeUndefined: Self = StObject.set(x, "logonType", js.undefined)
    
    @scala.inline
    def setOnPremisesSecurityIdentifier(value: NullableOption[String]): Self = StObject.set(x, "onPremisesSecurityIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremisesSecurityIdentifierNull: Self = StObject.set(x, "onPremisesSecurityIdentifier", null)
    
    @scala.inline
    def setOnPremisesSecurityIdentifierUndefined: Self = StObject.set(x, "onPremisesSecurityIdentifier", js.undefined)
    
    @scala.inline
    def setRiskScore(value: NullableOption[String]): Self = StObject.set(x, "riskScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRiskScoreNull: Self = StObject.set(x, "riskScore", null)
    
    @scala.inline
    def setRiskScoreUndefined: Self = StObject.set(x, "riskScore", js.undefined)
    
    @scala.inline
    def setUserAccountType(value: NullableOption[UserAccountSecurityType]): Self = StObject.set(x, "userAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccountTypeNull: Self = StObject.set(x, "userAccountType", null)
    
    @scala.inline
    def setUserAccountTypeUndefined: Self = StObject.set(x, "userAccountType", js.undefined)
    
    @scala.inline
    def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    @scala.inline
    def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
