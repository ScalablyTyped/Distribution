package typings.pkijs.mod

import typings.std.Crypto_
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "setEngine")
@js.native
object setEngine extends js.Object {
  def apply(name: String, crypto: Crypto_, subtle: SubtleCrypto): Unit = js.native
}

