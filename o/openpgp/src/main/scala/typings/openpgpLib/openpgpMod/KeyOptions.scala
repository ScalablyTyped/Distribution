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

