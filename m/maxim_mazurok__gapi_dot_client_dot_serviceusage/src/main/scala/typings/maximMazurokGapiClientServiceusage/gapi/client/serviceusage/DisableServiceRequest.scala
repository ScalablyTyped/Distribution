package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableServiceRequest extends StObject {
  
  /** Defines the behavior for checking service usage when disabling a service. */
  var checkIfServiceHasUsage: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if services that are enabled and which depend on this service should also be disabled. If not set, an error will be generated if any enabled services depend on the service
    * to be disabled. When set, the service, and any enabled services that depend on it, will be disabled together.
    */
  var disableDependentServices: js.UndefOr[Boolean] = js.undefined
}
object DisableServiceRequest {
  
  inline def apply(): DisableServiceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableServiceRequest]
  }
  
  extension [Self <: DisableServiceRequest](x: Self) {
    
    inline def setCheckIfServiceHasUsage(value: String): Self = StObject.set(x, "checkIfServiceHasUsage", value.asInstanceOf[js.Any])
    
    inline def setCheckIfServiceHasUsageUndefined: Self = StObject.set(x, "checkIfServiceHasUsage", js.undefined)
    
    inline def setDisableDependentServices(value: Boolean): Self = StObject.set(x, "disableDependentServices", value.asInstanceOf[js.Any])
    
    inline def setDisableDependentServicesUndefined: Self = StObject.set(x, "disableDependentServices", js.undefined)
  }
}
