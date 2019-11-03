package typings.postmark.distClientModelsTemplatesTemplateMod

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
    val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid, HtmlBody = HtmlBody, Subject = Subject, SuggestedTemplateModel = SuggestedTemplateModel, TextBody = TextBody)
  
    __obj.asInstanceOf[TemplateValidation]
  }
}

