package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.CustomXmlPartScopedCollectionData
import typings.officeJs.Excel.Interfaces.CustomXmlPartScopedCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A scoped collection of custom XML parts.
  A scoped collection is the result of some operation, e.g., filtering by namespace.
  A scoped collection cannot be scoped any further.
  *
  * [Api set: ExcelApi 1.5]
  */
@js.native
trait CustomXmlPartScopedCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartScopedCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  /**
    * Gets the number of CustomXML parts in this collection.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets a custom XML part based on its ID.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItem(id: String): CustomXmlPart = js.native
  /**
    * Gets a custom XML part based on its ID.
    If the CustomXmlPart does not exist, the return object's isNull property will be true.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItemOrNullObject(id: String): CustomXmlPart = js.native
  /**
    * If the collection contains exactly one item, this method returns it.
    Otherwise, this method produces an error.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getOnlyItem(): CustomXmlPart = js.native
  /**
    * If the collection contains exactly one item, this method returns it.
    Otherwise, this method returns Null.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getOnlyItemOrNullObject(): CustomXmlPart = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPartScopedCollection = js.native
  def load(options: CustomXmlPartScopedCollectionLoadOptions with CollectionLoadOptions): CustomXmlPartScopedCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): CustomXmlPartScopedCollection = js.native
  def load(propertyNames: String): CustomXmlPartScopedCollection = js.native
  def load(propertyNames: js.Array[String]): CustomXmlPartScopedCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CustomXmlPartScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomXmlPartScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): CustomXmlPartScopedCollectionData = js.native
}

