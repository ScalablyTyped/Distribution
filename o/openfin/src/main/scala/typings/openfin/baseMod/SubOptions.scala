package typings.openfin.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubOptions extends js.Object {
  var timestamp: js.UndefOr[Double] = js.undefined
}

object SubOptions {
  @scala.inline
  def apply(timestamp: Int | Double = null): SubOptions = {
    val __obj = js.Dynamic.literal()
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubOptions]
  }
}

