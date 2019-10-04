package typings.officeDashJs.ExcelNs

import typings.officeDashJs.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJs.ExcelNs.InterfacesNs.RangeCollectionData
import typings.officeDashJs.ExcelNs.InterfacesNs.RangeCollectionLoadOptions
import typings.officeDashJs.OfficeExtensionNs.ClientObject
import typings.officeDashJs.OfficeExtensionNs.ClientResult
import typings.officeDashJs.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.RangeCollection")
@js.native
class RangeCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Range] = js.native
  /**
    *
    * Returns the number of ranges in the RangeCollection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Returns the range object based on its position in the RangeCollection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index Index value of the range object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeCollection = js.native
  def load(options: RangeCollectionLoadOptions with CollectionLoadOptions): RangeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeCollection = js.native
  def load(propertyNames: String): RangeCollection = js.native
  def load(propertyNames: js.Array[String]): RangeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeCollectionData = js.native
}

