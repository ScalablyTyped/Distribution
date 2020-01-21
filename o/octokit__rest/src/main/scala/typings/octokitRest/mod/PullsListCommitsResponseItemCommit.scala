package typings.octokitRest.mod

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
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsListCommitsResponseItemCommit]
  }
}

