package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumberOfRetries extends js.Object {
  var numberOfRetries: js.UndefOr[Double] = js.undefined
  var tailableRetryInterval: js.UndefOr[Double] = js.undefined
}

object AnonNumberOfRetries {
  @scala.inline
  def apply(numberOfRetries: Int | Double = null, tailableRetryInterval: Int | Double = null): AnonNumberOfRetries = {
    val __obj = js.Dynamic.literal()
    if (numberOfRetries != null) __obj.updateDynamic("numberOfRetries")(numberOfRetries.asInstanceOf[js.Any])
    if (tailableRetryInterval != null) __obj.updateDynamic("tailableRetryInterval")(tailableRetryInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumberOfRetries]
  }
}

