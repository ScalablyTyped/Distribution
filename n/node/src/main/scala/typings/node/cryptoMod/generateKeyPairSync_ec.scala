package typings.node.cryptoMod

import typings.node.nodeStrings.ec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync_ec extends js.Object {
  def apply(`type`: ec, options: ECKeyPairKeyObjectOptions): KeyPairKeyObjectResult = js.native
}

