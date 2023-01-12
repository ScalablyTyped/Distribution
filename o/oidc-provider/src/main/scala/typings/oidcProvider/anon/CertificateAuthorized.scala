package typings.oidcProvider.anon

import typings.oidcProvider.mod.KoaContextWithOIDC
import typings.oidcProvider.mod.TLSClientAuthProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthorized extends StObject {
  
  var certificateAuthorized: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, Boolean]] = js.undefined
  
  var certificateBoundAccessTokens: js.UndefOr[Boolean] = js.undefined
  
  var certificateSubjectMatches: js.UndefOr[
    js.Function3[
      /* ctx */ KoaContextWithOIDC, 
      /* property */ TLSClientAuthProperty, 
      /* expected */ String, 
      Boolean
    ]
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var getCertificate: js.UndefOr[js.Function1[/* ctx */ KoaContextWithOIDC, String]] = js.undefined
  
  var selfSignedTlsClientAuth: js.UndefOr[Boolean] = js.undefined
  
  var tlsClientAuth: js.UndefOr[Boolean] = js.undefined
}
object CertificateAuthorized {
  
  inline def apply(): CertificateAuthorized = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthorized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateAuthorized] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthorized(value: /* ctx */ KoaContextWithOIDC => Boolean): Self = StObject.set(x, "certificateAuthorized", js.Any.fromFunction1(value))
    
    inline def setCertificateAuthorizedUndefined: Self = StObject.set(x, "certificateAuthorized", js.undefined)
    
    inline def setCertificateBoundAccessTokens(value: Boolean): Self = StObject.set(x, "certificateBoundAccessTokens", value.asInstanceOf[js.Any])
    
    inline def setCertificateBoundAccessTokensUndefined: Self = StObject.set(x, "certificateBoundAccessTokens", js.undefined)
    
    inline def setCertificateSubjectMatches(
      value: (/* ctx */ KoaContextWithOIDC, /* property */ TLSClientAuthProperty, /* expected */ String) => Boolean
    ): Self = StObject.set(x, "certificateSubjectMatches", js.Any.fromFunction3(value))
    
    inline def setCertificateSubjectMatchesUndefined: Self = StObject.set(x, "certificateSubjectMatches", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGetCertificate(value: /* ctx */ KoaContextWithOIDC => String): Self = StObject.set(x, "getCertificate", js.Any.fromFunction1(value))
    
    inline def setGetCertificateUndefined: Self = StObject.set(x, "getCertificate", js.undefined)
    
    inline def setSelfSignedTlsClientAuth(value: Boolean): Self = StObject.set(x, "selfSignedTlsClientAuth", value.asInstanceOf[js.Any])
    
    inline def setSelfSignedTlsClientAuthUndefined: Self = StObject.set(x, "selfSignedTlsClientAuth", js.undefined)
    
    inline def setTlsClientAuth(value: Boolean): Self = StObject.set(x, "tlsClientAuth", value.asInstanceOf[js.Any])
    
    inline def setTlsClientAuthUndefined: Self = StObject.set(x, "tlsClientAuth", js.undefined)
  }
}
