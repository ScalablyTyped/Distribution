package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposListCommitsResponseItem]
  }
}

