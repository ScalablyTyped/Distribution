package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateOrUpdateFileResponseCommit extends js.Object {
  var author: ReposCreateOrUpdateFileResponseCommitAuthor
  var committer: ReposCreateOrUpdateFileResponseCommitCommitter
  var html_url: java.lang.String
  var message: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem]
  var sha: java.lang.String
  var tree: ReposCreateOrUpdateFileResponseCommitTree
  var url: java.lang.String
  var verification: ReposCreateOrUpdateFileResponseCommitVerification
}

object ReposCreateOrUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateOrUpdateFileResponseCommitAuthor,
    committer: ReposCreateOrUpdateFileResponseCommitCommitter,
    html_url: java.lang.String,
    message: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposCreateOrUpdateFileResponseCommitParentsItem],
    sha: java.lang.String,
    tree: ReposCreateOrUpdateFileResponseCommitTree,
    url: java.lang.String,
    verification: ReposCreateOrUpdateFileResponseCommitVerification
  ): ReposCreateOrUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposCreateOrUpdateFileResponseCommit]
  }
}

