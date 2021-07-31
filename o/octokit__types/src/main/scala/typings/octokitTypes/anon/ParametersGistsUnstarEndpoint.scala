package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsUnstarEndpoint
import typings.octokitTypes.endpointsMod.GistsUnstarRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsUnstarEndpoint extends StObject {
  
  var parameters: GistsUnstarEndpoint
  
  var request: GistsUnstarRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersGistsUnstarEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsUnstarEndpoint,
    request: GistsUnstarRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersGistsUnstarEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsUnstarEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsUnstarEndpointMutableBuilder[Self <: ParametersGistsUnstarEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsUnstarEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsUnstarRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
