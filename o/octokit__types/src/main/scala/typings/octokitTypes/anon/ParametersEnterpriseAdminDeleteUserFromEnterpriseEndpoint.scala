package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteUserFromEnterpriseEndpoint
import typings.octokitTypes.endpointsMod.EnterpriseAdminDeleteUserFromEnterpriseRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminDeleteUserFromEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminDeleteUserFromEnterpriseEndpoint,
    request: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminDeleteUserFromEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminDeleteUserFromEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminDeleteUserFromEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
