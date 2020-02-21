package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsResponseBaseCommitCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposCompareCommitsResponseBaseCommitCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposCompareCommitsResponseBaseCommitCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsResponseBaseCommitCommitTree]
  }
}

