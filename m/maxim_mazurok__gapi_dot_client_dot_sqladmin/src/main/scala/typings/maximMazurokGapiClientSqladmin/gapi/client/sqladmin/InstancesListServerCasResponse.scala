package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesListServerCasResponse extends StObject {
  
  var activeVersion: js.UndefOr[String] = js.undefined
  
  /** List of server CA certificates for the instance. */
  var certs: js.UndefOr[js.Array[SslCert]] = js.undefined
  
  /** This is always `sql#instancesListServerCas`. */
  var kind: js.UndefOr[String] = js.undefined
}
object InstancesListServerCasResponse {
  
  inline def apply(): InstancesListServerCasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesListServerCasResponse]
  }
  
  extension [Self <: InstancesListServerCasResponse](x: Self) {
    
    inline def setActiveVersion(value: String): Self = StObject.set(x, "activeVersion", value.asInstanceOf[js.Any])
    
    inline def setActiveVersionUndefined: Self = StObject.set(x, "activeVersion", js.undefined)
    
    inline def setCerts(value: js.Array[SslCert]): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCertsVarargs(value: SslCert*): Self = StObject.set(x, "certs", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
