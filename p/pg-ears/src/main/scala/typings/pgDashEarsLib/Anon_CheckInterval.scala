package typings
package pgDashEarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CheckInterval extends js.Object {
  // Interval between connection retries, in milliseconds.
  var checkInterval: js.UndefOr[scala.Double] = js.undefined
  var maxAttempts: js.UndefOr[scala.Double] = js.undefined
}

object Anon_CheckInterval {
  @scala.inline
  def apply(checkInterval: scala.Int | scala.Double = null, maxAttempts: scala.Int | scala.Double = null): Anon_CheckInterval = {
    val __obj = js.Dynamic.literal()
    if (checkInterval != null) __obj.updateDynamic("checkInterval")(checkInterval.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CheckInterval]
  }
}

