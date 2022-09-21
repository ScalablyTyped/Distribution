package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartBorderData
import typings.officeJsPreview.Excel.Interfaces.ChartBorderLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartBorderUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Continuous
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashDot
import typings.officeJsPreview.officeJsPreviewStrings.DashDotDot
import typings.officeJsPreview.officeJsPreviewStrings.Dot
import typings.officeJsPreview.officeJsPreviewStrings.Grey25
import typings.officeJsPreview.officeJsPreviewStrings.Grey50
import typings.officeJsPreview.officeJsPreviewStrings.Grey75
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.RoundDot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the border formatting of a chart element.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait ChartBorder
  extends StObject
     with ClientObject {
  
  /**
    * Clear the border format of a chart element.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  def clear(): Unit = js.native
  
  /**
    * HTML color code representing the color of borders in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBorder: RequestContext = js.native
  
  /**
    * Represents the line style of the border. See `Excel.ChartLineStyle` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var lineStyle: ChartLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Grey25 | Grey50 | Grey75 | Automatic | RoundDot = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBorder = js.native
  def load(options: ChartBorderLoadOptions): ChartBorder = js.native
  def load(propertyNamesAndPaths: Expand): ChartBorder = js.native
  def load(propertyNames: String): ChartBorder = js.native
  def load(propertyNames: js.Array[String]): ChartBorder = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBorder): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartBorderUpdateData): Unit = js.native
  def set(properties: ChartBorderUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBorder object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBorderData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartBorderData = js.native
  
  /**
    * Represents weight of the border, in points.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var weight: Double = js.native
}
