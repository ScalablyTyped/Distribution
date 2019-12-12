package typings.officeDashJsDashPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the format properties for chart plotArea.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartPlotAreaFormatLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  var border: js.UndefOr[ChartBorderLoadOptions] = js.native
}

