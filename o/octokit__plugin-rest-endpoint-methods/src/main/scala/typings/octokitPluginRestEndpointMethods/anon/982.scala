package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typings.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `982` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
}
object `982` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): `982` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`982`]
  }
  
  @scala.inline
  implicit class `982MutableBuilder`[Self <: `982`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitStatusesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
