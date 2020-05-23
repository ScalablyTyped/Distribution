package typings.nodeJose.anon

import typings.nodeJose.mod.JWK.KeyUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<node-jose.node-jose.JWK.KeyStoreGetOptions> */
trait PartialKeyStoreGetOptions extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var kty: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[KeyUse] = js.undefined
}

object PartialKeyStoreGetOptions {
  @scala.inline
  def apply(alg: String = null, kid: String = null, kty: String = null, use: KeyUse = null): PartialKeyStoreGetOptions = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialKeyStoreGetOptions]
  }
}

