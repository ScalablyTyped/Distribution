package typings
package ndnDashJsLib.keyDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/key-chain", "SigningInfo")
@js.native
class SigningInfo () extends js.Object {
  def this(arg: java.lang.String) = this()
  def this(arg: PibIdentity) = this()
  def this(arg: PibKey) = this()
  def this(arg: SigningInfo) = this()
  def this(signerType: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType, signerName: ndnDashJsLib.nameMod.Name) = this()
  def getSignerName(): ndnDashJsLib.nameMod.Name = js.native
  def getSignerType(): ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType = js.native
}

