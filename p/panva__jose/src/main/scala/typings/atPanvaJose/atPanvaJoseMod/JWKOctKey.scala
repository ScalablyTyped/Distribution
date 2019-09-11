package typings.atPanvaJose.atPanvaJoseMod

import typings.atPanvaJose.atPanvaJoseStrings.oct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWKOctKey
  extends BasicParameters
     with JSONWebKey {
  var k: js.UndefOr[String] = js.undefined
  // no x5c
  var kty: oct
}

object JWKOctKey {
  @scala.inline
  def apply(
    kty: oct,
    alg: String = null,
    k: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null
  ): JWKOctKey = {
    val __obj = js.Dynamic.literal(kty = kty)
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (k != null) __obj.updateDynamic("k")(k)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[JWKOctKey]
  }
}

