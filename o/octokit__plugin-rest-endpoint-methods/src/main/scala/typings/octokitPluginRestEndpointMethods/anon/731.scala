package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesGetLabelEndpoint
import typings.octokitTypes.endpointsMod.IssuesGetLabelResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `731` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesGetLabelResponseData]
}
object `731` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetLabelResponseData]
  ): `731` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`731`]
  }
  
  @scala.inline
  implicit class `731MutableBuilder`[Self <: `731`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesGetLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
