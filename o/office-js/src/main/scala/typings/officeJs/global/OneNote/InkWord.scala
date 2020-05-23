package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the ink in a word in a paragraph.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkWord")
@js.native
class InkWord ()
  extends typings.officeJs.OneNote.InkWord {
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

