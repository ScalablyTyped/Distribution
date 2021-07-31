package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListReposInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListReposInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListReposInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListReposInOrgEndpoint extends StObject {
  
  var parameters: TeamsListReposInOrgEndpoint
  
  var request: TeamsListReposInOrgRequestOptions
  
  var response: OctokitResponse[TeamsListReposInOrgResponseData]
}
object ParametersTeamsListReposInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListReposInOrgEndpoint,
    request: TeamsListReposInOrgRequestOptions,
    response: OctokitResponse[TeamsListReposInOrgResponseData]
  ): ParametersTeamsListReposInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListReposInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListReposInOrgEndpointMutableBuilder[Self <: ParametersTeamsListReposInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListReposInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListReposInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListReposInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
