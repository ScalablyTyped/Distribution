package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.ChartSeriesFormatData
import typings.officeJs.Excel.Interfaces.ChartSeriesFormatLoadOptions
import typings.officeJs.Excel.Interfaces.ChartSeriesFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the format properties for the chart series
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartSeriesFormat extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartSeriesFormat: RequestContext = js.native
  
  /**
    *
    * Represents the fill format of a chart series, which includes background formatting information.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  
  /**
    *
    * Represents line formatting.
    *
    * [Api set: ExcelApi 1.1]
    */
  val line: ChartLineFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartSeriesFormat = js.native
  def load(options: ChartSeriesFormatLoadOptions): ChartSeriesFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartSeriesFormat = js.native
  def load(propertyNames: String): ChartSeriesFormat = js.native
  def load(propertyNames: js.Array[String]): ChartSeriesFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartSeriesFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartSeriesFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartSeriesFormatUpdateData): Unit = js.native
  def set(properties: ChartSeriesFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartSeriesFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartSeriesFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartSeriesFormatData = js.native
}
