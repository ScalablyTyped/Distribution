package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the IterativeCalculation object, for use in "iterativeCalculation.set({ ... })". */
trait IterativeCalculationUpdateData extends js.Object {
  /**
    *
    * True if Excel will use iteration to resolve circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the maximum amount of change between each iteration as Excel resolves circular references.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxChange: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[scala.Double] = js.undefined
}

object IterativeCalculationUpdateData {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxChange: scala.Int | scala.Double = null,
    maxIteration: scala.Int | scala.Double = null
  ): IterativeCalculationUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (maxChange != null) __obj.updateDynamic("maxChange")(maxChange.asInstanceOf[js.Any])
    if (maxIteration != null) __obj.updateDynamic("maxIteration")(maxIteration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterativeCalculationUpdateData]
  }
}

