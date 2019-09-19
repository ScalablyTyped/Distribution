package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseCommitsItem extends js.Object {
  var author: ReposCompareCommitsResponseCommitsItemAuthor
  var comments_url: String
  var commit: ReposCompareCommitsResponseCommitsItemCommit
  var committer: ReposCompareCommitsResponseCommitsItemCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposCompareCommitsResponseCommitsItemParentsItem]
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseCommitsItem {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseCommitsItemAuthor,
    comments_url: String,
    commit: ReposCompareCommitsResponseCommitsItemCommit,
    committer: ReposCompareCommitsResponseCommitsItemCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposCompareCommitsResponseCommitsItemParentsItem],
    sha: String,
    url: String
  ): ReposCompareCommitsResponseCommitsItem = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCompareCommitsResponseCommitsItem]
  }
}

