package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "KeyChain")
@js.native
class KeyChain ()
  extends ndnDashJsLib.keyDashChainMod.KeyChain {
  def this(pibLocator: java.lang.String, tpmLocator: java.lang.String) = this()
  def this(pibLocator: java.lang.String, tpmLocator: java.lang.String, allowReset: scala.Boolean) = this()
}

/* static members */
@JSImport("ndn-js", "KeyChain")
@js.native
object KeyChain extends js.Object {
  def getDefaultKeyParams(): ndnDashJsLib.keyDashChainMod.KeyParams = js.native
}

