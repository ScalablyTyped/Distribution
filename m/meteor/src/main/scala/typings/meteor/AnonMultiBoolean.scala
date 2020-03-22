package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultiBoolean extends js.Object {
  var multi: js.UndefOr[Boolean] = js.undefined
}

object AnonMultiBoolean {
  @scala.inline
  def apply(multi: js.UndefOr[Boolean] = js.undefined): AnonMultiBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiBoolean]
  }
}

