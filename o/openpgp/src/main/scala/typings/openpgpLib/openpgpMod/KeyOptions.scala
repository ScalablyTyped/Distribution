package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyOptions extends js.Object {
  var curve: js.UndefOr[java.lang.String] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var keyExpirationTime: js.UndefOr[scala.Double] = js.undefined
  var numBits: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var subkeys: js.UndefOr[js.Array[KeyOptions]] = js.undefined
  var userIds: js.UndefOr[js.Array[UserId]] = js.undefined
}

object KeyOptions {
  @scala.inline
  def apply(
    curve: java.lang.String = null,
    date: stdLib.Date = null,
    keyExpirationTime: scala.Int | scala.Double = null,
    numBits: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    subkeys: js.Array[KeyOptions] = null,
    userIds: js.Array[UserId] = null
  ): KeyOptions = {
    val __obj = js.Dynamic.literal()
    if (curve != null) __obj.updateDynamic("curve")(curve)
    if (date != null) __obj.updateDynamic("date")(date)
    if (keyExpirationTime != null) __obj.updateDynamic("keyExpirationTime")(keyExpirationTime.asInstanceOf[js.Any])
    if (numBits != null) __obj.updateDynamic("numBits")(numBits.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (subkeys != null) __obj.updateDynamic("subkeys")(subkeys)
    if (userIds != null) __obj.updateDynamic("userIds")(userIds)
    __obj.asInstanceOf[KeyOptions]
  }
}

