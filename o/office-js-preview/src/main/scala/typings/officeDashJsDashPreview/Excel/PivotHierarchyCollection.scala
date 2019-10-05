package typings.officeDashJsDashPreview.Excel

import typings.officeDashJsDashPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeDashJsDashPreview.Excel.Interfaces.PivotHierarchyCollectionData
import typings.officeDashJsDashPreview.Excel.Interfaces.PivotHierarchyCollectionLoadOptions
import typings.officeDashJsDashPreview.OfficeExtension.ClientObject
import typings.officeDashJsDashPreview.OfficeExtension.ClientResult
import typings.officeDashJsDashPreview.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the PivotHierarchies that are part of the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@JSGlobal("Excel.PivotHierarchyCollection")
@js.native
class PivotHierarchyCollection () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotHierarchyCollection: RequestContext = js.native
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotHierarchy] = js.native
  /**
    *
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  /**
    *
    * Gets a PivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotHierarchy to be retrieved.
    */
  def getItem(name: String): PivotHierarchy = js.native
  /**
    *
    * Gets a PivotHierarchy by name. If the PivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotHierarchy = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotHierarchyCollection = js.native
  def load(options: PivotHierarchyCollectionLoadOptions with CollectionLoadOptions): PivotHierarchyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotHierarchyCollection = js.native
  def load(propertyNames: String): PivotHierarchyCollection = js.native
  def load(propertyNames: js.Array[String]): PivotHierarchyCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotHierarchyCollectionData = js.native
}

