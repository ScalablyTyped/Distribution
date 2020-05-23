package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * A container for the visible content on a page. A Paragraph can contain any one ParagraphType type of content.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Paragraph")
@js.native
class Paragraph ()
  extends typings.officeJs.OneNote.Paragraph {
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

