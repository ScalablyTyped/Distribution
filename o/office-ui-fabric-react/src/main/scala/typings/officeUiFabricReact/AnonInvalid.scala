package typings.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  /** Whether it's invalid. */
  var invalid: js.UndefOr[Boolean] = js.undefined
}

object AnonInvalid {
  @scala.inline
  def apply(invalid: js.UndefOr[Boolean] = js.undefined): AnonInvalid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(invalid)) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalid]
  }
}

