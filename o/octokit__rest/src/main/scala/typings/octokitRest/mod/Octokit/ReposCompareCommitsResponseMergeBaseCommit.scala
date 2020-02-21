package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseMergeBaseCommit]
  }
}

