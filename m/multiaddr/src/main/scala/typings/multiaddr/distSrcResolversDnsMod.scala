package typings.multiaddr

import typings.node.dnsMod.ResolverOptions
import typings.node.dnsPromisesMod.Resolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversDnsMod {
  
  /**
    * An independent resolver for DNS requests.
    *
    * Creating a new resolver uses the default server settings. Setting
    * the servers used for a resolver using `resolver.setServers()` does not affect
    * other resolvers:
    *
    * ```js
    * const { Resolver } = require('node:dns').promises;
    * const resolver = new Resolver();
    * resolver.setServers(['4.4.4.4']);
    *
    * // This request will use the server at 4.4.4.4, independent of global settings.
    * resolver.resolve4('example.org').then((addresses) => {
    *   // ...
    * });
    *
    * // Alternatively, the same code can be written using async-await style.
    * (async function() {
    *   const addresses = await resolver.resolve4('example.org');
    * })();
    * ```
    *
    * The following methods from the `dnsPromises` API are available:
    *
    * * `resolver.getServers()`
    * * `resolver.resolve()`
    * * `resolver.resolve4()`
    * * `resolver.resolve6()`
    * * `resolver.resolveAny()`
    * * `resolver.resolveCaa()`
    * * `resolver.resolveCname()`
    * * `resolver.resolveMx()`
    * * `resolver.resolveNaptr()`
    * * `resolver.resolveNs()`
    * * `resolver.resolvePtr()`
    * * `resolver.resolveSoa()`
    * * `resolver.resolveSrv()`
    * * `resolver.resolveTxt()`
    * * `resolver.reverse()`
    * * `resolver.setServers()`
    * @since v10.6.0
    */
  /* was `typeof imported_promises.Resolver` */
  @JSImport("multiaddr/dist/src/resolvers/dns", JSImport.Namespace)
  @js.native
  open class ^ () extends Resolver {
    def this(options: ResolverOptions) = this()
  }
  
  /**
    * An independent resolver for DNS requests.
    *
    * Creating a new resolver uses the default server settings. Setting
    * the servers used for a resolver using `resolver.setServers()` does not affect
    * other resolvers:
    *
    * ```js
    * const { Resolver } = require('node:dns').promises;
    * const resolver = new Resolver();
    * resolver.setServers(['4.4.4.4']);
    *
    * // This request will use the server at 4.4.4.4, independent of global settings.
    * resolver.resolve4('example.org').then((addresses) => {
    *   // ...
    * });
    *
    * // Alternatively, the same code can be written using async-await style.
    * (async function() {
    *   const addresses = await resolver.resolve4('example.org');
    * })();
    * ```
    *
    * The following methods from the `dnsPromises` API are available:
    *
    * * `resolver.getServers()`
    * * `resolver.resolve()`
    * * `resolver.resolve4()`
    * * `resolver.resolve6()`
    * * `resolver.resolveAny()`
    * * `resolver.resolveCaa()`
    * * `resolver.resolveCname()`
    * * `resolver.resolveMx()`
    * * `resolver.resolveNaptr()`
    * * `resolver.resolveNs()`
    * * `resolver.resolvePtr()`
    * * `resolver.resolveSoa()`
    * * `resolver.resolveSrv()`
    * * `resolver.resolveTxt()`
    * * `resolver.reverse()`
    * * `resolver.setServers()`
    * @since v10.6.0
    */
  /* was `typeof imported_promises.Resolver` */
  type exports = Resolver
}
