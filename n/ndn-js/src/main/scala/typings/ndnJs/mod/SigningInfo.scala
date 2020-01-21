package typings.ndnJs.mod

import typings.ndnJs.keyChainMod.SigningInfo.SignerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
class SigningInfo ()
  extends typings.ndnJs.keyChainMod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typings.ndnJs.keyChainMod.PibIdentity) = this()
  def this(arg: typings.ndnJs.keyChainMod.PibKey) = this()
  def this(arg: typings.ndnJs.keyChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typings.ndnJs.nameMod.Name) = this()
}

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfo extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: typings.ndnJs.keyChainMod.SigningInfo.SignerType.CERT with Double = js.native
    /* 1 */ val ID: typings.ndnJs.keyChainMod.SigningInfo.SignerType.ID with Double = js.native
    /* 2 */ val KEY: typings.ndnJs.keyChainMod.SigningInfo.SignerType.KEY with Double = js.native
    /* 0 */ val NULL: typings.ndnJs.keyChainMod.SigningInfo.SignerType.NULL with Double = js.native
    /* 4 */ val SHA256: typings.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnJs.keyChainMod.SigningInfo.SignerType with Double] = js.native
  }
  
}

