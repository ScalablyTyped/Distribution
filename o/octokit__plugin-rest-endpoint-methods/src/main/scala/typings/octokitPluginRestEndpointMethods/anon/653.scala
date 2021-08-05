package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `653` extends StObject {
  
  var parameters: RequestParameters & (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
}
object `653` {
  
  inline def apply(
    parameters: RequestParameters & (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
  ): `653` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`653`]
  }
  
  extension [Self <: `653`](x: Self) {
    
    inline def setParameters(
      value: RequestParameters & (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
