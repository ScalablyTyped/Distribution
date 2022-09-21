package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceConfigRequest extends StObject {
  
  /** The instance configurations to be updated. */
  var config: js.UndefOr[InstanceConfig] = js.undefined
}
object UpdateInstanceConfigRequest {
  
  inline def apply(): UpdateInstanceConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceConfigRequest]
  }
  
  extension [Self <: UpdateInstanceConfigRequest](x: Self) {
    
    inline def setConfig(value: InstanceConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
