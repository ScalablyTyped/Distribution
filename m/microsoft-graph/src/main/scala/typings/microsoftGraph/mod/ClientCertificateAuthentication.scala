package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertificateAuthentication
  extends StObject
     with ApiAuthenticationConfigurationBase {
  
  // The list of certificates uploaded for this API connector.
  var certificateList: js.UndefOr[NullableOption[js.Array[Pkcs12CertificateInformation]]] = js.undefined
}
object ClientCertificateAuthentication {
  
  inline def apply(): ClientCertificateAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientCertificateAuthentication]
  }
  
  extension [Self <: ClientCertificateAuthentication](x: Self) {
    
    inline def setCertificateList(value: NullableOption[js.Array[Pkcs12CertificateInformation]]): Self = StObject.set(x, "certificateList", value.asInstanceOf[js.Any])
    
    inline def setCertificateListNull: Self = StObject.set(x, "certificateList", null)
    
    inline def setCertificateListUndefined: Self = StObject.set(x, "certificateList", js.undefined)
    
    inline def setCertificateListVarargs(value: Pkcs12CertificateInformation*): Self = StObject.set(x, "certificateList", js.Array(value*))
  }
}
