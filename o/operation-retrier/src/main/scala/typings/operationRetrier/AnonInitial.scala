package typings.operationRetrier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInitial extends js.Object {
  var initial: js.UndefOr[Double] = js.undefined
  var max: Double
  var maxAttemptsCount: js.UndefOr[Double] = js.undefined
  var maxAttemptsTime: js.UndefOr[Double] = js.undefined
  var min: Double
  var randomness: js.UndefOr[Double] = js.undefined
}

object AnonInitial {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    initial: Int | Double = null,
    maxAttemptsCount: Int | Double = null,
    maxAttemptsTime: Int | Double = null,
    randomness: Int | Double = null
  ): AnonInitial = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    if (initial != null) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    if (maxAttemptsCount != null) __obj.updateDynamic("maxAttemptsCount")(maxAttemptsCount.asInstanceOf[js.Any])
    if (maxAttemptsTime != null) __obj.updateDynamic("maxAttemptsTime")(maxAttemptsTime.asInstanceOf[js.Any])
    if (randomness != null) __obj.updateDynamic("randomness")(randomness.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInitial]
  }
}

