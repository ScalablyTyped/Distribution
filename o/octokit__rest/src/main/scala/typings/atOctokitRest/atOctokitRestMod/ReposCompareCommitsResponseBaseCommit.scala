package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseBaseCommit extends js.Object {
  var author: ReposCompareCommitsResponseBaseCommitAuthor
  var comments_url: String
  var commit: ReposCompareCommitsResponseBaseCommitCommit
  var committer: ReposCompareCommitsResponseBaseCommitCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposCompareCommitsResponseBaseCommitParentsItem]
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseBaseCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseBaseCommitAuthor,
    comments_url: String,
    commit: ReposCompareCommitsResponseBaseCommitCommit,
    committer: ReposCompareCommitsResponseBaseCommitCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposCompareCommitsResponseBaseCommitParentsItem],
    sha: String,
    url: String
  ): ReposCompareCommitsResponseBaseCommit = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommit]
  }
}

