package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typings.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `858` extends StObject {
  
  var parameters: RequestParameters & (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[PullsListCommitsResponseData]
}
object `858` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListCommitsResponseData]
  ): `858` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`858`]
  }
  
  @scala.inline
  implicit class `858MutableBuilder`[Self <: `858`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
