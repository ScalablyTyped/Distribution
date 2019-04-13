package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeleteFileResponseCommit extends js.Object {
  var author: ReposDeleteFileResponseCommitAuthor
  var committer: ReposDeleteFileResponseCommitCommitter
  var html_url: java.lang.String
  var message: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposDeleteFileResponseCommitParentsItem]
  var sha: java.lang.String
  var tree: ReposDeleteFileResponseCommitTree
  var url: java.lang.String
  var verification: ReposDeleteFileResponseCommitVerification
}

object ReposDeleteFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposDeleteFileResponseCommitAuthor,
    committer: ReposDeleteFileResponseCommitCommitter,
    html_url: java.lang.String,
    message: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposDeleteFileResponseCommitParentsItem],
    sha: java.lang.String,
    tree: ReposDeleteFileResponseCommitTree,
    url: java.lang.String,
    verification: ReposDeleteFileResponseCommitVerification
  ): ReposDeleteFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposDeleteFileResponseCommit]
  }
}

