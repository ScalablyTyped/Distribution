package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint extends StObject {
  
  @JSName("org")
  var org_ : String = js.native
  
  /**
    * Unique identifier of the self-hosted runner group.
    */
  var runner_group_id: Double = js.native
}
object ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint {
  
  @scala.inline
  def apply(org_ : String, runner_group_id: Double): ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(runner_group_id = runner_group_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ActionsDeleteSelfHostedRunnerGroupFromOrgEndpointMutableBuilder[Self <: ActionsDeleteSelfHostedRunnerGroupFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_group_id(value: Double): Self = StObject.set(x, "runner_group_id", value.asInstanceOf[js.Any])
  }
}
