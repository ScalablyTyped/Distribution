package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamlOrWsFedProvider
  extends StObject
     with IdentityProviderBase {
  
  // Issuer URI of the federation server.
  var issuerUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URI of the metadata exchange endpoint used for authentication from rich client applications.
  var metadataExchangeUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // URI that web-based clients are directed to when signing in to Azure Active Directory (Azure AD) services.
  var passiveSignInUri: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Preferred authentication protocol. The possible values are: wsFed, saml, unknownFutureValue.
  var preferredAuthenticationProtocol: js.UndefOr[NullableOption[AuthenticationProtocol]] = js.undefined
  
  /**
    * Current certificate used to sign tokens passed to the Microsoft identity platform. The certificate is formatted as a
    * Base64 encoded string of the public portion of the federated IdP's token signing certificate and must be compatible
    * with the X509Certificate2 class. This property is used in the following scenarios: if a rollover is required outside of
    * the autorollover update a new federation service is being set up if the new token signing certificate isn't present in
    * the federation properties after the federation service certificate has been updated. Azure AD updates certificates via
    * an autorollover process in which it attempts to retrieve a new certificate from the federation service metadata, 30
    * days before expiry of the current certificate. If a new certificate isn't available, Azure AD monitors the metadata
    * daily and will update the federation settings for the domain when a new certificate is available.
    */
  var signingCertificate: js.UndefOr[NullableOption[String]] = js.undefined
}
object SamlOrWsFedProvider {
  
  inline def apply(): SamlOrWsFedProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlOrWsFedProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamlOrWsFedProvider] (val x: Self) extends AnyVal {
    
    inline def setIssuerUri(value: NullableOption[String]): Self = StObject.set(x, "issuerUri", value.asInstanceOf[js.Any])
    
    inline def setIssuerUriNull: Self = StObject.set(x, "issuerUri", null)
    
    inline def setIssuerUriUndefined: Self = StObject.set(x, "issuerUri", js.undefined)
    
    inline def setMetadataExchangeUri(value: NullableOption[String]): Self = StObject.set(x, "metadataExchangeUri", value.asInstanceOf[js.Any])
    
    inline def setMetadataExchangeUriNull: Self = StObject.set(x, "metadataExchangeUri", null)
    
    inline def setMetadataExchangeUriUndefined: Self = StObject.set(x, "metadataExchangeUri", js.undefined)
    
    inline def setPassiveSignInUri(value: NullableOption[String]): Self = StObject.set(x, "passiveSignInUri", value.asInstanceOf[js.Any])
    
    inline def setPassiveSignInUriNull: Self = StObject.set(x, "passiveSignInUri", null)
    
    inline def setPassiveSignInUriUndefined: Self = StObject.set(x, "passiveSignInUri", js.undefined)
    
    inline def setPreferredAuthenticationProtocol(value: NullableOption[AuthenticationProtocol]): Self = StObject.set(x, "preferredAuthenticationProtocol", value.asInstanceOf[js.Any])
    
    inline def setPreferredAuthenticationProtocolNull: Self = StObject.set(x, "preferredAuthenticationProtocol", null)
    
    inline def setPreferredAuthenticationProtocolUndefined: Self = StObject.set(x, "preferredAuthenticationProtocol", js.undefined)
    
    inline def setSigningCertificate(value: NullableOption[String]): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    inline def setSigningCertificateNull: Self = StObject.set(x, "signingCertificate", null)
    
    inline def setSigningCertificateUndefined: Self = StObject.set(x, "signingCertificate", js.undefined)
  }
}
