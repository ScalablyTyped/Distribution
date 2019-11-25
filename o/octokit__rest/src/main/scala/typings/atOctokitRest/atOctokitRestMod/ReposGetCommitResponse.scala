package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponse extends js.Object {
  var author: ReposGetCommitResponseAuthor
  var comments_url: String
  var commit: ReposGetCommitResponseCommit
  var committer: ReposGetCommitResponseCommitter
  var files: js.Array[ReposGetCommitResponseFilesItem]
  var html_url: String
  var node_id: String
  var parents: js.Array[ReposGetCommitResponseParentsItem]
  var sha: String
  var stats: ReposGetCommitResponseStats
  var url: String
}

object ReposGetCommitResponse {
  @scala.inline
  def apply(
    author: ReposGetCommitResponseAuthor,
    comments_url: String,
    commit: ReposGetCommitResponseCommit,
    committer: ReposGetCommitResponseCommitter,
    files: js.Array[ReposGetCommitResponseFilesItem],
    html_url: String,
    node_id: String,
    parents: js.Array[ReposGetCommitResponseParentsItem],
    sha: String,
    stats: ReposGetCommitResponseStats,
    url: String
  ): ReposGetCommitResponse = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comments_url = comments_url.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitResponse]
  }
}

