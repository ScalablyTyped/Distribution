package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentDeviceId extends StObject {
  
  /** Third-party device ID. */
  var id: js.UndefOr[String] = js.native
}
object AgentDeviceId {
  
  @scala.inline
  def apply(): AgentDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentDeviceId]
  }
  
  @scala.inline
  implicit class AgentDeviceIdMutableBuilder[Self <: AgentDeviceId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
