package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.PivotFieldCollectionData
import typings.officeJs.Excel.Interfaces.PivotFieldCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of all the PivotFields that are part of a PivotTable's hierarchy.
  *
  * [Api set: ExcelApi 1.8]
  */
@js.native
trait PivotFieldCollection extends ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotFieldCollection: RequestContext = js.native
  
  /**
    * Gets the number of pivot fields in the collection.
    *
    * [Api set: ExcelApi 1.8]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a PivotField by its name or id.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotField to be retrieved.
    */
  def getItem(name: String): PivotField = js.native
  
  /**
    * Gets a PivotField by name. If the PivotField does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.8]
    *
    * @param name Name of the PivotField to be retrieved.
    */
  def getItemOrNullObject(name: String): PivotField = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PivotField] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PivotFieldCollection = js.native
  def load(options: PivotFieldCollectionLoadOptions with CollectionLoadOptions): PivotFieldCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PivotFieldCollection = js.native
  def load(propertyNames: String): PivotFieldCollection = js.native
  def load(propertyNames: js.Array[String]): PivotFieldCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PivotFieldCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotFieldCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PivotFieldCollectionData = js.native
}
