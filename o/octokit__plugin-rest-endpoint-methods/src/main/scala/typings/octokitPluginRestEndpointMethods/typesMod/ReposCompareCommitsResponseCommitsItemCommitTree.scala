package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseCommitsItemCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseCommitsItemCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposCompareCommitsResponseCommitsItemCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseCommitsItemCommitTree]
  }
}

