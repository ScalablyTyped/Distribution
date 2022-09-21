package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.AllowEditRangeCollectionData
import typings.officeJs.Excel.Interfaces.AllowEditRangeCollectionLoadOptions
import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the set of `AllowEditRange` objects found in a worksheet. `AllowEditRange` objects work with worksheet protection properties.
  When worksheet protection is enabled, an `AllowEditRange` object can be used to allow editing of a specific range, while maintaining protection on the rest of the worksheet.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait AllowEditRangeCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds an `AllowEditRange` object to the worksheet.
    Worksheet protection must be disabled or paused for this method to work properly.
    If worksheet protection is enabled and not paused, then this method throws an `AccessDenied` error and the add operation fails.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param title The title string of the `AllowEditRange` object to be added.
    * @param rangeAddress The range address of the `AllowEditRange` object to be added.
    * @param options Additional options to be added to the `AllowEditRange` object, such as the password.
    */
  def add(title: String, rangeAddress: String): Unit = js.native
  def add(title: String, rangeAddress: String, options: AllowEditRangeOptions): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_AllowEditRangeCollection: RequestContext = js.native
  
  /**
    * Returns the number of `AllowEditRange` objects in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets the `AllowEditRange` object by its title.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param key The title of the `AllowEditRange`.
    * @returns The `AllowEditRange` with the title. If there is no `AllowEditRange` with the given title, then an `ItemNotFound` error is thrown.
    */
  def getItem(key: String): AllowEditRange = js.native
  
  /**
    * Returns an `AllowEditRange` object by its index in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param index The index of the `AllowEditRange` object in the collection.
    * @returns The `AllowEditRange` at the given index.
    */
  def getItemAt(index: Double): AllowEditRange = js.native
  
  /**
    * Gets the `AllowEditRange` object by its title.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param key The title of the `AllowEditRange`.
    * @returns The `AllowEditRange` with the title. If there is no `AllowEditRange` with the given title, then this method returns an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    */
  def getItemOrNullObject(key: String): AllowEditRange = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[AllowEditRange] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): AllowEditRangeCollection = js.native
  def load(options: AllowEditRangeCollectionLoadOptions & CollectionLoadOptions): AllowEditRangeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): AllowEditRangeCollection = js.native
  def load(propertyNames: String): AllowEditRangeCollection = js.native
  def load(propertyNames: js.Array[String]): AllowEditRangeCollection = js.native
  
  /**
    * Pauses worksheet protection for all `AllowEditRange` objects found in this worksheet that have the given password for the user in the current session.
    This method does nothing if worksheet protection isn't enabled or is paused.
    If worksheet protection cannot be paused, this method throws an `UnsupportedOperation` error and fails to pause protection for the range.
    If the password does not match any `AllowEditRange` objects in the collection, then this method throws a `BadPassword` error and fails to pause protection for any range in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    *
    * @param password The password to pause protection on the `AllowEditRange` objects.
    */
  def pauseProtection(password: String): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.AllowEditRangeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.AllowEditRangeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): AllowEditRangeCollectionData = js.native
}
