package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommit extends js.Object {
  var author: ReposCreateFileResponseCommitAuthor
  var committer: ReposCreateFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposCreateFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposCreateFileResponseCommitTree
  var url: String
  var verification: ReposCreateFileResponseCommitVerification
}

object ReposCreateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateFileResponseCommitAuthor,
    committer: ReposCreateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposCreateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposCreateFileResponseCommitTree,
    url: String,
    verification: ReposCreateFileResponseCommitVerification
  ): ReposCreateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommit]
  }
}

