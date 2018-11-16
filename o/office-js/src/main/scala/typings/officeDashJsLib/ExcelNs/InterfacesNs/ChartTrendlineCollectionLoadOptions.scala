package typings
package officeDashJsLib.ExcelNs.InterfacesNs

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
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the number of periods that the trendline extends backward.
               *
               * [Api set: ExcelApi 1.8]
               */
  var backwardPeriod: js.UndefOr[scala.Boolean] = js.undefined
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
  var forwardPeriod: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
               *
               * [Api set: ExcelApi 1.7]
               */
  var intercept: js.UndefOr[scala.Boolean] = js.undefined
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
  var movingAveragePeriod: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
               *
               * [Api set: ExcelApi 1.7]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
               *
               * [Api set: ExcelApi 1.7]
               */
  var polynomialOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: True if the equation for the trendline is displayed on the chart.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showEquation: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: True if the R-squared for the trendline is displayed on the chart.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showRSquared: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the type of a chart trendline.
               *
               * [Api set: ExcelApi 1.7]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

