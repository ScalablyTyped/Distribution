package typings.officeJsPreview.Excel

import typings.officeJsPreview.AnonExpand
import typings.officeJsPreview.Excel.Interfaces.WorksheetCustomPropertyData
import typings.officeJsPreview.Excel.Interfaces.WorksheetCustomPropertyLoadOptions
import typings.officeJsPreview.OfficeExtension.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a worksheet-level custom property.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Excel.WorksheetCustomProperty")
@js.native
class WorksheetCustomProperty () extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_WorksheetCustomProperty: RequestContext = js.native
  /**
    *
    * Gets the key of the custom property. Read only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val key: String = js.native
  /**
    *
    * Gets the value of the custom property. Read only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val value: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): WorksheetCustomProperty = js.native
  def load(options: WorksheetCustomPropertyLoadOptions): WorksheetCustomProperty = js.native
  def load(propertyNamesAndPaths: AnonExpand): WorksheetCustomProperty = js.native
  def load(propertyNames: String): WorksheetCustomProperty = js.native
  def load(propertyNames: js.Array[String]): WorksheetCustomProperty = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.WorksheetCustomProperty object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.WorksheetCustomPropertyData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): WorksheetCustomPropertyData = js.native
}

