package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductEndpoint
import typings.octokitTypes.endpointsMod.CodesOfConductGetAllCodesOfConductResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `673` extends StObject {
  
  var parameters: RequestParameters & (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
}
object `673` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]
  ): `673` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`673`]
  }
  
  @scala.inline
  implicit class `673MutableBuilder`[Self <: `673`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[CodesOfConductGetAllCodesOfConductEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodesOfConductGetAllCodesOfConductResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
