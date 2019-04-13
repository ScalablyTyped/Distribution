package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItemCommit extends js.Object {
  var author: PullsListCommitsResponseItemCommitAuthor
  var comment_count: scala.Double
  var committer: PullsListCommitsResponseItemCommitCommitter
  var message: java.lang.String
  var tree: PullsListCommitsResponseItemCommitTree
  var url: java.lang.String
  var verification: PullsListCommitsResponseItemCommitVerification
}

object PullsListCommitsResponseItemCommit {
  @scala.inline
  def apply(
    author: PullsListCommitsResponseItemCommitAuthor,
    comment_count: scala.Double,
    committer: PullsListCommitsResponseItemCommitCommitter,
    message: java.lang.String,
    tree: PullsListCommitsResponseItemCommitTree,
    url: java.lang.String,
    verification: PullsListCommitsResponseItemCommitVerification
  ): PullsListCommitsResponseItemCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[PullsListCommitsResponseItemCommit]
  }
}

