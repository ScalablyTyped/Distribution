package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKeyInput extends js.Object {
  var format: js.UndefOr[KeyFormat] = js.undefined
  var key: java.lang.String | nodeLib.Buffer
  var `type`: js.UndefOr[nodeLib.nodeLibStrings.pkcs1 | nodeLib.nodeLibStrings.spki] = js.undefined
}

