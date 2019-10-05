package typings.nodeDashJose.nodeDashJoseMod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyStoreGetOptions extends KeyStoreGetFilter {
  var kid: String
}

object KeyStoreGetOptions {
  @scala.inline
  def apply(kid: String, alg: String = null, kty: String = null, use: KeyUse = null): KeyStoreGetOptions = {
    val __obj = js.Dynamic.literal(kid = kid)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (kty != null) __obj.updateDynamic("kty")(kty)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[KeyStoreGetOptions]
  }
}

