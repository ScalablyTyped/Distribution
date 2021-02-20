package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListReleasesEndpoint extends StObject {
  
  var parameters: ReposListReleasesEndpoint = js.native
  
  var response: OctokitResponse[ReposListReleasesResponseData] = js.native
}
object ParametersReposListReleasesEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListReleasesEndpoint, response: OctokitResponse[ReposListReleasesResponseData]): ParametersReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleasesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListReleasesEndpointMutableBuilder[Self <: ParametersReposListReleasesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListReleasesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleasesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
