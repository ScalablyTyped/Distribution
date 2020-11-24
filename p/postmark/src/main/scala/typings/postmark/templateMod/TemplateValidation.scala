package typings.postmark.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateValidation extends js.Object {
  
  var AllContentIsValid: Boolean = js.native
  
  var HtmlBody: ValidationSection = js.native
  
  var Subject: ValidationSection = js.native
  
  var SuggestedTemplateModel: js.Object = js.native
  
  var TextBody: ValidationSection = js.native
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
  
  @scala.inline
  implicit class TemplateValidationOps[Self <: TemplateValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllContentIsValid(value: Boolean): Self = this.set("AllContentIsValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBody(value: ValidationSection): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: ValidationSection): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTemplateModel(value: js.Object): Self = this.set("SuggestedTemplateModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBody(value: ValidationSection): Self = this.set("TextBody", value.asInstanceOf[js.Any])
  }
}
