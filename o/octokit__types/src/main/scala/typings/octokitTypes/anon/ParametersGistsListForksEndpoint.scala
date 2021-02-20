package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListForksEndpoint
import typings.octokitTypes.endpointsMod.GistsListForksRequestOptions
import typings.octokitTypes.endpointsMod.GistsListForksResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListForksEndpoint extends StObject {
  
  var parameters: GistsListForksEndpoint = js.native
  
  var request: GistsListForksRequestOptions = js.native
  
  var response: OctokitResponse[GistsListForksResponseData] = js.native
}
object ParametersGistsListForksEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListForksEndpoint,
    request: GistsListForksRequestOptions,
    response: OctokitResponse[GistsListForksResponseData]
  ): ParametersGistsListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListForksEndpointMutableBuilder[Self <: ParametersGistsListForksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListForksRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
