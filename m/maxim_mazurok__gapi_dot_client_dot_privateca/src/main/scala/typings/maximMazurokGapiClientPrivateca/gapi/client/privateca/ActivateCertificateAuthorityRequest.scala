package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateCertificateAuthorityRequest extends js.Object {
  
  /** Required. The signed CA certificate issued from FetchCertificateAuthorityCsrResponse.pem_csr. */
  var pemCaCertificate: js.UndefOr[String] = js.native
  
  /**
    * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been
    * completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times
    * out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second
    * request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.native
  
  /** Required. Must include information about the issuer of 'pem_ca_certificate', and any further issuers until the self-signed CA. */
  var subordinateConfig: js.UndefOr[SubordinateConfig] = js.native
}
object ActivateCertificateAuthorityRequest {
  
  @scala.inline
  def apply(): ActivateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class ActivateCertificateAuthorityRequestOps[Self <: ActivateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
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
    def setPemCaCertificate(value: String): Self = this.set("pemCaCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePemCaCertificate: Self = this.set("pemCaCertificate", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setSubordinateConfig(value: SubordinateConfig): Self = this.set("subordinateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubordinateConfig: Self = this.set("subordinateConfig", js.undefined)
  }
}
