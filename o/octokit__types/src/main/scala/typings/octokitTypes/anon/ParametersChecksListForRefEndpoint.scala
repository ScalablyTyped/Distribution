package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForRefRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListForRefEndpoint extends StObject {
  
  var parameters: ChecksListForRefEndpoint = js.native
  
  var request: ChecksListForRefRequestOptions = js.native
  
  var response: OctokitResponse[ChecksListForRefResponseData] = js.native
}
object ParametersChecksListForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListForRefEndpoint,
    request: ChecksListForRefRequestOptions,
    response: OctokitResponse[ChecksListForRefResponseData]
  ): ParametersChecksListForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListForRefEndpointMutableBuilder[Self <: ParametersChecksListForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksListForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
