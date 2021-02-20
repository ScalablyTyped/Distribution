package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typings.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListBranchesEndpoint extends StObject {
  
  var parameters: ReposListBranchesEndpoint = js.native
  
  var response: OctokitResponse[ReposListBranchesResponseData] = js.native
}
object ParametersReposListBranchesEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListBranchesEndpoint, response: OctokitResponse[ReposListBranchesResponseData]): ParametersReposListBranchesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListBranchesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListBranchesEndpointMutableBuilder[Self <: ParametersReposListBranchesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListBranchesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
