package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.CollectionLoadOptions
import typings.officeJs.Excel.Interfaces.PageBreakCollectionData
import typings.officeJs.Excel.Interfaces.PageBreakCollectionLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.ClientResult
import typings.officeJs.OfficeExtension.LoadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageBreakCollection extends ClientObject {
  
  def add(pageBreakRange: String): PageBreak = js.native
  /**
    * Adds a page break before the top-left cell of the range specified.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param pageBreakRange The range immediately after the page break to be added.
    */
  def add(pageBreakRange: Range): PageBreak = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PageBreakCollection: RequestContext = js.native
  
  /**
    * Gets the number of page breaks in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def getCount(): ClientResult[Double] = js.native
  
  /**
    * Gets a page break object via the index.
    *
    * [Api set: ExcelApi 1.9]
    *
    * @param index Index of the page break.
    */
  def getItem(index: Double): PageBreak = js.native
  
  /** Gets the loaded child items in this collection. */
  val items: js.Array[PageBreak] = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): PageBreakCollection = js.native
  def load(options: PageBreakCollectionLoadOptions with CollectionLoadOptions): PageBreakCollection = js.native
  def load(propertyNamesAndPaths: LoadOption): PageBreakCollection = js.native
  def load(propertyNames: String): PageBreakCollection = js.native
  def load(propertyNames: js.Array[String]): PageBreakCollection = js.native
  
  /**
    * Resets all manual page breaks in the collection.
    *
    * [Api set: ExcelApi 1.9]
    */
  def removePageBreaks(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original `Excel.PageBreakCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PageBreakCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
    */
  def toJSON(): PageBreakCollectionData = js.native
}
