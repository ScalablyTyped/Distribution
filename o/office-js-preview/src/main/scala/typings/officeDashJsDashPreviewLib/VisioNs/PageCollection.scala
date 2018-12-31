package typings
package officeDashJsDashPreviewLib.VisioNs

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
class PageCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Page] = js.native
  /**
    *
    * Gets the number of pages in the collection.
    *
    * [Api set:  1.1]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  def getItem(key: java.lang.String): Page = js.native
  /**
    *
    * Gets a page using its key (name or Id).
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name or Id of the page to be retrieved.
    */
  def getItem(key: scala.Double): Page = js.native
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
  def load(
    option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageCollectionLoadOptions with officeDashJsDashPreviewLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): PageCollection = js.native
  def load(option: java.lang.String): PageCollection = js.native
  def load(option: js.Array[java.lang.String]): PageCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): PageCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.PageCollectionData = js.native
}

