package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.Workbook")
@js.native
class Workbook ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents the Excel application instance that contains this workbook. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val application: Application = js.native
  /**
           *
           * Represents a collection of bindings that are part of the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val bindings: BindingCollection = js.native
  /**
           *
           * Represents the collection of custom XML parts contained by this workbook. Read-only.
           *
           * [Api set: ExcelApi 1.5]
           */
  val customXmlParts: CustomXmlPartCollection = js.native
  /**
           *
           * Represents all data connections in the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val dataConnections: DataConnectionCollection = js.native
  /**
           *
           * Represents a collection of worksheet functions that can be used for computation. Read-only.
           *
           * [Api set: ExcelApi 1.2]
           */
  val functions: Functions = js.native
  /**
           *
           * Gets the workbook name. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val name: java.lang.String = js.native
  /**
           *
           * Represents a collection of workbook scoped named items (named ranges and constants). Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val names: NamedItemCollection = js.native
  /**
           *
           * Occurs when the selection in the document is changed.
           *
           * [Api set: ExcelApi 1.2]
           *
           * @eventproperty
           */
  val onSelectionChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[SelectionChangedEventArgs] = js.native
  /**
           *
           * Represents a collection of PivotTables associated with the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.3]
           */
  val pivotTables: PivotTableCollection = js.native
  /**
           *
           * Gets the workbook properties. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val properties: DocumentProperties = js.native
  /**
           *
           * Returns workbook protection object for a workbook. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val protection: WorkbookProtection = js.native
  /**
           *
           * True if the workbook is open in Read-only mode. Read-only.
           *
           * [Api set: ExcelApi 1.8]
           */
  val readOnly: scala.Boolean = js.native
  /**
           *
           * Represents a collection of Settings associated with the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.4]
           */
  val settings: SettingCollection = js.native
  /**
           *
           * Represents a collection of styles associated with the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val styles: StyleCollection = js.native
  /**
           *
           * Represents a collection of tables associated with the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val tables: TableCollection = js.native
  /**
           *
           * Represents a collection of worksheets associated with the workbook. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val worksheets: WorksheetCollection = js.native
  /**
           *
           * Gets the currently active cell from the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  def getActiveCell(): Range = js.native
  /**
           *
           * Gets the currently selected single range from the workbook. If there are multiple ranges selected, this method will throw an error.
           *
           * [Api set: ExcelApi 1.1]
           */
  def getSelectedRange(): Range = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Workbook` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Workbook` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Workbook` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Workbook = js.native
  def load(option: java.lang.String): Workbook = js.native
  def load(option: js.Array[java.lang.String]): Workbook = js.native
  def load(option: officeDashJsLib.Anon_Select): Workbook = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Workbook` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Workbook` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Workbook` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.WorkbookLoadOptions): Workbook = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Workbook): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.WorkbookUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Workbook): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.WorkbookUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Workbook): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorkbookData = js.native
}

