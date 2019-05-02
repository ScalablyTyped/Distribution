package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartAxis.toJSON()". */
trait ChartAxisData extends js.Object {
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartTickLabelAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right
  ] = js.undefined
  /**
    *
    * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary
  ] = js.undefined
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
  ] = js.undefined
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisCategoryType | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.TextAxis | officeDashJsLib.officeDashJsLibStrings.DateAxis
  ] = js.undefined
  /**
    *
    * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisDisplayUnit | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Hundreds | officeDashJsLib.officeDashJsLibStrings.Thousands | officeDashJsLib.officeDashJsLibStrings.TenThousands | officeDashJsLib.officeDashJsLibStrings.HundredThousands | officeDashJsLib.officeDashJsLibStrings.Millions | officeDashJsLib.officeDashJsLibStrings.TenMillions | officeDashJsLib.officeDashJsLibStrings.HundredMillions | officeDashJsLib.officeDashJsLibStrings.Billions | officeDashJsLib.officeDashJsLibStrings.Trillions | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatData] = js.undefined
  /**
    *
    * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[scala.Double] = js.undefined
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
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
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
  var logBase: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside
  ] = js.undefined
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
  ] = js.undefined
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside
  ] = js.undefined
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years
  ] = js.undefined
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[js.Any] = js.undefined
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
  var numberFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisPosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Maximum | officeDashJsLib.officeDashJsLibStrings.Minimum | officeDashJsLib.officeDashJsLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[scala.Double] = js.undefined
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
  var scaleType: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisScaleType | officeDashJsLib.officeDashJsLibStrings.Linear | officeDashJsLib.officeDashJsLibStrings.Logarithmic
  ] = js.undefined
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
  var textOrientation: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition | officeDashJsLib.officeDashJsLibStrings.NextToAxis | officeDashJsLib.officeDashJsLibStrings.High | officeDashJsLib.officeDashJsLibStrings.Low | officeDashJsLib.officeDashJsLibStrings.None
  ] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the axis title. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleData] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Represents the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.ChartAxisType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Category | officeDashJsLib.officeDashJsLibStrings.Value | officeDashJsLib.officeDashJsLibStrings.Series
  ] = js.undefined
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
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ChartAxisData {
  @scala.inline
  def apply(
    alignment: officeDashJsLib.ExcelNs.ChartTickLabelAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right = null,
    axisGroup: officeDashJsLib.ExcelNs.ChartAxisGroup | officeDashJsLib.officeDashJsLibStrings.Primary | officeDashJsLib.officeDashJsLibStrings.Secondary = null,
    baseTimeUnit: officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years = null,
    categoryType: officeDashJsLib.ExcelNs.ChartAxisCategoryType | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.TextAxis | officeDashJsLib.officeDashJsLibStrings.DateAxis = null,
    customDisplayUnit: scala.Int | scala.Double = null,
    displayUnit: officeDashJsLib.ExcelNs.ChartAxisDisplayUnit | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Hundreds | officeDashJsLib.officeDashJsLibStrings.Thousands | officeDashJsLib.officeDashJsLibStrings.TenThousands | officeDashJsLib.officeDashJsLibStrings.HundredThousands | officeDashJsLib.officeDashJsLibStrings.Millions | officeDashJsLib.officeDashJsLibStrings.TenMillions | officeDashJsLib.officeDashJsLibStrings.HundredMillions | officeDashJsLib.officeDashJsLibStrings.Billions | officeDashJsLib.officeDashJsLibStrings.Trillions | officeDashJsLib.officeDashJsLibStrings.Custom = null,
    format: ChartAxisFormatData = null,
    height: scala.Int | scala.Double = null,
    isBetweenCategories: js.UndefOr[scala.Boolean] = js.undefined,
    left: scala.Int | scala.Double = null,
    linkNumberFormat: js.UndefOr[scala.Boolean] = js.undefined,
    logBase: scala.Int | scala.Double = null,
    majorGridlines: ChartGridlinesData = null,
    majorTickMark: officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside = null,
    majorTimeUnitScale: officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years = null,
    majorUnit: js.Any = null,
    maximum: js.Any = null,
    minimum: js.Any = null,
    minorGridlines: ChartGridlinesData = null,
    minorTickMark: officeDashJsLib.ExcelNs.ChartAxisTickMark | officeDashJsLib.officeDashJsLibStrings.None | officeDashJsLib.officeDashJsLibStrings.Cross | officeDashJsLib.officeDashJsLibStrings.Inside | officeDashJsLib.officeDashJsLibStrings.Outside = null,
    minorTimeUnitScale: officeDashJsLib.ExcelNs.ChartAxisTimeUnit | officeDashJsLib.officeDashJsLibStrings.Days | officeDashJsLib.officeDashJsLibStrings.Months | officeDashJsLib.officeDashJsLibStrings.Years = null,
    minorUnit: js.Any = null,
    multiLevel: js.UndefOr[scala.Boolean] = js.undefined,
    numberFormat: java.lang.String = null,
    offset: scala.Int | scala.Double = null,
    position: officeDashJsLib.ExcelNs.ChartAxisPosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Maximum | officeDashJsLib.officeDashJsLibStrings.Minimum | officeDashJsLib.officeDashJsLibStrings.Custom = null,
    positionAt: scala.Int | scala.Double = null,
    reversePlotOrder: js.UndefOr[scala.Boolean] = js.undefined,
    scaleType: officeDashJsLib.ExcelNs.ChartAxisScaleType | officeDashJsLib.officeDashJsLibStrings.Linear | officeDashJsLib.officeDashJsLibStrings.Logarithmic = null,
    showDisplayUnitLabel: js.UndefOr[scala.Boolean] = js.undefined,
    textOrientation: js.Any = null,
    tickLabelPosition: officeDashJsLib.ExcelNs.ChartAxisTickLabelPosition | officeDashJsLib.officeDashJsLibStrings.NextToAxis | officeDashJsLib.officeDashJsLibStrings.High | officeDashJsLib.officeDashJsLibStrings.Low | officeDashJsLib.officeDashJsLibStrings.None = null,
    tickLabelSpacing: js.Any = null,
    tickMarkSpacing: scala.Int | scala.Double = null,
    title: ChartAxisTitleData = null,
    top: scala.Int | scala.Double = null,
    `type`: officeDashJsLib.ExcelNs.ChartAxisType | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Category | officeDashJsLib.officeDashJsLibStrings.Value | officeDashJsLib.officeDashJsLibStrings.Series = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ChartAxisData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (axisGroup != null) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (baseTimeUnit != null) __obj.updateDynamic("baseTimeUnit")(baseTimeUnit.asInstanceOf[js.Any])
    if (categoryType != null) __obj.updateDynamic("categoryType")(categoryType.asInstanceOf[js.Any])
    if (customDisplayUnit != null) __obj.updateDynamic("customDisplayUnit")(customDisplayUnit.asInstanceOf[js.Any])
    if (displayUnit != null) __obj.updateDynamic("displayUnit")(displayUnit.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isBetweenCategories)) __obj.updateDynamic("isBetweenCategories")(isBetweenCategories)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat)
    if (logBase != null) __obj.updateDynamic("logBase")(logBase.asInstanceOf[js.Any])
    if (majorGridlines != null) __obj.updateDynamic("majorGridlines")(majorGridlines)
    if (majorTickMark != null) __obj.updateDynamic("majorTickMark")(majorTickMark.asInstanceOf[js.Any])
    if (majorTimeUnitScale != null) __obj.updateDynamic("majorTimeUnitScale")(majorTimeUnitScale.asInstanceOf[js.Any])
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum)
    if (minimum != null) __obj.updateDynamic("minimum")(minimum)
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines)
    if (minorTickMark != null) __obj.updateDynamic("minorTickMark")(minorTickMark.asInstanceOf[js.Any])
    if (minorTimeUnitScale != null) __obj.updateDynamic("minorTimeUnitScale")(minorTimeUnitScale.asInstanceOf[js.Any])
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit)
    if (!js.isUndefined(multiLevel)) __obj.updateDynamic("multiLevel")(multiLevel)
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionAt != null) __obj.updateDynamic("positionAt")(positionAt.asInstanceOf[js.Any])
    if (!js.isUndefined(reversePlotOrder)) __obj.updateDynamic("reversePlotOrder")(reversePlotOrder)
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisplayUnitLabel)) __obj.updateDynamic("showDisplayUnitLabel")(showDisplayUnitLabel)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation)
    if (tickLabelPosition != null) __obj.updateDynamic("tickLabelPosition")(tickLabelPosition.asInstanceOf[js.Any])
    if (tickLabelSpacing != null) __obj.updateDynamic("tickLabelSpacing")(tickLabelSpacing)
    if (tickMarkSpacing != null) __obj.updateDynamic("tickMarkSpacing")(tickMarkSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisData]
  }
}

