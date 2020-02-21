package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseMergeBaseCommitCommit extends js.Object {
  var author: ReposCompareCommitsResponseMergeBaseCommitCommitAuthor
  var comment_count: Double
  var committer: ReposCompareCommitsResponseMergeBaseCommitCommitCommitter
  var message: String
  var tree: ReposCompareCommitsResponseMergeBaseCommitCommitTree
  var url: String
  var verification: ReposCompareCommitsResponseMergeBaseCommitCommitVerification
}

object ReposCompareCommitsResponseMergeBaseCommitCommit {
  @scala.inline
  def apply(
    author: ReposCompareCommitsResponseMergeBaseCommitCommitAuthor,
    comment_count: Double,
    committer: ReposCompareCommitsResponseMergeBaseCommitCommitCommitter,
    message: String,
    tree: ReposCompareCommitsResponseMergeBaseCommitCommitTree,
    url: String,
    verification: ReposCompareCommitsResponseMergeBaseCommitCommitVerification
  ): ReposCompareCommitsResponseMergeBaseCommitCommit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], comment_count = comment_count.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseMergeBaseCommitCommit]
  }
}

