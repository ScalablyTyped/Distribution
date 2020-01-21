package typings.ncp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrs extends js.Object {
  var errs: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonErrs {
  @scala.inline
  def apply(errs: js.UndefOr[scala.Nothing] = js.undefined): AnonErrs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errs)) __obj.updateDynamic("errs")(errs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrs]
  }
}

