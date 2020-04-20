package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateValidation extends js.Object {
  var AllContentIsValid: Boolean
  var HtmlBody: ValidationSection
  var Subject: ValidationSection
  var SuggestedTemplateModel: js.Object
  var TextBody: ValidationSection
}

object TemplateValidation {
  @scala.inline
  def apply(
    AllContentIsValid: Boolean,
    HtmlBody: ValidationSection,
    Subject: ValidationSection,
    SuggestedTemplateModel: js.Object,
    TextBody: ValidationSection
  ): TemplateValidation = {
    val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid.asInstanceOf[js.Any], HtmlBody = HtmlBody.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], SuggestedTemplateModel = SuggestedTemplateModel.asInstanceOf[js.Any], TextBody = TextBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateValidation]
  }
}

