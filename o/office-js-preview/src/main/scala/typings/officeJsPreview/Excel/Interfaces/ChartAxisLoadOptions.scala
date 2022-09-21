package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single axis in a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait ChartAxisLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the alignment for the specified axis tick label. See `Excel.ChartTextHorizontalAlignment` for detail.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var alignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the group for the specified axis. See `Excel.ChartAxisGroup` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var axisGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the base unit for the specified category axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the category axis type.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the custom axis display unit value. To set this property, please use the `SetCustomDisplayUnit(double)` method.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var customDisplayUnit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the axis display unit. See `Excel.ChartAxisDisplayUnit` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAxisFormatLoadOptions] = js.undefined
  
  /**
    * Specifies the height, in points, of the chart axis. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the value axis crosses the category axis between categories.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the distance, in points, from the left edge of the axis to the left of chart area. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
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
  var logBase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns an object that represents the major gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var majorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  
  /**
    * Specifies the type of major tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the major unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns an object that represents the minor gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minorGridlines: js.UndefOr[ChartGridlinesLoadOptions] = js.undefined
  
  /**
    * Specifies the type of minor tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the minor unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.UndefOr[Boolean] = js.undefined
  
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
  var numberFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var offset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the specified axis position where the other axis crosses. See `Excel.ChartAxisPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the axis position where the other axis crosses. You should use the `SetPositionAt(double)` method to set this property.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var positionAt: js.UndefOr[Boolean] = js.undefined
  
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
  var scaleType: js.UndefOr[Boolean] = js.undefined
  
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
  var textOrientation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the position of tick-mark labels on the specified axis. See `Excel.ChartAxisTickLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the number of categories or series between tick marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the axis title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartAxisTitleLoadOptions] = js.undefined
  
  /**
    * Specifies the distance, in points, from the top edge of the axis to the top of chart area. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the axis type. See `Excel.ChartAxisType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the axis is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width, in points, of the chart axis. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Boolean] = js.undefined
}
object ChartAxisLoadOptions {
  
  inline def apply(): ChartAxisLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartAxisLoadOptions]
  }
  
  extension [Self <: ChartAxisLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAlignment(value: Boolean): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setAxisGroup(value: Boolean): Self = StObject.set(x, "axisGroup", value.asInstanceOf[js.Any])
    
    inline def setAxisGroupUndefined: Self = StObject.set(x, "axisGroup", js.undefined)
    
    inline def setBaseTimeUnit(value: Boolean): Self = StObject.set(x, "baseTimeUnit", value.asInstanceOf[js.Any])
    
    inline def setBaseTimeUnitUndefined: Self = StObject.set(x, "baseTimeUnit", js.undefined)
    
    inline def setCategoryType(value: Boolean): Self = StObject.set(x, "categoryType", value.asInstanceOf[js.Any])
    
    inline def setCategoryTypeUndefined: Self = StObject.set(x, "categoryType", js.undefined)
    
    inline def setCustomDisplayUnit(value: Boolean): Self = StObject.set(x, "customDisplayUnit", value.asInstanceOf[js.Any])
    
    inline def setCustomDisplayUnitUndefined: Self = StObject.set(x, "customDisplayUnit", js.undefined)
    
    inline def setDisplayUnit(value: Boolean): Self = StObject.set(x, "displayUnit", value.asInstanceOf[js.Any])
    
    inline def setDisplayUnitUndefined: Self = StObject.set(x, "displayUnit", js.undefined)
    
    inline def setFormat(value: ChartAxisFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIsBetweenCategories(value: Boolean): Self = StObject.set(x, "isBetweenCategories", value.asInstanceOf[js.Any])
    
    inline def setIsBetweenCategoriesUndefined: Self = StObject.set(x, "isBetweenCategories", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLinkNumberFormat(value: Boolean): Self = StObject.set(x, "linkNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkNumberFormatUndefined: Self = StObject.set(x, "linkNumberFormat", js.undefined)
    
    inline def setLogBase(value: Boolean): Self = StObject.set(x, "logBase", value.asInstanceOf[js.Any])
    
    inline def setLogBaseUndefined: Self = StObject.set(x, "logBase", js.undefined)
    
    inline def setMajorGridlines(value: ChartGridlinesLoadOptions): Self = StObject.set(x, "majorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMajorGridlinesUndefined: Self = StObject.set(x, "majorGridlines", js.undefined)
    
    inline def setMajorTickMark(value: Boolean): Self = StObject.set(x, "majorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMajorTickMarkUndefined: Self = StObject.set(x, "majorTickMark", js.undefined)
    
    inline def setMajorTimeUnitScale(value: Boolean): Self = StObject.set(x, "majorTimeUnitScale", value.asInstanceOf[js.Any])
    
    inline def setMajorTimeUnitScaleUndefined: Self = StObject.set(x, "majorTimeUnitScale", js.undefined)
    
    inline def setMajorUnit(value: Boolean): Self = StObject.set(x, "majorUnit", value.asInstanceOf[js.Any])
    
    inline def setMajorUnitUndefined: Self = StObject.set(x, "majorUnit", js.undefined)
    
    inline def setMaximum(value: Boolean): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Boolean): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setMinorGridlines(value: ChartGridlinesLoadOptions): Self = StObject.set(x, "minorGridlines", value.asInstanceOf[js.Any])
    
    inline def setMinorGridlinesUndefined: Self = StObject.set(x, "minorGridlines", js.undefined)
    
    inline def setMinorTickMark(value: Boolean): Self = StObject.set(x, "minorTickMark", value.asInstanceOf[js.Any])
    
    inline def setMinorTickMarkUndefined: Self = StObject.set(x, "minorTickMark", js.undefined)
    
    inline def setMinorTimeUnitScale(value: Boolean): Self = StObject.set(x, "minorTimeUnitScale", value.asInstanceOf[js.Any])
    
    inline def setMinorTimeUnitScaleUndefined: Self = StObject.set(x, "minorTimeUnitScale", js.undefined)
    
    inline def setMinorUnit(value: Boolean): Self = StObject.set(x, "minorUnit", value.asInstanceOf[js.Any])
    
    inline def setMinorUnitUndefined: Self = StObject.set(x, "minorUnit", js.undefined)
    
    inline def setMultiLevel(value: Boolean): Self = StObject.set(x, "multiLevel", value.asInstanceOf[js.Any])
    
    inline def setMultiLevelUndefined: Self = StObject.set(x, "multiLevel", js.undefined)
    
    inline def setNumberFormat(value: Boolean): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: Boolean): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionAt(value: Boolean): Self = StObject.set(x, "positionAt", value.asInstanceOf[js.Any])
    
    inline def setPositionAtUndefined: Self = StObject.set(x, "positionAt", js.undefined)
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setReversePlotOrder(value: Boolean): Self = StObject.set(x, "reversePlotOrder", value.asInstanceOf[js.Any])
    
    inline def setReversePlotOrderUndefined: Self = StObject.set(x, "reversePlotOrder", js.undefined)
    
    inline def setScaleType(value: Boolean): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setScaleTypeUndefined: Self = StObject.set(x, "scaleType", js.undefined)
    
    inline def setShowDisplayUnitLabel(value: Boolean): Self = StObject.set(x, "showDisplayUnitLabel", value.asInstanceOf[js.Any])
    
    inline def setShowDisplayUnitLabelUndefined: Self = StObject.set(x, "showDisplayUnitLabel", js.undefined)
    
    inline def setTextOrientation(value: Boolean): Self = StObject.set(x, "textOrientation", value.asInstanceOf[js.Any])
    
    inline def setTextOrientationUndefined: Self = StObject.set(x, "textOrientation", js.undefined)
    
    inline def setTickLabelPosition(value: Boolean): Self = StObject.set(x, "tickLabelPosition", value.asInstanceOf[js.Any])
    
    inline def setTickLabelPositionUndefined: Self = StObject.set(x, "tickLabelPosition", js.undefined)
    
    inline def setTickLabelSpacing(value: Boolean): Self = StObject.set(x, "tickLabelSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickLabelSpacingUndefined: Self = StObject.set(x, "tickLabelSpacing", js.undefined)
    
    inline def setTickMarkSpacing(value: Boolean): Self = StObject.set(x, "tickMarkSpacing", value.asInstanceOf[js.Any])
    
    inline def setTickMarkSpacingUndefined: Self = StObject.set(x, "tickMarkSpacing", js.undefined)
    
    inline def setTitle(value: ChartAxisTitleLoadOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
