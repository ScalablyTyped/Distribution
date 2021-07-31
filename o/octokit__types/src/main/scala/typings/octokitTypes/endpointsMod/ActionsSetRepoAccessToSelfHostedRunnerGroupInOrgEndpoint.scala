package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
  
  /**
    * List of repository IDs that can access the runner group.
    */
  var selected_repository_ids: js.Array[Double]
}
object ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double, selected_repository_ids: js.Array[Double]): ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any], selected_repository_ids = selected_repository_ids.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value :_*))
  }
}
