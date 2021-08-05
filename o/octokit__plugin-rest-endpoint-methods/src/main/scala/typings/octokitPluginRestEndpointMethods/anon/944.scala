package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `944` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetBranchProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetBranchProtectionResponseData]
}
object `944` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetBranchProtectionResponseData]
  ): `944` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`944`]
  }
  
  extension [Self <: `944`](x: Self) {
    
    inline def setParameters(value: RequestParameters & (Omit[ReposGetBranchProtectionEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
