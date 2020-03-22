package typings.otplibCore.totpMod

import typings.otplibCore.utilsMod.SecretKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@otplib/core/totp", "totpCheckByEpoch")
@js.native
object totpCheckByEpoch extends js.Object {
  def apply[T /* <: TOTPOptions_[String] */](epochs: js.Array[Double], token: String, secret: SecretKey, options: T): Double | Null = js.native
}

