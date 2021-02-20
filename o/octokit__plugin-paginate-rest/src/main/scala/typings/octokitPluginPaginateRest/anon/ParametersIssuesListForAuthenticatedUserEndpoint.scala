package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typings.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: IssuesListForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData] = js.native
}
object ParametersIssuesListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListForAuthenticatedUserEndpoint,
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): ParametersIssuesListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersIssuesListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
