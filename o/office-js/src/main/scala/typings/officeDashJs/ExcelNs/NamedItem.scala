package typings.officeDashJs.ExcelNs

import typings.officeDashJs.Anon_Expand
import typings.officeDashJs.ExcelNs.InterfacesNs.NamedItemData
import typings.officeDashJs.ExcelNs.InterfacesNs.NamedItemLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.NamedItemUpdateData
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.UpdateOptions
import typings.officeDashJs.officeDashJsStrings.Array
import typings.officeDashJs.officeDashJsStrings.Boolean
import typings.officeDashJs.officeDashJsStrings.Double
import typings.officeDashJs.officeDashJsStrings.Error
import typings.officeDashJs.officeDashJsStrings.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a defined name for a range of cells or value. Names can be primitive named objects (as seen in the type below), range object, or a reference to a range. This object can be used to obtain range object associated with names.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.NamedItem")
@js.native
class NamedItem () extends ClientObject {
  /**
    *
    * Returns an object containing values and types of the named item. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val arrayValues: NamedItemArrayValues = js.native
  /**
    *
    * Represents the comment associated with this name.
    *
    * [Api set: ExcelApi 1.4]
    */
  var comment: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedItem: RequestContext = js.native
  /**
    *
    * Gets or sets the formula of the named item.  Formula always starts with a '=' sign.
    *
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.Any = js.native
  /**
    *
    * The name of the object. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val name: String = js.native
  /**
    *
    * Indicates whether the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  val scope: NamedItemScope | typings.officeDashJs.officeDashJsStrings.Worksheet | typings.officeDashJs.officeDashJsStrings.Workbook = js.native
  /**
    *
    * Indicates the type of the value returned by the name's formula. See Excel.NamedItemType for details. Read-only.
    *
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  val `type`: NamedItemType | typings.officeDashJs.officeDashJsStrings.String | Integer | Double | Boolean | typings.officeDashJs.officeDashJsStrings.Range | Error | Array = js.native
  /**
    *
    * Represents the value computed by the name's formula. For a named range, will return the range address. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  val value: js.Any = js.native
  /**
    *
    * Specifies whether the object is visible or not.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: scala.Boolean = js.native
  /**
    *
    * Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  val worksheet: Worksheet = js.native
  /**
    *
    * Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
    *
    * [Api set: ExcelApi 1.4]
    */
  val worksheetOrNullObject: Worksheet = js.native
  /**
    *
    * Deletes the given name.
    *
    * [Api set: ExcelApi 1.4]
    */
  def delete(): Unit = js.native
  /**
    *
    * Returns the range object that is associated with the name. Throws an error if the named item's type is not a range.
    *
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  /**
    *
    * Returns the range object that is associated with the name. Returns a null object if the named item's type is not a range.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getRangeOrNullObject(): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.NamedItem` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.NamedItem` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.NamedItem` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItem = js.native
  def load(option: String): NamedItem = js.native
  def load(option: js.Array[String]): NamedItem = js.native
  def load(option: Anon_Expand): NamedItem = js.native
  def load(option: NamedItemLoadOptions): NamedItem = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.NamedItem): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: NamedItemUpdateData): Unit = js.native
  def set(properties: NamedItemUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: NamedItem): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.NamedItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): NamedItemData = js.native
}

