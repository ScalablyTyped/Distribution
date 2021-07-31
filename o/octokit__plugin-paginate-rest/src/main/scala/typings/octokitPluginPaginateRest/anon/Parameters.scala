package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.AppsListInstallationsEndpoint
import typings.octokitTypes.endpointsMod.AppsListInstallationsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var parameters: AppsListInstallationsEndpoint
  
  var response: OctokitResponse[AppsListInstallationsResponseData]
}
object Parameters {
  
  @scala.inline
  def apply(
    parameters: AppsListInstallationsEndpoint,
    response: OctokitResponse[AppsListInstallationsResponseData]
  ): Parameters = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListInstallationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListInstallationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
