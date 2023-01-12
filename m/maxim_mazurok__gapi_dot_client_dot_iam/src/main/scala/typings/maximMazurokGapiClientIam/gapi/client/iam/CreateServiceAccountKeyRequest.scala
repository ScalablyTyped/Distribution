package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceAccountKeyRequest extends StObject {
  
  /** Which type of key and algorithm to use for the key. The default is currently a 2K RSA key. However this may change in the future. */
  var keyAlgorithm: js.UndefOr[String] = js.undefined
  
  /** The output format of the private key. The default value is `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File format. */
  var privateKeyType: js.UndefOr[String] = js.undefined
}
object CreateServiceAccountKeyRequest {
  
  inline def apply(): CreateServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceAccountKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceAccountKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyAlgorithm(value: String): Self = StObject.set(x, "keyAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setKeyAlgorithmUndefined: Self = StObject.set(x, "keyAlgorithm", js.undefined)
    
    inline def setPrivateKeyType(value: String): Self = StObject.set(x, "privateKeyType", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyTypeUndefined: Self = StObject.set(x, "privateKeyType", js.undefined)
  }
}
