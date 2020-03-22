package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListCommitsResponseItemCommitTree extends js.Object {
  var sha: String
  var url: String
}

object ReposListCommitsResponseItemCommitTree {
  @scala.inline
  def apply(sha: String, url: String): ReposListCommitsResponseItemCommitTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposListCommitsResponseItemCommitTree]
  }
}

