package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForProjectInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1041` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
}
object `1041` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]
  ): `1041` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1041`]
  }
  
  extension [Self <: `1041`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[TeamsCheckPermissionsForProjectInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[TeamsCheckPermissionsForProjectInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
