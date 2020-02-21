package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowJobParams extends js.Object {
  var job_id: Double
  var owner: String
  var repo: String
}

object ActionsGetWorkflowJobParams {
  @scala.inline
  def apply(job_id: Double, owner: String, repo: String): ActionsGetWorkflowJobParams = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetWorkflowJobParams]
  }
}

