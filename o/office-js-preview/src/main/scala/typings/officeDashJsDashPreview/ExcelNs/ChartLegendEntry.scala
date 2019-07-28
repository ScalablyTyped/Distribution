package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartLegendEntryData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartLegendEntryLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartLegendEntryUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the legendEntry in legendEntryCollection.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.ChartLegendEntry")
@js.native
class ChartLegendEntry () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartLegendEntry: RequestContext = js.native
  /**
    *
    * Represents the height of the legendEntry on the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  val height: Double = js.native
  /**
    *
    * Represents the index of the legendEntry in the chart legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  val index: Double = js.native
  /**
    *
    * Represents the left of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  val left: Double = js.native
  /**
    *
    * Represents the top of a chart legendEntry.
    *
    * [Api set: ExcelApi 1.8]
    */
  val top: Double = js.native
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: Boolean = js.native
  /**
    *
    * Represents the width of the legendEntry on the chart Legend.
    *
    * [Api set: ExcelApi 1.8]
    */
  val width: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartLegendEntry` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegendEntry` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegendEntry` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartLegendEntry = js.native
  def load(option: String): ChartLegendEntry = js.native
  def load(option: js.Array[String]): ChartLegendEntry = js.native
  def load(option: Anon_Expand): ChartLegendEntry = js.native
  def load(option: ChartLegendEntryLoadOptions): ChartLegendEntry = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegendEntry): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartLegendEntry): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartLegendEntryUpdateData): Unit = js.native
  def set(properties: ChartLegendEntryUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartLegendEntry object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartLegendEntryData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartLegendEntryData = js.native
}

