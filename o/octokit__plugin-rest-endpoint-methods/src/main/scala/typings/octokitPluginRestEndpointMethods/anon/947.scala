package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCollaboratorPermissionLevelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `947` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
}
object `947` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]
  ): `947` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`947`]
  }
  
  extension [Self <: `947`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetCollaboratorPermissionLevelEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCollaboratorPermissionLevelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
