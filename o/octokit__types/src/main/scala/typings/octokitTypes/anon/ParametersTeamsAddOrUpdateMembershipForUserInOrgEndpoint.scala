package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateMembershipForUserInOrgEndpoint = js.native
  
  var request: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions = js.native
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
  ] = js.native
}
object ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipForUserInOrgEndpoint,
    request: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpointMutableBuilder[Self <: ParametersTeamsAddOrUpdateMembershipForUserInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsAddOrUpdateMembershipForUserInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateMembershipForUserInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserInOrgResponseData | TeamsAddOrUpdateMembershipForUserInOrgResponse422Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
