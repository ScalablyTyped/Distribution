package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorEndpoint
import typings.octokitTypes.endpointsMod.OrgsConvertMemberToOutsideCollaboratorResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `789` extends StObject {
  
  var parameters: RequestParameters & (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
}
object `789` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]
  ): `789` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`789`]
  }
  
  extension [Self <: `789`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[OrgsConvertMemberToOutsideCollaboratorEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[OrgsConvertMemberToOutsideCollaboratorResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
