package typings.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var statusCode: Double
}

object AnonData {
  @scala.inline
  def apply(statusCode: Double, data: js.Any = null): AnonData = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

