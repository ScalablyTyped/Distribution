package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResponsePayload extends StObject {
  
  /** Third-party user ID */
  var agentUserId: js.UndefOr[String] = js.undefined
  
  /** Devices associated with the third-party user. */
  var devices: js.UndefOr[js.Array[Device]] = js.undefined
}
object SyncResponsePayload {
  
  inline def apply(): SyncResponsePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResponsePayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResponsePayload] (val x: Self) extends AnyVal {
    
    inline def setAgentUserId(value: String): Self = StObject.set(x, "agentUserId", value.asInstanceOf[js.Any])
    
    inline def setAgentUserIdUndefined: Self = StObject.set(x, "agentUserId", js.undefined)
    
    inline def setDevices(value: js.Array[Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: Device*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
