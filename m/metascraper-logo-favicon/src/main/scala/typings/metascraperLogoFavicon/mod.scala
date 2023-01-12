package typings.metascraperLogoFavicon

import typings.metascraper.mod.Rule
import typings.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Rule = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Rule]
  inline def apply(options: Options): Rule = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  @JSImport("metascraper-logo-favicon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FaviconSize extends StObject {
    
    var href: String
    
    var rel: js.UndefOr[String] = js.undefined
    
    var size: Double
    
    var sizes: js.UndefOr[String] = js.undefined
    
    var url: String
  }
  object FaviconSize {
    
    inline def apply(href: String, size: Double, url: String): FaviconSize = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaviconSize] (val x: Self) extends AnyVal {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    /** Any option provided here will passed to `got#options`. */
    var gotOpts: js.UndefOr[ClientRequestArgs] = js.undefined
    
    /** Truncate the value extracted to a maximum size (default: `300`). */
    var pickFn: js.UndefOr[PickFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setGotOpts(value: ClientRequestArgs): Self = StObject.set(x, "gotOpts", value.asInstanceOf[js.Any])
      
      inline def setGotOptsUndefined: Self = StObject.set(x, "gotOpts", js.undefined)
      
      inline def setPickFn(value: (/* sizes */ js.Array[FaviconSize], /* pickDefault */ PickDefaultFunction) => FaviconSize): Self = StObject.set(x, "pickFn", js.Any.fromFunction2(value))
      
      inline def setPickFnUndefined: Self = StObject.set(x, "pickFn", js.undefined)
    }
  }
  
  type PickDefaultFunction = js.Function1[/* sizes */ js.Array[FaviconSize], FaviconSize]
  
  type PickFunction = js.Function2[
    /* sizes */ js.Array[FaviconSize], 
    /* pickDefault */ PickDefaultFunction, 
    FaviconSize
  ]
}
