package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsSetSelfHostedRunnersInGroupForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double
  
  /**
    * List of runner IDs to add to the runner group.
    */
  var runners: js.Array[Double]
}
object ActionsSetSelfHostedRunnersInGroupForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double, runners: js.Array[Double]): ActionsSetSelfHostedRunnersInGroupForOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any], runners = runners.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsSetSelfHostedRunnersInGroupForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsSetSelfHostedRunnersInGroupForOrgEndpointMutableBuilder[Self <: ActionsSetSelfHostedRunnersInGroupForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value :_*))
  }
}
