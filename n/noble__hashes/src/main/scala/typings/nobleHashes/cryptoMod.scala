package typings.nobleHashes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cryptoMod {
  
  object crypto {
    
    @JSImport("@noble/hashes/crypto", "crypto")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@noble/hashes/crypto", "crypto.node")
    @js.native
    def node: js.UndefOr[Any] = js.native
    inline def node_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("node")(x.asInstanceOf[js.Any])
    
    @JSImport("@noble/hashes/crypto", "crypto.web")
    @js.native
    def web: js.UndefOr[Any] = js.native
    inline def web_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("web")(x.asInstanceOf[js.Any])
  }
}
