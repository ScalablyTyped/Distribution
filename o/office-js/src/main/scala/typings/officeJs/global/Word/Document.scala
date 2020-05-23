package typings.officeJs.global.Word

import typings.officeJs.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * The Document object is the top level object. A Document object contains one or more sections, content controls, and the body that contains the contents of the document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Document")
@js.native
class Document ()
  extends typings.officeJs.Word.Document {
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

