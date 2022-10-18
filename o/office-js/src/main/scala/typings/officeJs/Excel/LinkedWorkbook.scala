package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.LinkedWorkbookData
import typings.officeJs.Excel.Interfaces.LinkedWorkbookLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a linked workbook.
  If a workbook has links pointing to data in another workbook, the second workbook is linked to the first workbook.
  In this scenario, the second workbook is called the "linked workbook".
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
@js.native
trait LinkedWorkbook
  extends StObject
     with ClientObject {
  
  /**
    * Makes a request to break the links pointing to the linked workbook.
    Links in formulas are replaced with the latest fetched data.
    The current `LinkedWorkbook` object is invalidated and removed from `LinkedWorkbookCollection`.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def breakLinks(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_LinkedWorkbook: RequestContext = js.native
  
  /**
    * The original URL pointing to the linked workbook. It is unique across all linked workbooks in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  val id: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): LinkedWorkbook = js.native
  def load(options: LinkedWorkbookLoadOptions): LinkedWorkbook = js.native
  def load(propertyNamesAndPaths: Expand): LinkedWorkbook = js.native
  def load(propertyNames: String): LinkedWorkbook = js.native
  def load(propertyNames: js.Array[String]): LinkedWorkbook = js.native
  
  /**
    * Makes a request to refresh the data retrieved from the linked workbook.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  def refresh(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.LinkedWorkbook` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.LinkedWorkbookData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): LinkedWorkbookData = js.native
}
