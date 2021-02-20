package typings.pacProxyAgent

import typings.agentBase.mod.Agent
import typings.node.streamMod.Readable
import typings.pacProxyAgent.mod.PacProxyAgentOptions
import typings.pacResolver.mod.FindProxyForURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object agentMod {
  
  @JSImport("pac-proxy-agent/dist/agent", JSImport.Default)
  @js.native
  class default protected () extends PacProxyAgent {
    def this(uri: String) = this()
    def this(uri: String, opts: PacProxyAgentOptions) = this()
  }
  
  @js.native
  trait PacProxyAgent extends Agent {
    
    var cache: js.UndefOr[Readable] = js.native
    
    var clearResolverPromise: js.Any = js.native
    
    /**
      * Loads the PAC proxy file from the source if necessary, and returns
      * a generated `FindProxyForURL()` resolver function to use.
      *
      * @api private
      */
    var getResolver: js.Any = js.native
    
    /**
      * Loads the contents of the PAC proxy file.
      *
      * @api private
      */
    var loadPacFile: js.Any = js.native
    
    var loadResolver: js.Any = js.native
    
    var opts: PacProxyAgentOptions = js.native
    
    var resolver: js.UndefOr[FindProxyForURL] = js.native
    
    var resolverHash: String = js.native
    
    var resolverPromise: js.UndefOr[js.Promise[FindProxyForURL]] = js.native
    
    var uri: String = js.native
  }
}
