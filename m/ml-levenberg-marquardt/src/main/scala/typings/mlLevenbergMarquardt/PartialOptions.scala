package typings.mlLevenbergMarquardt

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
    damping: Int | Double = null,
    errorTolerance: Int | Double = null,
    gradientDifference: Int | Double = null,
    initialValues: js.Array[Double] = null,
    maxIterations: Int | Double = null,
    maxValue: js.Array[Double] = null,
    minValue: js.Array[Double] = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (damping != null) __obj.updateDynamic("damping")(damping.asInstanceOf[js.Any])
    if (errorTolerance != null) __obj.updateDynamic("errorTolerance")(errorTolerance.asInstanceOf[js.Any])
    if (gradientDifference != null) __obj.updateDynamic("gradientDifference")(gradientDifference.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

