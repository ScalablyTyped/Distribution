package typings
package natsDashHemeraLib.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreakerConfig extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var halfOpenTime: js.UndefOr[scala.Double] = js.undefined
  var maxFailures: js.UndefOr[scala.Double] = js.undefined
  var minSuccesses: js.UndefOr[scala.Double] = js.undefined
  var resetIntervalTime: js.UndefOr[scala.Double] = js.undefined
}

object CircuitBreakerConfig {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    halfOpenTime: scala.Int | scala.Double = null,
    maxFailures: scala.Int | scala.Double = null,
    minSuccesses: scala.Int | scala.Double = null,
    resetIntervalTime: scala.Int | scala.Double = null
  ): CircuitBreakerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (halfOpenTime != null) __obj.updateDynamic("halfOpenTime")(halfOpenTime.asInstanceOf[js.Any])
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (minSuccesses != null) __obj.updateDynamic("minSuccesses")(minSuccesses.asInstanceOf[js.Any])
    if (resetIntervalTime != null) __obj.updateDynamic("resetIntervalTime")(resetIntervalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircuitBreakerConfig]
  }
}

