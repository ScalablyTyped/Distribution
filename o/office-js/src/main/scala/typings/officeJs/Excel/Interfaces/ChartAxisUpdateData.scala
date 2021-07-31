package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartAxisCategoryType
import typings.officeJs.Excel.ChartAxisDisplayUnit
import typings.officeJs.Excel.ChartAxisPosition
import typings.officeJs.Excel.ChartAxisScaleType
import typings.officeJs.Excel.ChartAxisTickLabelPosition
import typings.officeJs.Excel.ChartAxisTickMark
import typings.officeJs.Excel.ChartAxisTimeUnit
import typings.officeJs.Excel.ChartTickLabelAlignment
import typings.officeJs.officeJsStrings.Automatic
import typings.officeJs.officeJsStrings.Billions
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
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.TenMillions
import typings.officeJs.officeJsStrings.TenThousands
import typings.officeJs.officeJsStrings.TextAxis
import typings.officeJs.officeJsStrings.Thousands
import typings.officeJs.officeJsStrings.Trillions
import typings.officeJs.officeJsStrings.Years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartAxis object, for use in `chartAxis.set({ ... })`. */
trait ChartAxisUpdateData extends StObject {
  
  /**
    *
    * Specifies the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.undefined
  
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
    * Specifies if the value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  
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
  var majorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  
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
  var minorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  
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
  var title: js.UndefOr[ChartAxisTitleUpdateData] = js.undefined
  
  /**
    *
    * Specifies if the axis is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartAxisUpdateData {
  
  @scala.inline
  def apply(): ChartAxisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisUpdateData]
  }
  
  @scala.inline
  implicit class ChartAxisUpdateDataMutableBuilder[Self <: ChartAxisUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: ChartTickLabelAlignment | Center | Left | Right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setBaseTimeUnit(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "baseTimeUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseTimeUnitUndefined: Self = StObject.set(x, "baseTimeUnit", js.undefined)
    
    @scala.inline
    def setCategoryType(value: ChartAxisCategoryType | Automatic | TextAxis | DateAxis): Self = StObject.set(x, "categoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryTypeUndefined: Self = StObject.set(x, "categoryType", js.undefined)
    
    @scala.inline
    def setDisplayUnit(
      value: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
    ): Self = StObject.set(x, "displayUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUnitUndefined: Self = StObject.set(x, "displayUnit", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartAxisFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setIsBetweenCategories(value: Boolean): Self = StObject.set(x, "isBetweenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBetweenCategoriesUndefined: Self = StObject.set(x, "isBetweenCategories", js.undefined)
    
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    @scala.inline
    def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
    
    @scala.inline
    def setMajorGridlines(value: ChartGridlinesUpdateData): Self = StObject.set(x, "majorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorGridlinesUndefined: Self = StObject.set(x, "majorGridlines", js.undefined)
    
    @scala.inline
    def setMajorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = StObject.set(x, "majorTickMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTickMarkUndefined: Self = StObject.set(x, "majorTickMark", js.undefined)
    
    @scala.inline
    def setMajorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "majorTimeUnitScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTimeUnitScaleUndefined: Self = StObject.set(x, "majorTimeUnitScale", js.undefined)
    
    @scala.inline
    def setMajorUnit(value: js.Any): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    @scala.inline
    def setMaximum(value: js.Any): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    @scala.inline
    def setMinimum(value: js.Any): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    @scala.inline
    def setMinorGridlines(value: ChartGridlinesUpdateData): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    @scala.inline
    def setMinorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = StObject.set(x, "minorTickMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickMarkUndefined: Self = StObject.set(x, "minorTickMark", js.undefined)
    
    @scala.inline
    def setMinorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "minorTimeUnitScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTimeUnitScaleUndefined: Self = StObject.set(x, "minorTimeUnitScale", js.undefined)
    
    @scala.inline
    def setMinorUnit(value: js.Any): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    @scala.inline
    def setMultiLevel(value: Boolean): Self = StObject.set(x, "multiLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLevelUndefined: Self = StObject.set(x, "multiLevel", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: ChartAxisPosition | Automatic | Maximum | Minimum | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setReversePlotOrder(value: Boolean): Self = StObject.set(x, "reversePlotOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversePlotOrderUndefined: Self = StObject.set(x, "reversePlotOrder", js.undefined)
    
    @scala.inline
    def setScaleType(value: ChartAxisScaleType | Linear | Logarithmic): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    @scala.inline
    def setShowDisplayUnitLabel(value: Boolean): Self = StObject.set(x, "showDisplayUnitLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDisplayUnitLabelUndefined: Self = StObject.set(x, "showDisplayUnitLabel", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: js.Any): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    @scala.inline
    def setTickLabelPosition(value: ChartAxisTickLabelPosition | NextToAxis | High | Low | None): Self = StObject.set(x, "tickLabelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabelPositionUndefined: Self = StObject.set(x, "tickLabelPosition", js.undefined)
    
    @scala.inline
    def setTickLabelSpacing(value: js.Any): Self = StObject.set(x, "tickLabelSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabelSpacingUndefined: Self = StObject.set(x, "tickLabelSpacing", js.undefined)
    
    @scala.inline
    def setTickMarkSpacing(value: Double): Self = StObject.set(x, "tickMarkSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickMarkSpacingUndefined: Self = StObject.set(x, "tickMarkSpacing", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartAxisTitleUpdateData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
