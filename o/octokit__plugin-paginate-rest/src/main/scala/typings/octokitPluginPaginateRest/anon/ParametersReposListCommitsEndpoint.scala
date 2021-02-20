package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCommitsEndpoint extends StObject {
  
  var parameters: ReposListCommitsEndpoint = js.native
  
  var response: OctokitResponse[ReposListCommitsResponseData] = js.native
}
object ParametersReposListCommitsEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListCommitsEndpoint, response: OctokitResponse[ReposListCommitsResponseData]): ParametersReposListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCommitsEndpointMutableBuilder[Self <: ParametersReposListCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
