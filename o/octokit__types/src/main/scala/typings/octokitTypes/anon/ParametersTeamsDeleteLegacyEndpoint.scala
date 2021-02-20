package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyEndpoint
import typings.octokitTypes.endpointsMod.TeamsDeleteLegacyRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersTeamsDeleteLegacyEndpoint extends StObject {
  
  var parameters: TeamsDeleteLegacyEndpoint = js.native
  
  var request: TeamsDeleteLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersTeamsDeleteLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: TeamsDeleteLegacyEndpoint,
    request: TeamsDeleteLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersTeamsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsDeleteLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersTeamsDeleteLegacyEndpointMutableBuilder[Self <: ParametersTeamsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: TeamsDeleteLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: TeamsDeleteLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
