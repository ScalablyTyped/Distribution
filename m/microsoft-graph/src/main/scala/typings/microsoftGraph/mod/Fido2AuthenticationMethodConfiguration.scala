package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fido2AuthenticationMethodConfiguration
  extends StObject
     with AuthenticationMethodConfiguration {
  
  // A collection of users or groups who are enabled to use the authentication method.
  var includeTargets: js.UndefOr[NullableOption[js.Array[AuthenticationMethodTarget]]] = js.undefined
  
  // Determines whether attestation must be enforced for FIDO2 security key registration.
  var isAttestationEnforced: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // Determines if users can register new FIDO2 security keys.
  var isSelfServiceRegistrationAllowed: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Controls whether key restrictions are enforced on FIDO2 security keys, either allowing or disallowing certain key types
    * as defined by Authenticator Attestation GUID (AAGUID), an identifier that indicates the type (e.g. make and model) of
    * the authenticator.
    */
  var keyRestrictions: js.UndefOr[NullableOption[Fido2KeyRestrictions]] = js.undefined
}
object Fido2AuthenticationMethodConfiguration {
  
  inline def apply(): Fido2AuthenticationMethodConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fido2AuthenticationMethodConfiguration]
  }
  
  extension [Self <: Fido2AuthenticationMethodConfiguration](x: Self) {
    
    inline def setIncludeTargets(value: NullableOption[js.Array[AuthenticationMethodTarget]]): Self = StObject.set(x, "includeTargets", value.asInstanceOf[js.Any])
    
    inline def setIncludeTargetsNull: Self = StObject.set(x, "includeTargets", null)
    
    inline def setIncludeTargetsUndefined: Self = StObject.set(x, "includeTargets", js.undefined)
    
    inline def setIncludeTargetsVarargs(value: AuthenticationMethodTarget*): Self = StObject.set(x, "includeTargets", js.Array(value*))
    
    inline def setIsAttestationEnforced(value: NullableOption[Boolean]): Self = StObject.set(x, "isAttestationEnforced", value.asInstanceOf[js.Any])
    
    inline def setIsAttestationEnforcedNull: Self = StObject.set(x, "isAttestationEnforced", null)
    
    inline def setIsAttestationEnforcedUndefined: Self = StObject.set(x, "isAttestationEnforced", js.undefined)
    
    inline def setIsSelfServiceRegistrationAllowed(value: NullableOption[Boolean]): Self = StObject.set(x, "isSelfServiceRegistrationAllowed", value.asInstanceOf[js.Any])
    
    inline def setIsSelfServiceRegistrationAllowedNull: Self = StObject.set(x, "isSelfServiceRegistrationAllowed", null)
    
    inline def setIsSelfServiceRegistrationAllowedUndefined: Self = StObject.set(x, "isSelfServiceRegistrationAllowed", js.undefined)
    
    inline def setKeyRestrictions(value: NullableOption[Fido2KeyRestrictions]): Self = StObject.set(x, "keyRestrictions", value.asInstanceOf[js.Any])
    
    inline def setKeyRestrictionsNull: Self = StObject.set(x, "keyRestrictions", null)
    
    inline def setKeyRestrictionsUndefined: Self = StObject.set(x, "keyRestrictions", js.undefined)
  }
}
