package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.FilterPivotHierarchyCollectionData
import typings.officeJs.Excel.Interfaces.FilterPivotHierarchyCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of FilterPivotHierarchy items associated with the PivotTable.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait FilterPivotHierarchyCollection
  extends StObject
     with ClientObject {
  
  /**
    * Adds the PivotHierarchy to the current axis. If the hierarchy is present elsewhere on the row, column,
    or filter axis, it will be removed from that location.
    *
    * [Api set: ExcelApi 1.8]
    */
  def add(pivotHierarchy: PivotHierarchy): FilterPivotHierarchy = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_FilterPivotHierarchyCollection: RequestContext = js.native
  
  /**
    * Gets the number of pivot hierarchies in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a FilterPivotHierarchy by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the FilterPivotHierarchy to be retrieved.
    */
  def getItem(name: String): FilterPivotHierarchy = js.native
  
  /**
    * Gets a FilterPivotHierarchy by name. If the FilterPivotHierarchy does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the FilterPivotHierarchy to be retrieved.
    */
  def getItemOrNullObject(name: String): FilterPivotHierarchy = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[FilterPivotHierarchy] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): FilterPivotHierarchyCollection = js.native
  def load(options: FilterPivotHierarchyCollectionLoadOptions & CollectionLoadOptions): FilterPivotHierarchyCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): FilterPivotHierarchyCollection = js.native
  def load(propertyNames: String): FilterPivotHierarchyCollection = js.native
  def load(propertyNames: js.Array[String]): FilterPivotHierarchyCollection = js.native
  
  /**
    * Removes the PivotHierarchy from the current axis.
    *
    * [Api set: ExcelApi 1.8]
    */
  def remove(filterPivotHierarchy: FilterPivotHierarchy): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.FilterPivotHierarchyCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.FilterPivotHierarchyCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): FilterPivotHierarchyCollectionData = js.native
}
