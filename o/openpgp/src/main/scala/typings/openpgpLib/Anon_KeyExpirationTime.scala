package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyExpirationTime extends js.Object {
  var keyExpirationTime: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var privateKey: openpgpLib.openpgpMod.keyNs.Key
  var revocationCertificate: js.UndefOr[scala.Boolean] = js.undefined
  var userIds: js.UndefOr[js.Array[openpgpLib.openpgpMod.UserId]] = js.undefined
}

object Anon_KeyExpirationTime {
  @scala.inline
  def apply(
    privateKey: openpgpLib.openpgpMod.keyNs.Key,
    keyExpirationTime: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    revocationCertificate: js.UndefOr[scala.Boolean] = js.undefined,
    userIds: js.Array[openpgpLib.openpgpMod.UserId] = null
  ): Anon_KeyExpirationTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    if (keyExpirationTime != null) __obj.updateDynamic("keyExpirationTime")(keyExpirationTime.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (!js.isUndefined(revocationCertificate)) __obj.updateDynamic("revocationCertificate")(revocationCertificate)
    if (userIds != null) __obj.updateDynamic("userIds")(userIds)
    __obj.asInstanceOf[Anon_KeyExpirationTime]
  }
}

