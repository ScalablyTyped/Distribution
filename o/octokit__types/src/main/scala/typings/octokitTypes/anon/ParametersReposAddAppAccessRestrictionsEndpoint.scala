package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposAddAppAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddAppAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddAppAccessRestrictionsEndpoint = js.native
  
  var request: ReposAddAppAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData] = js.native
}
object ParametersReposAddAppAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddAppAccessRestrictionsEndpoint,
    request: ReposAddAppAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]
  ): ParametersReposAddAppAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddAppAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddAppAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposAddAppAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAddAppAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddAppAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddAppAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
