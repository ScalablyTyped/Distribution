package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a region on a page that contains top-level content types such as Outline or Image. A PageContent object can be assigned an XY position.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.PageContent")
@js.native
class PageContent ()
  extends typings.officeJsPreview.OneNote.PageContent {
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

