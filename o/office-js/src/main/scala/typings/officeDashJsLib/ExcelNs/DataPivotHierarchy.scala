package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel DataPivotHierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.DataPivotHierarchy")
@js.native
class DataPivotHierarchy ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataPivotHierarchy: RequestContext = js.native
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val field: PivotField = js.native
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: java.lang.String = js.native
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: java.lang.String = js.native
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: scala.Double = js.native
  /**
    *
    * Determines whether the data should be sown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: ShowAsRule = js.native
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: AggregationFunction | officeDashJsLib.officeDashJsLibStrings.Unknown | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.Sum | officeDashJsLib.officeDashJsLibStrings.Count | officeDashJsLib.officeDashJsLibStrings.Average | officeDashJsLib.officeDashJsLibStrings.Max | officeDashJsLib.officeDashJsLibStrings.Min | officeDashJsLib.officeDashJsLibStrings.Product | officeDashJsLib.officeDashJsLibStrings.CountNumbers | officeDashJsLib.officeDashJsLibStrings.StandardDeviation | officeDashJsLib.officeDashJsLibStrings.StandardDeviationP | officeDashJsLib.officeDashJsLibStrings.Variance | officeDashJsLib.officeDashJsLibStrings.VarianceP = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.DataPivotHierarchy` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.DataPivotHierarchy` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DataPivotHierarchy` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DataPivotHierarchy = js.native
  def load(option: java.lang.String): DataPivotHierarchy = js.native
  def load(option: js.Array[java.lang.String]): DataPivotHierarchy = js.native
  def load(option: officeDashJsLib.Anon_Expand): DataPivotHierarchy = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.DataPivotHierarchyLoadOptions): DataPivotHierarchy = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DataPivotHierarchy): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.DataPivotHierarchy): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.DataPivotHierarchyUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.DataPivotHierarchyUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Reset the DataPivotHierarchy back to its default values.
    *
    * [Api set: ExcelApi 1.8]
    */
  def setToDefault(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataPivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataPivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.DataPivotHierarchyData = js.native
}

