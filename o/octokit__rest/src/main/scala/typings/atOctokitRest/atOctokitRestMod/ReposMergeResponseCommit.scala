package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposMergeResponseCommit]
  }
}

