package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesRotateServerCaRequest extends StObject {
  
  /** Contains details about the rotate server CA operation. */
  var rotateServerCaContext: js.UndefOr[RotateServerCaContext] = js.undefined
}
object InstancesRotateServerCaRequest {
  
  inline def apply(): InstancesRotateServerCaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesRotateServerCaRequest]
  }
  
  extension [Self <: InstancesRotateServerCaRequest](x: Self) {
    
    inline def setRotateServerCaContext(value: RotateServerCaContext): Self = StObject.set(x, "rotateServerCaContext", value.asInstanceOf[js.Any])
    
    inline def setRotateServerCaContextUndefined: Self = StObject.set(x, "rotateServerCaContext", js.undefined)
  }
}
