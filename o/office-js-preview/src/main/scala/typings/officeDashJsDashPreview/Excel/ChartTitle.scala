package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTitleData
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTitleLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartTitleUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Bottom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Center
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Distributed
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Justify
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Left
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Right
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Top
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
class ChartTitle () extends ClientObject {
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
  val height: Double = js.native
  /**
    *
    * Represents the horizontal alignment for chart title.
    *
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = js.native
  /**
    *
    * Represents the distance, in points, from the left edge of chart title to the left edge of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: Double = js.native
  /**
    *
    * Boolean value representing if the chart title will overlay the chart or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: Boolean = js.native
  /**
    *
    * Represents the position of chart title. See Excel.ChartTitlePosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: ChartTitlePosition | Automatic | Top | Bottom | Left | Right = js.native
  /**
    *
    * Represents a boolean value that determines if the chart title has a shadow.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  /**
    *
    * Represents the title text of a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: String = js.native
  /**
    *
    * Represents the text orientation of chart title. The value should be an integer either from -90 to 90, or 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: Double = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of chart title to the top of chart area. Null if chart title is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: Double = js.native
  /**
    *
    * Represents the vertical alignment of chart title. See Excel.ChartTextVerticalAlignment for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = js.native
  /**
    *
    * A boolean value the represents the visibility of a chart title object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  /**
    *
    * Returns the width, in points, of the chart title. Null if chart title is not visible. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val width: Double = js.native
  /**
    *
    * Get the substring of a chart title. Line break '\n' also counts one character.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param start Start position of substring to be retrieved. Position start with 0.
    * @param length Length of substring to be retrieved.
    */
  def getSubstring(start: Double, length: Double): ChartFormatString = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTitle = js.native
  def load(options: ChartTitleLoadOptions): ChartTitle = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartTitle = js.native
  def load(propertyNames: String): ChartTitle = js.native
  def load(propertyNames: js.Array[String]): ChartTitle = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTitle): Unit = js.native
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
  def set(properties: ChartTitleUpdateData): Unit = js.native
  def set(properties: ChartTitleUpdateData, options: UpdateOptions): Unit = js.native
  /**
    *
    * Sets a string value that represents the formula of chart title using A1-style notation.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param formula A string that represents the formula to set.
    */
  def setFormula(formula: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTitle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTitleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTitleData = js.native
}

