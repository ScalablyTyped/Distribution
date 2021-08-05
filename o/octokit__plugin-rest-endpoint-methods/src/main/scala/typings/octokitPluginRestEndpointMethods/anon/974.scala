package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetUsersWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `974` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
}
object `974` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]
  ): `974` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`974`]
  }
  
  extension [Self <: `974`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetUsersWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetUsersWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
