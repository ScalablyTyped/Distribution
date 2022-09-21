package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartErrorBarsFormatData
import typings.officeJsPreview.Excel.Interfaces.ChartErrorBarsFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartErrorBarsFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the format properties for chart error bars.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartErrorBarsFormat
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartErrorBarsFormat: RequestContext = js.native
  
  /**
    * Represents the chart line formatting.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  val line: ChartLineFormat = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartErrorBarsFormat = js.native
  def load(options: ChartErrorBarsFormatLoadOptions): ChartErrorBarsFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartErrorBarsFormat = js.native
  def load(propertyNames: String): ChartErrorBarsFormat = js.native
  def load(propertyNames: js.Array[String]): ChartErrorBarsFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartErrorBarsFormat): Unit = js.native
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartErrorBarsFormatUpdateData): Unit = js.native
  def set(properties: ChartErrorBarsFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartErrorBarsFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartErrorBarsFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartErrorBarsFormatData = js.native
}
