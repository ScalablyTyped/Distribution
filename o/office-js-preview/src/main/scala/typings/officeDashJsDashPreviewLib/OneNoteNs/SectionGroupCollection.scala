package typings
package officeDashJsDashPreviewLib.OneNoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of section groups.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.SectionGroupCollection")
@js.native
class SectionGroupCollection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns the number of section groups in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  val count: scala.Double = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SectionGroup] = js.native
  /**
    *
    * Gets the collection of section groups with the specified name.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param name The name of the section group.
    */
  def getByName(name: java.lang.String): SectionGroupCollection = js.native
  def getItem(index: java.lang.String): SectionGroup = js.native
  /**
    *
    * Gets a section group by ID or by its index in the collection. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index The ID of the section group, or the index location of the section group in the collection.
    */
  def getItem(index: scala.Double): SectionGroup = js.native
  /**
    *
    * Gets a section group on its position in the collection.
    *
    * [Api set: OneNoteApi 1.1]
    *
    * @param index Index value of the object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: scala.Double): SectionGroup = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): OneNote.SectionGroupCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): OneNote.SectionGroupCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): OneNote.SectionGroupCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SectionGroupCollection = js.native
  def load(
    option: officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.SectionGroupCollectionLoadOptions with officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.CollectionLoadOptions
  ): SectionGroupCollection = js.native
  def load(option: java.lang.String): SectionGroupCollection = js.native
  def load(option: js.Array[java.lang.String]): SectionGroupCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): SectionGroupCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs.SectionGroupCollectionData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): SectionGroupCollection = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): SectionGroupCollection = js.native
}

