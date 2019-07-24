package typings
package nodemailerLib.libSmtpDashConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomAuthenticationResponse extends js.Object {
  var code: js.UndefOr[scala.Double] = js.undefined
  var command: java.lang.String
  var response: java.lang.String
  var status: scala.Double
  var text: java.lang.String
}

object CustomAuthenticationResponse {
  @scala.inline
  def apply(
    command: java.lang.String,
    response: java.lang.String,
    status: scala.Double,
    text: java.lang.String,
    code: scala.Int | scala.Double = null
  ): CustomAuthenticationResponse = {
    val __obj = js.Dynamic.literal(command = command, response = response, status = status, text = text)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthenticationResponse]
  }
}

