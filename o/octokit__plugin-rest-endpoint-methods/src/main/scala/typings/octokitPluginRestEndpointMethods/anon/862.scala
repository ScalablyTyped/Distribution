package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.PullsListReviewCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `862` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListReviewCommentsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
}
object `862` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsListReviewCommentsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewCommentsForRepoResponseData]
  ): `862` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`862`]
  }
  
  extension [Self <: `862`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[PullsListReviewCommentsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsListReviewCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
