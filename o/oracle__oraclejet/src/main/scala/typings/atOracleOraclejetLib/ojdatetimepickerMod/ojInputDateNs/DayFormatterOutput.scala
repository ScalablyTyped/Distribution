package typings
package atOracleOraclejetLib.ojdatetimepickerMod.ojInputDateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait DayFormatterOutput extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object DayFormatterOutput {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null
  ): DayFormatterOutput = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[DayFormatterOutput]
  }
}

