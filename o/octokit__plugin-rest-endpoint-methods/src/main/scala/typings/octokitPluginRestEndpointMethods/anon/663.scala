package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `663` extends StObject {
  
  var parameters: RequestParameters & (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[ChecksListForSuiteResponseData]
}
object `663` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForSuiteResponseData]
  ): `663` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`663`]
  }
  
  @scala.inline
  implicit class `663MutableBuilder`[Self <: `663`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
