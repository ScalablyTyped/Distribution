package typings.multiformatsMultiaddrToUri

import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@multiformats/multiaddr-to-uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multiaddrToUri(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def multiaddrToUri(input: String, opts: MultiaddrToUriOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def multiaddrToUri(input: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def multiaddrToUri(input: js.typedarray.Uint8Array, opts: MultiaddrToUriOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def multiaddrToUri(input: Multiaddr_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def multiaddrToUri(input: Multiaddr_, opts: MultiaddrToUriOpts): String = (^.asInstanceOf[js.Dynamic].applyDynamic("multiaddrToUri")(input.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait MultiaddrToUriOpts extends StObject {
    
    var assumeHttp: js.UndefOr[Boolean] = js.undefined
  }
  object MultiaddrToUriOpts {
    
    inline def apply(): MultiaddrToUriOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiaddrToUriOpts]
    }
    
    extension [Self <: MultiaddrToUriOpts](x: Self) {
      
      inline def setAssumeHttp(value: Boolean): Self = StObject.set(x, "assumeHttp", value.asInstanceOf[js.Any])
      
      inline def setAssumeHttpUndefined: Self = StObject.set(x, "assumeHttp", js.undefined)
    }
  }
}
