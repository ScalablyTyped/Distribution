package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizationPolicy
  extends StObject
     with PolicyBase {
  
  // Indicates whether a user can join the tenant by email validation.
  var allowEmailVerifiedUsersToJoinOrganization: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates who can invite external users to the organization. Possible values are: none, adminsAndGuestInviters,
    * adminsGuestInvitersAndAllMembers, everyone. everyone is the default setting for all cloud environments except US
    * Government. See more in the table below.
    */
  var allowInvitesFrom: js.UndefOr[NullableOption[AllowInvitesFrom]] = js.undefined
  
  var allowUserConsentForRiskyApps: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Indicates whether users can sign up for email based subscriptions.
  var allowedToSignUpEmailBasedSubscriptions: js.UndefOr[Boolean] = js.undefined
  
  // Indicates whether the Self-Serve Password Reset feature can be used by users on the tenant.
  var allowedToUseSSPR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To disable the use of MSOL PowerShell set this property to true. This will also disable user-based access to the legacy
    * service endpoint used by MSOL PowerShell. This does not affect Azure AD Connect or Microsoft Graph.
    */
  var blockMsolPowerShell: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Specifies certain customizable permissions for default user role.
  var defaultUserRolePermissions: js.UndefOr[DefaultUserRolePermissions] = js.undefined
  
  /**
    * Represents role templateId for the role that should be granted to guest user. Currently following roles are supported:
    * User (a0b1b346-4d3e-4e8b-98f8-753987be4970), Guest User (10dae51f-b6af-4016-8d66-8c2a99b929b3), and Restricted Guest
    * User (2af84b1e-32c8-42b7-82bc-daa82404023b).
    */
  var guestUserRoleId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AuthorizationPolicy {
  
  inline def apply(): AuthorizationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizationPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizationPolicy] (val x: Self) extends AnyVal {
    
    inline def setAllowEmailVerifiedUsersToJoinOrganization(value: Boolean): Self = StObject.set(x, "allowEmailVerifiedUsersToJoinOrganization", value.asInstanceOf[js.Any])
    
    inline def setAllowEmailVerifiedUsersToJoinOrganizationUndefined: Self = StObject.set(x, "allowEmailVerifiedUsersToJoinOrganization", js.undefined)
    
    inline def setAllowInvitesFrom(value: NullableOption[AllowInvitesFrom]): Self = StObject.set(x, "allowInvitesFrom", value.asInstanceOf[js.Any])
    
    inline def setAllowInvitesFromNull: Self = StObject.set(x, "allowInvitesFrom", null)
    
    inline def setAllowInvitesFromUndefined: Self = StObject.set(x, "allowInvitesFrom", js.undefined)
    
    inline def setAllowUserConsentForRiskyApps(value: NullableOption[Boolean]): Self = StObject.set(x, "allowUserConsentForRiskyApps", value.asInstanceOf[js.Any])
    
    inline def setAllowUserConsentForRiskyAppsNull: Self = StObject.set(x, "allowUserConsentForRiskyApps", null)
    
    inline def setAllowUserConsentForRiskyAppsUndefined: Self = StObject.set(x, "allowUserConsentForRiskyApps", js.undefined)
    
    inline def setAllowedToSignUpEmailBasedSubscriptions(value: Boolean): Self = StObject.set(x, "allowedToSignUpEmailBasedSubscriptions", value.asInstanceOf[js.Any])
    
    inline def setAllowedToSignUpEmailBasedSubscriptionsUndefined: Self = StObject.set(x, "allowedToSignUpEmailBasedSubscriptions", js.undefined)
    
    inline def setAllowedToUseSSPR(value: Boolean): Self = StObject.set(x, "allowedToUseSSPR", value.asInstanceOf[js.Any])
    
    inline def setAllowedToUseSSPRUndefined: Self = StObject.set(x, "allowedToUseSSPR", js.undefined)
    
    inline def setBlockMsolPowerShell(value: NullableOption[Boolean]): Self = StObject.set(x, "blockMsolPowerShell", value.asInstanceOf[js.Any])
    
    inline def setBlockMsolPowerShellNull: Self = StObject.set(x, "blockMsolPowerShell", null)
    
    inline def setBlockMsolPowerShellUndefined: Self = StObject.set(x, "blockMsolPowerShell", js.undefined)
    
    inline def setDefaultUserRolePermissions(value: DefaultUserRolePermissions): Self = StObject.set(x, "defaultUserRolePermissions", value.asInstanceOf[js.Any])
    
    inline def setDefaultUserRolePermissionsUndefined: Self = StObject.set(x, "defaultUserRolePermissions", js.undefined)
    
    inline def setGuestUserRoleId(value: NullableOption[String]): Self = StObject.set(x, "guestUserRoleId", value.asInstanceOf[js.Any])
    
    inline def setGuestUserRoleIdNull: Self = StObject.set(x, "guestUserRoleId", null)
    
    inline def setGuestUserRoleIdUndefined: Self = StObject.set(x, "guestUserRoleId", js.undefined)
  }
}
