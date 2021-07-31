package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var repository_id: Double
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
}
object ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, repository_id: Double, runner_group_id: Double): ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(repository_id = repository_id.asInstanceOf[js.Any], runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ActionsAddRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = StObject.set(x, "repository_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
