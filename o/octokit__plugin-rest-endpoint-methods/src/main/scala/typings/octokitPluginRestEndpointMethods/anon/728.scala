package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `728` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesGetResponseData]
}
object `728` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetResponseData]
  ): `728` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`728`]
  }
  
  @scala.inline
  implicit class `728MutableBuilder`[Self <: `728`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
