package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit extends js.Object {
  var author: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitAuthor
  var committer: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter
  var id: String
  var message: String
  var timestamp: String
  var tree_id: String
}

object ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit {
  @scala.inline
  def apply(
    author: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitAuthor,
    committer: ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommitCommitter,
    id: String,
    message: String,
    timestamp: String,
    tree_id: String
  ): ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], tree_id = tree_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionsListWorkflowRunsResponseWorkflowRunsItemHeadCommit]
  }
}

