package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetClonesEndpoint
import typings.octokitTypes.endpointsMod.ReposGetClonesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `945` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetClonesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetClonesResponseData] = js.native
}
object `945` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetClonesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetClonesResponseData]
  ): `945` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`945`]
  }
  
  @scala.inline
  implicit class `945MutableBuilder`[Self <: `945`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetClonesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetClonesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
