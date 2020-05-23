package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeResponseData extends js.Object {
  var merged: Boolean
  var message: String
  var sha: String
}

object PullsMergeResponseData {
  @scala.inline
  def apply(merged: Boolean, message: String, sha: String): PullsMergeResponseData = {
    val __obj = js.Dynamic.literal(merged = merged.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponseData]
  }
}

