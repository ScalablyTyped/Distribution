package typings.ndnDashJs.keyDashChainMod

import typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType
import typings.ndnDashJs.nameMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/key-chain", "SigningInfo")
@js.native
class SigningInfo () extends js.Object {
  def this(arg: String) = this()
  def this(arg: PibIdentity) = this()
  def this(arg: PibKey) = this()
  def this(arg: SigningInfo) = this()
  def this(signerType: SignerType, signerName: Name) = this()
  def getSignerName(): Name = js.native
  def getSignerType(): SignerType = js.native
}

