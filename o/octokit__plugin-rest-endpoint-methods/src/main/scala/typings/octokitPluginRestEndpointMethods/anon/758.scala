package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedEndpoint
import typings.octokitTypes.endpointsMod.LicensesGetAllCommonlyUsedResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `758` extends StObject {
  
  var parameters: RequestParameters & (Omit[LicensesGetAllCommonlyUsedEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
}
object `758` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[LicensesGetAllCommonlyUsedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]
  ): `758` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`758`]
  }
  
  extension [Self <: `758`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[LicensesGetAllCommonlyUsedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[LicensesGetAllCommonlyUsedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
