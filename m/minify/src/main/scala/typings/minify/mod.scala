package typings.minify

import typings.minify.anon.MaxSize
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A minifier of js, css, html and img files.
    * @async
    */
  inline def apply(name: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(name: String, options: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @JSImport("minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Full documentation for options that each file type accepts
    * can be found on the pages of the libraries used by minify to process the files
    */
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
