package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetRequestOptions
import typings.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposGetReleaseAssetEndpoint extends StObject {
  
  var parameters: ReposGetReleaseAssetEndpoint
  
  var request: ReposGetReleaseAssetRequestOptions
  
  var response: OctokitResponse[ReposGetReleaseAssetResponseData]
}
object ParametersReposGetReleaseAssetEndpoint {
  
  inline def apply(
    parameters: ReposGetReleaseAssetEndpoint,
    request: ReposGetReleaseAssetRequestOptions,
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): ParametersReposGetReleaseAssetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseAssetEndpoint]
  }
  
  extension [Self <: ParametersReposGetReleaseAssetEndpoint](x: Self) {
    
    inline def setParameters(value: ReposGetReleaseAssetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: ReposGetReleaseAssetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
