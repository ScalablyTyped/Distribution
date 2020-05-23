package typings.officeJs.Excel

import org.scalablytyped.runtime.StringDictionary
import typings.officeJs.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of all the Data Connections that are part of the workbook or worksheet.
  *
  * [Api set: ExcelApi 1.7]
  */
trait DataConnectionCollection extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DataConnectionCollection: RequestContext
  /**
    * Refreshes all the Data Connections in the collection.
    *
    * [Api set: ExcelApi 1.7]
    */
  def refreshAll(): Unit
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DataConnectionCollection object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DataConnectionCollectionData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StringDictionary[String]
}

object DataConnectionCollection {
  @scala.inline
  def apply(
    context: RequestContext,
    isNullObject: Boolean,
    refreshAll: () => Unit,
    toJSON: () => StringDictionary[String]
  ): DataConnectionCollection = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], isNullObject = isNullObject.asInstanceOf[js.Any], refreshAll = js.Any.fromFunction0(refreshAll), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[DataConnectionCollection]
  }
}

