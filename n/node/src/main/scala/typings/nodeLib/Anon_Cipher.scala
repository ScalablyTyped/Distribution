package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cipher extends js.Object {
  var cipher: js.UndefOr[java.lang.String] = js.undefined
  var format: nodeLib.cryptoMod.KeyFormat
  var passphrase: js.UndefOr[java.lang.String | Buffer] = js.undefined
  var `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1
}

object Anon_Cipher {
  @scala.inline
  def apply(
    format: nodeLib.cryptoMod.KeyFormat,
    `type`: nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1,
    cipher: java.lang.String = null,
    passphrase: java.lang.String | Buffer = null
  ): Anon_Cipher = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(format)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cipher]
  }
}

