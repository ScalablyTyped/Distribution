package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItem extends js.Object {
  var author: PullsListCommitsResponseItemAuthor
  var comments_url: String
  var commit: PullsListCommitsResponseItemCommit
  var committer: PullsListCommitsResponseItemCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[PullsListCommitsResponseItemParentsItem]
  var sha: String
  var url: String
}

object PullsListCommitsResponseItem {
  @scala.inline
  def apply(
    author: PullsListCommitsResponseItemAuthor,
    comments_url: String,
    commit: PullsListCommitsResponseItemCommit,
    committer: PullsListCommitsResponseItemCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[PullsListCommitsResponseItemParentsItem],
    sha: String,
    url: String
  ): PullsListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsListCommitsResponseItem]
  }
}

