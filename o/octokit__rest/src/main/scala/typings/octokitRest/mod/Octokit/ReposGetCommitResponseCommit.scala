package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseCommit extends js.Object {
  var author: ReposGetCommitResponseCommitAuthor
  var comment_count: Double
  var committer: ReposGetCommitResponseCommitCommitter
  var message: String
  var tree: ReposGetCommitResponseCommitTree
  var url: String
  var verification: ReposGetCommitResponseCommitVerification
}

object ReposGetCommitResponseCommit {
  @scala.inline
  def apply(
    author: ReposGetCommitResponseCommitAuthor,
    comment_count: Double,
    committer: ReposGetCommitResponseCommitCommitter,
    message: String,
    tree: ReposGetCommitResponseCommitTree,
    url: String,
    verification: ReposGetCommitResponseCommitVerification
  ): ReposGetCommitResponseCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitResponseCommit]
  }
}

