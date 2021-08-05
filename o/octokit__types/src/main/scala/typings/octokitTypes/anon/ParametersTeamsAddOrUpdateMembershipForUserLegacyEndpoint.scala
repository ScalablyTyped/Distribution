package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateMembershipForUserLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint extends StObject {
  
  var parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint
  
  var request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions
  
  var response: OctokitResponse[
    TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
  ]
}
object ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint {
  
  inline def apply(
    parameters: TeamsAddOrUpdateMembershipForUserLegacyEndpoint,
    request: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions,
    response: OctokitResponse[
      TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
    ]
  ): ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint]
  }
  
  extension [Self <: ParametersTeamsAddOrUpdateMembershipForUserLegacyEndpoint](x: Self) {
    
    inline def setParameters(value: TeamsAddOrUpdateMembershipForUserLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: TeamsAddOrUpdateMembershipForUserLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: OctokitResponse[
          TeamsAddOrUpdateMembershipForUserLegacyResponseData | TeamsAddOrUpdateMembershipForUserLegacyResponse422Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
