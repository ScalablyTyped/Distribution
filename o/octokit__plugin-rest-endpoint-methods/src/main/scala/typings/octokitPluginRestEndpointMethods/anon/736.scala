package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoEndpoint
import typings.octokitTypes.endpointsMod.IssuesListCommentsForRepoResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `736` extends StObject {
  
  var parameters: RequestParameters & (Omit[IssuesListCommentsForRepoEndpoint, baseUrl | headers | mediaType])
  
  var response: OctokitResponse[IssuesListCommentsForRepoResponseData]
}
object `736` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters & (Omit[IssuesListCommentsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListCommentsForRepoResponseData]
  ): `736` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`736`]
  }
  
  @scala.inline
  implicit class `736MutableBuilder`[Self <: `736`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters & (Omit[IssuesListCommentsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
