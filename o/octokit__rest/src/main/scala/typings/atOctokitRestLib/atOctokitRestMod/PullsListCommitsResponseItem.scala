package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItem extends js.Object {
  var author: PullsListCommitsResponseItemAuthor
  var comments_url: java.lang.String
  var commit: PullsListCommitsResponseItemCommit
  var committer: PullsListCommitsResponseItemCommitter
  var html_url: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[PullsListCommitsResponseItemParentsItem]
  var sha: java.lang.String
  var url: java.lang.String
}

object PullsListCommitsResponseItem {
  @scala.inline
  def apply(
    author: PullsListCommitsResponseItemAuthor,
    comments_url: java.lang.String,
    commit: PullsListCommitsResponseItemCommit,
    committer: PullsListCommitsResponseItemCommitter,
    html_url: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[PullsListCommitsResponseItemParentsItem],
    sha: java.lang.String,
    url: java.lang.String
  ): PullsListCommitsResponseItem = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[PullsListCommitsResponseItem]
  }
}

