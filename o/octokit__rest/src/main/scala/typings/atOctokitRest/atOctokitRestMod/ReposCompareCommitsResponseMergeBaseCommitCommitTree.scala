package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseMergeBaseCommitCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseMergeBaseCommitCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposCompareCommitsResponseMergeBaseCommitCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[ReposCompareCommitsResponseMergeBaseCommitCommitTree]
  }
}

