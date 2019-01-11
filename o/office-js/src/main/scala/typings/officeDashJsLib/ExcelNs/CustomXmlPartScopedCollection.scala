package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A scoped collection of custom XML parts.
  A scoped collection is the result of some operation, e.g. filtering by namespace.
  A scoped collection cannot be scoped any further.
  *
  * [Api set: ExcelApi 1.5]
  */
@JSGlobal("Excel.CustomXmlPartScopedCollection")
@js.native
class CustomXmlPartScopedCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartScopedCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  /**
    *
    * Gets the number of CustomXML parts in this collection.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a custom XML part based on its ID.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItem(id: java.lang.String): CustomXmlPart = js.native
  /**
    *
    * Gets a custom XML part based on its ID.
    If the CustomXmlPart does not exist, the return object's isNull property will be true.
    *
    * [Api set: ExcelApi 1.5]
    *
    * @param id ID of the object to be retrieved.
    */
  def getItemOrNullObject(id: java.lang.String): CustomXmlPart = js.native
  /**
    *
    * If the collection contains exactly one item, this method returns it.
    Otherwise, this method produces an error.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getOnlyItem(): CustomXmlPart = js.native
  /**
    *
    * If the collection contains exactly one item, this method returns it.
    Otherwise, this method returns Null.
    *
    * [Api set: ExcelApi 1.5]
    */
  def getOnlyItemOrNullObject(): CustomXmlPart = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.CustomXmlPartScopedCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.CustomXmlPartScopedCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomXmlPartScopedCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): CustomXmlPartScopedCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.CustomXmlPartScopedCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): CustomXmlPartScopedCollection = js.native
  def load(option: java.lang.String): CustomXmlPartScopedCollection = js.native
  def load(option: js.Array[java.lang.String]): CustomXmlPartScopedCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): CustomXmlPartScopedCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.CustomXmlPartScopedCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomXmlPartScopedCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.CustomXmlPartScopedCollectionData = js.native
}

