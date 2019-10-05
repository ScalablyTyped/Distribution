package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAxisTitleData
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAxisTitleLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.ChartAxisTitleUpdateData
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the title of a chart axis.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.ChartAxisTitle")
@js.native
class ChartAxisTitle () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartAxisTitle: RequestContext = js.native
  /**
    *
    * Represents the formatting of chart axis title. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val format: ChartAxisTitleFormat = js.native
  /**
    *
    * Represents the axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var text: String = js.native
  /**
    *
    * A boolean that specifies the visibility of an axis title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartAxisTitle = js.native
  def load(options: ChartAxisTitleLoadOptions): ChartAxisTitle = js.native
  def load(propertyNamesAndPaths: Anon_Expand): ChartAxisTitle = js.native
  def load(propertyNames: String): ChartAxisTitle = js.native
  def load(propertyNames: js.Array[String]): ChartAxisTitle = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartAxisTitle): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartAxisTitle): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartAxisTitleUpdateData): Unit = js.native
  def set(properties: ChartAxisTitleUpdateData, options: UpdateOptions): Unit = js.native
  /**
    *
    * A string value that represents the formula of chart axis title using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param formula a string that present the formula to set
    */
  def setFormula(formula: String): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartAxisTitle object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartAxisTitleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartAxisTitleData = js.native
}

