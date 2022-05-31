package typings.ndnJs.global.ndn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.KeyChain")
@js.native
class KeyChain ()
  extends typings.ndnJs.mod.KeyChain {
  def this(pibLocator: String, tpmLocator: String) = this()
  def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
}
/* static members */
object KeyChain {
  
  @JSGlobal("ndn.KeyChain")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultKeyParams(): typings.ndnJs.keyChainMod.KeyParams = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKeyParams")().asInstanceOf[typings.ndnJs.keyChainMod.KeyParams]
}
