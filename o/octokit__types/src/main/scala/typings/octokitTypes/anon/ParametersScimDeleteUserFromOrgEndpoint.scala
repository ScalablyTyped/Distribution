package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ScimDeleteUserFromOrgEndpoint
import typings.octokitTypes.endpointsMod.ScimDeleteUserFromOrgRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersScimDeleteUserFromOrgEndpoint extends StObject {
  
  var parameters: ScimDeleteUserFromOrgEndpoint
  
  var request: ScimDeleteUserFromOrgRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersScimDeleteUserFromOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimDeleteUserFromOrgEndpoint,
    request: ScimDeleteUserFromOrgRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersScimDeleteUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimDeleteUserFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimDeleteUserFromOrgEndpointMutableBuilder[Self <: ParametersScimDeleteUserFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimDeleteUserFromOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimDeleteUserFromOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
