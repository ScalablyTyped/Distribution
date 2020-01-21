package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNoop extends js.Object {
  var noop: js.UndefOr[Boolean] = js.undefined
}

object AnonNoop {
  @scala.inline
  def apply(noop: js.UndefOr[Boolean] = js.undefined): AnonNoop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noop)) __obj.updateDynamic("noop")(noop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNoop]
  }
}

