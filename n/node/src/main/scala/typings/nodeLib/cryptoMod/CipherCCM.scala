package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CipherCCM extends Cipher {
  def getAuthTag(): nodeLib.Buffer = js.native
  def setAAD(buffer: nodeLib.Buffer, options: nodeLib.Anon_PlaintextLength): this.type = js.native
}

