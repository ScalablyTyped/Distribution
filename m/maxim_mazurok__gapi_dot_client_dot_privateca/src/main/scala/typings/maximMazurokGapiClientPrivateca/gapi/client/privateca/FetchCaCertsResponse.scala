package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchCaCertsResponse extends StObject {
  
  /** The PEM encoded CA certificate chains of all ACTIVE CertificateAuthority resources in this CaPool. */
  var caCerts: js.UndefOr[js.Array[CertChain]] = js.undefined
}
object FetchCaCertsResponse {
  
  inline def apply(): FetchCaCertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchCaCertsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FetchCaCertsResponse] (val x: Self) extends AnyVal {
    
    inline def setCaCerts(value: js.Array[CertChain]): Self = StObject.set(x, "caCerts", value.asInstanceOf[js.Any])
    
    inline def setCaCertsUndefined: Self = StObject.set(x, "caCerts", js.undefined)
    
    inline def setCaCertsVarargs(value: CertChain*): Self = StObject.set(x, "caCerts", js.Array(value*))
  }
}
