package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Regexp extends js.Object {
  var regexp: js.UndefOr[Anon_MessageDetail] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
}

object Anon_Regexp {
  @scala.inline
  def apply(regexp: Anon_MessageDetail = null, required: Anon_Hint = null): Anon_Regexp = {
    val __obj = js.Dynamic.literal()
    if (regexp != null) __obj.updateDynamic("regexp")(regexp)
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Regexp]
  }
}

