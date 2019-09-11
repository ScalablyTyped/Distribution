package typings.atPanvaJose.atPanvaJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyParameters extends BasicParameters {
  var x5c: js.UndefOr[js.Array[String]] = js.undefined
  var x5t: js.UndefOr[String] = js.undefined
  var `x5t#S256`: js.UndefOr[String] = js.undefined
}

object KeyParameters {
  @scala.inline
  def apply(
    alg: String = null,
    key_ops: js.Array[keyOperation] = null,
    kid: String = null,
    use: use = null,
    x5c: js.Array[String] = null,
    x5t: String = null,
    `x5t#S256`: String = null
  ): KeyParameters = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (use != null) __obj.updateDynamic("use")(use)
    if (x5c != null) __obj.updateDynamic("x5c")(x5c)
    if (x5t != null) __obj.updateDynamic("x5t")(x5t)
    if (`x5t#S256` != null) __obj.updateDynamic("x5t#S256")(`x5t#S256`)
    __obj.asInstanceOf[KeyParameters]
  }
}

