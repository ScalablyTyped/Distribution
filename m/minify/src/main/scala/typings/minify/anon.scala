package typings.minify

import typings.cleanCss.mod.Options
import typings.terser.mod.MinifyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxSize extends StObject {
    
    /**
      * bigger images are not base64 in the CSS
      * @default 4096
      */
    var maxSize: js.UndefOr[Double] = js.undefined
  }
  object MaxSize {
    
    inline def apply(): MaxSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxSize]
    }
    
    extension [Self <: MaxSize](x: Self) {
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    }
  }
  
  /* Inlined std.Pick<minify.minify/lib/minify.Options, 'css'> */
  trait PickOptionscss extends StObject {
    
    var css: js.UndefOr[Options] = js.undefined
  }
  object PickOptionscss {
    
    inline def apply(): PickOptionscss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionscss]
    }
    
    extension [Self <: PickOptionscss](x: Self) {
      
      inline def setCss(value: Options): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    }
  }
  
  /* Inlined std.Pick<minify.minify/lib/minify.Options, 'html'> */
  trait PickOptionshtml extends StObject {
    
    var html: js.UndefOr[typings.htmlMinifierTerser.mod.Options] = js.undefined
  }
  object PickOptionshtml {
    
    inline def apply(): PickOptionshtml = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionshtml]
    }
    
    extension [Self <: PickOptionshtml](x: Self) {
      
      inline def setHtml(value: typings.htmlMinifierTerser.mod.Options): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    }
  }
  
  /* Inlined std.Pick<minify.minify/lib/minify.Options, 'img'> */
  trait PickOptionsimg extends StObject {
    
    var img: js.UndefOr[MaxSize] = js.undefined
  }
  object PickOptionsimg {
    
    inline def apply(): PickOptionsimg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsimg]
    }
    
    extension [Self <: PickOptionsimg](x: Self) {
      
      inline def setImg(value: MaxSize): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    }
  }
  
  /* Inlined std.Pick<minify.minify/lib/minify.Options, 'js'> */
  trait PickOptionsjs extends StObject {
    
    @JSName("js")
    var js_ : js.UndefOr[MinifyOptions] = js.undefined
  }
  object PickOptionsjs {
    
    inline def apply(): PickOptionsjs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsjs]
    }
    
    extension [Self <: PickOptionsjs](x: Self) {
      
      inline def setJs_(value: MinifyOptions): Self = StObject.set(x, "js", value.asInstanceOf[js.Any])
      
      inline def setJs_Undefined: Self = StObject.set(x, "js", js.undefined)
    }
  }
}
