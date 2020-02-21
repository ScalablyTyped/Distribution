package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItem extends js.Object {
  var author: ReposListCommitsResponseItemAuthor
  var comments_url: String
  var commit: ReposListCommitsResponseItemCommit
  var committer: ReposListCommitsResponseItemCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposListCommitsResponseItemParentsItem]
  var sha: String
  var url: String
}

object ReposListCommitsResponseItem {
  @scala.inline
  def apply(
    author: ReposListCommitsResponseItemAuthor,
    comments_url: String,
    commit: ReposListCommitsResponseItemCommit,
    committer: ReposListCommitsResponseItemCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposListCommitsResponseItemParentsItem],
    sha: String,
    url: String
  ): ReposListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListCommitsResponseItem]
  }
}

