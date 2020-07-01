package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.RangeAreasCollectionData
import typings.officeJsPreview.Excel.Interfaces.RangeAreasCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains the collection of cross-worksheets level Ranges.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait RangeAreasCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeAreasCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeAreas] = js.native
  /**
    * Gets the number of RangeAreas objects in this collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Returns the RangeAreas object based on position in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index Index value of the range object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): RangeAreas = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeAreasCollection = js.native
  def load(options: RangeAreasCollectionLoadOptions with CollectionLoadOptions): RangeAreasCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeAreasCollection = js.native
  def load(propertyNames: String): RangeAreasCollection = js.native
  def load(propertyNames: js.Array[String]): RangeAreasCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeAreasCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeAreasCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeAreasCollectionData = js.native
}

