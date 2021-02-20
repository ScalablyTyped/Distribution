package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsEndpoint
import typings.octokitTypes.endpointsMod.ReposListReleaseAssetsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListReleaseAssetsEndpoint extends StObject {
  
  var parameters: ReposListReleaseAssetsEndpoint = js.native
  
  var response: OctokitResponse[ReposListReleaseAssetsResponseData] = js.native
}
object ParametersReposListReleaseAssetsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListReleaseAssetsEndpoint,
    response: OctokitResponse[ReposListReleaseAssetsResponseData]
  ): ParametersReposListReleaseAssetsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleaseAssetsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListReleaseAssetsEndpointMutableBuilder[Self <: ParametersReposListReleaseAssetsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListReleaseAssetsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleaseAssetsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
