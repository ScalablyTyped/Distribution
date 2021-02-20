package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessUrls extends StObject {
  
  /** The URL where this CertificateAuthority's CA certificate is published. This will only be set for CAs that have been activated. */
  var caCertificateAccessUrl: js.UndefOr[String] = js.native
  
  /** The URL where this CertificateAuthority's CRLs are published. This will only be set for CAs that have been activated. */
  var crlAccessUrl: js.UndefOr[String] = js.native
}
object AccessUrls {
  
  @scala.inline
  def apply(): AccessUrls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessUrls]
  }
  
  @scala.inline
  implicit class AccessUrlsMutableBuilder[Self <: AccessUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaCertificateAccessUrl(value: String): Self = StObject.set(x, "caCertificateAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateAccessUrlUndefined: Self = StObject.set(x, "caCertificateAccessUrl", js.undefined)
    
    @scala.inline
    def setCrlAccessUrl(value: String): Self = StObject.set(x, "crlAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrlAccessUrlUndefined: Self = StObject.set(x, "crlAccessUrl", js.undefined)
  }
}
