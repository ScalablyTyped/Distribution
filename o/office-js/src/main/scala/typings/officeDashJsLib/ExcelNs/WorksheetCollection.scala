package typings
package officeDashJsLib.ExcelNs

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
class WorksheetCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
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
  val onActivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetActivatedEventArgs] = js.native
  /**
    *
    * Occurs when a new worksheet is added to the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onAdded: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetAddedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is calculated.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @eventproperty
    */
  val onCalculated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetCalculatedEventArgs] = js.native
  /**
    *
    * Occurs when any worksheet in the workbook is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeactivated: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetDeactivatedEventArgs] = js.native
  /**
    *
    * Occurs when a worksheet is deleted from the workbook.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @eventproperty
    */
  val onDeleted: officeDashJsLib.OfficeExtensionNs.EventHandlers[WorksheetDeletedEventArgs] = js.native
  /**
    *
    * Adds a new worksheet to the workbook. The worksheet will be added at the end of existing worksheets. If you wish to activate the newly added worksheet, call ".activate() on it.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Optional. The name of the worksheet to be added. If specified, name should be unqiue. If not specified, Excel determines the name of the new worksheet.
    */
  def add(): Worksheet = js.native
  def add(name: java.lang.String): Worksheet = js.native
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
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  def getCount(visibleOnly: scala.Boolean): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the first worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getFirst(): Worksheet = js.native
  def getFirst(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItem(key: java.lang.String): Worksheet = js.native
  /**
    *
    * Gets a worksheet object using its Name or ID. If the worksheet does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param key The Name or ID of the worksheet.
    */
  def getItemOrNullObject(key: java.lang.String): Worksheet = js.native
  /**
    *
    * Gets the last worksheet in the collection.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param visibleOnly Optional. If true, considers only visible worksheets, skipping over any hidden ones.
    */
  def getLast(): Worksheet = js.native
  def getLast(visibleOnly: scala.Boolean): Worksheet = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.WorksheetCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.WorksheetCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.WorksheetCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.WorksheetCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): WorksheetCollection = js.native
  def load(option: java.lang.String): WorksheetCollection = js.native
  def load(option: js.Array[java.lang.String]): WorksheetCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): WorksheetCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.WorksheetCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.WorksheetCollectionData = js.native
}

