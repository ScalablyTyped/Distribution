package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentEndpoint
import typings.octokitTypes.endpointsMod.AppsCreateContentAttachmentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `622` extends StObject {
  
  var parameters: RequestParameters & (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[AppsCreateContentAttachmentResponseData]
}
object `622` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsCreateContentAttachmentResponseData]
  ): `622` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`622`]
  }
  
  @scala.inline
  implicit class `622MutableBuilder`[Self <: `622`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[AppsCreateContentAttachmentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCreateContentAttachmentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
