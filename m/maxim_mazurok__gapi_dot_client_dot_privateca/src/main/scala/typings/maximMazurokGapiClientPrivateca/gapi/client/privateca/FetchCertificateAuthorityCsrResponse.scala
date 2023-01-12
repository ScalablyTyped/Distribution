package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchCertificateAuthorityCsrResponse extends StObject {
  
  /** Output only. The PEM-encoded signed certificate signing request (CSR). */
  var pemCsr: js.UndefOr[String] = js.undefined
}
object FetchCertificateAuthorityCsrResponse {
  
  inline def apply(): FetchCertificateAuthorityCsrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchCertificateAuthorityCsrResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchCertificateAuthorityCsrResponse] (val x: Self) extends AnyVal {
    
    inline def setPemCsr(value: String): Self = StObject.set(x, "pemCsr", value.asInstanceOf[js.Any])
    
    inline def setPemCsrUndefined: Self = StObject.set(x, "pemCsr", js.undefined)
  }
}
