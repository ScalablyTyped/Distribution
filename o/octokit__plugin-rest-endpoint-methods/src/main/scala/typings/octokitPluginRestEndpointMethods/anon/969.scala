package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagEndpoint
import typings.octokitTypes.endpointsMod.ReposGetReleaseByTagResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `969` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetReleaseByTagEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetReleaseByTagResponseData] = js.native
}
object `969` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReleaseByTagEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseByTagResponseData]
  ): `969` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`969`]
  }
  
  @scala.inline
  implicit class `969MutableBuilder`[Self <: `969`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetReleaseByTagEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseByTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
