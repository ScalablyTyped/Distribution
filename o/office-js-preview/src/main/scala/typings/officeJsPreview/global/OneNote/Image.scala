package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an Image. An Image can be a direct child of a PageContent object or a Paragraph object.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.Image")
@js.native
class Image ()
  extends typings.officeJsPreview.OneNote.Image {
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

