package typings.officeJs.Excel.Interfaces

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
    * Returns or sets the quartile calculation type of a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the inner points are shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean line is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not the mean marker is shown in a box and whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies whether or not outlier points are shown in a box and whisker chart. Read/Write.
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
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(quartileCalculation)) __obj.updateDynamic("quartileCalculation")(quartileCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine.asInstanceOf[js.Any])
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker.asInstanceOf[js.Any])
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
}

