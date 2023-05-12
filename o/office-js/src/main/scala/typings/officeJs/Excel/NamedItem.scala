package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.NamedItemData
import typings.officeJs.Excel.Interfaces.NamedItemLoadOptions
import typings.officeJs.Excel.Interfaces.NamedItemUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Array
import typings.officeJs.officeJsStrings.Boolean
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.Error
import typings.officeJs.officeJsStrings.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a defined name for a range of cells or value. Names can be primitive named objects (as seen in the type below), range object, or a reference to a range. This object can be used to obtain range object associated with names.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait NamedItem
  extends StObject
     with ClientObject {
  
  /**
    * Returns an object containing values and types of the named item.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  val arrayValues: NamedItemArrayValues = js.native
  
  /**
    * Specifies the comment associated with this name.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var comment: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedItem: RequestContext = js.native
  
  /**
    * Deletes the given name.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def delete(): Unit = js.native
  
  /**
    * The formula of the named item. Formulas always start with an equal sign ("=").
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var formula: Any = js.native
  
  /**
    * Returns the range object that is associated with the name. Throws an error if the named item's type is not a range.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  def getRange(): Range = js.native
  
  /**
    * Returns the range object that is associated with the name. If the named item's type is not a range, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getRangeOrNullObject(): Range = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItem = js.native
  def load(options: NamedItemLoadOptions): NamedItem = js.native
  def load(propertyNamesAndPaths: Expand): NamedItem = js.native
  def load(propertyNames: String): NamedItem = js.native
  def load(propertyNames: js.Array[String]): NamedItem = js.native
  
  /**
    * The name of the object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val name: String = js.native
  
  /**
    * Specifies if the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  val scope: NamedItemScope | typings.officeJs.officeJsStrings.Worksheet | typings.officeJs.officeJsStrings.Workbook = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
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
  
  /**
    * Specifies the type of the value returned by the name's formula. See `Excel.NamedItemType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
    */
  val `type`: NamedItemType | typings.officeJs.officeJsStrings.String | Integer | Double | Boolean | typings.officeJs.officeJsStrings.Range | Error | Array = js.native
  
  /**
    * Represents the value computed by the name's formula. For a named range it will return the range address.
    * Note: This API returns the #VALUE! error in the Excel UI if it refers to a custom function.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val value: Any = js.native
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJson` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the en-US locale.  To retrieve data in the user's display locale, use `NamedItem.valueAsJsonLocal`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  val valueAsJson: CellValue | String = js.native
  
  /**
    * A JSON representation of the values in this named item.
    Unlike `NamedItem.value`, `NamedItem.valueAsJsonLocal` supports all data types which can be in a cell. Examples include formatted number values and web images, in addition to the standard boolean, number, and string values.
    Data returned from this API always aligns with the user's display locale.  To retrieve data independent of locale, use `NamedItem.valueAsJson`.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  val valueAsJsonLocal: CellValue | String = js.native
  
  /**
    * Specifies if the object is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: scala.Boolean = js.native
  
  /**
    * Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  val worksheet: Worksheet = js.native
  
  /**
    * Returns the worksheet to which the named item is scoped. If the item is scoped to the workbook instead, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  val worksheetOrNullObject: Worksheet = js.native
}
