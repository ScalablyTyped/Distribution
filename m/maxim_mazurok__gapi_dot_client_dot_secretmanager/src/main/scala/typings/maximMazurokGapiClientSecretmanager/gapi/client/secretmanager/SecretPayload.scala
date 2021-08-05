package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretPayload extends StObject {
  
  /** The secret data. Must be no larger than 64KiB. */
  var data: js.UndefOr[String] = js.undefined
}
object SecretPayload {
  
  inline def apply(): SecretPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecretPayload]
  }
  
  extension [Self <: SecretPayload](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
