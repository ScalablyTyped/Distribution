package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a chart title object of a chart.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartTitle")
@js.native
class ChartTitle ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTitle: RequestContext = js.native
  /**
    *
    * Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartTitleFormat = js.native
  /**
    *
    * Returns the height, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val height: scala.Double = js.native
  /**
    *
    * Represents the horizontal alignment for chart title.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: scala.Double = js.native
  /**
    *
    * Boolean value representing if the chart title will overlay the chart or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: scala.Boolean = js.native
  /**
    *
    * Represents the position of chart title. See Excel.ChartTitlePosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: ChartTitlePosition | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right = js.native
  /**
    *
    * Represents a boolean value that determines if the chart title has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: scala.Boolean = js.native
  /**
    *
    * Represents the title text of a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: java.lang.String = js.native
  /**
    *
    * Represents the text orientation of chart title. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: scala.Double = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: scala.Double = js.native
  /**
    *
    * Represents the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: ChartTextVerticalAlignment | officeDashJsLib.officeDashJsLibStrings.Center | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Justify | officeDashJsLib.officeDashJsLibStrings.Distributed = js.native
  /**
    *
    * A boolean value the represents the visibility of a chart title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Returns the width, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val width: scala.Double = js.native
  /**
    *
    * Get the substring of a chart title. Line break '\n' also counts one character.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param start Start position of substring to be retrieved. Position start with 0.
    * @param length Length of substring to be retrieved.
    */
  def getSubstring(start: scala.Double, length: scala.Double): ChartFormatString = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartTitle` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartTitle` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartTitle` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTitle = js.native
  def load(option: java.lang.String): ChartTitle = js.native
  def load(option: js.Array[java.lang.String]): ChartTitle = js.native
  def load(option: officeDashJsLib.Anon_Expand): ChartTitle = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartTitleLoadOptions): ChartTitle = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTitle): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTitle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartTitleUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartTitleUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Sets a string value that represents the formula of chart title using A1-style notation.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param formula A string that represents the formula to set.
    */
  def setFormula(formula: java.lang.String): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTitle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTitleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartTitleData = js.native
}

