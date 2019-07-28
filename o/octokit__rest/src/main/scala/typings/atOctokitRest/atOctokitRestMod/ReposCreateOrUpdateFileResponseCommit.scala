package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseCommit extends js.Object {
  var author: ReposCreateOrUpdateFileResponseCommitAuthor
  var committer: ReposCreateOrUpdateFileResponseCommitCommitter
  var html_url: String
  var message: String
  var node_id: String
  var parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem]
  var sha: String
  var tree: ReposCreateOrUpdateFileResponseCommitTree
  var url: String
  var verification: ReposCreateOrUpdateFileResponseCommitVerification
}

object ReposCreateOrUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateOrUpdateFileResponseCommitAuthor,
    committer: ReposCreateOrUpdateFileResponseCommitCommitter,
    html_url: String,
    message: String,
    node_id: String,
    parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem],
    sha: String,
    tree: ReposCreateOrUpdateFileResponseCommitTree,
    url: String,
    verification: ReposCreateOrUpdateFileResponseCommitVerification
  ): ReposCreateOrUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommit]
  }
}

