package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.ProjectsCreateCardEndpoint
import typings.octokitTypes.endpointsMod.ProjectsCreateCardResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `821` extends StObject {
  
  var parameters: RequestParameters with (Omit[ProjectsCreateCardEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ProjectsCreateCardResponseData] = js.native
}
object `821` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ProjectsCreateCardEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ProjectsCreateCardResponseData]
  ): `821` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`821`]
  }
  
  @scala.inline
  implicit class `821MutableBuilder`[Self <: `821`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ProjectsCreateCardEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
