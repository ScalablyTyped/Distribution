package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsEndpoint
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsRequestOptions
import typings.octokitTypes.endpointsMod.ReposRemoveTeamAccessRestrictionsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveTeamAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposRemoveTeamAccessRestrictionsEndpoint = js.native
  
  var request: ReposRemoveTeamAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData] = js.native
}
object ParametersReposRemoveTeamAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveTeamAccessRestrictionsEndpoint,
    request: ReposRemoveTeamAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]
  ): ParametersReposRemoveTeamAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveTeamAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveTeamAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposRemoveTeamAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveTeamAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveTeamAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveTeamAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
