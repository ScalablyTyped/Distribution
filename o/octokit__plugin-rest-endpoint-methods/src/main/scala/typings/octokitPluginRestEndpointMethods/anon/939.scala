package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetAdminBranchProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `939` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
}
object `939` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAdminBranchProtectionResponseData]
  ): `939` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`939`]
  }
  
  extension [Self <: `939`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetAdminBranchProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetAdminBranchProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
