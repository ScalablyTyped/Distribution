package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the shape collection inside a shape group.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.GroupShapeCollection")
@js.native
class GroupShapeCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_GroupShapeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Shape] = js.native
  /**
    *
    * Returns the number of shapes in the shape group. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
    *
    * Gets a shape using its Name or ID.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param key The Name or ID of the shape to be retrieved.
    */
  def getItem(key: java.lang.String): Shape = js.native
  /**
    *
    * Gets a shape based on its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index The zero-based index value of the object to be retrieved.
    */
  def getItemAt(index: scala.Double): Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.GroupShapeCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.GroupShapeCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.GroupShapeCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): GroupShapeCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.GroupShapeCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): GroupShapeCollection = js.native
  def load(option: java.lang.String): GroupShapeCollection = js.native
  def load(option: js.Array[java.lang.String]): GroupShapeCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): GroupShapeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.GroupShapeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.GroupShapeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.GroupShapeCollectionData = js.native
}

