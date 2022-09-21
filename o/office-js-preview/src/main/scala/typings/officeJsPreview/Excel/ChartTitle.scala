package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartTitleData
import typings.officeJsPreview.Excel.Interfaces.ChartTitleLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartTitleUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a chart title object of a chart.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartTitle
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTitle: RequestContext = js.native
  
  /**
    * Represents the formatting of a chart title, which includes fill and font formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartTitleFormat = js.native
  
  /**
    * Get the substring of a chart title. Line break '\n' counts one character.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param start Start position of substring to be retrieved. Zero-indexed.
    * @param length Length of the substring to be retrieved.
    */
  def getSubstring(start: Double, length: Double): ChartFormatString = js.native
  
  /**
    * Returns the height, in points, of the chart title. Value is `null` if the chart title is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val height: Double = js.native
  
  /**
    * Specifies the horizontal alignment for chart title.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = js.native
  
  /**
    * Specifies the distance, in points, from the left edge of chart title to the left edge of chart area. Value is `null` if the chart title is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var left: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTitle = js.native
  def load(options: ChartTitleLoadOptions): ChartTitle = js.native
  def load(propertyNamesAndPaths: Expand): ChartTitle = js.native
  def load(propertyNames: String): ChartTitle = js.native
  def load(propertyNames: js.Array[String]): ChartTitle = js.native
  
  /**
    * Specifies if the chart title will overlay the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var overlay: Boolean = js.native
  
  /**
    * Represents the position of chart title. See `Excel.ChartTitlePosition` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var position: ChartTitlePosition | Automatic | Top | Bottom | Left | Right = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTitle): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTitleUpdateData): Unit = js.native
  def set(properties: ChartTitleUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Sets a string value that represents the formula of chart title using A1-style notation.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @param formula A string that represents the formula to set.
    */
  def setFormula(formula: String): Unit = js.native
  
  /**
    * Represents a boolean value that determines if the chart title has a shadow.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: Boolean = js.native
  
  /**
    * Specifies the chart's title text.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var text: String = js.native
  
  /**
    * Specifies the angle to which the text is oriented for the chart title. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var textOrientation: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTitle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTitleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTitleData = js.native
  
  /**
    * Specifies the distance, in points, from the top edge of chart title to the top of chart area. Value is `null` if the chart title is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var top: Double = js.native
  
  /**
    * Specifies the vertical alignment of chart title. See `Excel.ChartTextVerticalAlignment` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = js.native
  
  /**
    * Specifies if the chart title is visibile.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  
  /**
    * Specifies the width, in points, of the chart title. Value is `null` if the chart title is not visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val width: Double = js.native
}
