package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "SigningInfo")
@js.native
object SigningInfoNs extends js.Object {
  @js.native
  object SignerType extends js.Object {
    /* 3 */ val CERT: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType.CERT with scala.Double = js.native
    /* 1 */ val ID: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType.ID with scala.Double = js.native
    /* 2 */ val KEY: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType.KEY with scala.Double = js.native
    /* 0 */ val NULL: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType.NULL with scala.Double = js.native
    /* 4 */ val SHA256: ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType.SHA256 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType with scala.Double] = js.native
  }
  
}

