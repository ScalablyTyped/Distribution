package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposSetAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposSetAppAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposSetAppAccessRestrictionsEndpoint = js.native
  
  var request: ReposSetAppAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData] = js.native
}
object ParametersReposSetAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposSetAppAccessRestrictionsEndpoint,
    request: ReposSetAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]
  ): ParametersReposSetAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposSetAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposSetAppAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposSetAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposSetAppAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposSetAppAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetAppAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
