package typings.mysql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRejectUnauthorized extends js.Object {
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object AnonRejectUnauthorized {
  @scala.inline
  def apply(rejectUnauthorized: js.UndefOr[Boolean] = js.undefined): AnonRejectUnauthorized = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRejectUnauthorized]
  }
}

