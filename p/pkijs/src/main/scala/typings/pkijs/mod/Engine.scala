package typings.pkijs.mod

import typings.std.Crypto_
import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var crypto: Crypto_
  var name: String
  var subtle: SubtleCrypto
}

object Engine {
  @scala.inline
  def apply(crypto: Crypto_, name: String, subtle: SubtleCrypto): Engine = {
    val __obj = js.Dynamic.literal(crypto = crypto.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Engine]
  }
}

