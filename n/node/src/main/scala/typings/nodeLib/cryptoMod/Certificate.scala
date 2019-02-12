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

