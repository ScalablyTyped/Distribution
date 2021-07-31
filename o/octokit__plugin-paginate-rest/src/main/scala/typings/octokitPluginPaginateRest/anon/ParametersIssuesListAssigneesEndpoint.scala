package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersIssuesListAssigneesEndpoint extends StObject {
  
  var parameters: IssuesListAssigneesEndpoint
  
  var response: OctokitResponse[IssuesListAssigneesResponseData]
}
object ParametersIssuesListAssigneesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListAssigneesEndpoint,
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): ParametersIssuesListAssigneesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListAssigneesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListAssigneesEndpointMutableBuilder[Self <: ParametersIssuesListAssigneesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListAssigneesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
