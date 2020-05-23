package typings.operationRetrier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initial extends js.Object {
  var initial: js.UndefOr[Double] = js.undefined
  var max: Double
  var maxAttemptsCount: js.UndefOr[Double] = js.undefined
  var maxAttemptsTime: js.UndefOr[Double] = js.undefined
  var min: Double
  var randomness: js.UndefOr[Double] = js.undefined
}

object Initial {
  @scala.inline
  def apply(
    max: Double,
    min: Double,
    initial: js.UndefOr[Double] = js.undefined,
    maxAttemptsCount: js.UndefOr[Double] = js.undefined,
    maxAttemptsTime: js.UndefOr[Double] = js.undefined,
    randomness: js.UndefOr[Double] = js.undefined
  ): Initial = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttemptsCount)) __obj.updateDynamic("maxAttemptsCount")(maxAttemptsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAttemptsTime)) __obj.updateDynamic("maxAttemptsTime")(maxAttemptsTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(randomness)) __obj.updateDynamic("randomness")(randomness.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initial]
  }
}

