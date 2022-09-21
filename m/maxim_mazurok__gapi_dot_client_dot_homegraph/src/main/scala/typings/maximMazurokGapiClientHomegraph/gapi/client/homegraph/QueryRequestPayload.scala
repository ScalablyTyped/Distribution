package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRequestPayload extends StObject {
  
  /** Third-party device IDs for which to get the device states. */
  var devices: js.UndefOr[js.Array[AgentDeviceId]] = js.undefined
}
object QueryRequestPayload {
  
  inline def apply(): QueryRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequestPayload]
  }
  
  extension [Self <: QueryRequestPayload](x: Self) {
    
    inline def setDevices(value: js.Array[AgentDeviceId]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    inline def setDevicesVarargs(value: AgentDeviceId*): Self = StObject.set(x, "devices", js.Array(value*))
  }
}
