package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListEndpoint
import typings.octokitTypes.endpointsMod.IssuesListResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `733` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListResponseData]
}
object `733` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListResponseData]
  ): `733` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`733`]
  }
  
  @scala.inline
  implicit class `733MutableBuilder`[Self <: `733`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
