package typings.node.cryptoMod

import typings.node.Anon_PlaintextLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecipherCCM extends Decipher {
  def setAAD(buffer: Binary, options: Anon_PlaintextLength): this.type = js.native
  def setAuthTag(buffer: Binary): this.type = js.native
}

