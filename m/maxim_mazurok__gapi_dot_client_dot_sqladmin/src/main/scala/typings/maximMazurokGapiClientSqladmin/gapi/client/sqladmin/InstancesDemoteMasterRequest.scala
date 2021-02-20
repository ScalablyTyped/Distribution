package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesDemoteMasterRequest extends StObject {
  
  /** Contains details about the demoteMaster operation. */
  var demoteMasterContext: js.UndefOr[DemoteMasterContext] = js.native
}
object InstancesDemoteMasterRequest {
  
  @scala.inline
  def apply(): InstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesDemoteMasterRequest]
  }
  
  @scala.inline
  implicit class InstancesDemoteMasterRequestMutableBuilder[Self <: InstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDemoteMasterContext(value: DemoteMasterContext): Self = StObject.set(x, "demoteMasterContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemoteMasterContextUndefined: Self = StObject.set(x, "demoteMasterContext", js.undefined)
  }
}
