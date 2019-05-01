package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the properties for Box & Whisker chart.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartBoxwhiskerOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets quartile calculation type of a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if inner points showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if mean line showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if mean marker showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if outlier points showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    quartileCalculation: js.UndefOr[scala.Boolean] = js.undefined,
    showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanLine: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(quartileCalculation)) __obj.updateDynamic("quartileCalculation")(quartileCalculation)
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints)
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine)
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker)
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints)
    __obj.asInstanceOf[ChartBoxwhiskerOptionsLoadOptions]
  }
}

