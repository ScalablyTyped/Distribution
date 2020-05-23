package typings.openfin.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubOptions extends js.Object {
  var timestamp: js.UndefOr[Double] = js.undefined
}

object SubOptions {
  @scala.inline
  def apply(timestamp: js.UndefOr[Double] = js.undefined): SubOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubOptions]
  }
}

