package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumberOfRetries extends js.Object {
  var numberOfRetries: js.UndefOr[Double] = js.undefined
  var tailableRetryInterval: js.UndefOr[Double] = js.undefined
}

object Anon_NumberOfRetries {
  @scala.inline
  def apply(numberOfRetries: Int | Double = null, tailableRetryInterval: Int | Double = null): Anon_NumberOfRetries = {
    val __obj = js.Dynamic.literal()
    if (numberOfRetries != null) __obj.updateDynamic("numberOfRetries")(numberOfRetries.asInstanceOf[js.Any])
    if (tailableRetryInterval != null) __obj.updateDynamic("tailableRetryInterval")(tailableRetryInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NumberOfRetries]
  }
}

