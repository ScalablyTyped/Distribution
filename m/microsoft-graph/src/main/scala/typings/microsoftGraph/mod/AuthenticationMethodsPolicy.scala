package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationMethodsPolicy
  extends StObject
     with Entity {
  
  /**
    * Represents the settings for each authentication method. Automatically expanded on GET
    * /policies/authenticationMethodsPolicy.
    */
  var authenticationMethodConfigurations: js.UndefOr[NullableOption[js.Array[AuthenticationMethodConfiguration]]] = js.undefined
  
  // A description of the policy. Read-only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the policy. Read-only.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time of the last update to the policy. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The state of migration of the authentication methods policy from the legacy multifactor authentication and self-service
    * password reset (SSPR) policies. The possible values are: premigration - means the authentication methods policy is used
    * for authentication only, legacy policies are respected. migrationInProgress - means the authentication methods policy
    * is used for both authentication and SSPR, legacy policies are respected. migrationComplete - means the authentication
    * methods policy is used for authentication and SSPR, legacy policies are ignored. unknownFutureValue - Evolvable
    * enumeration sentinel value. Do not use.
    */
  var policyMigrationState: js.UndefOr[NullableOption[AuthenticationMethodsPolicyMigrationState]] = js.undefined
  
  // The version of the policy in use. Read-only.
  var policyVersion: js.UndefOr[NullableOption[String]] = js.undefined
  
  var reconfirmationInDays: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * Enforce registration at sign-in time. This property can be used to remind users to set up targeted authentication
    * methods.
    */
  var registrationEnforcement: js.UndefOr[NullableOption[RegistrationEnforcement]] = js.undefined
}
object AuthenticationMethodsPolicy {
  
  inline def apply(): AuthenticationMethodsPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationMethodsPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationMethodsPolicy] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethodConfigurations(value: NullableOption[js.Array[AuthenticationMethodConfiguration]]): Self = StObject.set(x, "authenticationMethodConfigurations", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationMethodConfigurationsNull: Self = StObject.set(x, "authenticationMethodConfigurations", null)
    
    inline def setAuthenticationMethodConfigurationsUndefined: Self = StObject.set(x, "authenticationMethodConfigurations", js.undefined)
    
    inline def setAuthenticationMethodConfigurationsVarargs(value: AuthenticationMethodConfiguration*): Self = StObject.set(x, "authenticationMethodConfigurations", js.Array(value*))
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPolicyMigrationState(value: NullableOption[AuthenticationMethodsPolicyMigrationState]): Self = StObject.set(x, "policyMigrationState", value.asInstanceOf[js.Any])
    
    inline def setPolicyMigrationStateNull: Self = StObject.set(x, "policyMigrationState", null)
    
    inline def setPolicyMigrationStateUndefined: Self = StObject.set(x, "policyMigrationState", js.undefined)
    
    inline def setPolicyVersion(value: NullableOption[String]): Self = StObject.set(x, "policyVersion", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionNull: Self = StObject.set(x, "policyVersion", null)
    
    inline def setPolicyVersionUndefined: Self = StObject.set(x, "policyVersion", js.undefined)
    
    inline def setReconfirmationInDays(value: NullableOption[Double]): Self = StObject.set(x, "reconfirmationInDays", value.asInstanceOf[js.Any])
    
    inline def setReconfirmationInDaysNull: Self = StObject.set(x, "reconfirmationInDays", null)
    
    inline def setReconfirmationInDaysUndefined: Self = StObject.set(x, "reconfirmationInDays", js.undefined)
    
    inline def setRegistrationEnforcement(value: NullableOption[RegistrationEnforcement]): Self = StObject.set(x, "registrationEnforcement", value.asInstanceOf[js.Any])
    
    inline def setRegistrationEnforcementNull: Self = StObject.set(x, "registrationEnforcement", null)
    
    inline def setRegistrationEnforcementUndefined: Self = StObject.set(x, "registrationEnforcement", js.undefined)
  }
}
