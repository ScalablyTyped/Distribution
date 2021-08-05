package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslCertsListResponse extends StObject {
  
  /** List of client certificates for the instance. */
  var items: js.UndefOr[js.Array[SslCert]] = js.undefined
  
  /** This is always *sql#sslCertsList*. */
  var kind: js.UndefOr[String] = js.undefined
}
object SslCertsListResponse {
  
  inline def apply(): SslCertsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslCertsListResponse]
  }
  
  extension [Self <: SslCertsListResponse](x: Self) {
    
    inline def setItems(value: js.Array[SslCert]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SslCert*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
