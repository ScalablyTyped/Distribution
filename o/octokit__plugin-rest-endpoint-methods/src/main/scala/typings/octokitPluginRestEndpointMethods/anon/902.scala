package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposCreateCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `902` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
}
object `902` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]
  ): `902` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`902`]
  }
  
  @scala.inline
  implicit class `902MutableBuilder`[Self <: `902`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[ReposCreateCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
