package typings.mlLevenbergMarquardt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ml-levenberg-marquardt.ml-levenberg-marquardt.Options> */
trait PartialOptions extends js.Object {
  var damping: js.UndefOr[Double] = js.undefined
  var errorTolerance: js.UndefOr[Double] = js.undefined
  var gradientDifference: js.UndefOr[Double] = js.undefined
  var initialValues: js.UndefOr[js.Array[Double]] = js.undefined
  var maxIterations: js.UndefOr[Double] = js.undefined
  var maxValue: js.UndefOr[js.Array[Double]] = js.undefined
  var minValue: js.UndefOr[js.Array[Double]] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    damping: js.UndefOr[Double] = js.undefined,
    errorTolerance: js.UndefOr[Double] = js.undefined,
    gradientDifference: js.UndefOr[Double] = js.undefined,
    initialValues: js.Array[Double] = null,
    maxIterations: js.UndefOr[Double] = js.undefined,
    maxValue: js.Array[Double] = null,
    minValue: js.Array[Double] = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(damping)) __obj.updateDynamic("damping")(damping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errorTolerance)) __obj.updateDynamic("errorTolerance")(errorTolerance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gradientDifference)) __obj.updateDynamic("gradientDifference")(gradientDifference.get.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (!js.isUndefined(maxIterations)) __obj.updateDynamic("maxIterations")(maxIterations.get.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

