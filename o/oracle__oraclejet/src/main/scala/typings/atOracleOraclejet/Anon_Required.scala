package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Required extends js.Object {
  var required: js.UndefOr[Anon_Hint] = js.undefined
}

object Anon_Required {
  @scala.inline
  def apply(required: Anon_Hint = null): Anon_Required = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[Anon_Required]
  }
}

