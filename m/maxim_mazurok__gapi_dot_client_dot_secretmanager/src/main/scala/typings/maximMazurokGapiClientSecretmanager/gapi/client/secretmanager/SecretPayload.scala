package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretPayload extends StObject {
  
  /** The secret data. Must be no larger than 64KiB. */
  var data: js.UndefOr[String] = js.undefined
}
object SecretPayload {
  
  @scala.inline
  def apply(): SecretPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretPayload]
  }
  
  @scala.inline
  implicit class SecretPayloadMutableBuilder[Self <: SecretPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
