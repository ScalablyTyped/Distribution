package typings.otplibCore.totpMod

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@otplib/core/totp", "totpCheckWithWindow")
@js.native
object totpCheckWithWindow extends js.Object {
  def apply[T /* <: TOTPOptions_[String] */](token: String, secret: SecretKey, options: T): Double | Null = js.native
}

