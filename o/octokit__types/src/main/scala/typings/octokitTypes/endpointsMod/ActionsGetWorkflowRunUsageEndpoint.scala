package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowRunUsageEndpoint extends js.Object {
  var owner: String
  var repo: String
  var run_id: Double
}

object ActionsGetWorkflowRunUsageEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, run_id: Double): ActionsGetWorkflowRunUsageEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], run_id = run_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsGetWorkflowRunUsageEndpoint]
  }
}

