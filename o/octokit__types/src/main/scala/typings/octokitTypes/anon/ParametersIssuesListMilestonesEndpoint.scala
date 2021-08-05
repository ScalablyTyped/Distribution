package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.IssuesListMilestonesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListMilestonesRequestOptions
import typings.octokitTypes.endpointsMod.IssuesListMilestonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListMilestonesEndpoint extends StObject {
  
  var parameters: IssuesListMilestonesEndpoint
  
  var request: IssuesListMilestonesRequestOptions
  
  var response: OctokitResponse[IssuesListMilestonesResponseData]
}
object ParametersIssuesListMilestonesEndpoint {
  
  inline def apply(
    parameters: IssuesListMilestonesEndpoint,
    request: IssuesListMilestonesRequestOptions,
    response: OctokitResponse[IssuesListMilestonesResponseData]
  ): ParametersIssuesListMilestonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesEndpoint]
  }
  
  extension [Self <: ParametersIssuesListMilestonesEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListMilestonesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IssuesListMilestonesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListMilestonesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
