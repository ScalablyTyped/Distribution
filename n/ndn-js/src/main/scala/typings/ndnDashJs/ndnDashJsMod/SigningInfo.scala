package typings.ndnDashJs.ndnDashJsMod

import typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
class SigningInfo ()
  extends typings.ndnDashJs.keyDashChainMod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typings.ndnDashJs.keyDashChainMod.PibIdentity) = this()
  def this(arg: typings.ndnDashJs.keyDashChainMod.PibKey) = this()
  def this(arg: typings.ndnDashJs.keyDashChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typings.ndnDashJs.nameMod.Name) = this()
}

