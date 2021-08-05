package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdatePullRequestReviewProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1025` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUpdatePullRequestReviewProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
}
object `1025` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposUpdatePullRequestReviewProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]
  ): `1025` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1025`]
  }
  
  extension [Self <: `1025`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposUpdatePullRequestReviewProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdatePullRequestReviewProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
