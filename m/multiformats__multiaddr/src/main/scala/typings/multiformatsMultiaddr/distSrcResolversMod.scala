package typings.multiformatsMultiaddr

import typings.multiformatsMultiaddr.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversMod {
  
  @JSImport("@multiformats/multiaddr/dist/src/resolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dnsaddrResolver(addr: Multiaddr_): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsaddrResolver")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  inline def dnsaddrResolver(addr: Multiaddr_, options: AbortOptions): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dnsaddrResolver")(addr.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
