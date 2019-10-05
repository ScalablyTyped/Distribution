package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "createPrivateKey")
@js.native
object createPrivateKey extends js.Object {
  def apply(key: java.lang.String): KeyObject = js.native
  def apply(key: Buffer): KeyObject = js.native
  def apply(key: PrivateKeyInput): KeyObject = js.native
}

