package typings.ndnDashJs.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfoNs extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType.CERT with Double = js.native
    /* 1 */ val ID: typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType.ID with Double = js.native
    /* 2 */ val KEY: typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType.KEY with Double = js.native
    /* 0 */ val NULL: typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType.NULL with Double = js.native
    /* 4 */ val SHA256: typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType.SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnDashJs.keyDashChainMod.SigningInfoNs.SignerType with Double] = js.native
  }
  
}

