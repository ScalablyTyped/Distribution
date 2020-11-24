package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessUrls extends js.Object {
  
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
  implicit class AccessUrlsOps[Self <: AccessUrls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaCertificateAccessUrl(value: String): Self = this.set("caCertificateAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificateAccessUrl: Self = this.set("caCertificateAccessUrl", js.undefined)
    
    @scala.inline
    def setCrlAccessUrl(value: String): Self = this.set("crlAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrlAccessUrl: Self = this.set("crlAccessUrl", js.undefined)
  }
}
