package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesEndpoint
import typings.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `670` extends StObject {
  
  var parameters: RequestParameters & (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
}
object `670` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
  ): `670` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`670`]
  }
  
  extension [Self <: `670`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[CodeScanningListRecentAnalysesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
