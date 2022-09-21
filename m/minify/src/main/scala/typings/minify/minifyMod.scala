package typings.minify

import typings.minify.anon.MaxSize
import typings.minify.anon.PickOptionscss
import typings.minify.anon.PickOptionshtml
import typings.minify.anon.PickOptionsimg
import typings.minify.anon.PickOptionsjs
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object minifyMod {
  
  @JSImport("minify/lib/minify", "minify")
  @js.native
  val minify: Minify_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.minify.minifyStrings.js_
    - typings.minify.minifyStrings.html
    - typings.minify.minifyStrings.css
  */
  trait Ext extends StObject
  object Ext {
    
    inline def css: typings.minify.minifyStrings.css = "css".asInstanceOf[typings.minify.minifyStrings.css]
    
    inline def html: typings.minify.minifyStrings.html = "html".asInstanceOf[typings.minify.minifyStrings.html]
    
    inline def js_ : typings.minify.minifyStrings.js_ = "js".asInstanceOf[typings.minify.minifyStrings.js_]
  }
  
  @js.native
  trait Minify_ extends StObject {
    
    /**
      * A minifier of js, css, html and img files.
      * @async
      */
    def apply(file: String): js.Promise[String] = js.native
    def apply(file: String, options: Options): js.Promise[String] = js.native
    
    def css(data: String): js.Promise[String] = js.native
    def css(data: String, userOptions: PickOptionscss): js.Promise[String] = js.native
    @JSName("css")
    var css_Original: js.Function2[/* data */ String, /* userOptions */ js.UndefOr[PickOptionscss], js.Promise[String]] = js.native
    
    def html(data: String): js.Promise[String] = js.native
    def html(data: String, userOptions: PickOptionshtml): js.Promise[String] = js.native
    @JSName("html")
    var html_Original: js.Function2[/* data */ String, /* userOptions */ js.UndefOr[PickOptionshtml], js.Promise[String]] = js.native
    
    def img(name: String, data: String): js.Promise[String] = js.native
    def img(name: String, data: String, userOptions: PickOptionsimg): js.Promise[String] = js.native
    @JSName("img")
    var img_Original: js.Function3[
        /* name */ String, 
        /* data */ String, 
        /* userOptions */ js.UndefOr[PickOptionsimg], 
        js.Promise[String]
      ] = js.native
    
    @JSName("js")
    def js_(data: String): js.Promise[String] = js.native
    @JSName("js")
    def js_(data: String, userOptions: PickOptionsjs): js.Promise[String] = js.native
    @JSName("js")
    var js_Original: js.Function2[/* data */ String, /* userOptions */ js.UndefOr[PickOptionsjs], js.Promise[String]] = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * see {@link https://github.com/jakubpawlowicz/clean-css}
      */
    var css: js.UndefOr[typings.cleanCss.mod.Options] = js.undefined
    
    /**
      * see {@link https://github.com/kangax/html-minifier}
      */
    var html: js.UndefOr[typings.htmlMinifierTerser.mod.Options] = js.undefined
    
    /**
      * see {@link https://github.com/Filirom1/css-base64-images}
      */
    var img: js.UndefOr[MaxSize] = js.undefined
    
    /**
      * see {@link https://github.com/terser/terser}
      */
    @JSName("js")
    var js_ : js.UndefOr[MinifyOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCss(value: typings.cleanCss.mod.Options): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setHtml(value: typings.htmlMinifierTerser.mod.Options): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setImg(value: MaxSize): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      inline def setJs_(value: MinifyOptions): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    }
  }
}
