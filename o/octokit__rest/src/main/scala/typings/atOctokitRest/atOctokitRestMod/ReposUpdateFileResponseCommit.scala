package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommit extends js.Object {
  var author: ReposUpdateFileResponseCommitAuthor
  var committer: ReposUpdateFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposUpdateFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposUpdateFileResponseCommitTree
  var url: String
  var verification: ReposUpdateFileResponseCommitVerification
}

object ReposUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposUpdateFileResponseCommitAuthor,
    committer: ReposUpdateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposUpdateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposUpdateFileResponseCommitTree,
    url: String,
    verification: ReposUpdateFileResponseCommitVerification
  ): ReposUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommit]
  }
}

