package typings.officeDashJs.VisioNs

import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import typings.officeDashJs.VisioNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.VisioNs.InterfacesNs.PageCollectionData
import typings.officeDashJs.VisioNs.InterfacesNs.PageCollectionLoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of Page objects that are part of the document.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.PageCollection")
@js.native
class PageCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Page] = js.native
  /**
    *
    * Gets the number of pages in the collection.
    *
    * [Api set:  1.1]
    */
  def getCount(): ClientResult[Double] = js.native
  def getItem(key: String): Page = js.native
  /**
    *
    * Gets a page using its key (name or Id).
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name or Id of the page to be retrieved.
    */
  def getItem(key: Double): Page = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.PageCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.PageCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.PageCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageCollection = js.native
  def load(option: PageCollectionLoadOptions with CollectionLoadOptions): PageCollection = js.native
  def load(option: String): PageCollection = js.native
  def load(option: js.Array[String]): PageCollection = js.native
  def load(option: LoadOption): PageCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.PageCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.PageCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PageCollectionData = js.native
}

