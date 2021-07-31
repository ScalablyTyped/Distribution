package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typings.octokitTypes.endpointsMod.TeamsCreateRequestOptions
import typings.octokitTypes.endpointsMod.TeamsCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersTeamsCreateEndpoint extends StObject {
  
  var parameters: TeamsCreateEndpoint
  
  var request: TeamsCreateRequestOptions
  
  var response: OctokitResponse[TeamsCreateResponseData]
}
object ParametersTeamsCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsCreateEndpoint,
    request: TeamsCreateRequestOptions,
    response: OctokitResponse[TeamsCreateResponseData]
  ): ParametersTeamsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsCreateEndpointMutableBuilder[Self <: ParametersTeamsCreateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsCreateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsCreateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
