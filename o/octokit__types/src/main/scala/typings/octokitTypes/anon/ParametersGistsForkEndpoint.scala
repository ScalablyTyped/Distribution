package typings.octokitTypes.anon

import typings.octokitTypes.endpointsMod.GistsForkEndpoint
import typings.octokitTypes.endpointsMod.GistsForkRequestOptions
import typings.octokitTypes.endpointsMod.GistsForkResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParametersGistsForkEndpoint extends StObject {
  
  var parameters: GistsForkEndpoint
  
  var request: GistsForkRequestOptions
  
  var response: OctokitResponse[GistsForkResponseData]
}
object ParametersGistsForkEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsForkEndpoint,
    request: GistsForkRequestOptions,
    response: OctokitResponse[GistsForkResponseData]
  ): ParametersGistsForkEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsForkEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsForkEndpointMutableBuilder[Self <: ParametersGistsForkEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsForkEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsForkRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsForkResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
