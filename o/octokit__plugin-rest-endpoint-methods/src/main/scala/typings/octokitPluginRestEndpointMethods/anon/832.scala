package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserEndpoint
import typings.octokitTypes.endpointsMod.ProjectsGetPermissionForUserResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `832` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
}
object `832` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsGetPermissionForUserResponseData]
  ): `832` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`832`]
  }
  
  @scala.inline
  implicit class `832MutableBuilder`[Self <: `832`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ProjectsGetPermissionForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetPermissionForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
