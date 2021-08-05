package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposSetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1013` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposSetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
}
object `1013` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposSetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposSetAdminBranchProtectionResponseData]
  ): `1013` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1013`]
  }
  
  extension [Self <: `1013`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposSetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposSetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
