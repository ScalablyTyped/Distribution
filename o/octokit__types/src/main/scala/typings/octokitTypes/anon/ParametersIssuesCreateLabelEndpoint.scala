package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesCreateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesCreateLabelEndpoint extends StObject {
  
  var parameters: IssuesCreateLabelEndpoint
  
  var request: IssuesCreateLabelRequestOptions
  
  var response: OctokitResponse[IssuesCreateLabelResponseData]
}
object ParametersIssuesCreateLabelEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesCreateLabelEndpoint,
    request: IssuesCreateLabelRequestOptions,
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): ParametersIssuesCreateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesCreateLabelEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesCreateLabelEndpointMutableBuilder[Self <: ParametersIssuesCreateLabelEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesCreateLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesCreateLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
