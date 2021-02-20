package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsListPublicEndpoint
import typings.octokitTypes.endpointsMod.GistsListPublicRequestOptions
import typings.octokitTypes.endpointsMod.GistsListPublicResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListPublicEndpoint extends StObject {
  
  var parameters: GistsListPublicEndpoint = js.native
  
  var request: GistsListPublicRequestOptions = js.native
  
  var response: OctokitResponse[GistsListPublicResponseData] = js.native
}
object ParametersGistsListPublicEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListPublicEndpoint,
    request: GistsListPublicRequestOptions,
    response: OctokitResponse[GistsListPublicResponseData]
  ): ParametersGistsListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListPublicEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListPublicEndpointMutableBuilder[Self <: ParametersGistsListPublicEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListPublicEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListPublicRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
