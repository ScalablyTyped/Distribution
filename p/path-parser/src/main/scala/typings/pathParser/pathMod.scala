package typings.pathParser

import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.pathParser.tokeniserMod.Token
import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("path-parser/dist/Path", JSImport.Default)
  @js.native
  class default[T /* <: Record[String, js.Any] */] protected () extends Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("path-parser/dist/Path", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPath[T /* <: Record[String, js.Any] */](path: String): Path[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any]).asInstanceOf[Path[T]]
    inline def createPath[T /* <: Record[String, js.Any] */](path: String, options: PathOptions): Path[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Path[T]]
  }
  
  @JSImport("path-parser/dist/Path", "Path")
  @js.native
  class Path[T /* <: Record[String, js.Any] */] protected () extends StObject {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
    
    def build(): String = js.native
    def build(params: T): String = js.native
    def build(params: T, opts: PathBuildOptions): String = js.native
    def build(params: Unit, opts: PathBuildOptions): String = js.native
    
    /* private */ var getParams: js.Any = js.native
    
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
    
    /* private */ var urlTest: js.Any = js.native
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser/dist/Path", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPath[T /* <: Record[String, js.Any] */](path: String): Path[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any]).asInstanceOf[Path[T]]
    inline def createPath[T /* <: Record[String, js.Any] */](path: String, options: PathOptions): Path[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Path[T]]
  }
  
  trait InternalPathOptions extends StObject {
    
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
    var urlParamsEncoding: URLParamsEncodingType
  }
  object InternalPathOptions {
    
    inline def apply(urlParamsEncoding: URLParamsEncodingType): InternalPathOptions = {
      val __obj = js.Dynamic.literal(urlParamsEncoding = urlParamsEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalPathOptions]
    }
    
    extension [Self <: InternalPathOptions](x: Self) {
      
      inline def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathBuildOptions
    extends StObject
       with PathOptions {
    
    var ignoreConstraints: js.UndefOr[Boolean] = js.undefined
    
    var ignoreSearch: js.UndefOr[Boolean] = js.undefined
  }
  object PathBuildOptions {
    
    inline def apply(): PathBuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathBuildOptions]
    }
    
    extension [Self <: PathBuildOptions](x: Self) {
      
      inline def setIgnoreConstraints(value: Boolean): Self = StObject.set(x, "ignoreConstraints", value.asInstanceOf[js.Any])
      
      inline def setIgnoreConstraintsUndefined: Self = StObject.set(x, "ignoreConstraints", js.undefined)
      
      inline def setIgnoreSearch(value: Boolean): Self = StObject.set(x, "ignoreSearch", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSearchUndefined: Self = StObject.set(x, "ignoreSearch", js.undefined)
    }
  }
  
  trait PathOptions extends StObject {
    
    /**
      * Query parameters buiding and matching options, see
      * https://github.com/troch/search-params#options
      */
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
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
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
  }
  object PathOptions {
    
    inline def apply(): PathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOptions]
    }
    
    extension [Self <: PathOptions](x: Self) {
      
      inline def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  trait PathPartialTestOptions
    extends StObject
       with PathOptions {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var delimited: js.UndefOr[Boolean] = js.undefined
  }
  object PathPartialTestOptions {
    
    inline def apply(): PathPartialTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathPartialTestOptions]
    }
    
    extension [Self <: PathPartialTestOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setDelimited(value: Boolean): Self = StObject.set(x, "delimited", value.asInstanceOf[js.Any])
      
      inline def setDelimitedUndefined: Self = StObject.set(x, "delimited", js.undefined)
    }
  }
  
  trait PathTestOptions
    extends StObject
       with PathOptions {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
  }
  object PathTestOptions {
    
    inline def apply(): PathTestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathTestOptions]
    }
    
    extension [Self <: PathTestOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
    }
  }
  
  type TestMatch[T /* <: Record[String, js.Any] */] = T | Null
}
