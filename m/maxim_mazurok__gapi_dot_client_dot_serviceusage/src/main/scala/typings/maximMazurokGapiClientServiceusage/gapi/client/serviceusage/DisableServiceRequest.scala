package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableServiceRequest extends StObject {
  
  /** Defines the behavior for checking service usage when disabling a service. */
  var checkIfServiceHasUsage: js.UndefOr[String] = js.native
  
  /**
    * Indicates if services that are enabled and which depend on this service should also be disabled. If not set, an error will be generated if any enabled services depend on the service
    * to be disabled. When set, the service, and any enabled services that depend on it, will be disabled together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.native
}
object DisableServiceRequest {
  
  @scala.inline
  def apply(): DisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceRequest]
  }
  
  @scala.inline
  implicit class DisableServiceRequestMutableBuilder[Self <: DisableServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckIfServiceHasUsage(value: String): Self = StObject.set(x, "checkIfServiceHasUsage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfServiceHasUsageUndefined: Self = StObject.set(x, "checkIfServiceHasUsage", js.undefined)
    
    @scala.inline
    def setDisableDependentServices(value: Boolean): Self = StObject.set(x, "disableDependentServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableDependentServicesUndefined: Self = StObject.set(x, "disableDependentServices", js.undefined)
  }
}
