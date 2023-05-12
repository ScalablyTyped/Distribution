package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.mod.MultiaddrInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFilterMultiaddrFilterMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/filter/multiaddr-filter", "MultiaddrFilter")
  @js.native
  open class MultiaddrFilter protected () extends StObject {
    def this(input: MultiaddrInput) = this()
    
    def contains(input: MultiaddrInput): Boolean = js.native
    
    /* private */ val multiaddr: Any = js.native
    
    /* private */ val netmask: Any = js.native
  }
}
