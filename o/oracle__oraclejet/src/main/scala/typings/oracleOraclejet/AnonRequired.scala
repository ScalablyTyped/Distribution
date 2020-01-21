package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequired extends js.Object {
  var required: js.UndefOr[AnonHint] = js.undefined
}

object AnonRequired {
  @scala.inline
  def apply(required: AnonHint = null): AnonRequired = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}

