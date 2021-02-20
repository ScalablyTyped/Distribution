package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesSetLabelsRequestOptions
import typings.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesSetLabelsEndpoint extends StObject {
  
  var parameters: IssuesSetLabelsEndpoint = js.native
  
  var request: IssuesSetLabelsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesSetLabelsResponseData] = js.native
}
object ParametersIssuesSetLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesSetLabelsEndpoint,
    request: IssuesSetLabelsRequestOptions,
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): ParametersIssuesSetLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesSetLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesSetLabelsEndpointMutableBuilder[Self <: ParametersIssuesSetLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesSetLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesSetLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesSetLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
