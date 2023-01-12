package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesDemoteMasterRequest extends StObject {
  
  /** Contains details about the demoteMaster operation. */
  var demoteMasterContext: js.UndefOr[DemoteMasterContext] = js.undefined
}
object InstancesDemoteMasterRequest {
  
  inline def apply(): InstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDemoteMasterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    
    inline def setDemoteMasterContext(value: DemoteMasterContext): Self = StObject.set(x, "demoteMasterContext", value.asInstanceOf[js.Any])
    
    inline def setDemoteMasterContextUndefined: Self = StObject.set(x, "demoteMasterContext", js.undefined)
  }
}
