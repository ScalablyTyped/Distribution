package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListForOrgEndpoint
import typings.octokitTypes.endpointsMod.ReposListForOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListForOrgEndpoint extends StObject {
  
  var parameters: ReposListForOrgEndpoint = js.native
  
  var response: OctokitResponse[ReposListForOrgResponseData] = js.native
}
object ParametersReposListForOrgEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListForOrgEndpoint, response: OctokitResponse[ReposListForOrgResponseData]): ParametersReposListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForOrgEndpointMutableBuilder[Self <: ParametersReposListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
