package typings
package passportDashAuth0Lib.passportDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraVerificationParams extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
}

object ExtraVerificationParams {
  @scala.inline
  def apply(
    audience: java.lang.String = null,
    connection: java.lang.String = null,
    prompt: java.lang.String = null
  ): ExtraVerificationParams = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    __obj.asInstanceOf[ExtraVerificationParams]
  }
}

