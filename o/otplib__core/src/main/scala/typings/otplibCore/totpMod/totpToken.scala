package typings.otplibCore.totpMod

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@otplib/core/totp", "totpToken")
@js.native
object totpToken extends js.Object {
  def apply[T /* <: TOTPOptions_[_] */](secret: SecretKey, options: T): String = js.native
}

