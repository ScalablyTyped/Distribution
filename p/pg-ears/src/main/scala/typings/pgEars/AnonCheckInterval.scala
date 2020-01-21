package typings.pgEars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCheckInterval extends js.Object {
  // Interval between connection retries, in milliseconds.
  var checkInterval: js.UndefOr[Double] = js.undefined
  var maxAttempts: js.UndefOr[Double] = js.undefined
}

object AnonCheckInterval {
  @scala.inline
  def apply(checkInterval: Int | Double = null, maxAttempts: Int | Double = null): AnonCheckInterval = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCheckInterval]
  }
}

