package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Defines the culturally appropriate format of displaying numbers. This is based on current system culture settings.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait NumberFormatInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberDecimalSeparator: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberGroupSeparator: js.UndefOr[Boolean] = js.undefined
}

object NumberFormatInfoLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    numberDecimalSeparator: js.UndefOr[Boolean] = js.undefined,
    numberGroupSeparator: js.UndefOr[Boolean] = js.undefined
  ): NumberFormatInfoLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(numberDecimalSeparator)) __obj.updateDynamic("numberDecimalSeparator")(numberDecimalSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(numberGroupSeparator)) __obj.updateDynamic("numberGroupSeparator")(numberGroupSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatInfoLoadOptions]
  }
}

