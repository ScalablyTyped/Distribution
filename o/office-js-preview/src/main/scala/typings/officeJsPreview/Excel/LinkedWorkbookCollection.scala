package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.LinkedWorkbookCollectionData
import typings.officeJsPreview.Excel.Interfaces.LinkedWorkbookCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.LoadOption
import typings.officeJsPreview.officeJsPreviewStrings.Automatic
import typings.officeJsPreview.officeJsPreviewStrings.Manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of linked workbook objects.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait LinkedWorkbookCollection
  extends StObject
     with ClientObject {
  
  /**
    * Breaks all the links to the linked workbooks. Once the links are broken, any formulas referencing workbook links are removed entirely and replaced with the most recently retrieved values.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def breakAllLinks(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_LinkedWorkbookCollection: RequestContext = js.native
  
  /**
    * Gets information about a linked workbook by its URL.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param key The URL of the linked workbook.
    * @returns The linked workbook with the given URL.
    */
  def getItem(key: String): LinkedWorkbook = js.native
  
  /**
    * Gets information about a linked workbook by its URL. If the workbook does not exist, then this method returns an object with its `isNullObject` property set to `true`.
    For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties  | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param key The URL of the linked workbook.
    * @returns The linked workbook with given URL.
    */
  def getItemOrNullObject(key: String): LinkedWorkbook = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[LinkedWorkbook] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): LinkedWorkbookCollection = js.native
  def load(options: LinkedWorkbookCollectionLoadOptions & CollectionLoadOptions): LinkedWorkbookCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): LinkedWorkbookCollection = js.native
  def load(propertyNames: String): LinkedWorkbookCollection = js.native
  def load(propertyNames: js.Array[String]): LinkedWorkbookCollection = js.native
  
  /**
    * Makes a request to refresh all the workbook links.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def refreshAll(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.LinkedWorkbookCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LinkedWorkbookCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): LinkedWorkbookCollectionData = js.native
  
  /**
    * Represents the update mode of the workbook links. The mode is same for all of the workbook links present in the workbook.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var workbookLinksRefreshMode: WorkbookLinksRefreshMode | Manual | Automatic = js.native
}
