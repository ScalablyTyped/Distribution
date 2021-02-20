package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListContributorsEndpoint
import typings.octokitTypes.endpointsMod.ReposListContributorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListContributorsEndpoint extends StObject {
  
  var parameters: ReposListContributorsEndpoint = js.native
  
  var response: OctokitResponse[ReposListContributorsResponseData] = js.native
}
object ParametersReposListContributorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListContributorsEndpoint,
    response: OctokitResponse[ReposListContributorsResponseData]
  ): ParametersReposListContributorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListContributorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListContributorsEndpointMutableBuilder[Self <: ParametersReposListContributorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListContributorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListContributorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
