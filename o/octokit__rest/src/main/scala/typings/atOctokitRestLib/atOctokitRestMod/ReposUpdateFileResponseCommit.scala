package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateFileResponseCommit extends js.Object {
  var author: ReposUpdateFileResponseCommitAuthor
  var committer: ReposUpdateFileResponseCommitCommitter
  var html_url: java.lang.String
  var message: java.lang.String
  var node_id: java.lang.String
  var parents: js.Array[ReposUpdateFileResponseCommitParentsItem]
  var sha: java.lang.String
  var tree: ReposUpdateFileResponseCommitTree
  var url: java.lang.String
  var verification: ReposUpdateFileResponseCommitVerification
}

object ReposUpdateFileResponseCommit {
  @scala.inline
  def apply(
    author: ReposUpdateFileResponseCommitAuthor,
    committer: ReposUpdateFileResponseCommitCommitter,
    html_url: java.lang.String,
    message: java.lang.String,
    node_id: java.lang.String,
    parents: js.Array[ReposUpdateFileResponseCommitParentsItem],
    sha: java.lang.String,
    tree: ReposUpdateFileResponseCommitTree,
    url: java.lang.String,
    verification: ReposUpdateFileResponseCommitVerification
  ): ReposUpdateFileResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, html_url = html_url, message = message, node_id = node_id, parents = parents, sha = sha, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposUpdateFileResponseCommit]
  }
}

