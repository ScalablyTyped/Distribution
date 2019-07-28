package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.DataBarConditionalFormatData
import typings.officeDashJs.ExcelNs.InterfacesNs.DataBarConditionalFormatLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.DataBarConditionalFormatUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Automatic
import typings.officeDashJs.officeDashJsStrings.CellMidPoint
import typings.officeDashJs.officeDashJsStrings.Context
import typings.officeDashJs.officeDashJsStrings.LeftToRight
import typings.officeDashJs.officeDashJsStrings.None
import typings.officeDashJs.officeDashJsStrings.RightToLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Excel Conditional Data Bar Type.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.DataBarConditionalFormat")
@js.native
class DataBarConditionalFormat () extends ClientObject {
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: String = js.native
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint = js.native
  /**
    *
    * Represents the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: ConditionalDataBarDirection | Context | LeftToRight | RightToLeft = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataBarConditionalFormat: RequestContext = js.native
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar. 
    * The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: ConditionalDataBarRule = js.native
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val negativeFormat: ConditionalDataBarNegativeFormat = js.native
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  val positiveFormat: ConditionalDataBarPositiveFormat = js.native
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: Boolean = js.native
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar. 
    * The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: ConditionalDataBarRule = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.DataBarConditionalFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.DataBarConditionalFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DataBarConditionalFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataBarConditionalFormat = js.native
  def load(option: String): DataBarConditionalFormat = js.native
  def load(option: js.Array[String]): DataBarConditionalFormat = js.native
  def load(option: Anon_Expand): DataBarConditionalFormat = js.native
  def load(option: DataBarConditionalFormatLoadOptions): DataBarConditionalFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataBarConditionalFormat): Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.DataBarConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: DataBarConditionalFormatUpdateData): Unit = js.native
  def set(properties: DataBarConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataBarConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataBarConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DataBarConditionalFormatData = js.native
}

