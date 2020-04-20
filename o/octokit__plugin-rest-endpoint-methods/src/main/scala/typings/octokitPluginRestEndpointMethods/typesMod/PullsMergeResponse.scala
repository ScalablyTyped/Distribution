package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeResponse extends js.Object {
  var merged: Boolean
  var message: String
  var sha: String
}

object PullsMergeResponse {
  @scala.inline
  def apply(merged: Boolean, message: String, sha: String): PullsMergeResponse = {
    val __obj = js.Dynamic.literal(merged = merged.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponse]
  }
}

