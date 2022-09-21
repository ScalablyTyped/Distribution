package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessSecretVersionResponse extends StObject {
  
  /** The resource name of the SecretVersion in the format `projects/ *‍/secrets/ *‍/versions/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Secret payload */
  var payload: js.UndefOr[SecretPayload] = js.undefined
}
object AccessSecretVersionResponse {
  
  inline def apply(): AccessSecretVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessSecretVersionResponse]
  }
  
  extension [Self <: AccessSecretVersionResponse](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPayload(value: SecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
