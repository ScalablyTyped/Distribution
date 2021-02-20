package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckRequest extends StObject {
  
  /** Describes attributes about the operation being executed by the service. */
  var attributes: js.UndefOr[AttributeContext] = js.native
  
  /** Describes the resources and the policies applied to each resource. */
  var resources: js.UndefOr[js.Array[ResourceInfo]] = js.native
  
  /**
    * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to 'latest' to specify using the latest
    * configuration.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}
object CheckRequest {
  
  @scala.inline
  def apply(): CheckRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckRequest]
  }
  
  @scala.inline
  implicit class CheckRequestMutableBuilder[Self <: CheckRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeContext): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setResources(value: js.Array[ResourceInfo]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: ResourceInfo*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
