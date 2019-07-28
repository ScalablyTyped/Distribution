package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.BindingCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.BindingCollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import typings.officeDashJs.officeDashJsStrings.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the collection of all the binding objects that are part of the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.BindingCollection")
@js.native
class BindingCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_BindingCollection: RequestContext = js.native
  /**
    *
    * Returns the number of bindings in the collection. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Binding] = js.native
  def add(range: String, bindingType: BindingType, id: String): Binding = js.native
  /**
    *
    * Add a new binding to a particular Range.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be an Excel Range object, or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def add(range: Range, bindingType: BindingType, id: String): Binding = js.native
  /**
    *
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def addFromNamedItem(name: String, bindingType: BindingType, id: String): Binding = js.native
  /**
    *
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("addFromNamedItem")
  def addFromNamedItem_Range(name: String, bindingType: typings.officeDashJs.officeDashJsStrings.Range, id: String): Binding = js.native
  @JSName("addFromNamedItem")
  def addFromNamedItem_Table(name: String, bindingType: typings.officeDashJs.officeDashJsStrings.Table, id: String): Binding = js.native
  @JSName("addFromNamedItem")
  def addFromNamedItem_Text(name: String, bindingType: Text, id: String): Binding = js.native
  /**
    *
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  def addFromSelection(bindingType: BindingType, id: String): Binding = js.native
  /**
    *
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the "InvalidReference" error will be returned.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("addFromSelection")
  def addFromSelection_Range(bindingType: typings.officeDashJs.officeDashJsStrings.Range, id: String): Binding = js.native
  @JSName("addFromSelection")
  def addFromSelection_Table(bindingType: typings.officeDashJs.officeDashJsStrings.Table, id: String): Binding = js.native
  @JSName("addFromSelection")
  def addFromSelection_Text(bindingType: Text, id: String): Binding = js.native
  @JSName("add")
  def add_Range(range: String, bindingType: typings.officeDashJs.officeDashJsStrings.Range, id: String): Binding = js.native
  /**
    *
    * Add a new binding to a particular Range.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be an Excel Range object, or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See Excel.BindingType.
    * @param id Name of binding.
    */
  @JSName("add")
  def add_Range(range: Range, bindingType: typings.officeDashJs.officeDashJsStrings.Range, id: String): Binding = js.native
  @JSName("add")
  def add_Table(range: String, bindingType: typings.officeDashJs.officeDashJsStrings.Table, id: String): Binding = js.native
  @JSName("add")
  def add_Table(range: Range, bindingType: typings.officeDashJs.officeDashJsStrings.Table, id: String): Binding = js.native
  @JSName("add")
  def add_Text(range: String, bindingType: Text, id: String): Binding = js.native
  @JSName("add")
  def add_Text(range: Range, bindingType: Text, id: String): Binding = js.native
  /**
    *
    * Gets the number of bindings in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a binding object by ID.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param id Id of the binding object to be retrieved.
    */
  def getItem(id: String): Binding = js.native
  /**
    *
    * Gets a binding object based on its position in the items array.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Binding = js.native
  /**
    *
    * Gets a binding object by ID. If the binding object does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param id Id of the binding object to be retrieved.
    */
  def getItemOrNullObject(id: String): Binding = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.BindingCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.BindingCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.BindingCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): BindingCollection = js.native
  def load(option: BindingCollectionLoadOptions with CollectionLoadOptions): BindingCollection = js.native
  def load(option: String): BindingCollection = js.native
  def load(option: js.Array[String]): BindingCollection = js.native
  def load(option: LoadOption): BindingCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.BindingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.BindingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): BindingCollectionData = js.native
}

