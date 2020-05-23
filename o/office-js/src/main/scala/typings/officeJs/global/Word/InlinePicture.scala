package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an inline picture.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.InlinePicture")
@js.native
class InlinePicture ()
  extends typings.officeJs.Word.InlinePicture {
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

