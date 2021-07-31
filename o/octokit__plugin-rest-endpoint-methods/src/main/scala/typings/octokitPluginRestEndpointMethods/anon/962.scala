package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildEndpoint
import typings.octokitTypes.endpointsMod.ReposGetPagesBuildResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `962` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetPagesBuildResponseData]
}
object `962` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPagesBuildResponseData]
  ): `962` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`962`]
  }
  
  @scala.inline
  implicit class `962MutableBuilder`[Self <: `962`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposGetPagesBuildEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesBuildResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
