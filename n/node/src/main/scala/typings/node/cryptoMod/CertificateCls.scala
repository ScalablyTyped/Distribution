package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.NodeJS.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Certificate")
@js.native
class CertificateCls () extends Certificate {
  /* CompleteClass */
  override def exportChallenge(spkac: BinaryLike): Buffer = js.native
  /* CompleteClass */
  override def exportPublicKey(spkac: BinaryLike): Buffer = js.native
  /* CompleteClass */
  override def verifySpkac(spkac: ArrayBufferView): Boolean = js.native
}

