package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Chart Trendlines.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartTrendlineCollectionLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the number of periods that the trendline extends backward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var backwardPeriod: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the formatting of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var format: js.UndefOr[ChartTrendlineFormatLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the number of periods that the trendline extends forward.
    *
    * [Api set: ExcelApi 1.8]
    */
  var forwardPeriod: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the intercept value of the trendline. Can be set to a numeric value or an empty string (for automatic values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var intercept: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the label of a chart trendline.
    *
    * [Api set: ExcelApi 1.8]
    */
  var label: js.UndefOr[ChartTrendlineLabelLoadOptions] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the period of a chart trendline. Only applicable for trendline with MovingAverage type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var movingAveragePeriod: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the name of the trendline. Can be set to a string value, or can be set to null value represents automatic values. The returned value is always a string
    *
    * [Api set: ExcelApi 1.7]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the order of a chart trendline. Only applicable for trendline with Polynomial type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var polynomialOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if the equation for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showEquation: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: True if the R-squared for the trendline is displayed on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showRSquared: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Represents the type of a chart trendline.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.native
}

object ChartTrendlineCollectionLoadOptions {
  @scala.inline
  def apply(): ChartTrendlineCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartTrendlineCollectionLoadOptions]
  }
  @scala.inline
  implicit class ChartTrendlineCollectionLoadOptionsOps[Self <: ChartTrendlineCollectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setBackwardPeriod(value: Boolean): Self = this.set("backwardPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackwardPeriod: Self = this.set("backwardPeriod", js.undefined)
    @scala.inline
    def setFormat(value: ChartTrendlineFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setForwardPeriod(value: Boolean): Self = this.set("forwardPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardPeriod: Self = this.set("forwardPeriod", js.undefined)
    @scala.inline
    def setIntercept(value: Boolean): Self = this.set("intercept", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntercept: Self = this.set("intercept", js.undefined)
    @scala.inline
    def setLabel(value: ChartTrendlineLabelLoadOptions): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMovingAveragePeriod(value: Boolean): Self = this.set("movingAveragePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingAveragePeriod: Self = this.set("movingAveragePeriod", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPolynomialOrder(value: Boolean): Self = this.set("polynomialOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolynomialOrder: Self = this.set("polynomialOrder", js.undefined)
    @scala.inline
    def setShowEquation(value: Boolean): Self = this.set("showEquation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowEquation: Self = this.set("showEquation", js.undefined)
    @scala.inline
    def setShowRSquared(value: Boolean): Self = this.set("showRSquared", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRSquared: Self = this.set("showRSquared", js.undefined)
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

