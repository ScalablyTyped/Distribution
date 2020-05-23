package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.SlicerStyleCollectionData
import typings.officeJs.Excel.Interfaces.SlicerStyleCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of SlicerStyle objects.
  *
  * [Api set: ExcelApi 1.10]
  */
@js.native
trait SlicerStyleCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_SlicerStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[SlicerStyle] = js.native
  /**
    * Creates a blank SlicerStyle with the specified name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name The unique name for the new SlicerStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created SlicerStyle.
    */
  def add(name: String): SlicerStyle = js.native
  def add(name: String, makeUniqueName: Boolean): SlicerStyle = js.native
  /**
    * Gets the number of slicer styles in the collection.
    *
    * [Api set: ExcelApi 1.10]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    * Gets the default SlicerStyle for the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    * @returns The SlicerStyle object that is the current default SlicerStyle.
    */
  def getDefault(): SlicerStyle = js.native
  /**
    * Gets a SlicerStyle by name.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the SlicerStyle to be retrieved.
    * @returns The SlicerStyle object whose name matches the input.
    */
  def getItem(name: String): SlicerStyle = js.native
  /**
    * Gets a SlicerStyle by name. If the SlicerStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param name Name of the SlicerStyle to be retrieved.
    * @returns The SlicerStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): SlicerStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): SlicerStyleCollection = js.native
  def load(options: SlicerStyleCollectionLoadOptions with CollectionLoadOptions): SlicerStyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): SlicerStyleCollection = js.native
  def load(propertyNames: String): SlicerStyleCollection = js.native
  def load(propertyNames: js.Array[String]): SlicerStyleCollection = js.native
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    * Sets the default SlicerStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi 1.10]
    *
    * @param newDefaultStyle The SlicerStyle object or name of the SlicerStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: SlicerStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.SlicerStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.SlicerStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): SlicerStyleCollectionData = js.native
}

