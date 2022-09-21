package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckRequest extends StObject {
  
  /** Describes attributes about the operation being executed by the service. */
  var attributes: js.UndefOr[AttributeContext] = js.undefined
  
  /** Optional. Contains a comma-separated list of flags. */
  var flags: js.UndefOr[String] = js.undefined
  
  /** Describes the resources and the policies applied to each resource. */
  var resources: js.UndefOr[js.Array[ResourceInfo]] = js.undefined
  
  /**
    * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to 'latest' to specify using the latest
    * configuration.
    */
  var serviceConfigId: js.UndefOr[String] = js.undefined
}
object CheckRequest {
  
  inline def apply(): CheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckRequest]
  }
  
  extension [Self <: CheckRequest](x: Self) {
    
    inline def setAttributes(value: AttributeContext): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setResources(value: js.Array[ResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: ResourceInfo*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
