package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchEndpoint
import typings.octokitTypes.endpointsMod.ReposGetTeamsWithAccessToProtectedBranchResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `971` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
}
object `971` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]
  ): `971` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`971`]
  }
  
  @scala.inline
  implicit class `971MutableBuilder`[Self <: `971`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposGetTeamsWithAccessToProtectedBranchEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTeamsWithAccessToProtectedBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
