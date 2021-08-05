package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesDeleteLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesDeleteLabelRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesDeleteLabelEndpoint extends StObject {
  
  var parameters: IssuesDeleteLabelEndpoint
  
  var request: IssuesDeleteLabelRequestOptions
  
  var response: OctokitResponse[js.Any]
}
object ParametersIssuesDeleteLabelEndpoint {
  
  inline def apply(
    parameters: IssuesDeleteLabelEndpoint,
    request: IssuesDeleteLabelRequestOptions,
    response: OctokitResponse[js.Any]
  ): ParametersIssuesDeleteLabelEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesDeleteLabelEndpoint]
  }
  
  extension [Self <: ParametersIssuesDeleteLabelEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesDeleteLabelEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesDeleteLabelRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[js.Any]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
