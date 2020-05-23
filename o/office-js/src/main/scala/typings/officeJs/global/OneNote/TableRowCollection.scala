package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of TableRow objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.TableRowCollection")
@js.native
class TableRowCollection ()
  extends typings.officeJs.OneNote.TableRowCollection {
  /** The request context associated with the object */
  /* CompleteClass */
  override var context: ClientRequestContext = js.native
  /**
    *  Returns a boolean value for whether the corresponding object is a null object. You must call `context.sync()` before reading the 
    * isNullObject property.
    */
  /* CompleteClass */
  override var isNullObject: Boolean = js.native
}

