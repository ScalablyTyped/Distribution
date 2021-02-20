package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryRequestPayload extends StObject {
  
  /** Third-party device IDs for which to get the device states. */
  var devices: js.UndefOr[js.Array[AgentDeviceId]] = js.native
}
object QueryRequestPayload {
  
  @scala.inline
  def apply(): QueryRequestPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRequestPayload]
  }
  
  @scala.inline
  implicit class QueryRequestPayloadMutableBuilder[Self <: QueryRequestPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[AgentDeviceId]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesUndefined: Self = StObject.set(x, "devices", js.undefined)
    
    @scala.inline
    def setDevicesVarargs(value: AgentDeviceId*): Self = StObject.set(x, "devices", js.Array(value :_*))
  }
}
