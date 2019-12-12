package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the the preset criteria conditional format such as above average, below average, unique values, contains blank, nonblank, error, and noerror.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait PresetCriteriaConditionalFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns a format object, encapsulating the conditional formats font, fill, borders, and other properties.
    *
    * [Api set: ExcelApi 1.6]
    */
  var format: js.UndefOr[ConditionalRangeFormatLoadOptions] = js.native
  /**
    *
    * The rule of the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var rule: js.UndefOr[Boolean] = js.native
}

