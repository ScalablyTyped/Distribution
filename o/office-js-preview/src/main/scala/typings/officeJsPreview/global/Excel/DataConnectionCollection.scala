package typings.officeJsPreview.global.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the Data Connections that are part of the workbook or worksheet.
  *
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.DataConnectionCollection")
@js.native
class DataConnectionCollection ()
  extends typings.officeJsPreview.Excel.DataConnectionCollection {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  /* CompleteClass */
  @JSName("context")
  override var context_DataConnectionCollection: typings.officeJsPreview.Excel.RequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
  /**
    * Refreshes all the Data Connections in the collection.
    *
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

