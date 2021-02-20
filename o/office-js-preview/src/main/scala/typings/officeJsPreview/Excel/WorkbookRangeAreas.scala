package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.Interfaces.WorkbookRangeAreasData
import typings.officeJsPreview.Excel.Interfaces.WorkbookRangeAreasLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a collection of one or more rectangular ranges in multiple worksheets.
  *
  * [Api set: ExcelApi 1.12]
  */
@js.native
trait WorkbookRangeAreas extends ClientObject {
  
  /**
    *
    * Returns an array of address in A1-style. Address value will contain the worksheet name for each rectangular block of cells (e.g., "Sheet1!A1:B4, Sheet1!D1:D4"). Read-only.
    *
    * [Api set: ExcelApi 1.12]
    */
  val addresses: js.Array[String] = js.native
  
  /**
    *
    * Returns the `RangeAreasCollection` object. Each `RangeAreas` in the collection represent one or more rectangle ranges in one worksheet.
    *
    * [Api set: ExcelApi 1.12]
    */
  val areas: RangeAreasCollection = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorkbookRangeAreas: RequestContext = js.native
  
  /**
    * Returns the `RangeAreas` object based on worksheet id or name in the collection.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key The name or id of the worksheet.
    */
  def getRangeAreasBySheet(key: String): RangeAreas = js.native
  
  /**
    * Returns the RangeAreas object based on worksheet name or id in the collection. If the worksheet does not exist, will return a null object.
    *
    * [Api set: ExcelApi 1.12]
    *
    * @param key The name or id of the worksheet.
    */
  def getRangeAreasOrNullObjectBySheet(key: String): RangeAreas = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorkbookRangeAreas = js.native
  def load(options: WorkbookRangeAreasLoadOptions): WorkbookRangeAreas = js.native
  def load(propertyNamesAndPaths: Expand): WorkbookRangeAreas = js.native
  def load(propertyNames: String): WorkbookRangeAreas = js.native
  def load(propertyNames: js.Array[String]): WorkbookRangeAreas = js.native
  
  /**
    *
    * Returns ranges that comprise this object in a `RangeCollection` object.
    *
    * [Api set: ExcelApi 1.12]
    */
  val ranges: RangeCollection = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorkbookRangeAreas object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorkbookRangeAreasData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorkbookRangeAreasData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for `context.trackedObjects.add(thisObject)`. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): WorkbookRangeAreas = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for `context.trackedObjects.remove(thisObject)`. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): WorkbookRangeAreas = js.native
}
