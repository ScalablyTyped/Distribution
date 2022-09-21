package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartAxisTitleFormatData
import typings.officeJs.Excel.Interfaces.ChartAxisTitleFormatLoadOptions
import typings.officeJs.Excel.Interfaces.ChartAxisTitleFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the chart axis title formatting.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartAxisTitleFormat
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the chart axis title's border format, which includes color, linestyle, and weight.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val border: ChartBorder = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxisTitleFormat: RequestContext = js.native
  
  /**
    * Specifies the chart axis title's fill formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  val fill: ChartFill = js.native
  
  /**
    * Specifies the chart axis title's font attributes, such as font name, font size, or color, of the chart axis title object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxisTitleFormat = js.native
  def load(options: ChartAxisTitleFormatLoadOptions): ChartAxisTitleFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartAxisTitleFormat = js.native
  def load(propertyNames: String): ChartAxisTitleFormat = js.native
  def load(propertyNames: js.Array[String]): ChartAxisTitleFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxisTitleFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAxisTitleFormatUpdateData): Unit = js.native
  def set(properties: ChartAxisTitleFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxisTitleFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxisTitleFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAxisTitleFormatData = js.native
}
