package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the data connections that are part of the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DataConnectionCollection")
@js.native
open class DataConnectionCollection ()
  extends StObject
     with typings.officeJsPreview.Excel.DataConnectionCollection {
  
  /** The request context associated with the object */
  /* CompleteClass */
  var context: ClientRequestContext = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  /* CompleteClass */
  @JSName("context")
  var context_DataConnectionCollection: typings.officeJsPreview.Excel.RequestContext = js.native
  
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  var isNullObject: Boolean = js.native
  
  /**
    * Refreshes data connections in the collection, such as from a PivotTable to a Power BI dataset, or a Data Model to a table or range in the same workbook.
    Data connections unsupported by this method are: Power Query connections, data connections outside the original workbook (except Power BI connections), and connections to data protected by a firewall.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  /* CompleteClass */
  override def refreshAll(): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataConnectionCollection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataConnectionCollectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  /* CompleteClass */
  override def toJSON(): StringDictionary[String] = js.native
}
