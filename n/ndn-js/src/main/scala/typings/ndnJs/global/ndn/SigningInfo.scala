package typings.ndnJs.global.ndn

import typings.ndnJs.keyChainMod.SigningInfo.SignerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.SigningInfo")
@js.native
open class SigningInfo ()
  extends typings.ndnJs.mod.SigningInfo {
  def this(arg: String) = this()
  def this(arg: typings.ndnJs.keyChainMod.PibIdentity) = this()
  def this(arg: typings.ndnJs.keyChainMod.PibKey) = this()
  def this(arg: typings.ndnJs.keyChainMod.SigningInfo) = this()
  def this(signerType: SignerType, signerName: typings.ndnJs.nameMod.Name) = this()
}
object SigningInfo {
  
  @JSGlobal("ndn.SigningInfo.SignerType")
  @js.native
  object SignerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ndnJs.keyChainMod.SigningInfo.SignerType & Double] = js.native
    
    /* 3 */ val CERT: typings.ndnJs.keyChainMod.SigningInfo.SignerType.CERT & Double = js.native
    
    /* 1 */ val ID: typings.ndnJs.keyChainMod.SigningInfo.SignerType.ID & Double = js.native
    
    /* 2 */ val KEY: typings.ndnJs.keyChainMod.SigningInfo.SignerType.KEY & Double = js.native
    
    /* 0 */ val NULL: typings.ndnJs.keyChainMod.SigningInfo.SignerType.NULL & Double = js.native
    
    /* 4 */ val SHA256: typings.ndnJs.keyChainMod.SigningInfo.SignerType.SHA256 & Double = js.native
  }
}
