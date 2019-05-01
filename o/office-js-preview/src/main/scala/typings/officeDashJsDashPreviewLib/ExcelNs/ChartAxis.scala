package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single axis in a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAxis")
@js.native
class ChartAxis ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the alignment for the specified axis tick label. See Excel.ChartTextHorizontalAlignment for detail.
    *
    * [Api set: ExcelApi 1.8]
    */
  var alignment: ChartTickLabelAlignment | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Center | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Left | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Right = js.native
  /**
    *
    * Represents the group for the specified axis. See Excel.ChartAxisGroup for details. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val axisGroup: ChartAxisGroup | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Primary | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Secondary = js.native
  /**
    *
    * Returns or sets the base unit for the specified category axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var baseTimeUnit: ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years = js.native
  /**
    *
    * Returns or sets the category axis type.
    *
    * [Api set: ExcelApi 1.7]
    */
  var categoryType: ChartAxisCategoryType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TextAxis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DateAxis = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxis: RequestContext = js.native
  /**
    *
    * Represents the custom axis display unit value. Read-only. To set this property, please use the SetCustomDisplayUnit(double) method.
    *
    * [Api set: ExcelApi 1.7]
    */
  val customDisplayUnit: scala.Double = js.native
  /**
    *
    * Represents the axis display unit. See Excel.ChartAxisDisplayUnit for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var displayUnit: ChartAxisDisplayUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Hundreds | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Thousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TenThousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HundredThousands | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Millions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.TenMillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.HundredMillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Billions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Trillions | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom = js.native
  /**
    *
    * Represents the formatting of a chart object, which includes line and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartAxisFormat = js.native
  /**
    *
    * Represents the height, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val height: scala.Double = js.native
  /**
    *
    * Represents whether value axis crosses the category axis between categories.
    *
    * [Api set: ExcelApi 1.8]
    */
  var isBetweenCategories: scala.Boolean = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of the axis to the left of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val left: scala.Double = js.native
  /**
    *
    * Represents whether the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: scala.Boolean = js.native
  /**
    *
    * Represents the base of the logarithm when using logarithmic scales.
    *
    * [Api set: ExcelApi 1.7]
    */
  var logBase: scala.Double = js.native
  /**
    *
    * Returns a Gridlines object that represents the major gridlines for the specified axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val majorGridlines: ChartGridlines = js.native
  /**
    *
    * Represents the type of major tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTickMark: ChartAxisTickMark | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Cross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inside | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outside = js.native
  /**
    *
    * Returns or sets the major unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var majorTimeUnitScale: ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years = js.native
  /**
    *
    * Represents the interval between two major tick marks. Can be set to a numeric value or an empty string.  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var majorUnit: js.Any = js.native
  /**
    *
    * Represents the maximum value on the value axis.  Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var maximum: js.Any = js.native
  /**
    *
    * Represents the minimum value on the value axis. Can be set to a numeric value or an empty string (for automatic axis values).  The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minimum: js.Any = js.native
  /**
    *
    * Returns a Gridlines object that represents the minor gridlines for the specified axis. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val minorGridlines: ChartGridlines = js.native
  /**
    *
    * Represents the type of minor tick mark for the specified axis. See Excel.ChartAxisTickMark for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTickMark: ChartAxisTickMark | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Cross | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inside | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Outside = js.native
  /**
    *
    * Returns or sets the minor unit scale value for the category axis when the CategoryType property is set to TimeScale.
    *
    * [Api set: ExcelApi 1.7]
    */
  var minorTimeUnitScale: ChartAxisTimeUnit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Days | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Months | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Years = js.native
  /**
    *
    * Represents the interval between two minor tick marks. Can be set to a numeric value or an empty string (for automatic axis values). The returned value is always a number.
    *
    * [Api set: ExcelApi 1.1]
    */
  var minorUnit: js.Any = js.native
  /**
    *
    * Represents whether an axis is multilevel or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var multiLevel: scala.Boolean = js.native
  /**
    *
    * Represents the format code for the axis tick label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: java.lang.String = js.native
  /**
    *
    * Represents the distance between the levels of labels, and the distance between the first level and the axis line. The value should be an integer from 0 to 1000.
    *
    * [Api set: ExcelApi 1.8]
    */
  var offset: scala.Double = js.native
  /**
    *
    * Represents the specified axis position where the other axis crosses. See Excel.ChartAxisPosition for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: ChartAxisPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Maximum | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Minimum | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom = js.native
  /**
    *
    * Represents the specified axis position where the other axis crosses at. You should use the SetPositionAt(double) method to set this property.
    *
    * [Api set: ExcelApi 1.8]
    */
  val positionAt: scala.Double = js.native
  /**
    *
    * Represents whether Microsoft Excel plots data points from last to first.
    *
    * [Api set: ExcelApi 1.7]
    */
  var reversePlotOrder: scala.Boolean = js.native
  /**
    *
    * Represents the value axis scale type. See Excel.ChartAxisScaleType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var scaleType: ChartAxisScaleType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Linear | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Logarithmic = js.native
  /**
    *
    * Represents whether the axis display unit label is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showDisplayUnitLabel: scala.Boolean = js.native
  /**
    *
    * Represents the text orientation of the axis tick label. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.Any = js.native
  /**
    *
    * Represents the position of tick-mark labels on the specified axis. See Excel.ChartAxisTickLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelPosition: ChartAxisTickLabelPosition | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.NextToAxis | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.High | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Low | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None = js.native
  /**
    *
    * Represents the number of categories or series between tick-mark labels. Can be a value from 1 through 31999 or an empty string for automatic setting. The returned value is always a number.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickLabelSpacing: js.Any = js.native
  /**
    *
    * Represents the number of categories or series between tick marks.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tickMarkSpacing: scala.Double = js.native
  /**
    *
    * Represents the axis title. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val title: ChartAxisTitle = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the axis to the top of chart area. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val top: scala.Double = js.native
  /**
    *
    * Represents the axis type. See Excel.ChartAxisType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  val `type`: ChartAxisType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Category | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Value | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Series = js.native
  /**
    *
    * A boolean value represents the visibility of the axis.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Represents the width, in points, of the chart axis. Null if the axis is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val width: scala.Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartAxis` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartAxis` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartAxis` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxis = js.native
  def load(option: java.lang.String): ChartAxis = js.native
  def load(option: js.Array[java.lang.String]): ChartAxis = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): ChartAxis = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAxisLoadOptions): ChartAxis = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxis): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAxis): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAxisUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAxisUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Sets all the category names for the specified axis.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param sourceData The Range object corresponding to the source data.
    */
  def setCategoryNames(sourceData: Range): scala.Unit = js.native
  /**
    *
    * Sets the axis display unit to a custom value.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param value Custom value of the display unit.
    */
  def setCustomDisplayUnit(value: scala.Double): scala.Unit = js.native
  /**
    *
    * Set the specified axis position where the other axis crosses at.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param value Custom value of the crosses at
    */
  def setPositionAt(value: scala.Double): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxis object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxisData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ChartAxisData = js.native
}

