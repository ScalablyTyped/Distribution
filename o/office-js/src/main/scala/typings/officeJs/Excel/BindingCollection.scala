package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.BindingCollectionData
import typings.officeJs.Excel.Interfaces.BindingCollectionLoadOptions
import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import typings.officeJs.officeJsStrings.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of all the binding objects that are part of the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
@js.native
trait BindingCollection
  extends StObject
     with ClientObject {
  
  def add(
    range: String,
    bindingType: typings.officeJs.officeJsStrings.Range | typings.officeJs.officeJsStrings.Table | Text,
    id: String
  ): Binding = js.native
  def add(range: String, bindingType: BindingType, id: String): Binding = js.native
  /**
    * Add a new binding to a particular Range.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be a `Range` object or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def add(
    range: Range,
    bindingType: typings.officeJs.officeJsStrings.Range | typings.officeJs.officeJsStrings.Table | Text,
    id: String
  ): Binding = js.native
  /**
    * Add a new binding to a particular Range.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param range Range to bind the binding to. May be a `Range` object or a string. If string, must contain the full address, including the sheet name
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def add(range: Range, bindingType: BindingType, id: String): Binding = js.native
  
  /**
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the `InvalidReference` error will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def addFromNamedItem(
    name: String,
    bindingType: typings.officeJs.officeJsStrings.Range | typings.officeJs.officeJsStrings.Table | Text,
    id: String
  ): Binding = js.native
  /**
    * Add a new binding based on a named item in the workbook.
    If the named item references to multiple areas, the `InvalidReference` error will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param name Name from which to create binding.
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def addFromNamedItem(name: String, bindingType: BindingType, id: String): Binding = js.native
  
  /**
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the `InvalidReference` error will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def addFromSelection(
    bindingType: typings.officeJs.officeJsStrings.Range | typings.officeJs.officeJsStrings.Table | Text,
    id: String
  ): Binding = js.native
  /**
    * Add a new binding based on the current selection.
    If the selection has multiple areas, the `InvalidReference` error will be returned.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param bindingType Type of binding. See `Excel.BindingType`.
    * @param id Name of the binding.
    */
  def addFromSelection(bindingType: BindingType, id: String): Binding = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_BindingCollection: RequestContext = js.native
  
  /**
    * Returns the number of bindings in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  val count: Double = js.native
  
  /**
    * Gets the number of bindings in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a binding object by ID.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param id ID of the binding object to be retrieved.
    */
  def getItem(id: String): Binding = js.native
  
  /**
    * Gets a binding object based on its position in the items array.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Binding = js.native
  
  /**
    * Gets a binding object by ID. If the binding object does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    *
    * @param id ID of the binding object to be retrieved.
    */
  def getItemOrNullObject(id: String): Binding = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Binding] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): BindingCollection = js.native
  def load(options: BindingCollectionLoadOptions & CollectionLoadOptions): BindingCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): BindingCollection = js.native
  def load(propertyNames: String): BindingCollection = js.native
  def load(propertyNames: js.Array[String]): BindingCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.BindingCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.BindingCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): BindingCollectionData = js.native
}
