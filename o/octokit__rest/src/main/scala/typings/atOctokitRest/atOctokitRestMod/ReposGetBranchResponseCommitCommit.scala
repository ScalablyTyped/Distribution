package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseCommitCommit extends js.Object {
  var author: ReposGetBranchResponseCommitCommitAuthor
  var committer: ReposGetBranchResponseCommitCommitCommitter
  var message: String
  var tree: ReposGetBranchResponseCommitCommitTree
  var url: String
  var verification: ReposGetBranchResponseCommitCommitVerification
}

object ReposGetBranchResponseCommitCommit {
  @scala.inline
  def apply(
    author: ReposGetBranchResponseCommitCommitAuthor,
    committer: ReposGetBranchResponseCommitCommitCommitter,
    message: String,
    tree: ReposGetBranchResponseCommitCommitTree,
    url: String,
    verification: ReposGetBranchResponseCommitCommitVerification
  ): ReposGetBranchResponseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposGetBranchResponseCommitCommit]
  }
}

