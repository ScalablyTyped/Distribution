package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsListProjectsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsListProjectsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListProjectsInOrgEndpoint = js.native
  
  var request: TeamsListProjectsInOrgRequestOptions = js.native
  
  var response: OctokitResponse[TeamsListProjectsInOrgResponseData] = js.native
}
object ParametersTeamsListProjectsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListProjectsInOrgEndpoint,
    request: TeamsListProjectsInOrgRequestOptions,
    response: OctokitResponse[TeamsListProjectsInOrgResponseData]
  ): ParametersTeamsListProjectsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListProjectsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListProjectsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListProjectsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListProjectsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsListProjectsInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListProjectsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
