package typings.multiaddr

import typings.multiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcResolversMod {
  
  @JSImport("multiaddr/dist/src/resolvers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dnsaddrResolver(addr: Multiaddr): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dnsaddrResolver")(addr.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  type Multiaddr = Multiaddr_
}
