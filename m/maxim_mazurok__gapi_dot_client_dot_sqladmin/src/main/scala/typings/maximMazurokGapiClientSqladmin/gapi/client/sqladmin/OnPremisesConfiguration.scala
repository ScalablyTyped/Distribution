package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnPremisesConfiguration extends StObject {
  
  /** PEM representation of the trusted CA's x509 certificate. */
  var caCertificate: js.UndefOr[String] = js.undefined
  
  /** PEM representation of the replica's x509 certificate. */
  var clientCertificate: js.UndefOr[String] = js.undefined
  
  /** PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. */
  var clientKey: js.UndefOr[String] = js.undefined
  
  /** The dump file to create the Cloud SQL replica. */
  var dumpFilePath: js.UndefOr[String] = js.undefined
  
  /** The host and port of the on-premises instance in host:port format */
  var hostPort: js.UndefOr[String] = js.undefined
  
  /** This is always *sql#onPremisesConfiguration*. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The password for connecting to on-premises instance. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The username for connecting to on-premises instance. */
  var username: js.UndefOr[String] = js.undefined
}
object OnPremisesConfiguration {
  
  inline def apply(): OnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnPremisesConfiguration]
  }
  
  extension [Self <: OnPremisesConfiguration](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setDumpFilePath(value: String): Self = StObject.set(x, "dumpFilePath", value.asInstanceOf[js.Any])
    
    inline def setDumpFilePathUndefined: Self = StObject.set(x, "dumpFilePath", js.undefined)
    
    inline def setHostPort(value: String): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
