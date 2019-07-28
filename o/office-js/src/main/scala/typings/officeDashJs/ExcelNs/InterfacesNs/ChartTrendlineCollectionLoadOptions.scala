package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Chart Trendlines.
  *
  * [Api set: ExcelApi 1.7]
  */
trait ChartTrendlineCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}

object ChartTrendlineCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    backwardPeriod: js.UndefOr[Boolean] = js.undefined,
    format: ChartTrendlineFormatLoadOptions = null,
    forwardPeriod: js.UndefOr[Boolean] = js.undefined,
    intercept: js.UndefOr[Boolean] = js.undefined,
    label: ChartTrendlineLabelLoadOptions = null,
    movingAveragePeriod: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    polynomialOrder: js.UndefOr[Boolean] = js.undefined,
    showEquation: js.UndefOr[Boolean] = js.undefined,
    showRSquared: js.UndefOr[Boolean] = js.undefined,
    `type`: js.UndefOr[Boolean] = js.undefined
  ): ChartTrendlineCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(backwardPeriod)) __obj.updateDynamic("backwardPeriod")(backwardPeriod)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(forwardPeriod)) __obj.updateDynamic("forwardPeriod")(forwardPeriod)
    if (!js.isUndefined(intercept)) __obj.updateDynamic("intercept")(intercept)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(movingAveragePeriod)) __obj.updateDynamic("movingAveragePeriod")(movingAveragePeriod)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(polynomialOrder)) __obj.updateDynamic("polynomialOrder")(polynomialOrder)
    if (!js.isUndefined(showEquation)) __obj.updateDynamic("showEquation")(showEquation)
    if (!js.isUndefined(showRSquared)) __obj.updateDynamic("showRSquared")(showRSquared)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartTrendlineCollectionLoadOptions]
  }
}

