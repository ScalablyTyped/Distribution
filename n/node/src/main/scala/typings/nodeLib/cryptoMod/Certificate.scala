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
    exportChallenge: BinaryLike => nodeLib.Buffer,
    exportPublicKey: BinaryLike => nodeLib.Buffer,
    verifySpkac: Binary => scala.Boolean
  ): Certificate = {
    val __obj = js.Dynamic.literal(exportChallenge = js.Any.fromFunction1(exportChallenge), exportPublicKey = js.Any.fromFunction1(exportPublicKey), verifySpkac = js.Any.fromFunction1(verifySpkac))
  
    __obj.asInstanceOf[Certificate]
  }
}

