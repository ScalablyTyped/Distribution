package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsListCommitsResponseItemCommit extends js.Object {
  var author: PullsListCommitsResponseItemCommitAuthor
  var comment_count: Double
  var committer: PullsListCommitsResponseItemCommitCommitter
  var message: String
  var tree: PullsListCommitsResponseItemCommitTree
  var url: String
  var verification: PullsListCommitsResponseItemCommitVerification
}

object PullsListCommitsResponseItemCommit {
  @scala.inline
  def apply(
    author: PullsListCommitsResponseItemCommitAuthor,
    comment_count: Double,
    committer: PullsListCommitsResponseItemCommitCommitter,
    message: String,
    tree: PullsListCommitsResponseItemCommitTree,
    url: String,
    verification: PullsListCommitsResponseItemCommitVerification
  ): PullsListCommitsResponseItemCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[PullsListCommitsResponseItemCommit]
  }
}

