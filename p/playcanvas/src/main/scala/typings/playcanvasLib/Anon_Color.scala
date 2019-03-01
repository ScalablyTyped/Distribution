package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.UndefOr[js.Array[_]] = js.undefined
  var curves: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var decimalPrecision: js.UndefOr[scala.Double] = js.undefined
  var enumerations: js.UndefOr[js.Array[_]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(
    color: js.Array[_] = null,
    curves: js.Array[java.lang.String] = null,
    decimalPrecision: scala.Int | scala.Double = null,
    enumerations: js.Array[_] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
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

