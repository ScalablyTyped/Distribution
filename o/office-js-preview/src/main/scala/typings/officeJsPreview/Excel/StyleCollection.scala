package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.StyleCollectionData
import typings.officeJsPreview.Excel.Interfaces.StyleCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the styles.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait StyleCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_StyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Style] = js.native
  /**
    * Adds a new style to the collection.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be added.
    */
  def add(name: String): Unit = js.native
  /**
    * Gets the number of styles in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets a style by name.
    *
    * [Api set: ExcelApi 1.7]
    *
    * @param name Name of the style to be retrieved.
    */
  def getItem(name: String): Style = js.native
  /**
    * Gets a style based on its position in the collection.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index Index value of the style object to be retrieved. Zero-indexed.
    */
  def getItemAt(index: Double): Style = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): StyleCollection = js.native
  def load(options: StyleCollectionLoadOptions with CollectionLoadOptions): StyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): StyleCollection = js.native
  def load(propertyNames: String): StyleCollection = js.native
  def load(propertyNames: js.Array[String]): StyleCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.StyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.StyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): StyleCollectionData = js.native
}

