package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListTeamsEndpoint
import typings.octokitTypes.endpointsMod.ReposListTeamsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListTeamsEndpoint extends StObject {
  
  var parameters: ReposListTeamsEndpoint = js.native
  
  var response: OctokitResponse[ReposListTeamsResponseData] = js.native
}
object ParametersReposListTeamsEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListTeamsEndpoint, response: OctokitResponse[ReposListTeamsResponseData]): ParametersReposListTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTeamsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListTeamsEndpointMutableBuilder[Self <: ParametersReposListTeamsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListTeamsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTeamsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
