package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentEndpoint
import typings.octokitTypes.endpointsMod.IssuesUpdateCommentResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `754` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesUpdateCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesUpdateCommentResponseData] = js.native
}
object `754` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateCommentResponseData]
  ): `754` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`754`]
  }
  
  @scala.inline
  implicit class `754MutableBuilder`[Self <: `754`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesUpdateCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
