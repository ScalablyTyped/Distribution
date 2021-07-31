package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsGetBySlugEndpoint
import typings.octokitTypes.endpointsMod.AppsGetBySlugResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `629` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsGetBySlugResponseData]
}
object `629` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsGetBySlugResponseData]
  ): `629` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`629`]
  }
  
  @scala.inline
  implicit class `629MutableBuilder`[Self <: `629`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[AppsGetBySlugEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetBySlugResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
