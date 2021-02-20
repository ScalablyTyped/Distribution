package typings.ndnJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "KeyChain")
@js.native
class KeyChain ()
  extends typings.ndnJs.keyChainMod.KeyChain {
  def this(pibLocator: String, tpmLocator: String) = this()
  def this(pibLocator: String, tpmLocator: String, allowReset: Boolean) = this()
}
/* static members */
object KeyChain {
  
  @JSImport("ndn-js", "KeyChain.getDefaultKeyParams")
  @js.native
  def getDefaultKeyParams(): typings.ndnJs.keyChainMod.KeyParams = js.native
}
