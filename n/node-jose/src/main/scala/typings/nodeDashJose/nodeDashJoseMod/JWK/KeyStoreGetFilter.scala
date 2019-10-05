package typings.nodeDashJose.nodeDashJoseMod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyStoreGetFilter extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var kty: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[KeyUse] = js.undefined
}

object KeyStoreGetFilter {
  @scala.inline
  def apply(alg: String = null, kty: String = null, use: KeyUse = null): KeyStoreGetFilter = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (kty != null) __obj.updateDynamic("kty")(kty)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[KeyStoreGetFilter]
  }
}

