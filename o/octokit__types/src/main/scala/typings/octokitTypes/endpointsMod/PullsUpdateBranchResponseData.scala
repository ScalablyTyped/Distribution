package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchResponseData extends js.Object {
  var message: String
  var url: String
}

object PullsUpdateBranchResponseData {
  @scala.inline
  def apply(message: String, url: String): PullsUpdateBranchResponseData = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchResponseData]
  }
}

