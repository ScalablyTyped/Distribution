package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Regexp extends js.Object {
  var regexp: js.UndefOr[MessageSummary] = js.undefined
  var required: js.UndefOr[Hint] = js.undefined
}

object Regexp {
  @scala.inline
  def apply(regexp: MessageSummary = null, required: Hint = null): Regexp = {
    val __obj = js.Dynamic.literal()
    if (regexp != null) __obj.updateDynamic("regexp")(regexp.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regexp]
  }
}

