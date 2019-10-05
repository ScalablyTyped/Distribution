package typings.ndnDashJs.ndnDashJsMod

import typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType
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

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfo extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.CERT with Double = js.native
    /* 1 */ val ID: typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.ID with Double = js.native
    /* 2 */ val KEY: typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.KEY with Double = js.native
    /* 0 */ val NULL: typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.NULL with Double = js.native
    /* 4 */ val SHA256: typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType.SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnDashJs.keyDashChainMod.SigningInfo.SignerType with Double] = js.native
  }
  
}

