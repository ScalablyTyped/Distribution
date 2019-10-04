package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartGridlinesData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartGridlinesLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartGridlinesUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents major or minor gridlines on a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartGridlines")
@js.native
class ChartGridlines () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartGridlines: RequestContext = js.native
  /**
    *
    * Represents the formatting of chart gridlines. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartGridlinesFormat = js.native
  /**
    *
    * Boolean value representing if the axis gridlines are visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartGridlines = js.native
  def load(options: ChartGridlinesLoadOptions): ChartGridlines = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartGridlines = js.native
  def load(propertyNames: String): ChartGridlines = js.native
  def load(propertyNames: js.Array[String]): ChartGridlines = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartGridlines): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartGridlines): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartGridlinesUpdateData): Unit = js.native
  def set(properties: ChartGridlinesUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartGridlines object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartGridlinesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartGridlinesData = js.native
}

