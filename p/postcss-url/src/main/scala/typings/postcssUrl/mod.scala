package typings.postcssUrl

import org.scalablytyped.runtime.Shortcut
import typings.node.bufferMod.global.Buffer
import typings.postcss.mod.PluginCreator
import typings.postcssUrl.anon.AbsolutePath
import typings.postcssUrl.anon.Append
import typings.postcssUrl.anon.File
import typings.postcssUrl.postcssUrlStrings.`inline`
import typings.postcssUrl.postcssUrlStrings.copy
import typings.postcssUrl.postcssUrlStrings.rebase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-url", JSImport.Namespace)
  @js.native
  val ^ : Url = js.native
  
  type CustomFilterFunction = js.Function1[/* file */ String, Boolean]
  
  type CustomHashFunction = js.Function1[/* file */ Buffer, String]
  
  type CustomTransformFunction = js.Function2[/* asset */ AbsolutePath, /* dir */ File, String]
  
  trait Options extends StObject {
    
    /**
      * The assets files will be copied in that destination.
      *
      * @default false
      */
    var assetsPath: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Specify the base path or list of base paths where to search images from.
      */
    var basePath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * The fallback method to use if the maximum size is exceeded or the URL contains a hash.
      */
    var fallback: js.UndefOr[CustomTransformFunction] = js.undefined
    
    /**
      * Determine wether a file should be inlined.
      */
    var filter: js.UndefOr[js.RegExp | CustomFilterFunction | String] = js.undefined
    
    /**
      * Hash options
      */
    var hashOptions: js.UndefOr[Append] = js.undefined
    
    /**
      * Do not warn when an SVG URL with a fragment is inlined.
      * PostCSS-URL does not support partial inlining.
      * The entire SVG file will be inlined.
      * By default a warning will be issued when this occurs.
      *
      * @default false
      */
    var ignoreFragmentWarning: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the URL's fragment identifer value, if present, will be added to the inlined data URI.
      *
      * @default false
      */
    var includeUriFragment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify the maximum file size to inline (in kilobytes).
      */
    var maxSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Reduce size of inlined svg (IE9+, Android 3+)
      *
      * @default false
      */
    var optimizeSvgEncode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * URL rewriting mechanism.
      *
      * @default 'rebase'
      */
    var url: js.UndefOr[copy | `inline` | rebase | CustomTransformFunction] = js.undefined
    
    /**
      * Rename the path of the files by a hash name.
      *
      * @default false
      */
    var useHash: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAssetsPath(value: Boolean | String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      inline def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      inline def setBasePath(value: String | js.Array[String]): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setBasePathVarargs(value: String*): Self = StObject.set(x, "basePath", js.Array(value*))
      
      inline def setFallback(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setFilter(value: js.RegExp | CustomFilterFunction | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHashOptions(value: Append): Self = StObject.set(x, "hashOptions", value.asInstanceOf[js.Any])
      
      inline def setHashOptionsUndefined: Self = StObject.set(x, "hashOptions", js.undefined)
      
      inline def setIgnoreFragmentWarning(value: Boolean): Self = StObject.set(x, "ignoreFragmentWarning", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFragmentWarningUndefined: Self = StObject.set(x, "ignoreFragmentWarning", js.undefined)
      
      inline def setIncludeUriFragment(value: Boolean): Self = StObject.set(x, "includeUriFragment", value.asInstanceOf[js.Any])
      
      inline def setIncludeUriFragmentUndefined: Self = StObject.set(x, "includeUriFragment", js.undefined)
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setOptimizeSvgEncode(value: Boolean): Self = StObject.set(x, "optimizeSvgEncode", value.asInstanceOf[js.Any])
      
      inline def setOptimizeSvgEncodeUndefined: Self = StObject.set(x, "optimizeSvgEncode", js.undefined)
      
      inline def setUrl(value: copy | `inline` | rebase | CustomTransformFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction2(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
    }
  }
  
  type Url = PluginCreator[Options | js.Array[Options]]
  
  type _To = Url
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Url = ^
}
