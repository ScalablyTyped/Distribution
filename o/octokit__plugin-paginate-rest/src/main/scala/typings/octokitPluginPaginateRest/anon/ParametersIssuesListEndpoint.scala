package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListEndpoint
import typings.octokitTypes.endpointsMod.IssuesListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListEndpoint extends StObject {
  
  var parameters: IssuesListEndpoint
  
  var response: OctokitResponse[IssuesListResponseData]
}
object ParametersIssuesListEndpoint {
  
  @scala.inline
  def apply(parameters: IssuesListEndpoint, response: OctokitResponse[IssuesListResponseData]): ParametersIssuesListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEndpointMutableBuilder[Self <: ParametersIssuesListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
