package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitResponseCommit extends js.Object {
  var author: ReposGetCommitResponseCommitAuthor
  var comment_count: scala.Double
  var committer: ReposGetCommitResponseCommitCommitter
  var message: java.lang.String
  var tree: ReposGetCommitResponseCommitTree
  var url: java.lang.String
  var verification: ReposGetCommitResponseCommitVerification
}

object ReposGetCommitResponseCommit {
  @scala.inline
  def apply(
    author: ReposGetCommitResponseCommitAuthor,
    comment_count: scala.Double,
    committer: ReposGetCommitResponseCommitCommitter,
    message: java.lang.String,
    tree: ReposGetCommitResponseCommitTree,
    url: java.lang.String,
    verification: ReposGetCommitResponseCommitVerification
  ): ReposGetCommitResponseCommit = {
    val __obj = js.Dynamic.literal(author = author, comment_count = comment_count, committer = committer, message = message, tree = tree, url = url, verification = verification)
  
    __obj.asInstanceOf[ReposGetCommitResponseCommit]
  }
}

