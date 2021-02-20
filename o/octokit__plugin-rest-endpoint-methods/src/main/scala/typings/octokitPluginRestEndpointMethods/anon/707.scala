package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetTreeEndpoint
import typings.octokitTypes.endpointsMod.GitGetTreeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `707` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitGetTreeResponseData] = js.native
}
object `707` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetTreeResponseData]
  ): `707` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`707`]
  }
  
  @scala.inline
  implicit class `707MutableBuilder`[Self <: `707`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitGetTreeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
