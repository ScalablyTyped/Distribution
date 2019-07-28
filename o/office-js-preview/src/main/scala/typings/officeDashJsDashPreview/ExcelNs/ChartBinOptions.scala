package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBinOptionsData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBinOptionsLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartBinOptionsUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Auto
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BinCount
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.BinWidth
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the bin options for histogram charts and pareto charts.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartBinOptions")
@js.native
class ChartBinOptions () extends ClientObject {
  /**
    *
    * Specifies whether or not the bin overflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowOverflow: Boolean = js.native
  /**
    *
    * Specifies whether or not the bin underflow is enabled in a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var allowUnderflow: Boolean = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartBinOptions: RequestContext = js.native
  /**
    *
    * Returns or sets the bin count of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var count: Double = js.native
  /**
    *
    * Returns or sets the bin overflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var overflowValue: Double = js.native
  /**
    *
    * Returns or sets the bin's type for a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ChartBinType | Category | Auto | BinWidth | BinCount = js.native
  /**
    *
    * Returns or sets the bin underflow value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var underflowValue: Double = js.native
  /**
    *
    * Returns or sets the bin width value of a histogram chart or pareto chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var width: Double = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartBinOptions` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartBinOptions` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartBinOptions` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartBinOptions = js.native
  def load(option: String): ChartBinOptions = js.native
  def load(option: js.Array[String]): ChartBinOptions = js.native
  def load(option: Anon_Expand): ChartBinOptions = js.native
  def load(option: ChartBinOptionsLoadOptions): ChartBinOptions = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartBinOptions): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartBinOptions): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartBinOptionsUpdateData): Unit = js.native
  def set(properties: ChartBinOptionsUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartBinOptions object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartBinOptionsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartBinOptionsData = js.native
}

