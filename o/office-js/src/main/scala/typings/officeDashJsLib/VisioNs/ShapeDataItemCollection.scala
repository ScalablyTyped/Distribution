package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItemCollection for a given Shape.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeDataItemCollection")
@js.native
class ShapeDataItemCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeDataItemCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[ShapeDataItem] = js.native
  /**
    *
    * Gets the number of Shape Data Items.
    *
    * [Api set:  1.1]
    */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets the ShapeDataItem using its name.
    *
    * [Api set:  1.1]
    *
    * @param key Key is the name of the ShapeDataItem to be retrieved.
    */
  def getItem(key: java.lang.String): ShapeDataItem = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeDataItemCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeDataItemCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeDataItemCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeDataItemCollection = js.native
  def load(
    option: officeDashJsLib.VisioNs.InterfacesNs.ShapeDataItemCollectionLoadOptions with officeDashJsLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): ShapeDataItemCollection = js.native
  def load(option: java.lang.String): ShapeDataItemCollection = js.native
  def load(option: js.Array[java.lang.String]): ShapeDataItemCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): ShapeDataItemCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Visio.ShapeDataItemCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeDataItemCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsLib.VisioNs.InterfacesNs.ShapeDataItemCollectionData = js.native
}

