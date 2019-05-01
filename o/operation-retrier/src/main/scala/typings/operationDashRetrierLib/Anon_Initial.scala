package typings
package operationDashRetrierLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Initial extends js.Object {
  var initial: js.UndefOr[scala.Double] = js.undefined
  var max: scala.Double
  var maxAttemptsCount: js.UndefOr[scala.Double] = js.undefined
  var maxAttemptsTime: js.UndefOr[scala.Double] = js.undefined
  var min: scala.Double
  var randomness: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Initial {
  @scala.inline
  def apply(
    max: scala.Double,
    min: scala.Double,
    initial: scala.Int | scala.Double = null,
    maxAttemptsCount: scala.Int | scala.Double = null,
    maxAttemptsTime: scala.Int | scala.Double = null,
    randomness: scala.Int | scala.Double = null
  ): Anon_Initial = {
    val __obj = js.Dynamic.literal(max = max, min = min)
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (maxAttemptsCount != null) __obj.updateDynamic("maxAttemptsCount")(maxAttemptsCount.asInstanceOf[js.Any])
    if (maxAttemptsTime != null) __obj.updateDynamic("maxAttemptsTime")(maxAttemptsTime.asInstanceOf[js.Any])
    if (randomness != null) __obj.updateDynamic("randomness")(randomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Initial]
  }
}

