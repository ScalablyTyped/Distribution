package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitResponseTree extends js.Object {
  var sha: String
  var url: String
}

object GitCreateCommitResponseTree {
  @scala.inline
  def apply(sha: String, url: String): GitCreateCommitResponseTree = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitCreateCommitResponseTree]
  }
}

