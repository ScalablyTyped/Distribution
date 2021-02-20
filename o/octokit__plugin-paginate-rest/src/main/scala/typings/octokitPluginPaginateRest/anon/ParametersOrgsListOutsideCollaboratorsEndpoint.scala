package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typings.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListOutsideCollaboratorsEndpoint extends StObject {
  
  var parameters: OrgsListOutsideCollaboratorsEndpoint = js.native
  
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData] = js.native
}
object ParametersOrgsListOutsideCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListOutsideCollaboratorsEndpoint,
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): ParametersOrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListOutsideCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListOutsideCollaboratorsEndpointMutableBuilder[Self <: ParametersOrgsListOutsideCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListOutsideCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
