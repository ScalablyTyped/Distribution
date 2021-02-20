package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GistsForkEndpoint
import typings.octokitTypes.endpointsMod.GistsForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `682` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsForkEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsForkResponseData] = js.native
}
object `682` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsForkEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsForkResponseData]
  ): `682` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`682`]
  }
  
  @scala.inline
  implicit class `682MutableBuilder`[Self <: `682`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsForkEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
