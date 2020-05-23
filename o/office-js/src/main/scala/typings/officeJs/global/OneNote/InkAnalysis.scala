package typings.officeJs.global.OneNote

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents ink analysis data for a given set of ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@JSGlobal("OneNote.InkAnalysis")
@js.native
class InkAnalysis ()
  extends typings.officeJs.OneNote.InkAnalysis {
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

