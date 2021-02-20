package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposUpdateReleaseAssetEndpoint = js.native
  
  var request: ReposUpdateReleaseAssetRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData] = js.native
}
object ParametersReposUpdateReleaseAssetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateReleaseAssetEndpoint,
    request: ReposUpdateReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): ParametersReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateReleaseAssetEndpointMutableBuilder[Self <: ParametersReposUpdateReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
