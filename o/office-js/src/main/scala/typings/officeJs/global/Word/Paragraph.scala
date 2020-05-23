package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a single paragraph in a selection, range, content control, or document body.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Paragraph")
@js.native
class Paragraph ()
  extends typings.officeJs.Word.Paragraph {
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

