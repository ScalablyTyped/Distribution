package typings.multiformatsMultiaddr

import typings.dnsOverHttpResolver.mod.ResolverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversDnsDotbrowserMod {
  
  /**
    * DNS over HTTP resolver.
    * Uses a list of servers to resolve DNS records with HTTP requests.
    */
  @JSImport("@multiformats/multiaddr/dist/src/resolvers/dns.browser", JSImport.Default)
  @js.native
  /**
    * @class
    * @param {object} [options]
    * @param {number} [options.maxCache = 100] - maximum number of cached dns records
    * @param {Request} [options.request] - function to return DNSJSON
    */
  open class default ()
    extends typings.dnsOverHttpResolver.mod.default {
    def this(options: ResolverOptions) = this()
  }
}
