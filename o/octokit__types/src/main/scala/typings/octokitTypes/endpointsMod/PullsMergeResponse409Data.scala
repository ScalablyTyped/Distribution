package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsMergeResponse409Data extends js.Object {
  var documentation_url: String
  var message: String
}

object PullsMergeResponse409Data {
  @scala.inline
  def apply(documentation_url: String, message: String): PullsMergeResponse409Data = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsMergeResponse409Data]
  }
}

