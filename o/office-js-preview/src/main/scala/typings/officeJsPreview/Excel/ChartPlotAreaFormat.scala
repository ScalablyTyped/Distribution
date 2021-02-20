package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartPlotAreaFormatData
import typings.officeJsPreview.Excel.Interfaces.ChartPlotAreaFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartPlotAreaFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the format properties for chart plotArea.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait ChartPlotAreaFormat extends ClientObject {
  
  /**
    *
    * Specifies the border attributes of a chart plotArea.
    *
    * [Api set: ExcelApi 1.8]
    */
  val border: ChartBorder = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartPlotAreaFormat: RequestContext = js.native
  
  /**
    *
    * Specifies the fill format of an object, which includes background formatting information.
    *
    * [Api set: ExcelApi 1.8]
    */
  val fill: ChartFill = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartPlotAreaFormat = js.native
  def load(options: ChartPlotAreaFormatLoadOptions): ChartPlotAreaFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartPlotAreaFormat = js.native
  def load(propertyNames: String): ChartPlotAreaFormat = js.native
  def load(propertyNames: js.Array[String]): ChartPlotAreaFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartPlotAreaFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartPlotAreaFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartPlotAreaFormatUpdateData): Unit = js.native
  def set(properties: ChartPlotAreaFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartPlotAreaFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartPlotAreaFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartPlotAreaFormatData = js.native
}
