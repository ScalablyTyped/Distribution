package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStatusCode extends js.Object {
  var statusCode: js.UndefOr[Double] = js.undefined
}

object AnonStatusCode {
  @scala.inline
  def apply(statusCode: Int | Double = null): AnonStatusCode = {
    val __obj = js.Dynamic.literal()
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStatusCode]
  }
}

