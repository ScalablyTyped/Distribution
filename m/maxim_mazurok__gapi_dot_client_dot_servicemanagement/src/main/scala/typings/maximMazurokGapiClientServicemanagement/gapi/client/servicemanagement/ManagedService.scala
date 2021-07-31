package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedService extends StObject {
  
  /** ID of the project that produces and owns this service. */
  var producerProjectId: js.UndefOr[String] = js.undefined
  
  /** The name of the service. See the [overview](/service-management/overview) for naming requirements. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object ManagedService {
  
  @scala.inline
  def apply(): ManagedService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedService]
  }
  
  @scala.inline
  implicit class ManagedServiceMutableBuilder[Self <: ManagedService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProducerProjectId(value: String): Self = StObject.set(x, "producerProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerProjectIdUndefined: Self = StObject.set(x, "producerProjectId", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
