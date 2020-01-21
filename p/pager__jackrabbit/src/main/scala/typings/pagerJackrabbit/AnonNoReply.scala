package typings.pagerJackrabbit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoReply extends js.Object {
  var noReply: js.UndefOr[Boolean] = js.undefined
}

object AnonNoReply {
  @scala.inline
  def apply(noReply: js.UndefOr[Boolean] = js.undefined): AnonNoReply = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noReply)) __obj.updateDynamic("noReply")(noReply.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoReply]
  }
}

