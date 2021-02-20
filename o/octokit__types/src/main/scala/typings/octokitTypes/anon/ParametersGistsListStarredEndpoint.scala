package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typings.octokitTypes.endpointsMod.GistsListStarredRequestOptions
import typings.octokitTypes.endpointsMod.GistsListStarredResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListStarredEndpoint extends StObject {
  
  var parameters: GistsListStarredEndpoint = js.native
  
  var request: GistsListStarredRequestOptions = js.native
  
  var response: OctokitResponse[GistsListStarredResponseData] = js.native
}
object ParametersGistsListStarredEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListStarredEndpoint,
    request: GistsListStarredRequestOptions,
    response: OctokitResponse[GistsListStarredResponseData]
  ): ParametersGistsListStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListStarredEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListStarredEndpointMutableBuilder[Self <: ParametersGistsListStarredEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListStarredEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListStarredRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListStarredResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
