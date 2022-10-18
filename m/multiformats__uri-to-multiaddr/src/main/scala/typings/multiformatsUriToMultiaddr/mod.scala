package typings.multiformatsUriToMultiaddr

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@multiformats/uri-to-multiaddr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uriStr: String): Multiaddr_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uriStr.asInstanceOf[js.Any]).asInstanceOf[Multiaddr_]
  inline def default(uriStr: String, opts: MultiaddrFromUriOpts): Multiaddr_ = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uriStr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Multiaddr_]
  
  trait MultiaddrFromUriOpts extends StObject {
    
    var defaultDnsType: js.UndefOr[String] = js.undefined
  }
  object MultiaddrFromUriOpts {
    
    inline def apply(): MultiaddrFromUriOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiaddrFromUriOpts]
    }
    
    extension [Self <: MultiaddrFromUriOpts](x: Self) {
      
      inline def setDefaultDnsType(value: String): Self = StObject.set(x, "defaultDnsType", value.asInstanceOf[js.Any])
      
      inline def setDefaultDnsTypeUndefined: Self = StObject.set(x, "defaultDnsType", js.undefined)
    }
  }
}
