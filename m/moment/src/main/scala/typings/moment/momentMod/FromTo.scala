package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromTo extends _DurationInputArg1 {
  var from: MomentInput
  var to: MomentInput
}

object FromTo {
  @scala.inline
  def apply(
    from: js.UndefOr[Null | MomentInput] = js.undefined,
    to: js.UndefOr[Null | MomentInput] = js.undefined
  ): FromTo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromTo]
  }
}

