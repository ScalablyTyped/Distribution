package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsRequestOptions
import typings.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListAnnotationsEndpoint extends StObject {
  
  var parameters: ChecksListAnnotationsEndpoint = js.native
  
  var request: ChecksListAnnotationsRequestOptions = js.native
  
  var response: OctokitResponse[ChecksListAnnotationsResponseData] = js.native
}
object ParametersChecksListAnnotationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListAnnotationsEndpoint,
    request: ChecksListAnnotationsRequestOptions,
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): ParametersChecksListAnnotationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListAnnotationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListAnnotationsEndpointMutableBuilder[Self <: ParametersChecksListAnnotationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListAnnotationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksListAnnotationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListAnnotationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
