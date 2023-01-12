package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishingOptions extends StObject {
  
  /**
    * Optional. When true, publishes each CertificateAuthority's CA certificate and includes its URL in the "Authority Information Access" X.509 extension in all issued Certificates. If
    * this is false, the CA certificate will not be published and the corresponding X.509 extension will not be written in issued certificates.
    */
  var publishCaCert: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. When true, publishes each CertificateAuthority's CRL and includes its URL in the "CRL Distribution Points" X.509 extension in all issued Certificates. If this is false,
    * CRLs will not be published and the corresponding X.509 extension will not be written in issued certificates. CRLs will expire 7 days from their creation. However, we will rebuild
    * daily. CRLs are also rebuilt shortly after a certificate is revoked.
    */
  var publishCrl: js.UndefOr[Boolean] = js.undefined
}
object PublishingOptions {
  
  inline def apply(): PublishingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishingOptions] (val x: Self) extends AnyVal {
    
    inline def setPublishCaCert(value: Boolean): Self = StObject.set(x, "publishCaCert", value.asInstanceOf[js.Any])
    
    inline def setPublishCaCertUndefined: Self = StObject.set(x, "publishCaCert", js.undefined)
    
    inline def setPublishCrl(value: Boolean): Self = StObject.set(x, "publishCrl", value.asInstanceOf[js.Any])
    
    inline def setPublishCrlUndefined: Self = StObject.set(x, "publishCrl", js.undefined)
  }
}
