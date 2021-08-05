package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionEndpoint
import typings.octokitTypes.endpointsMod.ReposGetCommitSignatureProtectionResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `952` extends StObject {
  
  var parameters: RequestParameters & (Omit[ReposGetCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
}
object `952` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[ReposGetCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]
  ): `952` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`952`]
  }
  
  extension [Self <: `952`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[ReposGetCommitSignatureProtectionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[ReposGetCommitSignatureProtectionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
