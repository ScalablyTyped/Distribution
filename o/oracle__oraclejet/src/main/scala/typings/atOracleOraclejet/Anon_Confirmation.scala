package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Confirmation extends js.Object {
  var confirmation: js.UndefOr[String] = js.undefined
  var error: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object Anon_Confirmation {
  @scala.inline
  def apply(confirmation: String = null, error: String = null, info: String = null, warning: String = null): Anon_Confirmation = {
    val __obj = js.Dynamic.literal()
    if (confirmation != null) __obj.updateDynamic("confirmation")(confirmation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Confirmation]
  }
}

