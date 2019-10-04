package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TableStyleCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.TableStyleCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of TableStyles.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.TableStyleCollection")
@js.native
class TableStyleCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TableStyleCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[TableStyle] = js.native
  /**
    *
    * Creates a blank TableStyle with the specified name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name The unique name for the new TableStyle. Will throw an invalid argument exception if the name is already in use.
    * @param makeUniqueName Optional, defaults to false. If true, will append numbers to the name in order to make it unique, if needed.
    * @returns The newly created TableStyle.
    */
  def add(name: String): TableStyle = js.native
  def add(name: String, makeUniqueName: Boolean): TableStyle = js.native
  /**
    *
    * Gets the number of table styles in the collection.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets the default TableStyle for the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    * @returns The TableStyle object that is the current default TableStyle.
    */
  def getDefault(): TableStyle = js.native
  /**
    *
    * Gets a TableStyle by name.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItem(name: String): TableStyle = js.native
  /**
    *
    * Gets a TableStyle by name. If the TableStyle does not exist, will return a null object.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Name of the TableStyle to be retrieved.
    * @returns The TableStyle object whose name matches the input.
    */
  def getItemOrNullObject(name: String): TableStyle = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TableStyleCollection = js.native
  def load(options: TableStyleCollectionLoadOptions with CollectionLoadOptions): TableStyleCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): TableStyleCollection = js.native
  def load(propertyNames: String): TableStyleCollection = js.native
  def load(propertyNames: js.Array[String]): TableStyleCollection = js.native
  def setDefault(newDefaultStyle: String): Unit = js.native
  /**
    *
    * Sets the default TableStyle for use in the parent object's scope.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param newDefaultStyle The TableStyle object or name of the TableStyle object that should be the new default.
    */
  def setDefault(newDefaultStyle: TableStyle): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.TableStyleCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.TableStyleCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): TableStyleCollectionData = js.native
}

