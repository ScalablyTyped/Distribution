package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalDomainFederation
  extends StObject
     with SamlOrWsFedProvider {
  
  /**
    * URL of the endpoint used by active clients when authenticating with federated domains set up for single sign-on in
    * Azure Active Directory (Azure AD). Corresponds to the ActiveLogOnUri property of the Set-MsolDomainFederationSettings
    * MSOnline v1 PowerShell cmdlet.
    */
  var activeSignInUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Determines whether Azure AD accepts the MFA performed by the federated IdP when a federated user accesses an
    * application that is governed by a conditional access policy that requires MFA. The possible values are:
    * acceptIfMfaDoneByFederatedIdp, enforceMfaByFederatedIdp, rejectMfaByFederatedIdp, unknownFutureValue. For more
    * information, see federatedIdpMfaBehavior values.
    */
  var federatedIdpMfaBehavior: js.UndefOr[NullableOption[FederatedIdpMfaBehavior]] = js.undefined
  
  /**
    * If true, when SAML authentication requests are sent to the federated SAML IdP, Azure AD will sign those requests using
    * the OrgID signing key. If false (default), the SAML authentication requests sent to the federated IdP are not signed.
    */
  var isSignedAuthenticationRequestRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  /**
    * Fallback token signing certificate that is used to sign tokens when the primary signing certificate expires. Formatted
    * as Base64 encoded strings of the public portion of the federated IdP's token signing certificate. Needs to be
    * compatible with the X509Certificate2 class. Much like the signingCertificate, the nextSigningCertificate property is
    * used if a rollover is required outside of the auto-rollover update, a new federation service is being set up, or if the
    * new token signing certificate is not present in the federation properties after the federation service certificate has
    * been updated.
    */
  var nextSigningCertificate: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Sets the preferred behavior for the sign-in prompt. The possible values are: translateToFreshPasswordAuthentication,
    * nativeSupport, disabled, unknownFutureValue.
    */
  var promptLoginBehavior: js.UndefOr[NullableOption[PromptLoginBehavior]] = js.undefined
  
  /**
    * URI that clients are redirected to when they sign out of Azure AD services. Corresponds to the LogOffUri property of
    * the Set-MsolDomainFederationSettings MSOnline v1 PowerShell cmdlet.
    */
  var signOutUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Provides status and timestamp of the last update of the signing certificate.
  var signingCertificateUpdateStatus: js.UndefOr[NullableOption[SigningCertificateUpdateStatus]] = js.undefined
}
object InternalDomainFederation {
  
  inline def apply(): InternalDomainFederation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalDomainFederation]
  }
  
  extension [Self <: InternalDomainFederation](x: Self) {
    
    inline def setActiveSignInUri(value: NullableOption[String]): Self = StObject.set(x, "activeSignInUri", value.asInstanceOf[js.Any])
    
    inline def setActiveSignInUriNull: Self = StObject.set(x, "activeSignInUri", null)
    
    inline def setActiveSignInUriUndefined: Self = StObject.set(x, "activeSignInUri", js.undefined)
    
    inline def setFederatedIdpMfaBehavior(value: NullableOption[FederatedIdpMfaBehavior]): Self = StObject.set(x, "federatedIdpMfaBehavior", value.asInstanceOf[js.Any])
    
    inline def setFederatedIdpMfaBehaviorNull: Self = StObject.set(x, "federatedIdpMfaBehavior", null)
    
    inline def setFederatedIdpMfaBehaviorUndefined: Self = StObject.set(x, "federatedIdpMfaBehavior", js.undefined)
    
    inline def setIsSignedAuthenticationRequestRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isSignedAuthenticationRequestRequired", value.asInstanceOf[js.Any])
    
    inline def setIsSignedAuthenticationRequestRequiredNull: Self = StObject.set(x, "isSignedAuthenticationRequestRequired", null)
    
    inline def setIsSignedAuthenticationRequestRequiredUndefined: Self = StObject.set(x, "isSignedAuthenticationRequestRequired", js.undefined)
    
    inline def setNextSigningCertificate(value: NullableOption[String]): Self = StObject.set(x, "nextSigningCertificate", value.asInstanceOf[js.Any])
    
    inline def setNextSigningCertificateNull: Self = StObject.set(x, "nextSigningCertificate", null)
    
    inline def setNextSigningCertificateUndefined: Self = StObject.set(x, "nextSigningCertificate", js.undefined)
    
    inline def setPromptLoginBehavior(value: NullableOption[PromptLoginBehavior]): Self = StObject.set(x, "promptLoginBehavior", value.asInstanceOf[js.Any])
    
    inline def setPromptLoginBehaviorNull: Self = StObject.set(x, "promptLoginBehavior", null)
    
    inline def setPromptLoginBehaviorUndefined: Self = StObject.set(x, "promptLoginBehavior", js.undefined)
    
    inline def setSignOutUri(value: NullableOption[String]): Self = StObject.set(x, "signOutUri", value.asInstanceOf[js.Any])
    
    inline def setSignOutUriNull: Self = StObject.set(x, "signOutUri", null)
    
    inline def setSignOutUriUndefined: Self = StObject.set(x, "signOutUri", js.undefined)
    
    inline def setSigningCertificateUpdateStatus(value: NullableOption[SigningCertificateUpdateStatus]): Self = StObject.set(x, "signingCertificateUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificateUpdateStatusNull: Self = StObject.set(x, "signingCertificateUpdateStatus", null)
    
    inline def setSigningCertificateUpdateStatusUndefined: Self = StObject.set(x, "signingCertificateUpdateStatus", js.undefined)
  }
}
