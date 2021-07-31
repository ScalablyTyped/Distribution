package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `834` extends StObject {
  
  var parameters: RequestParameters & (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData]
}
object `834` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): `834` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`834`]
  }
  
  @scala.inline
  implicit class `834MutableBuilder`[Self <: `834`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ProjectsListCollaboratorsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
