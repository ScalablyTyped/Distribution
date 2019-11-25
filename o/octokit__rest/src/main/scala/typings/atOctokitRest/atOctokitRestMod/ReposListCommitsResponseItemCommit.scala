package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommit extends js.Object {
  var author: ReposListCommitsResponseItemCommitAuthor
  var comment_count: Double
  var committer: ReposListCommitsResponseItemCommitCommitter
  var message: String
  var tree: ReposListCommitsResponseItemCommitTree
  var url: String
  var verification: ReposListCommitsResponseItemCommitVerification
}

object ReposListCommitsResponseItemCommit {
  @scala.inline
  def apply(
    author: ReposListCommitsResponseItemCommitAuthor,
    comment_count: Double,
    committer: ReposListCommitsResponseItemCommitCommitter,
    message: String,
    tree: ReposListCommitsResponseItemCommitTree,
    url: String,
    verification: ReposListCommitsResponseItemCommitVerification
  ): ReposListCommitsResponseItemCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommit]
  }
}

