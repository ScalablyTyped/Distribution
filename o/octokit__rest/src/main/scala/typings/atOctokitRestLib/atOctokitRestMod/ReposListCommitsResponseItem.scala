package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItem extends js.Object {
  var author: ReposListCommitsResponseItemAuthor
  var comments_url: java.lang.String
  var commit: ReposListCommitsResponseItemCommit
  var committer: ReposListCommitsResponseItemCommitter
  var html_url: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposListCommitsResponseItemParentsItem]
  var sha: java.lang.String
  var url: java.lang.String
}

object ReposListCommitsResponseItem {
  @scala.inline
  def apply(
    author: ReposListCommitsResponseItemAuthor,
    comments_url: java.lang.String,
    commit: ReposListCommitsResponseItemCommit,
    committer: ReposListCommitsResponseItemCommitter,
    html_url: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposListCommitsResponseItemParentsItem],
    sha: java.lang.String,
    url: java.lang.String
  ): ReposListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposListCommitsResponseItem]
  }
}

