package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgEndpoint
import typings.octokitTypes.endpointsMod.BillingGetSharedStorageBillingOrgResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `655` extends StObject {
  
  var parameters: RequestParameters with (Omit[BillingGetSharedStorageBillingOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData] = js.native
}
object `655` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[BillingGetSharedStorageBillingOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]
  ): `655` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`655`]
  }
  
  @scala.inline
  implicit class `655MutableBuilder`[Self <: `655`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[BillingGetSharedStorageBillingOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
