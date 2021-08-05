package typings.pacResolver

import typings.node.dnsMod.LookupAddress
import typings.node.dnsMod.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("pac-resolver/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dnsLookup(host: String, opts: LookupOptions): js.Promise[String | js.Array[LookupAddress]] = (^.asInstanceOf[js.Dynamic].applyDynamic("dnsLookup")(host.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String | js.Array[LookupAddress]]]
  
  inline def isGMT(v: js.Any): /* is pac-resolver.pac-resolver.GMT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGMT")(v.asInstanceOf[js.Any]).asInstanceOf[/* is pac-resolver.pac-resolver.GMT */ Boolean]
}
