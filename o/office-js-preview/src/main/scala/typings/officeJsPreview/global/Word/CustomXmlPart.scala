package typings.officeJsPreview.global.Word

import typings.officeJsPreview.OfficeExtension.ClientRequestContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a custom XML part.
  *
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@JSGlobal("Word.CustomXmlPart")
@js.native
class CustomXmlPart ()
  extends typings.officeJsPreview.Word.CustomXmlPart {
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

