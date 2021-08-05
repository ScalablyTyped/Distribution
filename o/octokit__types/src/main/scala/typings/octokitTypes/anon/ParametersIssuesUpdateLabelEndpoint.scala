package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesUpdateLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelRequestOptions
import typings.octokitTypes.endpointsMod.IssuesUpdateLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesUpdateLabelEndpoint extends StObject {
  
  var parameters: IssuesUpdateLabelEndpoint
  
  var request: IssuesUpdateLabelRequestOptions
  
  var response: OctokitResponse[IssuesUpdateLabelResponseData]
}
object ParametersIssuesUpdateLabelEndpoint {
  
  inline def apply(
    parameters: IssuesUpdateLabelEndpoint,
    request: IssuesUpdateLabelRequestOptions,
    response: OctokitResponse[IssuesUpdateLabelResponseData]
  ): ParametersIssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateLabelEndpoint]
  }
  
  extension [Self <: ParametersIssuesUpdateLabelEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesUpdateLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesUpdateLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesUpdateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
