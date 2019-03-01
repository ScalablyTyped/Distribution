package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  def exportChallenge(spkac: BinaryLike): nodeLib.Buffer
  def exportPublicKey(spkac: BinaryLike): nodeLib.Buffer
  def verifySpkac(spkac: Binary): scala.Boolean
}

object Certificate {
  @scala.inline
  def apply(
    exportChallenge: js.Function1[BinaryLike, nodeLib.Buffer],
    exportPublicKey: js.Function1[BinaryLike, nodeLib.Buffer],
    verifySpkac: js.Function1[Binary, scala.Boolean]
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exportChallenge")(exportChallenge)
    __obj.updateDynamic("exportPublicKey")(exportPublicKey)
    __obj.updateDynamic("verifySpkac")(verifySpkac)
    __obj.asInstanceOf[Certificate]
  }
}

