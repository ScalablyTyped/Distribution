package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.WorksheetCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.WorksheetCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.EventHandlers
import typings.officeDashJs.OfficeExtensionNs.LoadOption
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
    * Occurs when any worksheet in the workbook has format changed.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @eventproperty
    */
  val onFormatChanged: EventHandlers[WorksheetFormatChangedEventArgs] = js.native
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

