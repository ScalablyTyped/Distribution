package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRegexp extends js.Object {
  var regexp: js.UndefOr[AnonMessageDetail] = js.undefined
  var required: js.UndefOr[AnonHint] = js.undefined
}

object AnonRegexp {
  @scala.inline
  def apply(regexp: AnonMessageDetail = null, required: AnonHint = null): AnonRegexp = {
    val __obj = js.Dynamic.literal()
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRegexp]
  }
}

