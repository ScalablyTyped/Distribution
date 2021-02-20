package typings.postcssUrl

import org.scalablytyped.runtime.Shortcut
import typings.node.Buffer
import typings.postcss.mod.Plugin_
import typings.postcssUrl.anon.AbsolutePath
import typings.postcssUrl.anon.Append
import typings.postcssUrl.anon.File
import typings.postcssUrl.postcssUrlStrings.`inline`
import typings.postcssUrl.postcssUrlStrings.copy
import typings.postcssUrl.postcssUrlStrings.rebase
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-url", JSImport.Namespace)
  @js.native
  val ^ : Url = js.native
  
  type CustomFilterFunction = js.Function1[/* file */ String, Boolean]
  
  type CustomHashFunction = js.Function1[/* file */ Buffer, String]
  
  type CustomTransformFunction = js.Function2[/* asset */ AbsolutePath, /* dir */ File, String]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The assets files will be copied in that destination.
      *
      * @default false
      */
    var assetsPath: js.UndefOr[Boolean | String] = js.native
    
    /**
      * Specify the base path or list of base paths where to search images from.
      */
    var basePath: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * The fallback method to use if the maximum size is exceeded or the URL contains a hash.
      */
    var fallback: js.UndefOr[CustomTransformFunction] = js.native
    
    /**
      * Determine wether a file should be inlined.
      */
    var filter: js.UndefOr[RegExp | CustomFilterFunction | String] = js.native
    
    /**
      * Hash options
      */
    var hashOptions: js.UndefOr[Append] = js.native
    
    /**
      * Do not warn when an SVG URL with a fragment is inlined.
      * PostCSS-URL does not support partial inlining.
      * The entire SVG file will be inlined.
      * By default a warning will be issued when this occurs.
      *
      * @default false
      */
    var ignoreFragmentWarning: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether the URL's fragment identifer value, if present, will be added to the inlined data URI.
      *
      * @default false
      */
    var includeUriFragment: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify the maximum file size to inline (in kilobytes).
      */
    var maxSize: js.UndefOr[Double] = js.native
    
    /**
      * Reduce size of inlined svg (IE9+, Android 3+)
      *
      * @default false
      */
    var optimizeSvgEncode: js.UndefOr[Boolean] = js.native
    
    /**
      * URL rewriting mechanism.
      *
      * @default 'rebase'
      */
    var url: js.UndefOr[copy | `inline` | rebase | CustomTransformFunction] = js.native
    
    /**
      * Rename the path of the files by a hash name.
      *
      * @default false
      */
    var useHash: js.UndefOr[Boolean] = js.native
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
      def setAssetsPath(value: Boolean | String): Self = StObject.set(x, "assetsPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsPathUndefined: Self = StObject.set(x, "assetsPath", js.undefined)
      
      @scala.inline
      def setBasePath(value: String | js.Array[String]): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setBasePathVarargs(value: String*): Self = StObject.set(x, "basePath", js.Array(value :_*))
      
      @scala.inline
      def setFallback(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFilter(value: RegExp | CustomFilterFunction | String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterFunction1(value: /* file */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setHashOptions(value: Append): Self = StObject.set(x, "hashOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashOptionsUndefined: Self = StObject.set(x, "hashOptions", js.undefined)
      
      @scala.inline
      def setIgnoreFragmentWarning(value: Boolean): Self = StObject.set(x, "ignoreFragmentWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreFragmentWarningUndefined: Self = StObject.set(x, "ignoreFragmentWarning", js.undefined)
      
      @scala.inline
      def setIncludeUriFragment(value: Boolean): Self = StObject.set(x, "includeUriFragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUriFragmentUndefined: Self = StObject.set(x, "includeUriFragment", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setOptimizeSvgEncode(value: Boolean): Self = StObject.set(x, "optimizeSvgEncode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeSvgEncodeUndefined: Self = StObject.set(x, "optimizeSvgEncode", js.undefined)
      
      @scala.inline
      def setUrl(value: copy | `inline` | rebase | CustomTransformFunction): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction2(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
    }
  }
  
  type Url = Plugin_[Options | js.Array[Options]]
  
  type _To = Url
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Url = ^
}
