package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveAllLabelsRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesRemoveAllLabelsEndpoint extends StObject {
  
  var parameters: IssuesRemoveAllLabelsEndpoint = js.native
  
  var request: IssuesRemoveAllLabelsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersIssuesRemoveAllLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesRemoveAllLabelsEndpoint,
    request: IssuesRemoveAllLabelsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersIssuesRemoveAllLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveAllLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesRemoveAllLabelsEndpointMutableBuilder[Self <: ParametersIssuesRemoveAllLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesRemoveAllLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesRemoveAllLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
