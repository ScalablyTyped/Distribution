package typings.nativeUrl

import org.scalablytyped.runtime.StringDictionary
import typings.nativeUrl.nativeUrlBooleans.`false`
import typings.nativeUrl.nativeUrlBooleans.`true`
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.querystringMod.ParsedUrlQueryInput
import typings.std.Iterable
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends Iterable[js.Tuple2[String, String]] {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: StringDictionary[js.UndefOr[String | js.Array[String]]]) = this()
    def this(init: URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
    
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
  class URL_ protected () extends StObject {
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
  
  @JSImport("url", "domainToASCII")
  @js.native
  def domainToASCII(domain: String): String = js.native
  
  @JSImport("url", "domainToUnicode")
  @js.native
  def domainToUnicode(domain: String): String = js.native
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  @JSImport("url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: String): String = js.native
  @JSImport("url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: URL_): String = js.native
  
  @JSImport("url", "format")
  @js.native
  def format(URL: URL_): String = js.native
  @JSImport("url", "format")
  @js.native
  def format(URL: URL_, options: URLFormatOptions): String = js.native
  @JSImport("url", "format")
  @js.native
  def format(urlObject: String): String = js.native
  @JSImport("url", "format")
  @js.native
  def format(urlObject: UrlObject): String = js.native
  
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: String): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: String, parseQueryString: Boolean): Url = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_false(urlStr: String, parseQueryString: `false`): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_false(urlStr: String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_true(urlStr: String, parseQueryString: `true`): UrlWithParsedQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_true(urlStr: String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  @JSImport("url", "pathToFileURL")
  @js.native
  def pathToFileURL(url: String): URL_ = js.native
  
  @JSImport("url", "resolve")
  @js.native
  def resolve(from: String, to: String): String = js.native
  
  @js.native
  trait URLFormatOptions extends StObject {
    
    var auth: js.UndefOr[Boolean] = js.native
    
    var fragment: js.UndefOr[Boolean] = js.native
    
    var search: js.UndefOr[Boolean] = js.native
    
    var unicode: js.UndefOr[Boolean] = js.native
  }
  object URLFormatOptions {
    
    @scala.inline
    def apply(): URLFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[URLFormatOptions]
    }
    
    @scala.inline
    implicit class URLFormatOptionsMutableBuilder[Self <: URLFormatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setFragment(value: Boolean): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      @scala.inline
      def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setUnicode(value: Boolean): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnicodeUndefined: Self = StObject.set(x, "unicode", js.undefined)
    }
  }
  
  // Output of `url.parse`
  @js.native
  trait Url extends StObject {
    
    var auth: String | Null = js.native
    
    var hash: String | Null = js.native
    
    var host: String | Null = js.native
    
    var hostname: String | Null = js.native
    
    var href: String = js.native
    
    var path: String | Null = js.native
    
    var pathname: String | Null = js.native
    
    var port: String | Null = js.native
    
    var protocol: String | Null = js.native
    
    var query: String | Null | ParsedUrlQuery = js.native
    
    var search: String | Null = js.native
    
    var slashes: Boolean | Null = js.native
  }
  object Url {
    
    @scala.inline
    def apply(href: String): Url = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setQuery(value: String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
    }
  }
  
  // Input to `url.format`
  @js.native
  trait UrlObject extends StObject {
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var hash: js.UndefOr[String | Null] = js.native
    
    var host: js.UndefOr[String | Null] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var href: js.UndefOr[String | Null] = js.native
    
    var path: js.UndefOr[String | Null] = js.native
    
    var pathname: js.UndefOr[String | Null] = js.native
    
    var port: js.UndefOr[String | Double | Null] = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var query: js.UndefOr[String | Null | ParsedUrlQueryInput] = js.native
    
    var search: js.UndefOr[String | Null] = js.native
    
    var slashes: js.UndefOr[Boolean | Null] = js.native
  }
  object UrlObject {
    
    @scala.inline
    def apply(): UrlObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlObject]
    }
    
    @scala.inline
    implicit class UrlObjectMutableBuilder[Self <: UrlObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefNull: Self = StObject.set(x, "href", null)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchNull: Self = StObject.set(x, "search", null)
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setSlashes(value: Boolean): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesNull: Self = StObject.set(x, "slashes", null)
      
      @scala.inline
      def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  @js.native
  trait UrlWithParsedQuery extends Url {
    
    @JSName("query")
    var query_UrlWithParsedQuery: ParsedUrlQuery = js.native
  }
  object UrlWithParsedQuery {
    
    @scala.inline
    def apply(href: String, query: ParsedUrlQuery): UrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithParsedQuery]
    }
    
    @scala.inline
    implicit class UrlWithParsedQueryMutableBuilder[Self <: UrlWithParsedQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UrlWithStringQuery extends Url {
    
    @JSName("query")
    var query_UrlWithStringQuery: String | Null = js.native
  }
  object UrlWithStringQuery {
    
    @scala.inline
    def apply(href: String): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    @scala.inline
    implicit class UrlWithStringQueryMutableBuilder[Self <: UrlWithStringQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
}
