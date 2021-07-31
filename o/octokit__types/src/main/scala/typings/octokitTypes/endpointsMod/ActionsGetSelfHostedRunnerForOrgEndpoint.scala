package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsGetSelfHostedRunnerForOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double
}
object ActionsGetSelfHostedRunnerForOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_id: Double): ActionsGetSelfHostedRunnerForOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSelfHostedRunnerForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsGetSelfHostedRunnerForOrgEndpointMutableBuilder[Self <: ActionsGetSelfHostedRunnerForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
