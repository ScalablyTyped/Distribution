package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesFailoverRequest extends StObject {
  
  /** Failover Context. */
  var failoverContext: js.UndefOr[FailoverContext] = js.native
}
object InstancesFailoverRequest {
  
  @scala.inline
  def apply(): InstancesFailoverRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesFailoverRequest]
  }
  
  @scala.inline
  implicit class InstancesFailoverRequestMutableBuilder[Self <: InstancesFailoverRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailoverContext(value: FailoverContext): Self = StObject.set(x, "failoverContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailoverContextUndefined: Self = StObject.set(x, "failoverContext", js.undefined)
  }
}
