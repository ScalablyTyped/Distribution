package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var required: js.UndefOr[Hint] = js.undefined
}

object Required {
  @scala.inline
  def apply(required: Hint = null): Required = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

