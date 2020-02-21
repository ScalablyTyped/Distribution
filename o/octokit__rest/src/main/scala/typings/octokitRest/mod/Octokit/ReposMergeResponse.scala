package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeResponse extends js.Object {
  var author: ReposMergeResponseAuthor
  var comments_url: String
  var commit: ReposMergeResponseCommit
  var committer: ReposMergeResponseCommitter
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposMergeResponseParentsItem]
  var sha: String
  var url: String
}

object ReposMergeResponse {
  @scala.inline
  def apply(
    author: ReposMergeResponseAuthor,
    comments_url: String,
    commit: ReposMergeResponseCommit,
    committer: ReposMergeResponseCommitter,
    html_url: String,
    node_id: String,
    parents: js.Array[ReposMergeResponseParentsItem],
    sha: String,
    url: String
  ): ReposMergeResponse = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposMergeResponse]
  }
}

