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

