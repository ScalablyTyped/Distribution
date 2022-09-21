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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of worksheet objects that are part of the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait WorksheetCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds a new worksheet to the workbook. The worksheet will be added at the end of existing worksheets. If you wish to activate the newly added worksheet, call `.activate()` on it.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param name Optional. The name of the worksheet to be added. If specified, the name should be unique. If not specified, Excel determines the name of the new worksheet.
    */
  def add(): Worksheet = js.native
  def add(name: String): Worksheet = js.native
  
  /**
    * Inserts the specified worksheets of a workbook into the current workbook.
    
    **Note**: This API is currently only supported for Office on Windows and Mac. And it has been deprecated, please use `Workbook.insertWorksheetFromBase64` instead.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param base64File Required. The base64-encoded string representing the source workbook file.
    * @param sheetNamesToInsert Optional. The names of individual worksheets to insert. By default, all the worksheets from the source workbook are inserted.
    * @param positionType Optional. Where in the current workbook the new worksheets will be inserted. See `Excel.WorksheetPositionType` for details. Default is "Start".
    * @param relativeTo Optional. The worksheet in the current workbook that is referenced for the `positionType` parameter. Default is `null` and, based on `positionType`, it will insert worksheets at the start or end of the current workbook.
    * @returns An array of IDs corresponding to each newly inserted worksheet.
    */
  def addFromBase64(base64File: String): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: js.Array[String]): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: None | Before | After | Beginning | End
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: None | Before | After | Beginning | End,
    relativeTo: String
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: None | Before | After | Beginning | End,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: js.Array[String], positionType: Unit, relativeTo: String): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: js.Array[String],
    positionType: Unit,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
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
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: Unit,
    positionType: None | Before | After | Beginning | End
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: Unit,
    positionType: None | Before | After | Beginning | End,
    relativeTo: String
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: Unit,
    positionType: None | Before | After | Beginning | End,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: Unit, positionType: Unit, relativeTo: String): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: Unit, positionType: Unit, relativeTo: Worksheet): ClientResult[js.Array[String]] = js.native
  def addFromBase64(base64File: String, sheetNamesToInsert: Unit, positionType: WorksheetPositionType): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: Unit,
    positionType: WorksheetPositionType,
    relativeTo: String
  ): ClientResult[js.Array[String]] = js.native
  def addFromBase64(
    base64File: String,
    sheetNamesToInsert: Unit,
    positionType: WorksheetPositionType,
    relativeTo: Worksheet
  ): ClientResult[js.Array[String]] = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCollection: RequestContext = js.native
  
  /**
    * Gets the currently active worksheet in the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getActiveWorksheet(): Worksheet = js.native
  
  /**
    * Gets the number of worksheets in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getCount(): ClientResult[Double] = js.native
  def getCount(visibleOnly: Boolean): ClientResult[Double] = js.native
  
  /**
    * Gets the first worksheet in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getFirst(): Worksheet = js.native
  def getFirst(visibleOnly: Boolean): Worksheet = js.native
  
  /**
    * Gets a worksheet object using its name or ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param key The name or ID of the worksheet.
    */
  def getItem(key: String): Worksheet = js.native
  
  /**
    * Gets a worksheet object using its name or ID. If the worksheet does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param key The name or ID of the worksheet.
    */
  def getItemOrNullObject(key: String): Worksheet = js.native
  
  /**
    * Gets the last worksheet in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If `true`, considers only visible worksheets, skipping over any hidden ones.
    */
  def getLast(): Worksheet = js.native
  def getLast(visibleOnly: Boolean): Worksheet = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Worksheet] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCollection = js.native
  def load(options: WorksheetCollectionLoadOptions & CollectionLoadOptions): WorksheetCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): WorksheetCollection = js.native
  def load(propertyNames: String): WorksheetCollection = js.native
  def load(propertyNames: js.Array[String]): WorksheetCollection = js.native
  
  /**
    * Occurs when any worksheet in the workbook is activated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onActivated: EventHandlers[WorksheetActivatedEventArgs] = js.native
  
  /**
    * Occurs when a new worksheet is added to the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onAdded: EventHandlers[WorksheetAddedEventArgs] = js.native
  
  /**
    * Occurs when any worksheet in the workbook is calculated.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: EventHandlers[WorksheetCalculatedEventArgs] = js.native
  
  /**
    * Occurs when any worksheet in the workbook is changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onChanged: EventHandlers[WorksheetChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more columns have been sorted. This happens as the result of a left-to-right sort operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onColumnSorted: EventHandlers[WorksheetColumnSortedEventArgs] = js.native
  
  /**
    * Occurs when any worksheet in the workbook is deactivated.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  
  /**
    * Occurs when a worksheet is deleted from the workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeleted: EventHandlers[WorksheetDeletedEventArgs] = js.native
  
  /**
    * Occurs when any worksheet's filter is applied in the workbook.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    *
    * @eventproperty
    * @beta
    */
  val onFiltered: EventHandlers[WorksheetFilteredEventArgs] = js.native
  
  /**
    * Occurs when any worksheet in the workbook has a format changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: EventHandlers[WorksheetFormatChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more formulas are changed in any worksheet of this collection. This event is for when the formula itself changes, not the data value resulting from the formula's calculation.
    *
    * @remarks
    * [Api set: ExcelApi 1.13]
    *
    * @eventproperty
    */
  val onFormulaChanged: EventHandlers[WorksheetFormulaChangedEventArgs] = js.native
  
  /**
    * Occurs when a worksheet is moved within a workbook. This event only triggers when a worksheet is directly moved within a workbook. This event doesn't trigger when the position of a worksheet is indirectly changed, such as when a new worksheet is inserted and causes existing worksheets to change positions.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @eventproperty
    */
  val onMoved: EventHandlers[WorksheetMovedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet name is changed in the worksheet collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @eventproperty
    */
  val onNameChanged: EventHandlers[WorksheetNameChangedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet protection state is changed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    *
    * @eventproperty
    */
  val onProtectionChanged: EventHandlers[WorksheetProtectionChangedEventArgs] = js.native
  
  /**
    * Occurs when the hidden state of one or more rows has changed on a specific worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.11]
    *
    * @eventproperty
    */
  val onRowHiddenChanged: EventHandlers[WorksheetRowHiddenChangedEventArgs] = js.native
  
  /**
    * Occurs when one or more rows have been sorted. This happens as the result of a top-to-bottom sort operation.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onRowSorted: EventHandlers[WorksheetRowSortedEventArgs] = js.native
  
  /**
    * Occurs when the selection changes on any worksheet.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onSelectionChanged: EventHandlers[WorksheetSelectionChangedEventArgs] = js.native
  
  /**
    * Occurs when left-clicked/tapped operation happens in the worksheet collection. This event will not be fired when clicking in the following cases:
    - The user drags the mouse for multi-selection.
    - The user selects a cell in the mode when cell arguments are selected for formula references.
    *
    * @remarks
    * [Api set: ExcelApi 1.10]
    *
    * @eventproperty
    */
  val onSingleClicked: EventHandlers[WorksheetSingleClickedEventArgs] = js.native
  
  /**
    * Occurs when the worksheet visibility is changed in the worksheet collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @eventproperty
    */
  val onVisibilityChanged: EventHandlers[WorksheetVisibilityChangedEventArgs] = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): WorksheetCollectionData = js.native
}
