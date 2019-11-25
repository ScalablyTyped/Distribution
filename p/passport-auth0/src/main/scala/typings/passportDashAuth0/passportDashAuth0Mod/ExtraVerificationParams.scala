package typings.passportDashAuth0.passportDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraVerificationParams extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var connection: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
}

object ExtraVerificationParams {
  @scala.inline
  def apply(audience: String = null, connection: String = null, prompt: String = null): ExtraVerificationParams = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (prompt != null) __obj.updateDynamic("prompt")(prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtraVerificationParams]
  }
}

