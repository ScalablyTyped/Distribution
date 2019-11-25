package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var pauseOnConnect: js.UndefOr[Boolean] = js.undefined
}

object Anon_AllowHalfOpen {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    pauseOnConnect: js.UndefOr[Boolean] = js.undefined
  ): Anon_AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseOnConnect)) __obj.updateDynamic("pauseOnConnect")(pauseOnConnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowHalfOpen]
  }
}

