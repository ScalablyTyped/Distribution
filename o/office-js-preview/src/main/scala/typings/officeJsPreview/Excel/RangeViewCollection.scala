package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.RangeViewCollectionData
import typings.officeJsPreview.Excel.Interfaces.RangeViewCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of `RangeView` objects.
  *
  * @remarks
  * [Api set: ExcelApi 1.3]
  */
@js.native
trait RangeViewCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_RangeViewCollection: RequestContext = js.native
  
  /**
    * Gets the number of `RangeView` objects in the collection.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a `RangeView` row via its index. Zero-indexed.
    *
    * @remarks
    * [Api set: ExcelApi 1.3]
    *
    * @param index Index of the visible row.
    */
  def getItemAt(index: Double): RangeView = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[RangeView] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): RangeViewCollection = js.native
  def load(options: RangeViewCollectionLoadOptions & CollectionLoadOptions): RangeViewCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): RangeViewCollection = js.native
  def load(propertyNames: String): RangeViewCollection = js.native
  def load(propertyNames: js.Array[String]): RangeViewCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.RangeViewCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.RangeViewCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): RangeViewCollectionData = js.native
}
