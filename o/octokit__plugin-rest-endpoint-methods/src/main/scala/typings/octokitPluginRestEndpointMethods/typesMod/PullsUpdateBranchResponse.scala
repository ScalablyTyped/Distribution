package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateBranchResponse extends js.Object {
  var message: String
  var url: String
}

object PullsUpdateBranchResponse {
  @scala.inline
  def apply(message: String, url: String): PullsUpdateBranchResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullsUpdateBranchResponse]
  }
}

