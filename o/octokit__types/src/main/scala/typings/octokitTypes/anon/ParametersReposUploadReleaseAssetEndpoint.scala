package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUploadReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUploadReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposUploadReleaseAssetEndpoint = js.native
  
  var request: ReposUploadReleaseAssetRequestOptions = js.native
  
  var response: OctokitResponse[ReposUploadReleaseAssetResponseData] = js.native
}
object ParametersReposUploadReleaseAssetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUploadReleaseAssetEndpoint,
    request: ReposUploadReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUploadReleaseAssetResponseData]
  ): ParametersReposUploadReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUploadReleaseAssetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUploadReleaseAssetEndpointMutableBuilder[Self <: ParametersReposUploadReleaseAssetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUploadReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUploadReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUploadReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
