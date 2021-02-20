package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.LicensesGetEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `757` extends StObject {
  
  var parameters: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[LicensesGetResponseData] = js.native
}
object `757` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[LicensesGetResponseData]
  ): `757` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`757`]
  }
  
  @scala.inline
  implicit class `757MutableBuilder`[Self <: `757`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[LicensesGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[LicensesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
