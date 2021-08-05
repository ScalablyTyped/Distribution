package typings.node

import typings.node.NodeJS.Dict
import typings.node.fsMod._PathLike
import typings.node.nodeBooleans.`false`
import typings.node.nodeBooleans.`true`
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.querystringMod.ParsedUrlQueryInput
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends StObject
       with Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
    def this(init: java.lang.String) = this()
    def this(init: js.Array[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    def this(init: Dict[java.lang.String | js.Array[java.lang.String]]) = this()
    def this(init: URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[java.lang.String, java.lang.String]]) = this()
    
    def append(name: java.lang.String, value: java.lang.String): Unit = js.native
    
    def delete(name: java.lang.String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[java.lang.String, java.lang.String]] = js.native
    
    def forEach(
      callback: js.Function3[
          /* value */ java.lang.String, 
          /* name */ java.lang.String, 
          /* searchParams */ this.type, 
          Unit
        ]
    ): Unit = js.native
    
    def get(name: java.lang.String): java.lang.String | Null = js.native
    
    def getAll(name: java.lang.String): js.Array[java.lang.String] = js.native
    
    def has(name: java.lang.String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[java.lang.String, java.lang.String]]] = js.native
    
    def keys(): IterableIterator[java.lang.String] = js.native
    
    def set(name: java.lang.String, value: java.lang.String): Unit = js.native
    
    def sort(): Unit = js.native
    
    def values(): IterableIterator[java.lang.String] = js.native
  }
  
  @JSImport("url", "URL")
  @js.native
  class URL_ protected ()
    extends StObject
       with _PathLike {
    def this(input: java.lang.String) = this()
    def this(input: java.lang.String, base: java.lang.String) = this()
    def this(input: java.lang.String, base: URL_) = this()
    
    var hash: java.lang.String = js.native
    
    var host: java.lang.String = js.native
    
    var hostname: java.lang.String = js.native
    
    var href: java.lang.String = js.native
    
    val origin: java.lang.String = js.native
    
    var password: java.lang.String = js.native
    
    var pathname: java.lang.String = js.native
    
    var port: java.lang.String = js.native
    
    var protocol: java.lang.String = js.native
    
    var search: java.lang.String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): java.lang.String = js.native
    
    var username: java.lang.String = js.native
  }
  
  inline def domainToASCII(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def domainToUnicode(domain: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  inline def fileURLToPath(url: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def fileURLToPath(url: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def format(URL: URL_): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def format(URL: URL_, options: URLFormatOptions): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def format(urlObject: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def format(urlObject: UrlObject): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  inline def parse(urlStr: java.lang.String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
  inline def parse(urlStr: java.lang.String, parseQueryString: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url]
  inline def parse(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  inline def parse(urlStr: java.lang.String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  inline def parse_false(urlStr: java.lang.String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  inline def parse_false(urlStr: java.lang.String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  inline def parse_true(urlStr: java.lang.String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  inline def parse_true(urlStr: java.lang.String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  inline def pathToFileURL(url: java.lang.String): URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToFileURL")(url.asInstanceOf[js.Any]).asInstanceOf[URL_]
  
  inline def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
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
    
    extension [Self <: URLFormatOptions](x: Self) {
      
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
  
  // Output of `url.parse`
  trait Url extends StObject {
    
    var auth: java.lang.String | Null
    
    var hash: java.lang.String | Null
    
    var host: java.lang.String | Null
    
    var hostname: java.lang.String | Null
    
    var href: java.lang.String
    
    var path: java.lang.String | Null
    
    var pathname: java.lang.String | Null
    
    var port: java.lang.String | Null
    
    var protocol: java.lang.String | Null
    
    var query: java.lang.String | Null | ParsedUrlQuery
    
    var search: java.lang.String | Null
    
    var slashes: Boolean | Null
  }
  object Url {
    
    inline def apply(href: java.lang.String): Url = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      inline def setPort(value: java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setQuery(value: java.lang.String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesNull: Self = StObject.set(x, "slashes", null)
    }
  }
  
  // Input to `url.format`
  trait UrlObject extends StObject {
    
    var auth: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var hash: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var host: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var hostname: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var href: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var pathname: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var port: js.UndefOr[java.lang.String | Double | Null] = js.undefined
    
    var protocol: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var query: js.UndefOr[java.lang.String | Null | ParsedUrlQueryInput] = js.undefined
    
    var search: js.UndefOr[java.lang.String | Null] = js.undefined
    
    var slashes: js.UndefOr[Boolean | Null] = js.undefined
  }
  object UrlObject {
    
    inline def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    extension [Self <: UrlObject](x: Self) {
      
      inline def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefNull: Self = StObject.set(x, "href", null)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: java.lang.String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: java.lang.String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesNull: Self = StObject.set(x, "slashes", null)
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  trait UrlWithParsedQuery
    extends StObject
       with Url {
    
    @JSName("query")
    var query_UrlWithParsedQuery: ParsedUrlQuery
  }
  object UrlWithParsedQuery {
    
    inline def apply(href: java.lang.String, query: ParsedUrlQuery): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
    
    extension [Self <: UrlWithParsedQuery](x: Self) {
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait UrlWithStringQuery
    extends StObject
       with Url {
    
    @JSName("query")
    var query_UrlWithStringQuery: java.lang.String | Null
  }
  object UrlWithStringQuery {
    
    inline def apply(href: java.lang.String): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    extension [Self <: UrlWithStringQuery](x: Self) {
      
      inline def setQuery(value: java.lang.String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
}
