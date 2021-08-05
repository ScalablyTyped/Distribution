package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typings.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `848` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsCreateReviewResponseData]
}
object `848` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): `848` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`848`]
  }
  
  extension [Self <: `848`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[PullsCreateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
