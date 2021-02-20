package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSecretVersionRequest extends StObject {
  
  /** Required. The secret payload of the SecretVersion. */
  var payload: js.UndefOr[SecretPayload] = js.native
}
object AddSecretVersionRequest {
  
  @scala.inline
  def apply(): AddSecretVersionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSecretVersionRequest]
  }
  
  @scala.inline
  implicit class AddSecretVersionRequestMutableBuilder[Self <: AddSecretVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: SecretPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
