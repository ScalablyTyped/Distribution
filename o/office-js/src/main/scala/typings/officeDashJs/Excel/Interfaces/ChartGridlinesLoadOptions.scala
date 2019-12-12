package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents major or minor gridlines on a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartGridlinesLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatLoadOptions] = js.native
  /**
    *
    * Boolean value representing if the axis gridlines are visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}

