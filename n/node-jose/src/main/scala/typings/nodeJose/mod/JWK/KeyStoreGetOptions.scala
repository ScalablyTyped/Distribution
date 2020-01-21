package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyStoreGetOptions extends KeyStoreGetFilter {
  var kid: String
}

object KeyStoreGetOptions {
  @scala.inline
  def apply(kid: String, alg: String = null, kty: String = null, use: KeyUse = null): KeyStoreGetOptions = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStoreGetOptions]
  }
}

