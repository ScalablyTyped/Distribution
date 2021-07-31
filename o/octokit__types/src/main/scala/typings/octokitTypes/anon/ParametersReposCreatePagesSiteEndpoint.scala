package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteEndpoint
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteRequestOptions
import typings.octokitTypes.endpointsMod.ReposCreatePagesSiteResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersReposCreatePagesSiteEndpoint extends StObject {
  
  var parameters: ReposCreatePagesSiteEndpoint
  
  var request: ReposCreatePagesSiteRequestOptions
  
  var response: OctokitResponse[ReposCreatePagesSiteResponseData]
}
object ParametersReposCreatePagesSiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreatePagesSiteEndpoint,
    request: ReposCreatePagesSiteRequestOptions,
    response: OctokitResponse[ReposCreatePagesSiteResponseData]
  ): ParametersReposCreatePagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreatePagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreatePagesSiteEndpointMutableBuilder[Self <: ParametersReposCreatePagesSiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreatePagesSiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreatePagesSiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreatePagesSiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
