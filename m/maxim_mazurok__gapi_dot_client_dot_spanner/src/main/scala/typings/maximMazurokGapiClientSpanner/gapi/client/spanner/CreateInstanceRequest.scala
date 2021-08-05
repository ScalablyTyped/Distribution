package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInstanceRequest extends StObject {
  
  /** Required. The instance to create. The name may be omitted, but if specified must be `/instances/`. */
  var instance: js.UndefOr[Instance] = js.undefined
  
  /** Required. The ID of the instance to create. Valid identifiers are of the form `a-z*[a-z0-9]` and must be between 2 and 64 characters in length. */
  var instanceId: js.UndefOr[String] = js.undefined
}
object CreateInstanceRequest {
  
  inline def apply(): CreateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInstanceRequest]
  }
  
  extension [Self <: CreateInstanceRequest](x: Self) {
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
