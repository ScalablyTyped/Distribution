package typings
package postmarkLib.postmarkMod.PostmarkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSet extends js.Object {
  var ContentIsValid: scala.Boolean
  var RenderedContent: java.lang.String
  var ValidationErrors: js.Array[ValidationError]
}

object ValidationSet {
  @scala.inline
  def apply(
    ContentIsValid: scala.Boolean,
    RenderedContent: java.lang.String,
    ValidationErrors: js.Array[ValidationError]
  ): ValidationSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContentIsValid")(ContentIsValid)
    __obj.updateDynamic("RenderedContent")(RenderedContent)
    __obj.updateDynamic("ValidationErrors")(ValidationErrors)
    __obj.asInstanceOf[ValidationSet]
  }
}

