package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}

object AllowHalfOpen {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  ): AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnConnect)) __obj.updateDynamic("pauseOnConnect")(pauseOnConnect.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowHalfOpen]
  }
}

