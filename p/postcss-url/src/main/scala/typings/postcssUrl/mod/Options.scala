package typings.postcssUrl.mod

import typings.postcssUrl.anon.AbsolutePath
import typings.postcssUrl.anon.Append
import typings.postcssUrl.anon.File
import typings.postcssUrl.postcssUrlStrings.`inline`
import typings.postcssUrl.postcssUrlStrings.copy
import typings.postcssUrl.postcssUrlStrings.rebase
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssetsPath(value: Boolean | String): Self = this.set("assetsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsPath: Self = this.set("assetsPath", js.undefined)
    
    @scala.inline
    def setBasePathVarargs(value: String*): Self = this.set("basePath", js.Array(value :_*))
    
    @scala.inline
    def setBasePath(value: String | js.Array[String]): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setFallback(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = this.set("fallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setFilterFunction1(value: /* file */ String => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilter(value: RegExp | CustomFilterFunction | String): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setHashOptions(value: Append): Self = this.set("hashOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashOptions: Self = this.set("hashOptions", js.undefined)
    
    @scala.inline
    def setIgnoreFragmentWarning(value: Boolean): Self = this.set("ignoreFragmentWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreFragmentWarning: Self = this.set("ignoreFragmentWarning", js.undefined)
    
    @scala.inline
    def setIncludeUriFragment(value: Boolean): Self = this.set("includeUriFragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUriFragment: Self = this.set("includeUriFragment", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    
    @scala.inline
    def setOptimizeSvgEncode(value: Boolean): Self = this.set("optimizeSvgEncode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeSvgEncode: Self = this.set("optimizeSvgEncode", js.undefined)
    
    @scala.inline
    def setUrlFunction2(value: (/* asset */ AbsolutePath, /* dir */ File) => String): Self = this.set("url", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUrl(value: copy | `inline` | rebase | CustomTransformFunction): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUseHash(value: Boolean): Self = this.set("useHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHash: Self = this.set("useHash", js.undefined)
  }
}
