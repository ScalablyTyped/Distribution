package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListEndpoint
import typings.octokitTypes.endpointsMod.GistsListRequestOptions
import typings.octokitTypes.endpointsMod.GistsListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsListEndpoint extends StObject {
  
  var parameters: GistsListEndpoint
  
  var request: GistsListRequestOptions
  
  var response: OctokitResponse[GistsListResponseData]
}
object ParametersGistsListEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListEndpoint,
    request: GistsListRequestOptions,
    response: OctokitResponse[GistsListResponseData]
  ): ParametersGistsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListEndpointMutableBuilder[Self <: ParametersGistsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
