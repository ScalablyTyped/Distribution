package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signature extends js.Object {
  var keyid: Keyid
  var valid: scala.Boolean
  var verified: js.UndefOr[scala.Boolean] = js.undefined
}

object Signature {
  @scala.inline
  def apply(keyid: Keyid, valid: scala.Boolean, verified: js.UndefOr[scala.Boolean] = js.undefined): Signature = {
    val __obj = js.Dynamic.literal(keyid = keyid, valid = valid)
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified)
    __obj.asInstanceOf[Signature]
  }
}

