package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgEndpoint
import typings.octokitTypes.endpointsMod.TeamsAddOrUpdateProjectPermissionsInOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1039` extends StObject {
  
  var parameters: RequestParameters & (Omit[TeamsAddOrUpdateProjectPermissionsInOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
}
object `1039` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[TeamsAddOrUpdateProjectPermissionsInOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]
  ): `1039` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1039`]
  }
  
  @scala.inline
  implicit class `1039MutableBuilder`[Self <: `1039`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[TeamsAddOrUpdateProjectPermissionsInOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsAddOrUpdateProjectPermissionsInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
