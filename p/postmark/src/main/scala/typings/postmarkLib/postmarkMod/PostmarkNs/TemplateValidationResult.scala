package typings
package postmarkLib.postmarkMod.PostmarkNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllContentIsValid")(AllContentIsValid)
    __obj.updateDynamic("HtmlBody")(HtmlBody)
    __obj.updateDynamic("Subject")(Subject)
    __obj.updateDynamic("SuggestedTemplateModel")(SuggestedTemplateModel.asInstanceOf[js.Any])
    __obj.updateDynamic("TextBody")(TextBody)
    __obj.asInstanceOf[TemplateValidationResult[T]]
  }
}

