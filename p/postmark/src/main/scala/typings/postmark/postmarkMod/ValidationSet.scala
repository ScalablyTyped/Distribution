package typings.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSet extends js.Object {
  var ContentIsValid: Boolean
  var RenderedContent: String
  var ValidationErrors: js.Array[ValidationError]
}

object ValidationSet {
  @scala.inline
  def apply(ContentIsValid: Boolean, RenderedContent: String, ValidationErrors: js.Array[ValidationError]): ValidationSet = {
    val __obj = js.Dynamic.literal(ContentIsValid = ContentIsValid, RenderedContent = RenderedContent, ValidationErrors = ValidationErrors)
  
    __obj.asInstanceOf[ValidationSet]
  }
}

