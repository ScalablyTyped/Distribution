package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommit extends js.Object {
  var author: ReposListCommitsResponseItemCommitAuthor
  var comment_count: scala.Double
  var committer: ReposListCommitsResponseItemCommitCommitter
  var message: java.lang.String
  var tree: ReposListCommitsResponseItemCommitTree
  var url: java.lang.String
  var verification: ReposListCommitsResponseItemCommitVerification
}

object ReposListCommitsResponseItemCommit {
  @scala.inline
  def apply(
    author: ReposListCommitsResponseItemCommitAuthor,
    comment_count: scala.Double,
    committer: ReposListCommitsResponseItemCommitCommitter,
    message: java.lang.String,
    tree: ReposListCommitsResponseItemCommitTree,
    url: java.lang.String,
    verification: ReposListCommitsResponseItemCommitVerification
  ): ReposListCommitsResponseItemCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommit]
  }
}

