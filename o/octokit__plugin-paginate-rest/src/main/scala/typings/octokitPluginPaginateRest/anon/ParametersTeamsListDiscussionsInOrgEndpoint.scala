package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsListDiscussionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsListDiscussionsInOrgEndpoint extends StObject {
  
  var parameters: TeamsListDiscussionsInOrgEndpoint
  
  var response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
}
object ParametersTeamsListDiscussionsInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsInOrgEndpoint,
    response: OctokitResponse[TeamsListDiscussionsInOrgResponseData]
  ): ParametersTeamsListDiscussionsInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsListDiscussionsInOrgEndpointMutableBuilder[Self <: ParametersTeamsListDiscussionsInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsListDiscussionsInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
