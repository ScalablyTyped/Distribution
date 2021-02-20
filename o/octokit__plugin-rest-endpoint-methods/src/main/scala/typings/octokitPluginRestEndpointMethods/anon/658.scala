package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typings.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `658` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksCreateSuiteEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksCreateSuiteResponseData] = js.native
}
object `658` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksCreateSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): `658` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`658`]
  }
  
  @scala.inline
  implicit class `658MutableBuilder`[Self <: `658`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksCreateSuiteEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
