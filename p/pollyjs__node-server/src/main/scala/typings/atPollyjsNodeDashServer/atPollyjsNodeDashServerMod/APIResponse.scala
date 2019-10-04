package typings.atPollyjsNodeDashServer.atPollyjsNodeDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIResponse extends js.Object {
  var body: js.UndefOr[js.Any] = js.undefined
  var status: Double
}

object APIResponse {
  @scala.inline
  def apply(status: Double, body: js.Any = null): APIResponse = {
    val __obj = js.Dynamic.literal(status = status)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[APIResponse]
  }
}

