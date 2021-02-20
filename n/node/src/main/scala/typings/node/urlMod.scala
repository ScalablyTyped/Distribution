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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlMod {
  
  @JSImport("url", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends Iterable[js.Tuple2[java.lang.String, java.lang.String]] {
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
  class URL_ protected () extends _PathLike {
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
  
  @JSImport("url", "domainToASCII")
  @js.native
  def domainToASCII(domain: java.lang.String): java.lang.String = js.native
  
  @JSImport("url", "domainToUnicode")
  @js.native
  def domainToUnicode(domain: java.lang.String): java.lang.String = js.native
  
  /**
    * This function ensures the correct decodings of percent-encoded characters as
    * well as ensuring a cross-platform valid absolute path string.
    * @param url The file URL string or URL object to convert to a path.
    */
  @JSImport("url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: java.lang.String): java.lang.String = js.native
  @JSImport("url", "fileURLToPath")
  @js.native
  def fileURLToPath(url: URL_): java.lang.String = js.native
  
  @JSImport("url", "format")
  @js.native
  def format(URL: URL_): java.lang.String = js.native
  @JSImport("url", "format")
  @js.native
  def format(URL: URL_, options: URLFormatOptions): java.lang.String = js.native
  @JSImport("url", "format")
  @js.native
  def format(urlObject: java.lang.String): java.lang.String = js.native
  @JSImport("url", "format")
  @js.native
  def format(urlObject: UrlObject): java.lang.String = js.native
  
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: java.lang.String): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: Boolean): Url = js.native
  @JSImport("url", "parse")
  @js.native
  def parse(urlStr: java.lang.String, parseQueryString: Boolean, slashesDenoteHost: Boolean): Url = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_false(urlStr: java.lang.String, parseQueryString: `false`, slashesDenoteHost: Boolean): UrlWithStringQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`): UrlWithParsedQuery = js.native
  @JSImport("url", "parse")
  @js.native
  def parse_true(urlStr: java.lang.String, parseQueryString: `true`, slashesDenoteHost: Boolean): UrlWithParsedQuery = js.native
  
  /**
    * This function ensures that path is resolved absolutely, and that the URL
    * control characters are correctly encoded when converting into a File URL.
    * @param url The path to convert to a File URL.
    */
  @JSImport("url", "pathToFileURL")
  @js.native
  def pathToFileURL(url: java.lang.String): URL_ = js.native
  
  @JSImport("url", "resolve")
  @js.native
  def resolve(from: java.lang.String, to: java.lang.String): java.lang.String = js.native
  
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
    
    var auth: java.lang.String | Null = js.native
    
    var hash: java.lang.String | Null = js.native
    
    var host: java.lang.String | Null = js.native
    
    var hostname: java.lang.String | Null = js.native
    
    var href: java.lang.String = js.native
    
    var path: java.lang.String | Null = js.native
    
    var pathname: java.lang.String | Null = js.native
    
    var port: java.lang.String | Null = js.native
    
    var protocol: java.lang.String | Null = js.native
    
    var query: java.lang.String | Null | ParsedUrlQuery = js.native
    
    var search: java.lang.String | Null = js.native
    
    var slashes: Boolean | Null = js.native
  }
  object Url {
    
    @scala.inline
    def apply(href: java.lang.String): Url = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: java.lang.String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathNull: Self = StObject.set(x, "path", null)
      
      @scala.inline
      def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPort(value: java.lang.String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setQuery(value: java.lang.String | ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
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
    
    var auth: js.UndefOr[java.lang.String | Null] = js.native
    
    var hash: js.UndefOr[java.lang.String | Null] = js.native
    
    var host: js.UndefOr[java.lang.String | Null] = js.native
    
    var hostname: js.UndefOr[java.lang.String | Null] = js.native
    
    var href: js.UndefOr[java.lang.String | Null] = js.native
    
    var pathname: js.UndefOr[java.lang.String | Null] = js.native
    
    var port: js.UndefOr[java.lang.String | Double | Null] = js.native
    
    var protocol: js.UndefOr[java.lang.String | Null] = js.native
    
    var query: js.UndefOr[java.lang.String | Null | ParsedUrlQueryInput] = js.native
    
    var search: js.UndefOr[java.lang.String | Null] = js.native
    
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
      def setAuth(value: java.lang.String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHash(value: java.lang.String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashNull: Self = StObject.set(x, "hash", null)
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHost(value: java.lang.String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostNull: Self = StObject.set(x, "host", null)
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: java.lang.String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setHref(value: java.lang.String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefNull: Self = StObject.set(x, "href", null)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setPathname(value: java.lang.String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameNull: Self = StObject.set(x, "pathname", null)
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPort(value: java.lang.String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortNull: Self = StObject.set(x, "port", null)
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: java.lang.String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: java.lang.String | ParsedUrlQueryInput): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSearch(value: java.lang.String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
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
    def apply(href: java.lang.String, query: ParsedUrlQuery): UrlWithParsedQuery = {
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
    var query_UrlWithStringQuery: java.lang.String | Null = js.native
  }
  object UrlWithStringQuery {
    
    @scala.inline
    def apply(href: java.lang.String): UrlWithStringQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlWithStringQuery]
    }
    
    @scala.inline
    implicit class UrlWithStringQueryMutableBuilder[Self <: UrlWithStringQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: java.lang.String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryNull: Self = StObject.set(x, "query", null)
    }
  }
}
