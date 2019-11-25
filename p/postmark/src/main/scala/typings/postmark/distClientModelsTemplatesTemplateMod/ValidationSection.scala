package typings.postmark.distClientModelsTemplatesTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSection extends js.Object {
  var ContentIsValid: Boolean
  var RenderedContent: String
  var ValidationErrors: js.Object
}

object ValidationSection {
  @scala.inline
  def apply(ContentIsValid: Boolean, RenderedContent: String, ValidationErrors: js.Object): ValidationSection = {
    val __obj = js.Dynamic.literal(ContentIsValid = ContentIsValid.asInstanceOf[js.Any], RenderedContent = RenderedContent.asInstanceOf[js.Any], ValidationErrors = ValidationErrors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationSection]
  }
}

