package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of RangeView objects.
  *
  * [Api set: ExcelApi 1.3]
  */
@JSGlobal("Excel.RangeViewCollection")
@js.native
class RangeViewCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeViewCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeView] = js.native
  /**
    *
    * Gets the number of RangeView objects in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a RangeView Row via its index. Zero-Indexed.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param index Index of the visible row.
    */
  def getItemAt(index: scala.Double): RangeView = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.RangeViewCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.RangeViewCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RangeViewCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeViewCollection = js.native
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.RangeViewCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): RangeViewCollection = js.native
  def load(option: java.lang.String): RangeViewCollection = js.native
  def load(option: js.Array[java.lang.String]): RangeViewCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): RangeViewCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeViewCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeViewCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RangeViewCollectionData = js.native
}

