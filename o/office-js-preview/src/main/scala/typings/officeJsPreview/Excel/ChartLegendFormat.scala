package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.ChartLegendFormatData
import typings.officeJsPreview.Excel.Interfaces.ChartLegendFormatLoadOptions
import typings.officeJsPreview.Excel.Interfaces.ChartLegendFormatUpdateData
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Encapsulates the format properties of a chart legend.
  *
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait ChartLegendFormat extends ClientObject {
  
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  val border: ChartBorder = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegendFormat: RequestContext = js.native
  
  /**
    *
    * Represents the fill format of an object, which includes background formatting information.
    *
    * [Api set: ExcelApi 1.1]
    */
  val fill: ChartFill = js.native
  
  /**
    *
    * Represents the font attributes such as font name, font size, color, etc. of a chart legend.
    *
    * [Api set: ExcelApi 1.1]
    */
  val font: ChartFont = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegendFormat = js.native
  def load(options: ChartLegendFormatLoadOptions): ChartLegendFormat = js.native
  def load(propertyNamesAndPaths: Expand): ChartLegendFormat = js.native
  def load(propertyNames: String): ChartLegendFormat = js.native
  def load(propertyNames: js.Array[String]): ChartLegendFormat = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegendFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartLegendFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendFormatUpdateData): Unit = js.native
  def set(properties: ChartLegendFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegendFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendFormatData = js.native
}
