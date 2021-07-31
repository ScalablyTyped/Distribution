package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typings.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `734` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListAssigneesResponseData]
}
object `734` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): `734` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`734`]
  }
  
  @scala.inline
  implicit class `734MutableBuilder`[Self <: `734`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
