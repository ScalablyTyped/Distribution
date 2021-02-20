package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesGetEventEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetEventRequestOptions
import typings.octokitTypes.endpointsMod.IssuesGetEventResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetEventEndpoint extends StObject {
  
  var parameters: IssuesGetEventEndpoint = js.native
  
  var request: IssuesGetEventRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetEventResponseData] = js.native
}
object ParametersIssuesGetEventEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetEventEndpoint,
    request: IssuesGetEventRequestOptions,
    response: OctokitResponse[IssuesGetEventResponseData]
  ): ParametersIssuesGetEventEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEventEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetEventEndpointMutableBuilder[Self <: ParametersIssuesGetEventEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesGetEventEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetEventRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetEventResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
