package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Iterative Calculation settings.
  *
  * [Api set: ExcelApi 1.9]
  */
trait IterativeCalculationLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
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
  var maxChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the maximum number of iterations that Excel can use to resolve a circular reference.
    *
    * [Api set: ExcelApi 1.9]
    */
  var maxIteration: js.UndefOr[scala.Boolean] = js.undefined
}

object IterativeCalculationLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    maxChange: js.UndefOr[scala.Boolean] = js.undefined,
    maxIteration: js.UndefOr[scala.Boolean] = js.undefined
  ): IterativeCalculationLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(maxChange)) __obj.updateDynamic("maxChange")(maxChange)
    if (!js.isUndefined(maxIteration)) __obj.updateDynamic("maxIteration")(maxIteration)
    __obj.asInstanceOf[IterativeCalculationLoadOptions]
  }
}

