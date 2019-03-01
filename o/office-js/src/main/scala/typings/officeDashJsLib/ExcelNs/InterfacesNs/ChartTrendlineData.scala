package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartTrendline.toJSON()". */
trait ChartTrendlineData extends js.Object {
  /**
    *
    * Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatData] = js.undefined
  /**
    *
    * Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[scala.Double] = js.undefined
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
  var label: js.UndefOr[ChartTrendlineLabelData] = js.undefined
  /**
    *
    * Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTrendlineType | officeDashJsLib.officeDashJsLibStrings.Linear | officeDashJsLib.officeDashJsLibStrings.Exponential | officeDashJsLib.officeDashJsLibStrings.Logarithmic | officeDashJsLib.officeDashJsLibStrings.MovingAverage | officeDashJsLib.officeDashJsLibStrings.Polynomial | officeDashJsLib.officeDashJsLibStrings.Power
  ] = js.undefined
}

object ChartTrendlineData {
  @scala.inline
  def apply(
    backwardPeriod: scala.Int | scala.Double = null,
    format: ChartTrendlineFormatData = null,
    forwardPeriod: scala.Int | scala.Double = null,
    intercept: js.Any = null,
    label: ChartTrendlineLabelData = null,
    movingAveragePeriod: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    polynomialOrder: scala.Int | scala.Double = null,
    showEquation: js.UndefOr[scala.Boolean] = js.undefined,
    showRSquared: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: officeDashJsLib.ExcelNs.ChartTrendlineType | officeDashJsLib.officeDashJsLibStrings.Linear | officeDashJsLib.officeDashJsLibStrings.Exponential | officeDashJsLib.officeDashJsLibStrings.Logarithmic | officeDashJsLib.officeDashJsLibStrings.MovingAverage | officeDashJsLib.officeDashJsLibStrings.Polynomial | officeDashJsLib.officeDashJsLibStrings.Power = null
  ): ChartTrendlineData = {
    val __obj = js.Dynamic.literal()
    if (backwardPeriod != null) __obj.updateDynamic("backwardPeriod")(backwardPeriod.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (forwardPeriod != null) __obj.updateDynamic("forwardPeriod")(forwardPeriod.asInstanceOf[js.Any])
    if (intercept != null) __obj.updateDynamic("intercept")(intercept)
    if (label != null) __obj.updateDynamic("label")(label)
    if (movingAveragePeriod != null) __obj.updateDynamic("movingAveragePeriod")(movingAveragePeriod.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (polynomialOrder != null) __obj.updateDynamic("polynomialOrder")(polynomialOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(showEquation)) __obj.updateDynamic("showEquation")(showEquation)
    if (!js.isUndefined(showRSquared)) __obj.updateDynamic("showRSquared")(showRSquared)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTrendlineData]
  }
}

