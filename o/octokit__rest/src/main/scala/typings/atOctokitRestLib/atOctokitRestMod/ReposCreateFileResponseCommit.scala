package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateFileResponseCommit extends js.Object {
  var author: ReposCreateFileResponseCommitAuthor
  var committer: ReposCreateFileResponseCommitCommitter
  var html_url: java.lang.String
  var message: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposCreateFileResponseCommitParentsItem]
  var sha: java.lang.String
  var tree: ReposCreateFileResponseCommitTree
  var url: java.lang.String
  var verification: ReposCreateFileResponseCommitVerification
}

object ReposCreateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposCreateFileResponseCommitAuthor,
    committer: ReposCreateFileResponseCommitCommitter,
    html_url: java.lang.String,
    message: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposCreateFileResponseCommitParentsItem],
    sha: java.lang.String,
    tree: ReposCreateFileResponseCommitTree,
    url: java.lang.String,
    verification: ReposCreateFileResponseCommitVerification
  ): ReposCreateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposCreateFileResponseCommit]
  }
}

