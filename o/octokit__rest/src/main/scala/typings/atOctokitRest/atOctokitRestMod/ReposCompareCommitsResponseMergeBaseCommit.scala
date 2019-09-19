package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseMergeBaseCommit extends js.Object {
  var author: ReposCompareCommitsResponseMergeBaseCommitAuthor
  var comments_url: String
  var commit: ReposCompareCommitsResponseMergeBaseCommitCommit
  var committer: ReposCompareCommitsResponseMergeBaseCommitCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposCompareCommitsResponseMergeBaseCommitParentsItem]
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseMergeBaseCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseMergeBaseCommitAuthor,
    comments_url: String,
    commit: ReposCompareCommitsResponseMergeBaseCommitCommit,
    committer: ReposCompareCommitsResponseMergeBaseCommitCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposCompareCommitsResponseMergeBaseCommitParentsItem],
    sha: String,
    url: String
  ): ReposCompareCommitsResponseMergeBaseCommit = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, html_url = html_url, node_id = node_id, parents = parents, sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCompareCommitsResponseMergeBaseCommit]
  }
}

