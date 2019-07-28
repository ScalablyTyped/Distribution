package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartMapOptionsData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartMapOptionsLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartMapOptionsUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Albers
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Automatic
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BestFit
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.City
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Continent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Country
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.County
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.DataOnly
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Mercator
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Miller
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.None
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Robinson
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.ShowAll
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.State
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the properties for a region map chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartMapOptions")
@js.native
class ChartMapOptions () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartMapOptions: RequestContext = js.native
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: ChartMapLabelStrategy | None | BestFit | ShowAll = js.native
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: ChartMapAreaLevel | Automatic | DataOnly | City | County | State | Country | Continent | World = js.native
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: ChartMapProjectionType | Automatic | Mercator | Miller | Robinson | Albers = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartMapOptions` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartMapOptions` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartMapOptions` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartMapOptions = js.native
  def load(option: String): ChartMapOptions = js.native
  def load(option: js.Array[String]): ChartMapOptions = js.native
  def load(option: Anon_Expand): ChartMapOptions = js.native
  def load(option: ChartMapOptionsLoadOptions): ChartMapOptions = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartMapOptions): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartMapOptions): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartMapOptionsUpdateData): Unit = js.native
  def set(properties: ChartMapOptionsUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartMapOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartMapOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartMapOptionsData = js.native
}

