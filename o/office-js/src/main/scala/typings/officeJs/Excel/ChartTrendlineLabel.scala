package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartTrendlineLabelData
import typings.officeJs.Excel.Interfaces.ChartTrendlineLabelLoadOptions
import typings.officeJs.Excel.Interfaces.ChartTrendlineLabelUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Bottom
import typings.officeJs.officeJsStrings.Center
import typings.officeJs.officeJsStrings.Distributed
import typings.officeJs.officeJsStrings.Justify
import typings.officeJs.officeJsStrings.Left
import typings.officeJs.officeJsStrings.Right
import typings.officeJs.officeJsStrings.Top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * This object represents the attributes for a chart trendline lable object.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartTrendlineLabel
  extends StObject
     with ClientObject {
  
  /**
    *
    * Specifies if trendline label automatically generate appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartTrendlineLabel: RequestContext = js.native
  
  /**
    *
    * The format of chart trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  val format: ChartTrendlineLabelFormat = js.native
  
  /**
    *
    * String value that represents the formula of chart trendline label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: String = js.native
  
  /**
    *
    * Returns the height, in points, of the chart trendline label. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  val height: Double = js.native
  
  /**
    *
    * Represents the horizontal alignment for chart trendline label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of trendline label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = js.native
  
  /**
    *
    * Represents the distance, in points, from the left edge of chart trendline label to the left edge of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: Double = js.native
  
  /**
    *
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartTrendlineLabel = js.native
  def load(options: ChartTrendlineLabelLoadOptions): ChartTrendlineLabel = js.native
  def load(propertyNamesAndPaths: Expand): ChartTrendlineLabel = js.native
  def load(propertyNames: String): ChartTrendlineLabel = js.native
  def load(propertyNames: js.Array[String]): ChartTrendlineLabel = js.native
  
  /**
    *
    * String value that represents the format code for trendline label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: String = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartTrendlineLabel): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartTrendlineLabel): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartTrendlineLabelUpdateData): Unit = js.native
  def set(properties: ChartTrendlineLabelUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * String representing the text of the trendline label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: String = js.native
  
  /**
    *
    * Represents the angle to which the text is oriented for the chart trendline label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartTrendlineLabel object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartTrendlineLabelData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartTrendlineLabelData = js.native
  
  /**
    *
    * Represents the distance, in points, from the top edge of chart trendline label to the top of chart area. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: Double = js.native
  
  /**
    *
    * Represents the vertical alignment of chart trendline label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of trendline label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = js.native
  
  /**
    *
    * Returns the width, in points, of the chart trendline label. Null if chart trendline label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  val width: Double = js.native
}
