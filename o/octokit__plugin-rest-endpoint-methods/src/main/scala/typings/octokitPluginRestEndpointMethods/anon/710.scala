package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typings.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `710` extends StObject {
  
  var parameters: RequestParameters & (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
}
object `710` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): `710` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`710`]
  }
  
  @scala.inline
  implicit class `710MutableBuilder`[Self <: `710`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters & (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetAllTemplatesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
