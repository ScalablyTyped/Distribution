package typings.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOfRetries extends js.Object {
  var numberOfRetries: js.UndefOr[Double] = js.undefined
  var tailableRetryInterval: js.UndefOr[Double] = js.undefined
}

object NumberOfRetries {
  @scala.inline
  def apply(
    numberOfRetries: js.UndefOr[Double] = js.undefined,
    tailableRetryInterval: js.UndefOr[Double] = js.undefined
  ): NumberOfRetries = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfRetries)) __obj.updateDynamic("numberOfRetries")(numberOfRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tailableRetryInterval)) __obj.updateDynamic("tailableRetryInterval")(tailableRetryInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfRetries]
  }
}

