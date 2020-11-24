package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IssuingOptions extends js.Object {
  
  /** Required. When true, includes a URL to the issuing CA certificate in the "authority information access" X.509 extension. */
  var includeCaCertUrl: js.UndefOr[Boolean] = js.native
  
  /**
    * Required. When true, includes a URL to the CRL corresponding to certificates issued from a CertificateAuthority. CRLs will expire 7 days from their creation. However, we will
    * rebuild daily. CRLs are also rebuilt shortly after a certificate is revoked.
    */
  var includeCrlAccessUrl: js.UndefOr[Boolean] = js.native
}
object IssuingOptions {
  
  @scala.inline
  def apply(): IssuingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuingOptions]
  }
  
  @scala.inline
  implicit class IssuingOptionsOps[Self <: IssuingOptions] (val x: Self) extends AnyVal {
    
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
    def setIncludeCaCertUrl(value: Boolean): Self = this.set("includeCaCertUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCaCertUrl: Self = this.set("includeCaCertUrl", js.undefined)
    
    @scala.inline
    def setIncludeCrlAccessUrl(value: Boolean): Self = this.set("includeCrlAccessUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCrlAccessUrl: Self = this.set("includeCrlAccessUrl", js.undefined)
  }
}
