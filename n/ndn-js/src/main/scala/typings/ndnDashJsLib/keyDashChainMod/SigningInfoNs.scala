package typings
package ndnDashJsLib.keyDashChainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js/key-chain", "SigningInfo")
@js.native
object SigningInfoNs extends js.Object {
  @js.native
  sealed trait SignerType extends js.Object
  
  @js.native
  object SignerType extends js.Object {
    @js.native
    sealed trait CERT
      extends ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType
    
    @js.native
    sealed trait ID
      extends ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType
    
    @js.native
    sealed trait KEY
      extends ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType
    
    @js.native
    sealed trait NULL
      extends ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType
    
    @js.native
    sealed trait SHA256
      extends ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType
    
    /* 3 */ val CERT: CERT with scala.Double = js.native
    /* 1 */ val ID: ID with scala.Double = js.native
    /* 2 */ val KEY: KEY with scala.Double = js.native
    /* 0 */ val NULL: NULL with scala.Double = js.native
    /* 4 */ val SHA256: SHA256 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[ndnDashJsLib.keyDashChainMod.SigningInfoNs.SignerType with scala.Double] = js.native
  }
  
}

