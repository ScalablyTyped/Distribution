package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesRemoveLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesRemoveLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesRemoveLabelEndpoint extends StObject {
  
  var parameters: IssuesRemoveLabelEndpoint = js.native
  
  var request: IssuesRemoveLabelRequestOptions = js.native
  
  var response: OctokitResponse[IssuesRemoveLabelResponseData] = js.native
}
object ParametersIssuesRemoveLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesRemoveLabelEndpoint,
    request: IssuesRemoveLabelRequestOptions,
    response: OctokitResponse[IssuesRemoveLabelResponseData]
  ): ParametersIssuesRemoveLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesRemoveLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesRemoveLabelEndpointMutableBuilder[Self <: ParametersIssuesRemoveLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesRemoveLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesRemoveLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
