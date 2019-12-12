package typings.officeDashJsDashPreview.Excel.Interfaces

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
@js.native
trait NumberFormatInfoLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used as the decimal separator for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberDecimalSeparator: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the string used to separate groups of digits to the left of the decimal for numeric values. This is based on current system settings.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberGroupSeparator: js.UndefOr[Boolean] = js.native
}

