package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartAxisData
import typings.officeJsPreview.Excel.Interfaces.ChartAxisLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartAxisUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a single axis in a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxis
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the alignment for the specified axis tick label. See `Excel.ChartTextHorizontalAlignment` for detail.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var alignment: ChartTickLabelAlignment | Center | Left | Right = js.native
  
  /**
    * Specifies the group for the specified axis. See `Excel.ChartAxisGroup` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val axisGroup: ChartAxisGroup | Primary | Secondary = js.native
  
  /**
    * Specifies the base unit for the specified category axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: ChartAxisTimeUnit | Days | Months | Years = js.native
  
  /**
    * Specifies the category axis type.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: ChartAxisCategoryType | Automatic | TextAxis | DateAxis = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxis: RequestContext = js.native
  
  /**
    * Specifies the custom axis display unit value. To set this property, please use the `SetCustomDisplayUnit(double)` method.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val customDisplayUnit: Double = js.native
  
  /**
    * Represents the axis display unit. See `Excel.ChartAxisDisplayUnit` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: ChartAxisDisplayUnit | None | Hundreds | Thousands | TenThousands | HundredThousands | Millions | TenMillions | HundredMillions | Billions | Trillions | Custom = js.native
  
  /**
    * Represents the formatting of a chart object, which includes line and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartAxisFormat = js.native
  
  /**
    * Specifies the height, in points, of the chart axis. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val height: Double = js.native
  
  /**
    * Specifies if the value axis crosses the category axis between categories.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: Boolean = js.native
  
  /**
    * Specifies the distance, in points, from the left edge of the axis to the left of chart area. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val left: Double = js.native
  
  /**
    * Specifies if the number format is linked to the cells. If `true`, the number format will change in the labels when it changes in the cells.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxis = js.native
  def load(options: ChartAxisLoadOptions): ChartAxis = js.native
  def load(propertyNamesAndPaths: Expand): ChartAxis = js.native
  def load(propertyNames: String): ChartAxis = js.native
  def load(propertyNames: js.Array[String]): ChartAxis = js.native
  
  /**
    * Specifies the base of the logarithm when using logarithmic scales.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var logBase: Double = js.native
  
  /**
    * Returns an object that represents the major gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val majorGridlines: ChartGridlines = js.native
  
  /**
    * Specifies the type of major tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = js.native
  
  /**
    * Specifies the major unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = js.native
  
  /**
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: Any = js.native
  
  /**
    * Represents the maximum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var maximum: Any = js.native
  
  /**
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minimum: Any = js.native
  
  /**
    * Returns an object that represents the minor gridlines for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val minorGridlines: ChartGridlines = js.native
  
  /**
    * Specifies the type of minor tick mark for the specified axis. See `Excel.ChartAxisTickMark` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: ChartAxisTickMark | None | Cross | Inside | Outside = js.native
  
  /**
    * Specifies the minor unit scale value for the category axis when the `categoryType` property is set to `dateAxis`.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: ChartAxisTimeUnit | Days | Months | Years = js.native
  
  /**
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: Any = js.native
  
  /**
    * Specifies if an axis is multilevel.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: Boolean = js.native
  
  /**
    * Specifies the format code for the axis tick label.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: String = js.native
  
  /**
    * Specifies the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var offset: Double = js.native
  
  /**
    * Specifies the specified axis position where the other axis crosses. See `Excel.ChartAxisPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var position: ChartAxisPosition | Automatic | Maximum | Minimum | Custom = js.native
  
  /**
    * Specifies the axis position where the other axis crosses. You should use the `SetPositionAt(double)` method to set this property.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val positionAt: Double = js.native
  
  /**
    * Specifies if Excel plots data points from last to first.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: Boolean = js.native
  
  /**
    * Specifies the value axis scale type. See `Excel.ChartAxisScaleType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: ChartAxisScaleType | Linear | Logarithmic = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxis): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAxisUpdateData): Unit = js.native
  def set(properties: ChartAxisUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Sets all the category names for the specified axis.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The `Range` object corresponding to the source data.
    */
  def setCategoryNames(sourceData: Range): Unit = js.native
  
  /**
    * Sets the axis display unit to a custom value.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param value Custom value of the display unit.
    */
  def setCustomDisplayUnit(value: Double): Unit = js.native
  
  /**
    * Sets the specified axis position where the other axis crosses.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @param value Custom value of the crossing point.
    */
  def setPositionAt(value: Double): Unit = js.native
  
  /**
    * Specifies if the axis display unit label is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: Boolean = js.native
  
  /**
    * Specifies the angle to which the text is oriented for the chart axis tick label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: Any = js.native
  
  /**
    * Specifies the position of tick-mark labels on the specified axis. See `Excel.ChartAxisTickLabelPosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: ChartAxisTickLabelPosition | NextToAxis | High | Low | None = js.native
  
  /**
    * Specifies the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: Any = js.native
  
  /**
    * Specifies the number of categories or series between tick marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: Double = js.native
  
  /**
    * Represents the axis title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val title: ChartAxisTitle = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxis object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxisData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAxisData = js.native
  
  /**
    * Specifies the distance, in points, from the top edge of the axis to the top of chart area. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val top: Double = js.native
  
  /**
    * Specifies the axis type. See `Excel.ChartAxisType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val `type`: ChartAxisType | Invalid | Category | Value | Series = js.native
  
  /**
    * Specifies if the axis is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var visible: Boolean = js.native
  
  /**
    * Specifies the width, in points, of the chart axis. Returns `null` if the axis is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val width: Double = js.native
}
