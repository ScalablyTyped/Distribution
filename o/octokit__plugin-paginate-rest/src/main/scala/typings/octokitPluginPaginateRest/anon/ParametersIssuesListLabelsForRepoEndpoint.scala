package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListLabelsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListLabelsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListLabelsForRepoEndpoint
  
  var response: OctokitResponse[IssuesListLabelsForRepoResponseData]
}
object ParametersIssuesListLabelsForRepoEndpoint {
  
  inline def apply(
    parameters: IssuesListLabelsForRepoEndpoint,
    response: OctokitResponse[IssuesListLabelsForRepoResponseData]
  ): ParametersIssuesListLabelsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForRepoEndpoint]
  }
  
  extension [Self <: ParametersIssuesListLabelsForRepoEndpoint](x: Self) {
    
    inline def setParameters(value: IssuesListLabelsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[IssuesListLabelsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
