package typings.pathParser

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.pathParser.tokeniserMod.Token
import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("path-parser/dist/Path", JSImport.Default)
  @js.native
  class default[T /* <: Record[String, _] */] protected () extends Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("path-parser/dist/Path", "default.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String): Path[T] = js.native
    @JSImport("path-parser/dist/Path", "default.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): Path[T] = js.native
  }
  
  @JSImport("path-parser/dist/Path", "Path")
  @js.native
  class Path[T /* <: Record[String, _] */] protected () extends StObject {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
    
    def build(): String = js.native
    def build(params: T): String = js.native
    def build(params: T, opts: PathBuildOptions): String = js.native
    def build(params: js.UndefOr[scala.Nothing], opts: PathBuildOptions): String = js.native
    
    var getParams: js.Any = js.native
    
    var hasMatrixParams: Boolean = js.native
    
    var hasQueryParams: Boolean = js.native
    
    var hasSpatParam: Boolean = js.native
    
    var hasUrlParams: Boolean = js.native
    
    def isQueryParam(name: String): Boolean = js.native
    
    def isSpatParam(name: String): Boolean = js.native
    
    var options: InternalPathOptions = js.native
    
    var params: js.Array[String] = js.native
    
    def partialTest(path: String): TestMatch[T] = js.native
    def partialTest(path: String, opts: PathPartialTestOptions): TestMatch[T] = js.native
    
    var path: String = js.native
    
    var queryParams: js.Array[String] = js.native
    
    var source: String = js.native
    
    var spatParams: js.Array[String] = js.native
    
    def test(path: String): TestMatch[T] = js.native
    def test(path: String, opts: PathTestOptions): TestMatch[T] = js.native
    
    var tokens: js.Array[Token] = js.native
    
    var urlParams: js.Array[String] = js.native
    
    var urlTest: js.Any = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser/dist/Path", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String): Path[T] = js.native
    @JSImport("path-parser/dist/Path", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): Path[T] = js.native
  }
  
  @js.native
  trait InternalPathOptions extends StObject {
    
    var queryParams: js.UndefOr[IOptions] = js.native
    
    var urlParamsEncoding: URLParamsEncodingType = js.native
  }
  object InternalPathOptions {
    
    @scala.inline
    def apply(urlParamsEncoding: URLParamsEncodingType): InternalPathOptions = {
      val __obj = js.Dynamic.literal(urlParamsEncoding = urlParamsEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalPathOptions]
    }
    
    @scala.inline
    implicit class InternalPathOptionsMutableBuilder[Self <: InternalPathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathBuildOptions extends PathOptions {
    
    var ignoreConstraints: js.UndefOr[Boolean] = js.native
    
    var ignoreSearch: js.UndefOr[Boolean] = js.native
  }
  object PathBuildOptions {
    
    @scala.inline
    def apply(): PathBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathBuildOptions]
    }
    
    @scala.inline
    implicit class PathBuildOptionsMutableBuilder[Self <: PathBuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreConstraints(value: Boolean): Self = StObject.set(x, "ignoreConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreConstraintsUndefined: Self = StObject.set(x, "ignoreConstraints", js.undefined)
      
      @scala.inline
      def setIgnoreSearch(value: Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    }
  }
  
  @js.native
  trait PathOptions extends StObject {
    
    /**
      * Query parameters buiding and matching options, see
      * https://github.com/troch/search-params#options
      */
    var queryParams: js.UndefOr[IOptions] = js.native
    
    /**
      * Specifies the method used to encode URL parameters:
      *   - `'default': `encodeURIComponent` and `decodeURIComponent`
      *      are used but some characters to encode and decode URL parameters,
      *      but some characters are preserved when encoding
      *      (sub-delimiters: `+`, `:`, `'`, `!`, `,`, `;`, `'*'`).
      *   - `'uriComponent'`: use `encodeURIComponent` and `decodeURIComponent`
      *      for encoding and decoding URL parameters.
      *   - `'uri'`: use `encodeURI` and `decodeURI for encoding amd decoding
      *      URL parameters.
      *   - `'none'`: no encoding or decoding is performed
      *   - `'legacy'`: the approach for version 5.x and below (not recoomended)
      */
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.native
  }
  object PathOptions {
    
    @scala.inline
    def apply(): PathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOptions]
    }
    
    @scala.inline
    implicit class PathOptionsMutableBuilder[Self <: PathOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  @js.native
  trait PathPartialTestOptions extends PathOptions {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var delimited: js.UndefOr[Boolean] = js.native
  }
  object PathPartialTestOptions {
    
    @scala.inline
    def apply(): PathPartialTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathPartialTestOptions]
    }
    
    @scala.inline
    implicit class PathPartialTestOptionsMutableBuilder[Self <: PathPartialTestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    }
  }
  
  @js.native
  trait PathTestOptions extends PathOptions {
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.native
  }
  object PathTestOptions {
    
    @scala.inline
    def apply(): PathTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathTestOptions]
    }
    
    @scala.inline
    implicit class PathTestOptionsMutableBuilder[Self <: PathTestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
    }
  }
  
  type TestMatch[T /* <: Record[String, _] */] = T | Null
}
