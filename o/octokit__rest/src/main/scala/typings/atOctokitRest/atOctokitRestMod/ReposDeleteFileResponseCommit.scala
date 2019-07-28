package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommit extends js.Object {
  var author: ReposDeleteFileResponseCommitAuthor
  var committer: ReposDeleteFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposDeleteFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposDeleteFileResponseCommitTree
  var url: String
  var verification: ReposDeleteFileResponseCommitVerification
}

object ReposDeleteFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposDeleteFileResponseCommitAuthor,
    committer: ReposDeleteFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposDeleteFileResponseCommitParentsItem],
    sha: String,
    tree: ReposDeleteFileResponseCommitTree,
    url: String,
    verification: ReposDeleteFileResponseCommitVerification
  ): ReposDeleteFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommit]
  }
}

