package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposGetCommitResponseCommit]
  }
}

