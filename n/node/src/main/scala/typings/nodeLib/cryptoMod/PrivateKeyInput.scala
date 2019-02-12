package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: java.lang.String | nodeLib.Buffer
  var passphrase: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var `type`: js.UndefOr[
    nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.pkcs8 | nodeLib.nodeLibStrings.sec1
  ] = js.undefined
}

