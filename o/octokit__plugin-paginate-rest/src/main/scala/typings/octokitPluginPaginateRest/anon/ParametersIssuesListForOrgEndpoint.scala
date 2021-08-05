package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForOrgEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListForOrgEndpoint extends StObject {
  
  var parameters: IssuesListForOrgEndpoint
  
  var response: OctokitResponse[IssuesListForOrgResponseData]
}
object ParametersIssuesListForOrgEndpoint {
  
  inline def apply(parameters: IssuesListForOrgEndpoint, response: OctokitResponse[IssuesListForOrgResponseData]): ParametersIssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForOrgEndpoint]
  }
  
  extension [Self <: ParametersIssuesListForOrgEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
