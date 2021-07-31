package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksCreateEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `657` extends StObject {
  
  var parameters: RequestParameters & (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ChecksCreateResponseData]
}
object `657` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksCreateResponseData]
  ): `657` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`657`]
  }
  
  @scala.inline
  implicit class `657MutableBuilder`[Self <: `657`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ChecksCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
