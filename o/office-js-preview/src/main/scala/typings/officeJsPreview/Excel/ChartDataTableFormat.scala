package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartDataTableFormatData
import typings.officeJsPreview.Excel.Interfaces.ChartDataTableFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartDataTableFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the format of a chart data table.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@js.native
trait ChartDataTableFormat
  extends StObject
     with ClientObject {
  
  /**
    * Represents the border format of chart data table, which includes color, line style, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val border: ChartBorder = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartDataTableFormat: RequestContext = js.native
  
  /**
    * Represents the fill format of an object, which includes background formatting information.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val fill: ChartFill = js.native
  
  /**
    * Represents the font attributes (such as font name, font size, and color) for the current object.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val font: ChartFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartDataTableFormat = js.native
  def load(options: ChartDataTableFormatLoadOptions): ChartDataTableFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartDataTableFormat = js.native
  def load(propertyNames: String): ChartDataTableFormat = js.native
  def load(propertyNames: js.Array[String]): ChartDataTableFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartDataTableFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartDataTableFormatUpdateData): Unit = js.native
  def set(properties: ChartDataTableFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartDataTableFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartDataTableFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartDataTableFormatData = js.native
}
