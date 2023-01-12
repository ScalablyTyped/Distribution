package typings.pixiUtils

import org.scalablytyped.runtime.StringDictionary
import typings.pixiUtils.pixiUtilsBooleans.`false`
import typings.pixiUtils.pixiUtilsBooleans.`true`
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlMod {
  
  object url {
    
    @JSImport("@pixi/utils/lib/url", "url")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@pixi/utils/lib/url", "url.format")
    @js.native
    def format: FormatFunction = js.native
    inline def format(URL: URL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(URL: URL, options: URLFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def format(urlObject: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(urlObject: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format_=(x: FormatFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("format")(x.asInstanceOf[js.Any])
    
    @JSImport("@pixi/utils/lib/url", "url.parse")
    @js.native
    def parse: ParseFunction = js.native
    inline def parse(urlStr: String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
    inline def parse(urlStr: String, parseQueryString: Boolean): Url_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url_]
    inline def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url_ = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url_]
    inline def parse(urlStr: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    inline def parse_=(x: ParseFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    inline def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    inline def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
    
    inline def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
    inline def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
    
    @JSImport("@pixi/utils/lib/url", "url.resolve")
    @js.native
    def resolve: ResolveFunction = js.native
    inline def resolve(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def resolve_=(x: ResolveFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resolve")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait FormatFunction extends StObject {
    
    def apply(URL: URL): String = js.native
    def apply(URL: URL, options: URLFormatOptions): String = js.native
    def apply(urlObject: String): String = js.native
    def apply(urlObject: UrlObject): String = js.native
  }
  
  @js.native
  trait ParseFunction extends StObject {
    
    def apply(urlStr: String): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: Boolean): Url_ = js.native
    def apply(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url_ = js.native
    def apply(urlStr: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
    def apply(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
    def apply(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  }
  
  type ParsedUrlQuery = StringDictionary[String | js.Array[String]]
  
  type ParsedUrlQueryInput = StringDictionary[Any]
  
  type ResolveFunction = js.Function2[/* from */ String, /* to */ String, String]
  
  trait URLFormatOptions extends StObject {
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var fragment: js.UndefOr[Boolean] = js.undefined
    
    var search: js.UndefOr[Boolean] = js.undefined
    
    var unicode: js.UndefOr[Boolean] = js.undefined
  }
  object URLFormatOptions {
    
    inline def apply(): URLFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URLFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      inline def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
  
  trait UrlObject
    extends StObject
       with UrlObjectCommon {
    
    var port: js.UndefOr[String | Double] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQueryInput] = js.undefined
  }
  object UrlObject {
    
    inline def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  trait UrlObjectCommon extends StObject {
    
    var auth: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var search: js.UndefOr[String] = js.undefined
    
    var slashes: js.UndefOr[Boolean] = js.undefined
  }
  object UrlObjectCommon {
    
    inline def apply(): UrlObjectCommon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObjectCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlObjectCommon] (val x: Self) extends AnyVal {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  trait UrlWithParsedQuery
    extends StObject
       with Url_ {
    
    @JSName("query")
    var query_UrlWithParsedQuery: ParsedUrlQuery
  }
  object UrlWithParsedQuery {
    
    inline def apply(query: ParsedUrlQuery): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlWithParsedQuery] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlWithStringQuery
    extends StObject
       with Url_ {
    
    @JSName("query")
    var query_UrlWithStringQuery: String | Null
  }
  object UrlWithStringQuery {
    
    inline def apply(): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(query = null)
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UrlWithStringQuery] (val x: Self) extends AnyVal {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
  
  trait Url_
    extends StObject
       with UrlObjectCommon {
    
    var port: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String | Null | ParsedUrlQuery] = js.undefined
  }
  object Url_ {
    
    inline def apply(): Url_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Url_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Url_] (val x: Self) extends AnyVal {
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
