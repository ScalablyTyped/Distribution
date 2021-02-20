package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsGetSelfHostedRunnerForRepoEndpoint extends StObject {
  
  var owner: String = js.native
  
  var repo: String = js.native
  
  /**
    * Unique identifier of the self-hosted runner.
    */
  var runner_id: Double = js.native
}
object ActionsGetSelfHostedRunnerForRepoEndpoint {
  
  @scala.inline
  def apply(owner: String, repo: String, runner_id: Double): ActionsGetSelfHostedRunnerForRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetSelfHostedRunnerForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ActionsGetSelfHostedRunnerForRepoEndpointMutableBuilder[Self <: ActionsGetSelfHostedRunnerForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
