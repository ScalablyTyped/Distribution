package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.NamedSheetViewCollectionData
import typings.officeJsPreview.Excel.Interfaces.NamedSheetViewCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the collection of sheet views in the worksheet.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait NamedSheetViewCollection
  extends StObject
     with ClientObject {
  
  /**
    * Creates a new sheet view with the given name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The name of the sheet view to be created.
    Throws an error when the provided name already exists, is empty, or is a name reserved by the worksheet.
    * @returns The newly created sheet view object.
    */
  def add(name: String): NamedSheetView = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedSheetViewCollection: RequestContext = js.native
  
  /**
    * Creates and activates a new temporary sheet view.
    Temporary views are removed when closing the application, exiting the temporary view with the exit method, or switching to another sheet view.
    The temporary sheet view can also be acccessed with the empty string (""), if the temporary view exists.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The newly created sheet view object.
    */
  def enterTemporary(): NamedSheetView = js.native
  
  /**
    * Exits the currently active sheet view.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def exit(): Unit = js.native
  
  /**
    * Gets the worksheet's currently active sheet view.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The currently active sheet view for this worksheet.
    */
  def getActive(): NamedSheetView = js.native
  
  /**
    * Gets the number of sheet views in this worksheet.
    Includes the temporary sheet view if it exists.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a sheet view using its name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param key The case-sensitive name of the sheet view. Use the empty string ("") to get the temporary sheet view, if the temporary view exists.
    * @returns The sheet view with the given name, or the temporary view if the empty string was provided. If there is no current temporary view and the empty string was provided, then an error is thrown.
    */
  def getItem(key: String): NamedSheetView = js.native
  
  /**
    * Gets a sheet view by its index in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The index of the sheet view object in the collection.
    * @returns The sheet view at the given index.
    */
  def getItemAt(index: Double): NamedSheetView = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[NamedSheetView] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedSheetViewCollection = js.native
  def load(options: NamedSheetViewCollectionLoadOptions & CollectionLoadOptions): NamedSheetViewCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): NamedSheetViewCollection = js.native
  def load(propertyNames: String): NamedSheetViewCollection = js.native
  def load(propertyNames: js.Array[String]): NamedSheetViewCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.NamedSheetViewCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedSheetViewCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): NamedSheetViewCollectionData = js.native
}
