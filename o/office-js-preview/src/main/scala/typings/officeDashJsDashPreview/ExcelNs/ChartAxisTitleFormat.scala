package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartAxisTitleFormatData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartAxisTitleFormatLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartAxisTitleFormatUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the chart axis title formatting.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAxisTitleFormat")
@js.native
class ChartAxisTitleFormat () extends ClientObject {
  /**
    *
    * Represents the border format, which includes color, linestyle, and weight.
    *
    * [Api set: ExcelApi 1.8]
    */
  val border: ChartBorder = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxisTitleFormat: RequestContext = js.native
  /**
    *
    * Represents chart fill formatting.
    *
    * [Api set: ExcelApi 1.8]
    */
  val fill: ChartFill = js.native
  /**
    *
    * Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
    *
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
  def load(propertyNamesAndPaths: Anon_Expand): ChartAxisTitleFormat = js.native
  def load(propertyNames: String): ChartAxisTitleFormat = js.native
  def load(propertyNames: js.Array[String]): ChartAxisTitleFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxisTitleFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAxisTitleFormat): void`
    *
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

