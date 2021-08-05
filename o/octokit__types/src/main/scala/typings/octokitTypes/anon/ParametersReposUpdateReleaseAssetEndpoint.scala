package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposUpdateReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposUpdateReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposUpdateReleaseAssetEndpoint
  
  var request: ReposUpdateReleaseAssetRequestOptions
  
  var response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
}
object ParametersReposUpdateReleaseAssetEndpoint {
  
  inline def apply(
    parameters: ReposUpdateReleaseAssetEndpoint,
    request: ReposUpdateReleaseAssetRequestOptions,
    response: OctokitResponse[ReposUpdateReleaseAssetResponseData]
  ): ParametersReposUpdateReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateReleaseAssetEndpoint]
  }
  
  extension [Self <: ParametersReposUpdateReleaseAssetEndpoint](x: Self) {
    
    inline def setParameters(value: ReposUpdateReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposUpdateReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
