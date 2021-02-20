package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueRequestOptions
import typings.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsCreateForIssueEndpoint extends StObject {
  
  var parameters: ReactionsCreateForIssueEndpoint = js.native
  
  var request: ReactionsCreateForIssueRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsCreateForIssueResponseData] = js.native
}
object ParametersReactionsCreateForIssueEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsCreateForIssueEndpoint,
    request: ReactionsCreateForIssueRequestOptions,
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): ParametersReactionsCreateForIssueEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsCreateForIssueEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsCreateForIssueEndpointMutableBuilder[Self <: ParametersReactionsCreateForIssueEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsCreateForIssueEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsCreateForIssueRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
