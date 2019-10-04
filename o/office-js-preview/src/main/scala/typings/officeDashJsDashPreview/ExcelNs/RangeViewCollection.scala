package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeViewCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.RangeViewCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
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
class RangeViewCollection () extends ClientObject {
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
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a RangeView Row via its index. Zero-Indexed.
    *
    * [Api set: ExcelApi 1.3]
    *
    * @param index Index of the visible row.
    */
  def getItemAt(index: Double): RangeView = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeViewCollection = js.native
  def load(options: RangeViewCollectionLoadOptions with CollectionLoadOptions): RangeViewCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeViewCollection = js.native
  def load(propertyNames: String): RangeViewCollection = js.native
  def load(propertyNames: js.Array[String]): RangeViewCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeViewCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeViewCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeViewCollectionData = js.native
}

