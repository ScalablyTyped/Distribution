package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ChartMarkerStyle
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.Circle
import typings.officeDashJs.officeDashJsStrings.Dash
import typings.officeDashJs.officeDashJsStrings.Diamond
import typings.officeDashJs.officeDashJsStrings.Dot
import typings.officeDashJs.officeDashJsStrings.Invalid
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Picture
import typings.officeDashJs.officeDashJsStrings.Plus
import typings.officeDashJs.officeDashJsStrings.Square
import typings.officeDashJs.officeDashJsStrings.Star
import typings.officeDashJs.officeDashJsStrings.Triangle
import typings.officeDashJs.officeDashJsStrings.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartPoint.toJSON()`. */
trait ChartPointData extends js.Object {
  /**
    *
    * Returns the data label of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelData] = js.undefined
  /**
    *
    * Encapsulates the format properties chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatData] = js.undefined
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
  var markerBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * HTML color code representation of the marker foreground color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.undefined
  /**
    *
    * Returns the value of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartPointData {
  @scala.inline
  def apply(
    dataLabel: ChartDataLabelData = null,
    format: ChartPointFormatData = null,
    hasDataLabel: js.UndefOr[Boolean] = js.undefined,
    markerBackgroundColor: String = null,
    markerForegroundColor: String = null,
    markerSize: Int | Double = null,
    markerStyle: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture = null,
    value: js.Any = null
  ): ChartPointData = {
    val __obj = js.Dynamic.literal()
    if (dataLabel != null) __obj.updateDynamic("dataLabel")(dataLabel)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(hasDataLabel)) __obj.updateDynamic("hasDataLabel")(hasDataLabel)
    if (markerBackgroundColor != null) __obj.updateDynamic("markerBackgroundColor")(markerBackgroundColor)
    if (markerForegroundColor != null) __obj.updateDynamic("markerForegroundColor")(markerForegroundColor)
    if (markerSize != null) __obj.updateDynamic("markerSize")(markerSize.asInstanceOf[js.Any])
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartPointData]
  }
}

