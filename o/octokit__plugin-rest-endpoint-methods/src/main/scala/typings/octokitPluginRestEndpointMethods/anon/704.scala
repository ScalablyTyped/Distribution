package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typings.octokitTypes.endpointsMod.GitGetCommitResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `704` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitGetCommitResponseData]
}
object `704` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetCommitResponseData]
  ): `704` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`704`]
  }
  
  @scala.inline
  implicit class `704MutableBuilder`[Self <: `704`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
