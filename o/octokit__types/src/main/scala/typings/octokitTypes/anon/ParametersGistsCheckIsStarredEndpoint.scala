package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsCheckIsStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsCheckIsStarredRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsCheckIsStarredEndpoint extends StObject {
  
  var parameters: GistsCheckIsStarredEndpoint
  
  var request: GistsCheckIsStarredRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersGistsCheckIsStarredEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCheckIsStarredEndpoint,
    request: GistsCheckIsStarredRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersGistsCheckIsStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCheckIsStarredEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCheckIsStarredEndpointMutableBuilder[Self <: ParametersGistsCheckIsStarredEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsCheckIsStarredEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCheckIsStarredRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
