package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartAxisCategoryType
import typings.officeJsPreview.Excel.ChartAxisDisplayUnit
import typings.officeJsPreview.Excel.ChartAxisGroup
import typings.officeJsPreview.Excel.ChartAxisPosition
import typings.officeJsPreview.Excel.ChartAxisScaleType
import typings.officeJsPreview.Excel.ChartAxisTickLabelPosition
import typings.officeJsPreview.Excel.ChartAxisTickMark
import typings.officeJsPreview.Excel.ChartAxisTimeUnit
import typings.officeJsPreview.Excel.ChartAxisType
import typings.officeJsPreview.Excel.ChartTickLabelAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Billions
import typings.officeJsPreview.officeJsPreviewStrings.Category
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Cross
import typings.officeJsPreview.officeJsPreviewStrings.Custom
import typings.officeJsPreview.officeJsPreviewStrings.DateAxis
import typings.officeJsPreview.officeJsPreviewStrings.Days
import typings.officeJsPreview.officeJsPreviewStrings.High
import typings.officeJsPreview.officeJsPreviewStrings.HundredMillions
import typings.officeJsPreview.officeJsPreviewStrings.HundredThousands
import typings.officeJsPreview.officeJsPreviewStrings.Hundreds
import typings.officeJsPreview.officeJsPreviewStrings.Inside
import typings.officeJsPreview.officeJsPreviewStrings.Invalid
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Linear
import typings.officeJsPreview.officeJsPreviewStrings.Logarithmic
import typings.officeJsPreview.officeJsPreviewStrings.Low
import typings.officeJsPreview.officeJsPreviewStrings.Maximum
import typings.officeJsPreview.officeJsPreviewStrings.Millions
import typings.officeJsPreview.officeJsPreviewStrings.Minimum
import typings.officeJsPreview.officeJsPreviewStrings.Months
import typings.officeJsPreview.officeJsPreviewStrings.NextToAxis
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Outside
import typings.officeJsPreview.officeJsPreviewStrings.Primary
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Secondary
import typings.officeJsPreview.officeJsPreviewStrings.Series
import typings.officeJsPreview.officeJsPreviewStrings.TenMillions
import typings.officeJsPreview.officeJsPreviewStrings.TenThousands
import typings.officeJsPreview.officeJsPreviewStrings.TextAxis
import typings.officeJsPreview.officeJsPreviewStrings.Thousands
import typings.officeJsPreview.officeJsPreviewStrings.Trillions
import typings.officeJsPreview.officeJsPreviewStrings.Value
import typings.officeJsPreview.officeJsPreviewStrings.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAxis.toJSON()`. */
trait ChartAxisData extends js.Object {
  /**
    *
    * Specifies the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.undefined
  /**
    *
    * Specifies the group for the specified axis. See Excel.ChartAxisGroup for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[ChartAxisGroup | Primary | Secondary] = js.undefined
  /**
    *
    * Specifies the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  /**
    *
    * Specifies the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[ChartAxisCategoryType | Automatic | TextAxis | DateAxis] = js.undefined
  /**
    *
    * Specifies the custom axis display unit value. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[
    ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
  ] = js.undefined
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatData] = js.undefined
  /**
    *
    * Specifies the height, in points, of the chart axis. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if the value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[Double] = js.undefined
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
    *
    * Specifies the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  /**
    *
    * Specifies the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
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
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesData] = js.undefined
  /**
    *
    * Specifies the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  /**
    *
    * Specifies the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Specifies if an axis is multilevel.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.undefined
  /**
    *
    * Specifies the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies if Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.undefined
  /**
    *
    * Specifies if the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Specifies the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.undefined
  /**
    *
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.undefined
  /**
    *
    * Specifies the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleData] = js.undefined
  /**
    *
    * Specifies the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Specifies the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[ChartAxisType | Invalid | Category | Value | Series] = js.undefined
  /**
    *
    * Specifies if the axis is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Specifies the width, in points, of the chart axis. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartAxisData {
  @scala.inline
  def apply(
    alignment: ChartTickLabelAlignment | Center | Left | Right = null,
    axisGroup: ChartAxisGroup | Primary | Secondary = null,
    baseTimeUnit: ChartAxisTimeUnit | Days | Months | Years = null,
    categoryType: ChartAxisCategoryType | Automatic | TextAxis | DateAxis = null,
    customDisplayUnit: js.UndefOr[Double] = js.undefined,
    displayUnit: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom = null,
    format: ChartAxisFormatData = null,
    height: js.UndefOr[Double] = js.undefined,
    isBetweenCategories: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    logBase: js.UndefOr[Double] = js.undefined,
    majorGridlines: ChartGridlinesData = null,
    majorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = null,
    majorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = null,
    majorUnit: js.Any = null,
    maximum: js.Any = null,
    minimum: js.Any = null,
    minorGridlines: ChartGridlinesData = null,
    minorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = null,
    minorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = null,
    minorUnit: js.Any = null,
    multiLevel: js.UndefOr[Boolean] = js.undefined,
    numberFormat: String = null,
    offset: js.UndefOr[Double] = js.undefined,
    position: ChartAxisPosition | Automatic | Maximum | Minimum | Custom = null,
    positionAt: js.UndefOr[Double] = js.undefined,
    reversePlotOrder: js.UndefOr[Boolean] = js.undefined,
    scaleType: ChartAxisScaleType | Linear | Logarithmic = null,
    showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.Any = null,
    tickLabelPosition: ChartAxisTickLabelPosition | NextToAxis | High | Low | None = null,
    tickLabelSpacing: js.Any = null,
    tickMarkSpacing: js.UndefOr[Double] = js.undefined,
    title: ChartAxisTitleData = null,
    top: js.UndefOr[Double] = js.undefined,
    `type`: ChartAxisType | Invalid | Category | Value | Series = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): ChartAxisData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (axisGroup != null) __obj.updateDynamic("axisGroup")(axisGroup.asInstanceOf[js.Any])
    if (baseTimeUnit != null) __obj.updateDynamic("baseTimeUnit")(baseTimeUnit.asInstanceOf[js.Any])
    if (categoryType != null) __obj.updateDynamic("categoryType")(categoryType.asInstanceOf[js.Any])
    if (!js.isUndefined(customDisplayUnit)) __obj.updateDynamic("customDisplayUnit")(customDisplayUnit.get.asInstanceOf[js.Any])
    if (displayUnit != null) __obj.updateDynamic("displayUnit")(displayUnit.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isBetweenCategories)) __obj.updateDynamic("isBetweenCategories")(isBetweenCategories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logBase)) __obj.updateDynamic("logBase")(logBase.get.asInstanceOf[js.Any])
    if (majorGridlines != null) __obj.updateDynamic("majorGridlines")(majorGridlines.asInstanceOf[js.Any])
    if (majorTickMark != null) __obj.updateDynamic("majorTickMark")(majorTickMark.asInstanceOf[js.Any])
    if (majorTimeUnitScale != null) __obj.updateDynamic("majorTimeUnitScale")(majorTimeUnitScale.asInstanceOf[js.Any])
    if (majorUnit != null) __obj.updateDynamic("majorUnit")(majorUnit.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorGridlines != null) __obj.updateDynamic("minorGridlines")(minorGridlines.asInstanceOf[js.Any])
    if (minorTickMark != null) __obj.updateDynamic("minorTickMark")(minorTickMark.asInstanceOf[js.Any])
    if (minorTimeUnitScale != null) __obj.updateDynamic("minorTimeUnitScale")(minorTimeUnitScale.asInstanceOf[js.Any])
    if (minorUnit != null) __obj.updateDynamic("minorUnit")(minorUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(multiLevel)) __obj.updateDynamic("multiLevel")(multiLevel.get.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(positionAt)) __obj.updateDynamic("positionAt")(positionAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reversePlotOrder)) __obj.updateDynamic("reversePlotOrder")(reversePlotOrder.get.asInstanceOf[js.Any])
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisplayUnitLabel)) __obj.updateDynamic("showDisplayUnitLabel")(showDisplayUnitLabel.get.asInstanceOf[js.Any])
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (tickLabelPosition != null) __obj.updateDynamic("tickLabelPosition")(tickLabelPosition.asInstanceOf[js.Any])
    if (tickLabelSpacing != null) __obj.updateDynamic("tickLabelSpacing")(tickLabelSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(tickMarkSpacing)) __obj.updateDynamic("tickMarkSpacing")(tickMarkSpacing.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxisData]
  }
}

