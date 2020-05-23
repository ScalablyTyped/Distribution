package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartTrendlineType
import typings.officeJsPreview.officeJsPreviewStrings.Exponential
import typings.officeJsPreview.officeJsPreviewStrings.Linear
import typings.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typings.officeJsPreview.officeJsPreviewStrings.MovingAverage
import typings.officeJsPreview.officeJsPreviewStrings.Polynomial
import typings.officeJsPreview.officeJsPreviewStrings.Power
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartTrendline object, for use in `chartTrendline.set({ ... })`. */
trait ChartTrendlineUpdateData extends js.Object {
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatUpdateData] = js.undefined
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelUpdateData] = js.undefined
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Double] = js.undefined
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power
  ] = js.undefined
}

object ChartTrendlineUpdateData {
  @scala.inline
  def apply(
    backwardPeriod: js.UndefOr[Double] = js.undefined,
    format: ChartTrendlineFormatUpdateData = null,
    forwardPeriod: js.UndefOr[Double] = js.undefined,
    intercept: js.Any = null,
    label: ChartTrendlineLabelUpdateData = null,
    movingAveragePeriod: js.UndefOr[Double] = js.undefined,
    name: String = null,
    polynomialOrder: js.UndefOr[Double] = js.undefined,
    showEquation: js.UndefOr[Boolean] = js.undefined,
    showRSquared: js.UndefOr[Boolean] = js.undefined,
    `type`: ChartTrendlineType | Linear | Exponential | Logarithmic | MovingAverage | Polynomial | Power = null
  ): ChartTrendlineUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backwardPeriod)) __obj.updateDynamic("backwardPeriod")(backwardPeriod.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(forwardPeriod)) __obj.updateDynamic("forwardPeriod")(forwardPeriod.get.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(movingAveragePeriod)) __obj.updateDynamic("movingAveragePeriod")(movingAveragePeriod.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(polynomialOrder)) __obj.updateDynamic("polynomialOrder")(polynomialOrder.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showEquation)) __obj.updateDynamic("showEquation")(showEquation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRSquared)) __obj.updateDynamic("showRSquared")(showRSquared.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineUpdateData]
  }
}

