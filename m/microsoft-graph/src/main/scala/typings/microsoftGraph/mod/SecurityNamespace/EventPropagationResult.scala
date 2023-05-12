package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPropagationResult extends StObject {
  
  // The name of the specific location in the workload associated with the event.
  var location: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the workload associated with the event.
  var serviceName: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Indicates the status of the event creation request. The possible values are: none, inProcessing, failed, success,
    * unknownFutureValue.
    */
  var status: js.UndefOr[NullableOption[EventPropagationStatus]] = js.undefined
  
  // Additional information about the status of the event creation request.
  var statusInformation: js.UndefOr[NullableOption[String]] = js.undefined
}
object EventPropagationResult {
  
  inline def apply(): EventPropagationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPropagationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventPropagationResult] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: NullableOption[String]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setServiceName(value: NullableOption[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setStatus(value: NullableOption[EventPropagationStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusInformation(value: NullableOption[String]): Self = StObject.set(x, "statusInformation", value.asInstanceOf[js.Any])
    
    inline def setStatusInformationNull: Self = StObject.set(x, "statusInformation", null)
    
    inline def setStatusInformationUndefined: Self = StObject.set(x, "statusInformation", js.undefined)
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
