package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.StyleCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.StyleCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the styles.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.StyleCollection")
@js.native
class StyleCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_StyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Style] = js.native
  /**
    *
    * Adds a new style to the collection.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be added.
    */
  def add(name: String): Unit = js.native
  /**
    *
    * Gets the number of styles in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a style by name.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be retrieved.
    */
  def getItem(name: String): Style = js.native
  /**
    *
    * Gets a style based on its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index Index value of the style object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Style = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.StyleCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.StyleCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.StyleCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): StyleCollection = js.native
  def load(option: StyleCollectionLoadOptions with CollectionLoadOptions): StyleCollection = js.native
  def load(option: String): StyleCollection = js.native
  def load(option: js.Array[String]): StyleCollection = js.native
  def load(option: LoadOption): StyleCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.StyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.StyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): StyleCollectionData = js.native
}

