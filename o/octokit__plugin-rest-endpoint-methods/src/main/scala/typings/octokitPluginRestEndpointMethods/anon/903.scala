package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitStatusResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `903` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateCommitStatusEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateCommitStatusResponseData]
}
object `903` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateCommitStatusEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitStatusResponseData]
  ): `903` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`903`]
  }
  
  @scala.inline
  implicit class `903MutableBuilder`[Self <: `903`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ReposCreateCommitStatusEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
