package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Represents the Excel application instance that contains this workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val application: Application = js.native
  /**
    *
    * True if the workbook is in auto save mode.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val autoSave: scala.Boolean = js.native
  /**
    *
    * Represents a collection of bindings that are part of the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val bindings: BindingCollection = js.native
  /**
    *
    * Returns a number about the version of Excel Calculation Engine. Read-Only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val calculationEngineVersion: scala.Double = js.native
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var chartDataPointTrack: scala.Boolean = js.native
  /**
    *
    * Represents a collection of Comments associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val comments: CommentCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Workbook: RequestContext = js.native
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
    * True if no changes have been made to the specified workbook since it was last saved.
    You can set this property to True if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isDirty: scala.Boolean = js.native
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
    * Occurs when AutoSave setting is changed on the workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onAutoSaveSettingChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[WorkbookAutoSaveSettingChangedEventArgs] = js.native
  /**
    *
    * Occurs when the selection in the document is changed.
    *
    * [Api set: ExcelApi 1.2]
    *
    * @eventproperty
    */
  val onSelectionChanged: officeDashJsDashPreviewLib.OfficeExtensionNs.EventHandlers[SelectionChangedEventArgs] = js.native
  /**
    *
    * Represents a collection of PivotTables associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  val pivotTables: PivotTableCollection = js.native
  /**
    *
    * True if the workbook has ever been saved locally or online.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val previouslySaved: scala.Boolean = js.native
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
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: scala.Boolean = js.native
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var usePrecisionAsDisplayed: scala.Boolean = js.native
  /**
    *
    * Represents a collection of worksheets associated with the workbook. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val worksheets: WorksheetCollection = js.native
  /**
    *
    * Close current workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param closeBehavior workbook close behavior.
    */
  def close(): scala.Unit = js.native
  def close(closeBehavior: CloseBehavior): scala.Unit = js.native
  @JSName("close")
  def close_Save(closeBehavior: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Save): scala.Unit = js.native
  @JSName("close")
  def close_SkipSave(closeBehavior: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SkipSave): scala.Unit = js.native
  /**
    *
    * Gets the currently active cell from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  def getActiveCell(): Range = js.native
  /**
    *
    * Gets the currently active chart in the workbook. If there is no active chart, will throw exception when invoke this statement
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getActiveChart(): Chart = js.native
  /**
    *
    * Gets the currently active chart in the workbook. If there is no active chart, will return null object
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getActiveChartOrNullObject(): Chart = js.native
  /**
    *
    * True if the workbook is being edited by multiple users (co-authoring).
    Please be aware there might be some delay between when the workbook status changes and when the changes are reflected on the result of the method.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getIsActiveCollabSession(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Boolean] = js.native
  /**
    *
    * Gets the currently selected single range from the workbook. If there are multiple ranges selected, this method will throw an error.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getSelectedRange(): Range = js.native
  /**
    *
    * Gets the currently selected one or more ranges from the workbook. Unlike getSelectedRange(), this method returns a RangeAreas object that represents all the selected ranges.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getSelectedRanges(): RangeAreas = js.native
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
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Workbook = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorkbookLoadOptions): Workbook = js.native
  /**
    *
    * Save current workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param saveBehavior workbook save behavior.
    */
  def save(): scala.Unit = js.native
  def save(saveBehavior: SaveBehavior): scala.Unit = js.native
  @JSName("save")
  def save_Prompt(saveBehavior: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Prompt): scala.Unit = js.native
  @JSName("save")
  def save_Save(saveBehavior: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Save): scala.Unit = js.native
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
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorkbookUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorkbookUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Workbook): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Workbook object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorkbookData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.WorkbookData = js.native
}

