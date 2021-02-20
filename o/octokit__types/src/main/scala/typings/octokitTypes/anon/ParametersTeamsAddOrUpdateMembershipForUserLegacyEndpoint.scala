package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint = js.native
  
  var request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions = js.native
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
  ] = js.native
}
object ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint,
    request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpointMutableBuilder[Self <: ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsAddOrUpdateMembershipForUserLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
