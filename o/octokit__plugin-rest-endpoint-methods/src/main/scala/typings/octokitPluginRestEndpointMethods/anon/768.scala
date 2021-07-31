package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsEndpoint
import typings.octokitTypes.endpointsMod.MigrationsGetCommitAuthorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `768` extends StObject {
  
  var parameters: RequestParameters & (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
}
object `768` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MigrationsGetCommitAuthorsResponseData]
  ): `768` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`768`]
  }
  
  @scala.inline
  implicit class `768MutableBuilder`[Self <: `768`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[MigrationsGetCommitAuthorsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetCommitAuthorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
