package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsCheckPermissionsForRepoInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1042` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsCheckPermissionsForRepoInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
}
object `1042` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsCheckPermissionsForRepoInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]
  ): `1042` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1042`]
  }
  
  @scala.inline
  implicit class `1042MutableBuilder`[Self <: `1042`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[TeamsCheckPermissionsForRepoInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCheckPermissionsForRepoInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
