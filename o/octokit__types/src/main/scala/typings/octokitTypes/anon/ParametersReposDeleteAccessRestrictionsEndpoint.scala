package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposDeleteAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposDeleteAccessRestrictionsEndpoint
  
  var request: ReposDeleteAccessRestrictionsRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersReposDeleteAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteAccessRestrictionsEndpoint,
    request: ReposDeleteAccessRestrictionsRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersReposDeleteAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposDeleteAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
