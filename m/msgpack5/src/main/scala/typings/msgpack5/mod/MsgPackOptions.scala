package typings.msgpack5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackOptions extends js.Object {
  var compatibilityMode: js.UndefOr[Boolean] = js.undefined
  var forceFloat64: js.UndefOr[Boolean] = js.undefined
}

object MsgPackOptions {
  @scala.inline
  def apply(
    compatibilityMode: js.UndefOr[Boolean] = js.undefined,
    forceFloat64: js.UndefOr[Boolean] = js.undefined
  ): MsgPackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compatibilityMode)) __obj.updateDynamic("compatibilityMode")(compatibilityMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFloat64)) __obj.updateDynamic("forceFloat64")(forceFloat64.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MsgPackOptions]
  }
}

