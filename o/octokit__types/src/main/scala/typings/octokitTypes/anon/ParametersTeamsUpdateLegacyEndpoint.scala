package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyRequestOptions
import typings.octokitTypes.endpointsMod.TeamsUpdateLegacyResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsUpdateLegacyEndpoint extends StObject {
  
  var parameters: TeamsUpdateLegacyEndpoint
  
  var request: TeamsUpdateLegacyRequestOptions
  
  var response: OctokitResponse[TeamsUpdateLegacyResponseData]
}
object ParametersTeamsUpdateLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsUpdateLegacyEndpoint,
    request: TeamsUpdateLegacyRequestOptions,
    response: OctokitResponse[TeamsUpdateLegacyResponseData]
  ): ParametersTeamsUpdateLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsUpdateLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsUpdateLegacyEndpointMutableBuilder[Self <: ParametersTeamsUpdateLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsUpdateLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsUpdateLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsUpdateLegacyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
