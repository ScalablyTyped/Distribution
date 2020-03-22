package typings.otplibCore.totpMod

import typings.otplibCore.utilsMod.KeyEncodings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@otplib/core/totp", "totpPadSecret")
@js.native
object totpPadSecret extends js.Object {
  def apply(secret: String, encoding: KeyEncodings, minLength: Double): String = js.native
}

