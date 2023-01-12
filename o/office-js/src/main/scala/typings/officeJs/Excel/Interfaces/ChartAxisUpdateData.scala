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
    * Specifies the alignment for the specified axis tick label. See `Excel.ChartTextHorizontalAlignment` for detail.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[ChartTickLabelAlignment | Center | Left | Right] = js.undefined
  
  /**
    * Specifies the base unit for the specified category axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  
  /**
    * Specifies the category axis type.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[ChartAxisCategoryType | Automatic | TextAxis | DateAxis] = js.undefined
  
  /**
    * Represents the axis display unit. See `Excel.ChartAxisDisplayUnit` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[
    ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
  ] = js.undefined
  
  /**
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatUpdateData] = js.undefined
  
  /**
    * Specifies if the value axis crosses the category axis between categories.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the number format is linked to the cells. If `true`, the number format will change in the labels when it changes in the cells.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the base of the logarithm when using logarithmic scales.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var logBase: js.UndefOr[Double] = js.undefined
  
  /**
    * Returns an object that represents the major gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  
  /**
    * Specifies the type of major tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  
  /**
    * Specifies the major unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[Any] = js.undefined
  
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[Any] = js.undefined
  
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[Any] = js.undefined
  
  /**
    * Returns an object that represents the minor gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesUpdateData] = js.undefined
  
  /**
    * Specifies the type of minor tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[ChartAxisTickMark | None | Cross | Inside | Outside] = js.undefined
  
  /**
    * Specifies the minor unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[ChartAxisTimeUnit | Days | Months | Years] = js.undefined
  
  /**
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies if an axis is multilevel.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the format code for the axis tick label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the specified axis position where the other axis crosses. See `Excel.ChartAxisPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[ChartAxisPosition | Automatic | Maximum | Minimum | Custom] = js.undefined
  
  /**
    * Specifies if Excel plots data points from last to first.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the value axis scale type. See `Excel.ChartAxisScaleType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: js.UndefOr[ChartAxisScaleType | Linear | Logarithmic] = js.undefined
  
  /**
    * Specifies if the axis display unit label is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the position of tick-mark labels on the specified axis. See `Excel.ChartAxisTickLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[ChartAxisTickLabelPosition | NextToAxis | High | Low | None] = js.undefined
  
  /**
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies the number of categories or series between tick marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the axis title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleUpdateData] = js.undefined
  
  /**
    * Specifies if the axis is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ChartAxisUpdateData {
  
  inline def apply(): ChartAxisUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartAxisUpdateData] (val x: Self) extends AnyVal {
    
    inline def setAlignment(value: ChartTickLabelAlignment | Center | Left | Right): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBaseTimeUnit(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "baseTimeUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseTimeUnitUndefined: Self = StObject.set(x, "baseTimeUnit", js.undefined)
    
    inline def setCategoryType(value: ChartAxisCategoryType | Automatic | TextAxis | DateAxis): Self = StObject.set(x, "categoryType", value.asInstanceOf[js.Any])
    
    inline def setCategoryTypeUndefined: Self = StObject.set(x, "categoryType", js.undefined)
    
    inline def setDisplayUnit(
      value: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom
    ): Self = StObject.set(x, "displayUnit", value.asInstanceOf[js.Any])
    
    inline def setDisplayUnitUndefined: Self = StObject.set(x, "displayUnit", js.undefined)
    
    inline def setFormat(value: ChartAxisFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsBetweenCategories(value: Boolean): Self = StObject.set(x, "isBetweenCategories", value.asInstanceOf[js.Any])
    
    inline def setIsBetweenCategoriesUndefined: Self = StObject.set(x, "isBetweenCategories", js.undefined)
    
    inline def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    inline def setLogBase(value: Double): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
    
    inline def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
    
    inline def setMajorGridlines(value: ChartGridlinesUpdateData): Self = StObject.set(x, "majorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridlinesUndefined: Self = StObject.set(x, "majorGridlines", js.undefined)
    
    inline def setMajorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = StObject.set(x, "majorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMajorTickMarkUndefined: Self = StObject.set(x, "majorTickMark", js.undefined)
    
    inline def setMajorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "majorTimeUnitScale", value.asInstanceOf[js.Any])
    
    inline def setMajorTimeUnitScaleUndefined: Self = StObject.set(x, "majorTimeUnitScale", js.undefined)
    
    inline def setMajorUnit(value: Any): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMaximum(value: Any): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Any): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMinorGridlines(value: ChartGridlinesUpdateData): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    inline def setMinorTickMark(value: ChartAxisTickMark | None | Cross | Inside | Outside): Self = StObject.set(x, "minorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMinorTickMarkUndefined: Self = StObject.set(x, "minorTickMark", js.undefined)
    
    inline def setMinorTimeUnitScale(value: ChartAxisTimeUnit | Days | Months | Years): Self = StObject.set(x, "minorTimeUnitScale", value.asInstanceOf[js.Any])
    
    inline def setMinorTimeUnitScaleUndefined: Self = StObject.set(x, "minorTimeUnitScale", js.undefined)
    
    inline def setMinorUnit(value: Any): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setMultiLevel(value: Boolean): Self = StObject.set(x, "multiLevel", value.asInstanceOf[js.Any])
    
    inline def setMultiLevelUndefined: Self = StObject.set(x, "multiLevel", js.undefined)
    
    inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: ChartAxisPosition | Automatic | Maximum | Minimum | Custom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReversePlotOrder(value: Boolean): Self = StObject.set(x, "reversePlotOrder", value.asInstanceOf[js.Any])
    
    inline def setReversePlotOrderUndefined: Self = StObject.set(x, "reversePlotOrder", js.undefined)
    
    inline def setScaleType(value: ChartAxisScaleType | Linear | Logarithmic): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setShowDisplayUnitLabel(value: Boolean): Self = StObject.set(x, "showDisplayUnitLabel", value.asInstanceOf[js.Any])
    
    inline def setShowDisplayUnitLabelUndefined: Self = StObject.set(x, "showDisplayUnitLabel", js.undefined)
    
    inline def setTextOrientation(value: Any): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTickLabelPosition(value: ChartAxisTickLabelPosition | NextToAxis | High | Low | None): Self = StObject.set(x, "tickLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setTickLabelPositionUndefined: Self = StObject.set(x, "tickLabelPosition", js.undefined)
    
    inline def setTickLabelSpacing(value: Any): Self = StObject.set(x, "tickLabelSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickLabelSpacingUndefined: Self = StObject.set(x, "tickLabelSpacing", js.undefined)
    
    inline def setTickMarkSpacing(value: Double): Self = StObject.set(x, "tickMarkSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickMarkSpacingUndefined: Self = StObject.set(x, "tickMarkSpacing", js.undefined)
    
    inline def setTitle(value: ChartAxisTitleUpdateData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
