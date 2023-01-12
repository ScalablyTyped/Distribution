package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessUrls extends StObject {
  
  /** The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated. */
  var caCertificateAccessUrl: js.UndefOr[String] = js.undefined
  
  /** The URLs where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated. */
  var crlAccessUrls: js.UndefOr[js.Array[String]] = js.undefined
}
object AccessUrls {
  
  inline def apply(): AccessUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessUrls] (val x: Self) extends AnyVal {
    
    inline def setCaCertificateAccessUrl(value: String): Self = StObject.set(x, "caCertificateAccessUrl", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateAccessUrlUndefined: Self = StObject.set(x, "caCertificateAccessUrl", js.undefined)
    
    inline def setCrlAccessUrls(value: js.Array[String]): Self = StObject.set(x, "crlAccessUrls", value.asInstanceOf[js.Any])
    
    inline def setCrlAccessUrlsUndefined: Self = StObject.set(x, "crlAccessUrls", js.undefined)
    
    inline def setCrlAccessUrlsVarargs(value: String*): Self = StObject.set(x, "crlAccessUrls", js.Array(value*))
  }
}
