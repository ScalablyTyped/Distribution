package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.QueryData
import typings.officeJs.Excel.Interfaces.QueryLoadOptions
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.ConnectionOnly
import typings.officeJs.officeJsStrings.FailedDownload
import typings.officeJs.officeJsStrings.FailedLoadToDataModel
import typings.officeJs.officeJsStrings.FailedLoadToWorksheet
import typings.officeJs.officeJsStrings.FailedToCompleteDownload
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.PivotChart
import typings.officeJs.officeJsStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Power Query query.
  *
  * @remarks
  * [Api set: ExcelApi 1.14]
  */
@js.native
trait Query
  extends StObject
     with ClientObject {
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Query: RequestContext = js.native
  
  /**
    * Gets the query error message from when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val error: QueryError | Unknown_ | None | FailedLoadToWorksheet | FailedLoadToDataModel | FailedDownload | FailedToCompleteDownload = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Query = js.native
  def load(options: QueryLoadOptions): Query = js.native
  def load(propertyNamesAndPaths: Expand): Query = js.native
  def load(propertyNames: String): Query = js.native
  def load(propertyNames: js.Array[String]): Query = js.native
  
  /**
    * Gets the query loaded to object type.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val loadedTo: LoadToType | ConnectionOnly | typings.officeJs.officeJsStrings.Table | typings.officeJs.officeJsStrings.PivotTable | PivotChart = js.native
  
  /**
    * Specifies if the query loaded to the data model.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val loadedToDataModel: Boolean = js.native
  
  /**
    * Gets the name of the query.
    Query names cannot contain periods or quotation marks.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val name: String = js.native
  
  /**
    * Gets the date and time when the query was last refreshed.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val refreshDate: js.Date = js.native
  
  /**
    * Gets the number of rows that were loaded when the query was last refreshed.
    If last refresh has errors the value will be -1.
    *
    * @remarks
    * [Api set: ExcelApi 1.14]
    */
  val rowsLoadedCount: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Query object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.QueryData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): QueryData = js.native
}
