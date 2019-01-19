package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Shape Collection.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.ShapeCollection")
@js.native
class ShapeCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  /**
    *
    * Gets the number of Shapes in the collection.
    *
    * [Api set:  1.1]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  def getItem(key: java.lang.String): Shape = js.native
  /**
    *
    * Gets a Shape using its key (name or Index).
    *
    * [Api set:  1.1]
    *
    * @param key Key is the Name or Index of the shape to be retrieved.
    */
  def getItem(key: scala.Double): Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeCollectionLoadOptions with officeDashJsDashPreviewLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): ShapeCollection = js.native
  def load(option: java.lang.String): ShapeCollection = js.native
  def load(option: js.Array[java.lang.String]): ShapeCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): ShapeCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.ShapeCollectionData = js.native
}

