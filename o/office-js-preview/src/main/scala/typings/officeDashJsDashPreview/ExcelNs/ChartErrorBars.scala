package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.Anon_Expand
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartErrorBarsData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartErrorBarsLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.ChartErrorBarsUpdateData
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.UpdateOptions
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Both
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Custom
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.FixedValue
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.MinusValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.Percent
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.PlusValues
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StDev
import typings.officeDashJsDashPreview.officeDashJsDashPreviewStrings.StError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * This object represents the attributes for a chart's error bars.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.ChartErrorBars")
@js.native
class ChartErrorBars () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ChartErrorBars: RequestContext = js.native
  /**
    *
    * Specifies whether or not the error bars have an end style cap.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endStyleCap: Boolean = js.native
  /**
    *
    * Specifies the formatting type of the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  val format: ChartErrorBarsFormat = js.native
  /**
    *
    * Specifies which parts of the error bars to include.
    *
    * [Api set: ExcelApi 1.9]
    */
  var include: ChartErrorBarsInclude | Both | MinusValues | PlusValues = js.native
  /**
    *
    * The type of range marked by the error bars.
    *
    * [Api set: ExcelApi 1.9]
    */
  var `type`: ChartErrorBarsType | FixedValue | Percent | StDev | StError | Custom = js.native
  /**
    *
    * Specifies whether or not the error bars are displayed.
    *
    * [Api set: ExcelApi 1.9]
    */
  var visible: Boolean = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.ChartErrorBars` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.ChartErrorBars` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartErrorBars` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ChartErrorBars = js.native
  def load(option: String): ChartErrorBars = js.native
  def load(option: js.Array[String]): ChartErrorBars = js.native
  def load(option: Anon_Expand): ChartErrorBars = js.native
  def load(option: ChartErrorBarsLoadOptions): ChartErrorBars = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartErrorBars): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.ChartErrorBars): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ChartErrorBarsUpdateData): Unit = js.native
  def set(properties: ChartErrorBarsUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.ChartErrorBars object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ChartErrorBarsData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ChartErrorBarsData = js.native
}

