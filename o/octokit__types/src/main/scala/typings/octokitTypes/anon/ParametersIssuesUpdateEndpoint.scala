package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateEndpoint extends StObject {
  
  var parameters: IssuesUpdateEndpoint = js.native
  
  var request: IssuesUpdateRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateResponseData] = js.native
}
object ParametersIssuesUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateEndpoint,
    request: IssuesUpdateRequestOptions,
    response: OctokitResponse[IssuesUpdateResponseData]
  ): ParametersIssuesUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateEndpointMutableBuilder[Self <: ParametersIssuesUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
