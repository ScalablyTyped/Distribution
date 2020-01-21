package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPermanent extends js.Object {
  var permanent: js.UndefOr[Boolean] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object AnonPermanent {
  @scala.inline
  def apply(permanent: js.UndefOr[Boolean] = js.undefined, statusCode: Int | Double = null): AnonPermanent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPermanent]
  }
}

