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

@JSImport("crypto", "Certificate")
@js.native
class CertificateCls () extends Certificate {
  /* CompleteClass */
  override def exportChallenge(spkac: BinaryLike): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def exportPublicKey(spkac: BinaryLike): nodeLib.Buffer = js.native
  /* CompleteClass */
  override def verifySpkac(spkac: Binary): scala.Boolean = js.native
}

@JSImport("crypto", "Certificate")
@js.native
object Certificate
  extends org.scalablytyped.runtime.Instantiable0[Certificate] {
  def apply(): nodeLib.cryptoMod.Certificate = js.native
}

