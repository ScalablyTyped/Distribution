package typings.node.cryptoMod

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  def exportChallenge(spkac: BinaryLike): Buffer
  def exportPublicKey(spkac: BinaryLike): Buffer
  def verifySpkac(spkac: ArrayBufferView): Boolean
}

@JSImport("crypto", "Certificate")
@js.native
object Certificate extends Instantiable0[Certificate] {
  def apply(): Certificate = js.native
}

