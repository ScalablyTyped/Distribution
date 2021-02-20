package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksUpdateEndpoint
import typings.octokitTypes.endpointsMod.ChecksUpdateRequestOptions
import typings.octokitTypes.endpointsMod.ChecksUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksUpdateEndpoint extends StObject {
  
  var parameters: ChecksUpdateEndpoint = js.native
  
  var request: ChecksUpdateRequestOptions = js.native
  
  var response: OctokitResponse[ChecksUpdateResponseData] = js.native
}
object ParametersChecksUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksUpdateEndpoint,
    request: ChecksUpdateRequestOptions,
    response: OctokitResponse[ChecksUpdateResponseData]
  ): ParametersChecksUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksUpdateEndpointMutableBuilder[Self <: ParametersChecksUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
