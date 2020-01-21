package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeResponseCommit extends js.Object {
  var author: ReposMergeResponseCommitAuthor
  var comment_count: Double
  var committer: ReposMergeResponseCommitCommitter
  var message: String
  var tree: ReposMergeResponseCommitTree
  var url: String
  var verification: ReposMergeResponseCommitVerification
}

object ReposMergeResponseCommit {
  @scala.inline
  def apply(
    author: ReposMergeResponseCommitAuthor,
    comment_count: Double,
    committer: ReposMergeResponseCommitCommitter,
    message: String,
    tree: ReposMergeResponseCommitTree,
    url: String,
    verification: ReposMergeResponseCommitVerification
  ): ReposMergeResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposMergeResponseCommit]
  }
}

