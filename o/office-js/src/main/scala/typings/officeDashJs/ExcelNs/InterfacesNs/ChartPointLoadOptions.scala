package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a point of a series in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartPointLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelLoadOptions] = js.undefined
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatLoadOptions] = js.undefined
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the marker background color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * HTML color code representation of the marker foreground color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns the value of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object ChartPointLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    dataLabel: ChartDataLabelLoadOptions = null,
    format: ChartPointFormatLoadOptions = null,
    hasDataLabel: js.UndefOr[Boolean] = js.undefined,
    markerBackgroundColor: js.UndefOr[Boolean] = js.undefined,
    markerForegroundColor: js.UndefOr[Boolean] = js.undefined,
    markerSize: js.UndefOr[Boolean] = js.undefined,
    markerStyle: js.UndefOr[Boolean] = js.undefined,
    value: js.UndefOr[Boolean] = js.undefined
  ): ChartPointLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasDataLabel)) __obj.updateDynamic("hasDataLabel")(hasDataLabel)
    if (!js.isUndefined(markerBackgroundColor)) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor)
    if (!js.isUndefined(markerForegroundColor)) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor)
    if (!js.isUndefined(markerSize)) __obj.updateDynamic("markerSize")(markerSize)
    if (!js.isUndefined(markerStyle)) __obj.updateDynamic("markerStyle")(markerStyle)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartPointLoadOptions]
  }
}

