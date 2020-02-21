package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsGetWorkflowRunResponseHeadCommit extends js.Object {
  var author: ActionsGetWorkflowRunResponseHeadCommitAuthor
  var committer: ActionsGetWorkflowRunResponseHeadCommitCommitter
  var id: String
  var message: String
  var timestamp: String
  var tree_id: String
}

object ActionsGetWorkflowRunResponseHeadCommit {
  @scala.inline
  def apply(
    author: ActionsGetWorkflowRunResponseHeadCommitAuthor,
    committer: ActionsGetWorkflowRunResponseHeadCommitCommitter,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): ActionsGetWorkflowRunResponseHeadCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsGetWorkflowRunResponseHeadCommit]
  }
}

