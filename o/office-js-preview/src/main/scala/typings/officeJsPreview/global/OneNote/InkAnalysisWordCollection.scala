package typings.officeJsPreview.global.OneNote

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of InkAnalysisWord objects.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkAnalysisWordCollection")
@js.native
class InkAnalysisWordCollection ()
  extends typings.officeJsPreview.OneNote.InkAnalysisWordCollection {
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

