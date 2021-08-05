package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposUpdateBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1021` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposUpdateBranchProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
}
object `1021` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposUpdateBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposUpdateBranchProtectionResponseData]
  ): `1021` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1021`]
  }
  
  extension [Self <: `1021`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposUpdateBranchProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposUpdateBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
