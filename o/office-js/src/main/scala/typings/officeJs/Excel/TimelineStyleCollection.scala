package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.TimelineStyleCollectionData
import typings.officeJs.Excel.Interfaces.TimelineStyleCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of TimelineStyles.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait TimelineStyleCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TimelineStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TimelineStyle] = js.native
  /**
    * Creates a blank TimelineStyle with the specified name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name The unique name for the new TimelineStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created TimelineStyle.
    */
  def add(name: String): TimelineStyle = js.native
  def add(name: String, makeUniqueName: Boolean): TimelineStyle = js.native
  /**
    * Gets the number of timeline styles in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets the default TimelineStyle for the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The TimelineStyle object that is the current default TimelineStyle.
    */
  def getDefault(): TimelineStyle = js.native
  /**
    * Gets a TimelineStyle by name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the TimelineStyle to be retrieved.
    * @returns The TimelineStyle object whose name matches the input.
    */
  def getItem(name: String): TimelineStyle = js.native
  /**
    * Gets a TimelineStyle by name. If the TimelineStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the TimelineStyle to be retrieved.
    * @returns The TimelineStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): TimelineStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TimelineStyleCollection = js.native
  def load(options: TimelineStyleCollectionLoadOptions with CollectionLoadOptions): TimelineStyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TimelineStyleCollection = js.native
  def load(propertyNames: String): TimelineStyleCollection = js.native
  def load(propertyNames: js.Array[String]): TimelineStyleCollection = js.native
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    * Sets the default TimelineStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param newDefaultStyle The TimelineStyle object or name of the TimelineStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: TimelineStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TimelineStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TimelineStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TimelineStyleCollectionData = js.native
}

