package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListCommentsEndpoint extends StObject {
  
  var parameters: IssuesListCommentsEndpoint = js.native
  
  var response: OctokitResponse[IssuesListCommentsResponseData] = js.native
}
object ParametersIssuesListCommentsEndpoint {
  
  @scala.inline
  def apply(parameters: IssuesListCommentsEndpoint, response: OctokitResponse[IssuesListCommentsResponseData]): ParametersIssuesListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListCommentsEndpointMutableBuilder[Self <: ParametersIssuesListCommentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListCommentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
