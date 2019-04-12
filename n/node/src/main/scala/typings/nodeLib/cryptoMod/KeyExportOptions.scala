package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyExportOptions[T /* <: KeyFormat */] extends js.Object {
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var format: T
  var passphrase: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1
}

object KeyExportOptions {
  @scala.inline
  def apply[T /* <: KeyFormat */](
    format: T,
    `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1,
    cipher: java.lang.String = null,
    passphrase: java.lang.String | nodeLib.Buffer = null
  ): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
}

