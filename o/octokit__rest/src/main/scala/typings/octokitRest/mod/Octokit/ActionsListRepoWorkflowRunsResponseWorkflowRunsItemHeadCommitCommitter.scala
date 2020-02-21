package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter extends js.Object {
  var email: String
  var name: String
}

object ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter {
  @scala.inline
  def apply(email: String, name: String): ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListRepoWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter]
  }
}

