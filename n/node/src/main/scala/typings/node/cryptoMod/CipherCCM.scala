package typings.node.cryptoMod

import typings.node.AnonPlaintextLength
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCM extends Cipher {
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer, options: AnonPlaintextLength): this.type = js.native
}

