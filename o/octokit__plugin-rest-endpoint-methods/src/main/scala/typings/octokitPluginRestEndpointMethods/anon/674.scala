package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetConductCodeResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `674` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodesOfConductGetConductCodeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodesOfConductGetConductCodeResponseData] = js.native
}
object `674` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodesOfConductGetConductCodeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetConductCodeResponseData]
  ): `674` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`674`]
  }
  
  @scala.inline
  implicit class `674MutableBuilder`[Self <: `674`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[CodesOfConductGetConductCodeEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetConductCodeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
