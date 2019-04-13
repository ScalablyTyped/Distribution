package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponse extends js.Object {
  var author: ReposGetCommitResponseAuthor
  var comments_url: java.lang.String
  var commit: ReposGetCommitResponseCommit
  var committer: ReposGetCommitResponseCommitter
  var files: js.Array[ReposGetCommitResponseFilesItem]
  var html_url: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposGetCommitResponseParentsItem]
  var sha: java.lang.String
  var stats: ReposGetCommitResponseStats
  var url: java.lang.String
}

object ReposGetCommitResponse {
  @scala.inline
  def apply(
    author: ReposGetCommitResponseAuthor,
    comments_url: java.lang.String,
    commit: ReposGetCommitResponseCommit,
    committer: ReposGetCommitResponseCommitter,
    files: js.Array[ReposGetCommitResponseFilesItem],
    html_url: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposGetCommitResponseParentsItem],
    sha: java.lang.String,
    stats: ReposGetCommitResponseStats,
    url: java.lang.String
  ): ReposGetCommitResponse = {
    val __obj = js.Dynamic.literal(author = author, comments_url = comments_url, commit = commit, committer = committer, files = files, html_url = html_url, node_id = node_id, parents = parents, sha = sha, stats = stats, url = url)
  
    __obj.asInstanceOf[ReposGetCommitResponse]
  }
}

