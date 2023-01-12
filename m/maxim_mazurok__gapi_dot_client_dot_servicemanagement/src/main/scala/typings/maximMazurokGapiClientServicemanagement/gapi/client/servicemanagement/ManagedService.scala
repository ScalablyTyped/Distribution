package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedService extends StObject {
  
  /** ID of the project that produces and owns this service. */
  var producerProjectId: js.UndefOr[String] = js.undefined
  
  /** The name of the service. See the [overview](https://cloud.google.com/service-infrastructure/docs/overview) for naming requirements. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ManagedService {
  
  inline def apply(): ManagedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedService] (val x: Self) extends AnyVal {
    
    inline def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    inline def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
