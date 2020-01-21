package typings.memFsEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeparator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var trimEnd: js.UndefOr[Boolean] = js.undefined
}

object AnonSeparator {
  @scala.inline
  def apply(separator: String = null, trimEnd: js.UndefOr[Boolean] = js.undefined): AnonSeparator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(trimEnd)) __obj.updateDynamic("trimEnd")(trimEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
}

