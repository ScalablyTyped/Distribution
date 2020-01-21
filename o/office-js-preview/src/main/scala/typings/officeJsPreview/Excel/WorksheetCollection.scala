package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.WorksheetCollectionData
import typings.officeJsPreview.Excel.Interfaces.WorksheetCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.EventHandlers
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.After
import typings.officeJsPreview.officeJsPreviewStrings.Before
import typings.officeJsPreview.officeJsPreviewStrings.Beginning
import typings.officeJsPreview.officeJsPreviewStrings.End
import typings.officeJsPreview.officeJsPreviewStrings.None
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of worksheet objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.WorksheetCollection")
@js.native
class WorksheetCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Worksheet] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is activated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[WorksheetActivatedEventArgs] = js.native
  /**
    *
    * Occurs when a new worksheet is added to the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[WorksheetAddedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is calculated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: EventHandlers[WorksheetCalculatedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is changed.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[WorksheetChangedEventArgs] = js.native
  /**
    *
    * Occurs when one or more columns have been sorted. This happens as the result of a left-to-right sort operation.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onColumnSorted: EventHandlers[WorksheetColumnSortedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  /**
    *
    * Occurs when a worksheet is deleted from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[WorksheetDeletedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet's filter is applied in the workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onFiltered: EventHandlers[WorksheetFilteredEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook has format changed.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: EventHandlers[WorksheetFormatChangedEventArgs] = js.native
  /**
    *
    * Occurs when the hidden state of one or more rows has changed on a specific worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onRowHiddenChanged: EventHandlers[WorksheetRowHiddenChangedEventArgs] = js.native
  /**
    *
    * Occurs when one or more rows have been sorted. This happens as the result of a top-to-bottom sort operation.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onRowSorted: EventHandlers[WorksheetRowSortedEventArgs] = js.native
  /**
    *
    * Occurs when the selection changes on any worksheet.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[WorksheetSelectionChangedEventArgs] = js.native
  /**
    *
    * Occurs when left-clicked/tapped operation happens in the worksheet collection. This event will not be fired when clicking in the following cases:
    - The user drags the mouse for multi-selection.
    - The user selects a cell in the mode when cell arguments are selected for formula references.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onSingleClicked: EventHandlers[WorksheetSingleClickedEventArgs] = js.native
  /**
    *
    * Adds a new worksheet to the workbook. The worksheet will be added at the end of existing worksheets. If you wish to activate the newly added worksheet, call ".activate() on it.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Optional. The name of the worksheet to be added. If specified, name should be unqiue. If not specified, Excel determines the name of the new worksheet.
    */
  def add(): Worksheet = js.native
  def add(name: String): Worksheet = js.native
  /**
    *
    * Inserts the specified worksheets of a workbook into the current workbook.
    
    **Note**: This API is currently only supported for Office on Windows and Mac.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param base64File Required. The base64-encoded string representing the source workbook file.
    * @param sheetNamesToInsert Optional. The names of individual worksheets to insert. By default, all the worksheets from the source workbook are inserted.
    * @param positionType Optional. Where in the current workbook the new worksheets will be inserted. See Excel.WorksheetPositionType for details. Default is "Start".
    * @param relativeTo Optional. The worksheet in the current workbook that is referenced for the positionType parameter. Default is null and, based on positionType, it will insert worksheets at the start or end of the current workbook.
    * @returns An array of ids corresponding to each newly inserted worksheet.
    */
  def addFromBase64(base64File: String): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: js.Array[String]): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: js.Array[String], positionType: WorksheetPositionType): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: WorksheetPositionType,
    relativeTo: String
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: WorksheetPositionType,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(base64File: String, sheetNamesToInsert: js.Array[String], positionType: After): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(base64File: String, sheetNamesToInsert: js.Array[String], positionType: After, relativeTo: String): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_After(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: After,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(base64File: String, sheetNamesToInsert: js.Array[String], positionType: Before): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(base64File: String, sheetNamesToInsert: js.Array[String], positionType: Before, relativeTo: String): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Before(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: Before,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(base64File: String, sheetNamesToInsert: js.Array[String], positionType: Beginning): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: Beginning,
    relativeTo: String
  ): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_Beginning(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: Beginning,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(base64File: String, sheetNamesToInsert: js.Array[String], positionType: End): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(base64File: String, sheetNamesToInsert: js.Array[String], positionType: End, relativeTo: String): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_End(base64File: String, sheetNamesToInsert: js.Array[String], positionType: End, relativeTo: Worksheet): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(base64File: String, sheetNamesToInsert: js.Array[String], positionType: None): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(base64File: String, sheetNamesToInsert: js.Array[String], positionType: None, relativeTo: String): ClientResult[js.Array[String]] = js.native
  @JSName("addFromBase64")
  def addFromBase64_None(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: None,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  /**
    *
    * Gets the currently active worksheet in the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getActiveWorksheet(): Worksheet = js.native
  /**
    *
    * Gets the number of worksheets in the collection.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getCount(): ClientResult[Double] = js.native
  def getCount(visibleOnly: Boolean): ClientResult[Double] = js.native
  /**
    *
    * Gets the first worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getFirst(): Worksheet = js.native
  def getFirst(visibleOnly: Boolean): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItem(key: String): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID. If the worksheet does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItemOrNullObject(key: String): Worksheet = js.native
  /**
    *
    * Gets the last worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getLast(): Worksheet = js.native
  def getLast(visibleOnly: Boolean): Worksheet = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCollection = js.native
  def load(options: WorksheetCollectionLoadOptions with CollectionLoadOptions): WorksheetCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): WorksheetCollection = js.native
  def load(propertyNames: String): WorksheetCollection = js.native
  def load(propertyNames: js.Array[String]): WorksheetCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): WorksheetCollectionData = js.native
}

