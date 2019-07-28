package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[js.Array[_]] = js.undefined
  var curves: js.UndefOr[js.Array[String]] = js.undefined
  var decimalPrecision: js.UndefOr[Double] = js.undefined
  var enumerations: js.UndefOr[js.Array[_]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: js.Array[_] = null,
    curves: js.Array[String] = null,
    decimalPrecision: Int | Double = null,
    enumerations: js.Array[_] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null
  ): Anon_Color = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (curves != null) __obj.updateDynamic("curves")(curves)
    if (decimalPrecision != null) __obj.updateDynamic("decimalPrecision")(decimalPrecision.asInstanceOf[js.Any])
    if (enumerations != null) __obj.updateDynamic("enumerations")(enumerations)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

