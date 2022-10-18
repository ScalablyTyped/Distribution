package typings.nativeUrl

import org.scalablytyped.runtime.StringDictionary
import typings.nativeUrl.nativeUrlBooleans.`false`
import typings.nativeUrl.nativeUrlBooleans.`true`
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
  open class URLSearchParams ()
    extends StObject
       with Iterable[js.Tuple2[String, String]] {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: js.Iterable[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: URLSearchParams) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function3[/* value */ String, /* name */ String, /* searchParams */ this.type, Unit]): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def getAll(name: String): js.Array[String] = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_URLSearchParams: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def sort(): Unit = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("url", "URL")
  @js.native
  open class URL_ protected () extends StObject {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
    
    var hash: String = js.native
    
    var host: String = js.native
    
    var hostname: String = js.native
    
    var href: String = js.native
    
    val origin: String = js.native
    
    var password: String = js.native
    
    var pathname: String = js.native
    
    var port: String = js.native
    
    var protocol: String = js.native
    
    var search: String = js.native
    
    val searchParams: URLSearchParams = js.native
    
    def toJSON(): String = js.native
    
    var username: String = js.native
  }
  
  inline def domainToASCII(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToASCII")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def domainToUnicode(domain: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("domainToUnicode")(domain.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  inline def fileURLToPath(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fileURLToPath(url: URL_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileURLToPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(URL: URL_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(URL: URL_, options: URLFormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(URL.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(urlObject: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(urlObject: UrlObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(urlObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(urlStr: String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
  inline def parse(urlStr: String, parseQueryString: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[Url]
  inline def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[Url]
  inline def parse(urlStr: String, parseQueryString: Unit, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  inline def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  inline def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  inline def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  inline def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(urlStr.asInstanceOf[js.Any], parseQueryString.asInstanceOf[js.Any], slashesDenoteHost.asInstanceOf[js.Any])).asInstanceOf[UrlWithParsedQuery]
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  inline def pathToFileURL(url: String): URL_ = ^.asInstanceOf[js.Dynamic].applyDynamic("pathToFileURL")(url.asInstanceOf[js.Any]).asInstanceOf[URL_]
  
  inline def resolve(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
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
    
    var auth: String | Null
    
    var hash: String | Null
    
    var host: String | Null
    
    var hostname: String | Null
    
    var href: String
    
    var path: String | Null
    
    var pathname: String | Null
    
    var port: String | Null
    
    var protocol: String | Null
    
    var query: String | Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any)
    
    var search: String | Null
    
    var slashes: Boolean | Null
  }
  object Url {
    
    inline def apply(href: String): Url = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setQuery(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any)
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesNull: Self = StObject.set(x, "slashes", null)
    }
  }
  
  // Input to `url.format`
  trait UrlObject extends StObject {
    
    var auth: js.UndefOr[String | Null] = js.undefined
    
    var hash: js.UndefOr[String | Null] = js.undefined
    
    var host: js.UndefOr[String | Null] = js.undefined
    
    var hostname: js.UndefOr[String | Null] = js.undefined
    
    var href: js.UndefOr[String | Null] = js.undefined
    
    var path: js.UndefOr[String | Null] = js.undefined
    
    var pathname: js.UndefOr[String | Null] = js.undefined
    
    var port: js.UndefOr[String | Double | Null] = js.undefined
    
    var protocol: js.UndefOr[String | Null] = js.undefined
    
    var query: js.UndefOr[
        String | Null | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQueryInput */ Any)
      ] = js.undefined
    
    var search: js.UndefOr[String | Null] = js.undefined
    
    var slashes: js.UndefOr[Boolean | Null] = js.undefined
  }
  object UrlObject {
    
    inline def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    extension [Self <: UrlObject](x: Self) {
      
      inline def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashNull: Self = StObject.set(x, "hash", null)
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostNull: Self = StObject.set(x, "host", null)
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefNull: Self = StObject.set(x, "href", null)
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathNull: Self = StObject.set(x, "path", null)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortNull: Self = StObject.set(x, "port", null)
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQueryInput */ Any)
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setSearchNull: Self = StObject.set(x, "search", null)
      
      inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      inline def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesNull: Self = StObject.set(x, "slashes", null)
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  trait UrlWithParsedQuery
    extends StObject
       with Url
  object UrlWithParsedQuery {
    
    inline def apply(href: String): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
  }
  
  trait UrlWithStringQuery
    extends StObject
       with Url {
    
    @JSName("query")
    var query_UrlWithStringQuery: String | Null
  }
  object UrlWithStringQuery {
    
    inline def apply(href: String): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, query = null, search = null, slashes = null)
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    extension [Self <: UrlWithStringQuery](x: Self) {
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
}
