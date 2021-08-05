package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateCertificateAuthorityRequest extends StObject {
  
  /** Required. The signed CA certificate issued from FetchCertificateAuthorityCsrResponse.pem_csr. */
  var pemCaCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. An ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been
    * completed. The server will guarantee that for at least 60 minutes since the first request. For example, consider a situation where you make an initial request and t he request times
    * out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second
    * request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /** Required. Must include information about the issuer of 'pem_ca_certificate', and any further issuers until the self-signed CA. */
  var subordinateConfig: js.UndefOr[SubordinateConfig] = js.undefined
}
object ActivateCertificateAuthorityRequest {
  
  inline def apply(): ActivateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivateCertificateAuthorityRequest]
  }
  
  extension [Self <: ActivateCertificateAuthorityRequest](x: Self) {
    
    inline def setPemCaCertificate(value: String): Self = StObject.set(x, "pemCaCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemCaCertificateUndefined: Self = StObject.set(x, "pemCaCertificate", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSubordinateConfig(value: SubordinateConfig): Self = StObject.set(x, "subordinateConfig", value.asInstanceOf[js.Any])
    
    inline def setSubordinateConfigUndefined: Self = StObject.set(x, "subordinateConfig", js.undefined)
  }
}
