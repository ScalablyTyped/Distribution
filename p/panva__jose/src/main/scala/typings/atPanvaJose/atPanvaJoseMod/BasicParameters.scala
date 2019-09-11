package typings.atPanvaJose.atPanvaJoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicParameters extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var key_ops: js.UndefOr[js.Array[keyOperation]] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[typings.atPanvaJose.atPanvaJoseMod.use] = js.undefined
}

object BasicParameters {
  @scala.inline
  def apply(alg: String = null, key_ops: js.Array[keyOperation] = null, kid: String = null, use: use = null): BasicParameters = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (key_ops != null) __obj.updateDynamic("key_ops")(key_ops)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[BasicParameters]
  }
}

