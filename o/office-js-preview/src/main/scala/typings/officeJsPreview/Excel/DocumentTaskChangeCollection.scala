package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.CollectionLoadOptions
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskChangeCollectionData
import typings.officeJsPreview.Excel.Interfaces.DocumentTaskChangeCollectionLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.ClientResult
import typings.officeJsPreview.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of change records for a task.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait DocumentTaskChangeCollection
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentTaskChangeCollection: RequestContext = js.native
  
  /**
    * Gets the number of change records in the collection for the task.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a task change record by using its index in the collection.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param index The records are stored in chronological order from when the changes were recorded by Excel and are not necessarily ordered by `CreatedDateTime`. The `create` record is always at index 0.
    * @returns The change record with the given index.
    */
  def getItemAt(index: Double): DocumentTaskChange = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[DocumentTaskChange] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentTaskChangeCollection = js.native
  def load(options: DocumentTaskChangeCollectionLoadOptions & CollectionLoadOptions): DocumentTaskChangeCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): DocumentTaskChangeCollection = js.native
  def load(propertyNames: String): DocumentTaskChangeCollection = js.native
  def load(propertyNames: js.Array[String]): DocumentTaskChangeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.DocumentTaskChangeCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DocumentTaskChangeCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): DocumentTaskChangeCollectionData = js.native
}
