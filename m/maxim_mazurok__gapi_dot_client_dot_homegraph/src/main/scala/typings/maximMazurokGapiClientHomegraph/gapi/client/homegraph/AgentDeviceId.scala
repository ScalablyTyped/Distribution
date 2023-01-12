package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentDeviceId extends StObject {
  
  /** Third-party device ID. */
  var id: js.UndefOr[String] = js.undefined
}
object AgentDeviceId {
  
  inline def apply(): AgentDeviceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentDeviceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentDeviceId] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
