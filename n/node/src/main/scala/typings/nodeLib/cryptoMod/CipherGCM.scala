package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherGCM extends Cipher {
  def getAuthTag(): nodeLib.Buffer = js.native
  def setAAD(buffer: nodeLib.Buffer): this.type = js.native
  def setAAD(buffer: nodeLib.Buffer, options: nodeLib.Anon_PlaintextLength): this.type = js.native
}

