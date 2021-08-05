package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSecretVersionRequest extends StObject {
  
  /** Required. The secret payload of the SecretVersion. */
  var payload: js.UndefOr[SecretPayload] = js.undefined
}
object AddSecretVersionRequest {
  
  inline def apply(): AddSecretVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSecretVersionRequest]
  }
  
  extension [Self <: AddSecretVersionRequest](x: Self) {
    
    inline def setPayload(value: SecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
