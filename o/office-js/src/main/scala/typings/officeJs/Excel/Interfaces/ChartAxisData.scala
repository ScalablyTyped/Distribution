package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartAxisCategoryType
import typings.officeJs.Excel.ChartAxisDisplayUnit
import typings.officeJs.Excel.ChartAxisGroup
import typings.officeJs.Excel.ChartAxisPosition
import typings.officeJs.Excel.ChartAxisScaleType
import typings.officeJs.Excel.ChartAxisTickLabelPosition
import typings.officeJs.Excel.ChartAxisTickMark
import typings.officeJs.Excel.ChartAxisTimeUnit
import typings.officeJs.Excel.ChartAxisType
import typings.officeJs.Excel.ChartTickLabelAlignment
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Billions
import typings.officeJs.officeJsStrings.Category
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Cross
import typings.officeJs.officeJsStrings.Custom
import typings.officeJs.officeJsStrings.DateAxis
import typings.officeJs.officeJsStrings.Days
import typings.officeJs.officeJsStrings.High
import typings.officeJs.officeJsStrings.HundredMillions
import typings.officeJs.officeJsStrings.HundredThousands
import typings.officeJs.officeJsStrings.Hundreds
import typings.officeJs.officeJsStrings.Inside
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Linear
import typings.officeJs.officeJsStrings.Logarithmic
import typings.officeJs.officeJsStrings.Low
import typings.officeJs.officeJsStrings.Maximum
import typings.officeJs.officeJsStrings.Millions
import typings.officeJs.officeJsStrings.Minimum
import typings.officeJs.officeJsStrings.Months
import typings.officeJs.officeJsStrings.NextToAxis
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Outside
import typings.officeJs.officeJsStrings.Primary
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Secondary
import typings.officeJs.officeJsStrings.Series
import typings.officeJs.officeJsStrings.TenMillions
import typings.officeJs.officeJsStrings.TenThousands
import typings.officeJs.officeJsStrings.TextAxis
import typings.officeJs.officeJsStrings.Thousands
import typings.officeJs.officeJsStrings.Trillions
import typings.officeJs.officeJsStrings.Value
import typings.officeJs.officeJsStrings.Years
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAxis.toJSON()`. */
@js.native
trait ChartAxisData extends js.Object {
  /**
    *
    * Specifies the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.native
  /**
    *
    * Specifies the group for the specified axis. See Excel.ChartAxisGroup for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[ChartAxisGroup | Primary | Secondary] = js.native
  /**
    *
    * Specifies the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Specifies the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[ChartAxisCategoryType | Automatic | TextAxis | DateAxis] = js.native
  /**
    *
    * Specifies the custom axis display unit value. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[
    ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
  ] = js.native
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatData] = js.native
  /**
    *
    * Specifies the height, in points, of the chart axis. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if the number format is linked to the cells. If true, the number format will change in the labels when it changes in the cells.
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[Double] = js.native
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesData] = js.native
  /**
    *
    * Specifies the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  /**
    *
    * Specifies the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[js.Any] = js.native
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[js.Any] = js.native
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesData] = js.native
  /**
    *
    * Specifies the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.native
  /**
    *
    * Specifies the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.native
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[js.Any] = js.native
  /**
    *
    * Specifies if an axis is multilevel.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  /**
    *
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.native
  /**
    *
    * Specifies the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies if Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.native
  /**
    *
    * Specifies if the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[js.Any] = js.native
  /**
    *
    * Specifies the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.native
  /**
    *
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[js.Any] = js.native
  /**
    *
    * Specifies the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleData] = js.native
  /**
    *
    * Specifies the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[ChartAxisType | Invalid | Category | Value | Series] = js.native
  /**
    *
    * Specifies if the axis is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the width, in points, of the chart axis. Null if the axis is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.native
}

object ChartAxisData {
  @scala.inline
  def apply(): ChartAxisData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisData]
  }
  @scala.inline
  implicit class ChartAxisDataOps[Self <: ChartAxisData] (val x: Self) extends AnyVal {
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
    def setAlignment(value: ChartTickLabelAlignment | Center | Left | Right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAxisGroup(value: ChartAxisGroup | Primary | Secondary): Self = this.set("axisGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisGroup: Self = this.set("axisGroup", js.undefined)
    @scala.inline
    def setBaseTimeUnit(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("baseTimeUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseTimeUnit: Self = this.set("baseTimeUnit", js.undefined)
    @scala.inline
    def setCategoryType(value: ChartAxisCategoryType | Automatic | TextAxis | DateAxis): Self = this.set("categoryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryType: Self = this.set("categoryType", js.undefined)
    @scala.inline
    def setCustomDisplayUnit(value: Double): Self = this.set("customDisplayUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDisplayUnit: Self = this.set("customDisplayUnit", js.undefined)
    @scala.inline
    def setDisplayUnit(
      value: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
    ): Self = this.set("displayUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayUnit: Self = this.set("displayUnit", js.undefined)
    @scala.inline
    def setFormat(value: ChartAxisFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIsBetweenCategories(value: Boolean): Self = this.set("isBetweenCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBetweenCategories: Self = this.set("isBetweenCategories", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = this.set("linkNumberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkNumberFormat: Self = this.set("linkNumberFormat", js.undefined)
    @scala.inline
    def setLogBase(value: Double): Self = this.set("logBase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogBase: Self = this.set("logBase", js.undefined)
    @scala.inline
    def setMajorGridlines(value: ChartGridlinesData): Self = this.set("majorGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorGridlines: Self = this.set("majorGridlines", js.undefined)
    @scala.inline
    def setMajorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = this.set("majorTickMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTickMark: Self = this.set("majorTickMark", js.undefined)
    @scala.inline
    def setMajorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("majorTimeUnitScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTimeUnitScale: Self = this.set("majorTimeUnitScale", js.undefined)
    @scala.inline
    def setMajorUnit(value: js.Any): Self = this.set("majorUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorUnit: Self = this.set("majorUnit", js.undefined)
    @scala.inline
    def setMaximum(value: js.Any): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinimum(value: js.Any): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMinorGridlines(value: ChartGridlinesData): Self = this.set("minorGridlines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorGridlines: Self = this.set("minorGridlines", js.undefined)
    @scala.inline
    def setMinorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = this.set("minorTickMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickMark: Self = this.set("minorTickMark", js.undefined)
    @scala.inline
    def setMinorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = this.set("minorTimeUnitScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTimeUnitScale: Self = this.set("minorTimeUnitScale", js.undefined)
    @scala.inline
    def setMinorUnit(value: js.Any): Self = this.set("minorUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorUnit: Self = this.set("minorUnit", js.undefined)
    @scala.inline
    def setMultiLevel(value: Boolean): Self = this.set("multiLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiLevel: Self = this.set("multiLevel", js.undefined)
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPosition(value: ChartAxisPosition | Automatic | Maximum | Minimum | Custom): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionAt(value: Double): Self = this.set("positionAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionAt: Self = this.set("positionAt", js.undefined)
    @scala.inline
    def setReversePlotOrder(value: Boolean): Self = this.set("reversePlotOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversePlotOrder: Self = this.set("reversePlotOrder", js.undefined)
    @scala.inline
    def setScaleType(value: ChartAxisScaleType | Linear | Logarithmic): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleType: Self = this.set("scaleType", js.undefined)
    @scala.inline
    def setShowDisplayUnitLabel(value: Boolean): Self = this.set("showDisplayUnitLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDisplayUnitLabel: Self = this.set("showDisplayUnitLabel", js.undefined)
    @scala.inline
    def setTextOrientation(value: js.Any): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    @scala.inline
    def setTickLabelPosition(value: ChartAxisTickLabelPosition | NextToAxis | High | Low | None): Self = this.set("tickLabelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickLabelPosition: Self = this.set("tickLabelPosition", js.undefined)
    @scala.inline
    def setTickLabelSpacing(value: js.Any): Self = this.set("tickLabelSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickLabelSpacing: Self = this.set("tickLabelSpacing", js.undefined)
    @scala.inline
    def setTickMarkSpacing(value: Double): Self = this.set("tickMarkSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickMarkSpacing: Self = this.set("tickMarkSpacing", js.undefined)
    @scala.inline
    def setTitle(value: ChartAxisTitleData): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setType(value: ChartAxisType | Invalid | Category | Value | Series): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

