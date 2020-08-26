package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties of a box and whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartBoxwhiskerOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.native
}

object ChartBoxwhiskerOptionsLoadOptions {
  @scala.inline
  def apply(): ChartBoxwhiskerOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
  @scala.inline
  implicit class ChartBoxwhiskerOptionsLoadOptionsOps[Self <: ChartBoxwhiskerOptionsLoadOptions] (val x: Self) extends AnyVal {
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
    def setQuartileCalculation(value: Boolean): Self = this.set("quartileCalculation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuartileCalculation: Self = this.set("quartileCalculation", js.undefined)
    @scala.inline
    def setShowInnerPoints(value: Boolean): Self = this.set("showInnerPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowInnerPoints: Self = this.set("showInnerPoints", js.undefined)
    @scala.inline
    def setShowMeanLine(value: Boolean): Self = this.set("showMeanLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeanLine: Self = this.set("showMeanLine", js.undefined)
    @scala.inline
    def setShowMeanMarker(value: Boolean): Self = this.set("showMeanMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMeanMarker: Self = this.set("showMeanMarker", js.undefined)
    @scala.inline
    def setShowOutlierPoints(value: Boolean): Self = this.set("showOutlierPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowOutlierPoints: Self = this.set("showOutlierPoints", js.undefined)
  }
  
}

