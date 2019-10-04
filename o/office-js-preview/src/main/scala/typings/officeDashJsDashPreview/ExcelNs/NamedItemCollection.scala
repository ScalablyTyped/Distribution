package typings.officeDashJsDashPreview.ExcelNs

import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.CollectionLoadOptions
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.NamedItemCollectionData
import typings.officeDashJsDashPreview.ExcelNs.InterfacesNs.NamedItemCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientObject
import typings.officeDashJsDashPreview.OfficeExtensionNs.ClientResult
import typings.officeDashJsDashPreview.OfficeExtensionNs.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A collection of all the NamedItem objects that are part of the workbook or worksheet, depending on how it was reached.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.NamedItemCollection")
@js.native
class NamedItemCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_NamedItemCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[NamedItem] = js.native
  def add(name: String, reference: String): NamedItem = js.native
  def add(name: String, reference: String, comment: String): NamedItem = js.native
  /**
    *
    * Adds a new name to the collection of the given scope.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name The name of the named item.
    * @param reference The formula or the range that the name will refer to.
    * @param comment Optional. The comment associated with the named item.
    * @returns
    */
  def add(name: String, reference: Range): NamedItem = js.native
  def add(name: String, reference: Range, comment: String): NamedItem = js.native
  /**
    *
    * Adds a new name to the collection of the given scope using the user's locale for the formula.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name The "name" of the named item.
    * @param formula The formula in the user's locale that the name will refer to.
    * @param comment Optional. The comment associated with the named item.
    * @returns
    */
  def addFormulaLocal(name: String, formula: String): NamedItem = js.native
  def addFormulaLocal(name: String, formula: String, comment: String): NamedItem = js.native
  /**
    *
    * Gets the number of named items in the collection.
    *
    * [Api set: ExcelApi 1.4]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a NamedItem object using its name.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param name Nameditem name.
    */
  def getItem(name: String): NamedItem = js.native
  /**
    *
    * Gets a NamedItem object using its name. If the nameditem object does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.4]
    *
    * @param name Nameditem name.
    */
  def getItemOrNullObject(name: String): NamedItem = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): NamedItemCollection = js.native
  def load(options: NamedItemCollectionLoadOptions with CollectionLoadOptions): NamedItemCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): NamedItemCollection = js.native
  def load(propertyNames: String): NamedItemCollection = js.native
  def load(propertyNames: js.Array[String]): NamedItemCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.NamedItemCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.NamedItemCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): NamedItemCollectionData = js.native
}

