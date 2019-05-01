package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single axis in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `Position` instead.
    * Represents the specified axis where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crosses: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * [DEPRECATED; kept for back-compat with existing first-party solutions]. Please use `PositionAt` instead.
    * Represents the specified axis where the other axis crosses at. Read Only. Set to this property should use SetCrossesAt(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var crossesAt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether an axis is multilevel or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether Microsoft Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents whether the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of the axis tick label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleLoadOptions] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartAxisLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    alignment: js.UndefOr[scala.Boolean] = js.undefined,
    axisGroup: js.UndefOr[scala.Boolean] = js.undefined,
    baseTimeUnit: js.UndefOr[scala.Boolean] = js.undefined,
    categoryType: js.UndefOr[scala.Boolean] = js.undefined,
    crosses: js.UndefOr[scala.Boolean] = js.undefined,
    crossesAt: js.UndefOr[scala.Boolean] = js.undefined,
    customDisplayUnit: js.UndefOr[scala.Boolean] = js.undefined,
    displayUnit: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartAxisFormatLoadOptions = null,
    height: js.UndefOr[scala.Boolean] = js.undefined,
    isBetweenCategories: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    logBase: js.UndefOr[scala.Boolean] = js.undefined,
    majorGridlines: ChartGridlinesLoadOptions = null,
    majorTickMark: js.UndefOr[scala.Boolean] = js.undefined,
    majorTimeUnitScale: js.UndefOr[scala.Boolean] = js.undefined,
    majorUnit: js.UndefOr[scala.Boolean] = js.undefined,
    maximum: js.UndefOr[scala.Boolean] = js.undefined,
    minimum: js.UndefOr[scala.Boolean] = js.undefined,
    minorGridlines: ChartGridlinesLoadOptions = null,
    minorTickMark: js.UndefOr[scala.Boolean] = js.undefined,
    minorTimeUnitScale: js.UndefOr[scala.Boolean] = js.undefined,
    minorUnit: js.UndefOr[scala.Boolean] = js.undefined,
    multiLevel: js.UndefOr[scala.Boolean] = js.undefined,
    numberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    offset: js.UndefOr[scala.Boolean] = js.undefined,
    position: js.UndefOr[scala.Boolean] = js.undefined,
    positionAt: js.UndefOr[scala.Boolean] = js.undefined,
    reversePlotOrder: js.UndefOr[scala.Boolean] = js.undefined,
    scaleType: js.UndefOr[scala.Boolean] = js.undefined,
    showDisplayUnitLabel: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: js.UndefOr[scala.Boolean] = js.undefined,
    tickLabelPosition: js.UndefOr[scala.Boolean] = js.undefined,
    tickLabelSpacing: js.UndefOr[scala.Boolean] = js.undefined,
    tickMarkSpacing: js.UndefOr[scala.Boolean] = js.undefined,
    title: ChartAxisTitleLoadOptions = null,
    top: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartAxisLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(axisGroup)) __obj.updateDynamic("axisGroup")(axisGroup)
    if (!js.isUndefined(baseTimeUnit)) __obj.updateDynamic("baseTimeUnit")(baseTimeUnit)
    if (!js.isUndefined(categoryType)) __obj.updateDynamic("categoryType")(categoryType)
    if (!js.isUndefined(crosses)) __obj.updateDynamic("crosses")(crosses)
    if (!js.isUndefined(crossesAt)) __obj.updateDynamic("crossesAt")(crossesAt)
    if (!js.isUndefined(customDisplayUnit)) __obj.updateDynamic("customDisplayUnit")(customDisplayUnit)
    if (!js.isUndefined(displayUnit)) __obj.updateDynamic("displayUnit")(displayUnit)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(isBetweenCategories)) __obj.updateDynamic("isBetweenCategories")(isBetweenCategories)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (!js.isUndefined(logBase)) __obj.updateDynamic("logBase")(logBase)
    if (majorGridlines != null) __obj.updateDynamic("majorGridlines")(majorGridlines)
    if (!js.isUndefined(majorTickMark)) __obj.updateDynamic("majorTickMark")(majorTickMark)
    if (!js.isUndefined(majorTimeUnitScale)) __obj.updateDynamic("majorTimeUnitScale")(majorTimeUnitScale)
    if (!js.isUndefined(majorUnit)) __obj.updateDynamic("majorUnit")(majorUnit)
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum)
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum)
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines)
    if (!js.isUndefined(minorTickMark)) __obj.updateDynamic("minorTickMark")(minorTickMark)
    if (!js.isUndefined(minorTimeUnitScale)) __obj.updateDynamic("minorTimeUnitScale")(minorTimeUnitScale)
    if (!js.isUndefined(minorUnit)) __obj.updateDynamic("minorUnit")(minorUnit)
    if (!js.isUndefined(multiLevel)) __obj.updateDynamic("multiLevel")(multiLevel)
    if (!js.isUndefined(numberFormat)) __obj.updateDynamic("numberFormat")(numberFormat)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (!js.isUndefined(position)) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(positionAt)) __obj.updateDynamic("positionAt")(positionAt)
    if (!js.isUndefined(reversePlotOrder)) __obj.updateDynamic("reversePlotOrder")(reversePlotOrder)
    if (!js.isUndefined(scaleType)) __obj.updateDynamic("scaleType")(scaleType)
    if (!js.isUndefined(showDisplayUnitLabel)) __obj.updateDynamic("showDisplayUnitLabel")(showDisplayUnitLabel)
    if (!js.isUndefined(textOrientation)) __obj.updateDynamic("textOrientation")(textOrientation)
    if (!js.isUndefined(tickLabelPosition)) __obj.updateDynamic("tickLabelPosition")(tickLabelPosition)
    if (!js.isUndefined(tickLabelSpacing)) __obj.updateDynamic("tickLabelSpacing")(tickLabelSpacing)
    if (!js.isUndefined(tickMarkSpacing)) __obj.updateDynamic("tickMarkSpacing")(tickMarkSpacing)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartAxisLoadOptions]
  }
}

