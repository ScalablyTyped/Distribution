package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposDeleteReleaseAssetRequestOptions
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposDeleteReleaseAssetEndpoint = js.native
  
  var request: ReposDeleteReleaseAssetRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteReleaseAssetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteReleaseAssetEndpoint,
    request: ReposDeleteReleaseAssetRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteReleaseAssetEndpointMutableBuilder[Self <: ParametersReposDeleteReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
