package typings.officeDashJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the chart points within a series inside a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartPointsCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: HTML color code representation of the marker background color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: HTML color code representation of the marker foreground color of data point. E.g. #FF0000 represents Red.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Returns the value of a chart point. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var value: js.UndefOr[Boolean] = js.native
}

