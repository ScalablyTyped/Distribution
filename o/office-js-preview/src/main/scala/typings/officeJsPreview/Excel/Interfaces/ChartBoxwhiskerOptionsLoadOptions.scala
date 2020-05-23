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
trait ChartBoxwhiskerOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    quartileCalculation: js.UndefOr[Boolean] = js.undefined,
    showInnerPoints: js.UndefOr[Boolean] = js.undefined,
    showMeanLine: js.UndefOr[Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quartileCalculation)) __obj.updateDynamic("quartileCalculation")(quartileCalculation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
}

