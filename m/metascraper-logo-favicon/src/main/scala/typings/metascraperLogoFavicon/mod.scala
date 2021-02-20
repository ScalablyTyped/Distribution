package typings.metascraperLogoFavicon

import typings.metascraper.mod.Rule
import typings.node.httpMod.ClientRequestArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-logo-favicon", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  @JSImport("metascraper-logo-favicon", JSImport.Namespace)
  @js.native
  def apply(options: Options): Rule = js.native
  
  @js.native
  trait FaviconSize extends StObject {
    
    var href: String = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var size: Double = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object FaviconSize {
    
    @scala.inline
    def apply(href: String, size: Double, url: String): FaviconSize = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaviconSize]
    }
    
    @scala.inline
    implicit class FaviconSizeMutableBuilder[Self <: FaviconSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** Any option provided here will passed to `got#options`. */
    var gotOpts: js.UndefOr[ClientRequestArgs] = js.native
    
    /** Truncate the value extracted to a maximum size (default: `300`). */
    var pickFn: js.UndefOr[PickFunction] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGotOpts(value: ClientRequestArgs): Self = StObject.set(x, "gotOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGotOptsUndefined: Self = StObject.set(x, "gotOpts", js.undefined)
      
      @scala.inline
      def setPickFn(value: (/* sizes */ js.Array[FaviconSize], /* pickDefault */ PickDefaultFunction) => FaviconSize): Self = StObject.set(x, "pickFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPickFnUndefined: Self = StObject.set(x, "pickFn", js.undefined)
    }
  }
  
  type PickDefaultFunction = js.Function1[/* sizes */ js.Array[FaviconSize], FaviconSize]
  
  type PickFunction = js.Function2[
    /* sizes */ js.Array[FaviconSize], 
    /* pickDefault */ PickDefaultFunction, 
    FaviconSize
  ]
}
