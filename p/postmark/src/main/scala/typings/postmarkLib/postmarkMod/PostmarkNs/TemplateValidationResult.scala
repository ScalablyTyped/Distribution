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

