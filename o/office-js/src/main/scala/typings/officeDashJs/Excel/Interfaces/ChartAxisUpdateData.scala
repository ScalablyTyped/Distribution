package typings.officeDashJs.Excel.Interfaces

import typings.officeDashJs.Excel.ChartAxisCategoryType
import typings.officeDashJs.Excel.ChartAxisDisplayUnit
import typings.officeDashJs.Excel.ChartAxisPosition
import typings.officeDashJs.Excel.ChartAxisScaleType
import typings.officeDashJs.Excel.ChartAxisTickLabelPosition
import typings.officeDashJs.Excel.ChartAxisTickMark
import typings.officeDashJs.Excel.ChartAxisTimeUnit
import typings.officeDashJs.Excel.ChartTickLabelAlignment
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.Billions
import typings.officeDashJs.officeDashJsStrings.Center
import typings.officeDashJs.officeDashJsStrings.Cross
import typings.officeDashJs.officeDashJsStrings.Custom
import typings.officeDashJs.officeDashJsStrings.DateAxis
import typings.officeDashJs.officeDashJsStrings.Days
import typings.officeDashJs.officeDashJsStrings.High
import typings.officeDashJs.officeDashJsStrings.HundredMillions
import typings.officeDashJs.officeDashJsStrings.HundredThousands
import typings.officeDashJs.officeDashJsStrings.Hundreds
import typings.officeDashJs.officeDashJsStrings.Inside
import typings.officeDashJs.officeDashJsStrings.Left
import typings.officeDashJs.officeDashJsStrings.Linear
import typings.officeDashJs.officeDashJsStrings.Logarithmic
import typings.officeDashJs.officeDashJsStrings.Low
import typings.officeDashJs.officeDashJsStrings.Maximum
import typings.officeDashJs.officeDashJsStrings.Millions
import typings.officeDashJs.officeDashJsStrings.Minimum
import typings.officeDashJs.officeDashJsStrings.Months
import typings.officeDashJs.officeDashJsStrings.NextToAxis
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.Outside
import typings.officeDashJs.officeDashJsStrings.Right
import typings.officeDashJs.officeDashJsStrings.TenMillions
import typings.officeDashJs.officeDashJsStrings.TenThousands
import typings.officeDashJs.officeDashJsStrings.TextAxis
import typings.officeDashJs.officeDashJsStrings.Thousands
import typings.officeDashJs.officeDashJsStrings.Trillions
import typings.officeDashJs.officeDashJsStrings.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxis object, for use in `chartAxis.set({ ... })`. */
trait ChartAxisUpdateData extends js.Object {
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.undefined
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[ChartAxisCategoryType | Automatic | TextAxis | DateAxis] = js.undefined
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
  var format: js.UndefOr[ChartAxisFormatUpdateData] = js.undefined
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether or not the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the base of the logarithm when using logarithmic scales.
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
  var majorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
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
  var minorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
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
    * Represents whether an axis is multilevel or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.undefined
  /**
    *
    * Represents whether Microsoft Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.undefined
  /**
    *
    * Represents whether the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined
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
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.undefined
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
  var tickMarkSpacing: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleUpdateData] = js.undefined
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ChartAxisUpdateData {
  @scala.inline
  def apply(
    alignment: ChartTickLabelAlignment | Center | Left | Right = null,
    baseTimeUnit: ChartAxisTimeUnit | Days | Months | Years = null,
    categoryType: ChartAxisCategoryType | Automatic | TextAxis | DateAxis = null,
    displayUnit: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom = null,
    format: ChartAxisFormatUpdateData = null,
    isBetweenCategories: js.UndefOr[Boolean] = js.undefined,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    logBase: Int | Double = null,
    majorGridlines: ChartGridlinesUpdateData = null,
    majorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = null,
    majorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = null,
    majorUnit: js.Any = null,
    maximum: js.Any = null,
    minimum: js.Any = null,
    minorGridlines: ChartGridlinesUpdateData = null,
    minorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = null,
    minorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = null,
    minorUnit: js.Any = null,
    multiLevel: js.UndefOr[Boolean] = js.undefined,
    numberFormat: String = null,
    offset: Int | Double = null,
    position: ChartAxisPosition | Automatic | Maximum | Minimum | Custom = null,
    reversePlotOrder: js.UndefOr[Boolean] = js.undefined,
    scaleType: ChartAxisScaleType | Linear | Logarithmic = null,
    showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined,
    textOrientation: js.Any = null,
    tickLabelPosition: ChartAxisTickLabelPosition | NextToAxis | High | Low | None = null,
    tickLabelSpacing: js.Any = null,
    tickMarkSpacing: Int | Double = null,
    title: ChartAxisTitleUpdateData = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ChartAxisUpdateData = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (baseTimeUnit != null) __obj.updateDynamic("baseTimeUnit")(baseTimeUnit.asInstanceOf[js.Any])
    if (categoryType != null) __obj.updateDynamic("categoryType")(categoryType.asInstanceOf[js.Any])
    if (displayUnit != null) __obj.updateDynamic("displayUnit")(displayUnit.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(isBetweenCategories)) __obj.updateDynamic("isBetweenCategories")(isBetweenCategories)
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
    if (!js.isUndefined(reversePlotOrder)) __obj.updateDynamic("reversePlotOrder")(reversePlotOrder)
    if (scaleType != null) __obj.updateDynamic("scaleType")(scaleType.asInstanceOf[js.Any])
    if (!js.isUndefined(showDisplayUnitLabel)) __obj.updateDynamic("showDisplayUnitLabel")(showDisplayUnitLabel)
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation)
    if (tickLabelPosition != null) __obj.updateDynamic("tickLabelPosition")(tickLabelPosition.asInstanceOf[js.Any])
    if (tickLabelSpacing != null) __obj.updateDynamic("tickLabelSpacing")(tickLabelSpacing)
    if (tickMarkSpacing != null) __obj.updateDynamic("tickMarkSpacing")(tickMarkSpacing.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartAxisUpdateData]
  }
}

