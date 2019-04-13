package typings
package postmarkLib.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateValidationResult[T /* <: js.Object */] extends js.Object {
  var AllContentIsValid: scala.Boolean
  var HtmlBody: ValidationSet
  var Subject: ValidationSet
  var SuggestedTemplateModel: T
  var TextBody: ValidationSet
}

object TemplateValidationResult {
  @scala.inline
  def apply[T /* <: js.Object */](
    AllContentIsValid: scala.Boolean,
    HtmlBody: ValidationSet,
    Subject: ValidationSet,
    SuggestedTemplateModel: T,
    TextBody: ValidationSet
  ): TemplateValidationResult[T] = {
    val __obj = js.Dynamic.literal(AllContentIsValid = AllContentIsValid, HtmlBody = HtmlBody, Subject = Subject, SuggestedTemplateModel = SuggestedTemplateModel.asInstanceOf[js.Any], TextBody = TextBody)
  
    __obj.asInstanceOf[TemplateValidationResult[T]]
  }
}

