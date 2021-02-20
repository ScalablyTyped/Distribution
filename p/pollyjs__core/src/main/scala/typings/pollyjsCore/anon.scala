package typings.pollyjsCore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.pollyjsCore.mod.Headers
import typings.pollyjsCore.mod.MatchBy
import typings.pollyjsCore.mod.Request
import typings.pollyjsPersister.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ApiNamespace extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
  }
  object ApiNamespace {
    
    @scala.inline
    def apply(): ApiNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiNamespace]
    }
    
    @scala.inline
    implicit class ApiNamespaceMutableBuilder[Self <: ApiNamespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
  
  @js.native
  trait Body extends StObject {
    
    var body: js.UndefOr[Boolean | (MatchBy[_, _])] = js.native
    
    var headers: js.UndefOr[Boolean | Exclude | (MatchBy[Headers, Headers])] = js.native
    
    var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var order: js.UndefOr[Boolean] = js.native
    
    var url: js.UndefOr[Boolean | (MatchBy[String, String]) | Hash] = js.native
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: Boolean | (MatchBy[_, _])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyFunction2(value: (_, /* req */ Request) => _): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHeaders(value: Boolean | Exclude | (MatchBy[Headers, Headers])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersFunction2(value: (Headers, /* req */ Request) => Headers): Self = StObject.set(x, "headers", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setUrl(value: Boolean | (MatchBy[String, String]) | Hash): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
  }
  object Context {
    
    @scala.inline
    def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var fetch: js.UndefOr[Context] = js.native
    
    var puppeteer: js.UndefOr[Page] = js.native
    
    var xhr: js.UndefOr[Context] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: Context): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setPuppeteer(value: Page): Self = StObject.set(x, "puppeteer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuppeteerUndefined: Self = StObject.set(x, "puppeteer", js.undefined)
      
      @scala.inline
      def setXhr(value: Context): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  @js.native
  trait DisableSortingHarEntries
    extends /* key */ StringDictionary[js.Any] {
    
    var disableSortingHarEntries: js.UndefOr[Boolean] = js.native
    
    var fs: js.UndefOr[RecordingsDir] = js.native
    
    var keepUnusedRequests: js.UndefOr[Boolean] = js.native
    
    var `local-storage`: js.UndefOr[Key] = js.native
    
    var rest: js.UndefOr[ApiNamespace] = js.native
  }
  object DisableSortingHarEntries {
    
    @scala.inline
    def apply(): DisableSortingHarEntries = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableSortingHarEntries]
    }
    
    @scala.inline
    implicit class DisableSortingHarEntriesMutableBuilder[Self <: DisableSortingHarEntries] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableSortingHarEntries(value: Boolean): Self = StObject.set(x, "disableSortingHarEntries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSortingHarEntriesUndefined: Self = StObject.set(x, "disableSortingHarEntries", js.undefined)
      
      @scala.inline
      def setFs(value: RecordingsDir): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      @scala.inline
      def setKeepUnusedRequests(value: Boolean): Self = StObject.set(x, "keepUnusedRequests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepUnusedRequestsUndefined: Self = StObject.set(x, "keepUnusedRequests", js.undefined)
      
      @scala.inline
      def `setLocal-storage`(value: Key): Self = StObject.set(x, "local-storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setLocal-storageUndefined`: Self = StObject.set(x, "local-storage", js.undefined)
      
      @scala.inline
      def setRest(value: ApiNamespace): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    }
  }
  
  @js.native
  trait Exclude extends StObject {
    
    var exclude: js.Array[String] = js.native
  }
  object Exclude {
    
    @scala.inline
    def apply(exclude: js.Array[String]): Exclude = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exclude]
    }
    
    @scala.inline
    implicit class ExcludeMutableBuilder[Self <: Exclude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Hash extends StObject {
    
    var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.native
    
    var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
    
    var query: js.UndefOr[Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])] = js.native
    
    var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.native
  }
  object Hash {
    
    @scala.inline
    def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    @scala.inline
    implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHostname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "hostname", js.Any.fromFunction2(value))
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setPassword(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "password", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPathname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "pathname", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setPort(value: Boolean | (MatchBy[Double, Double])): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortFunction2(value: (Double, /* req */ Request) => Double): Self = StObject.set(x, "port", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "protocol", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setQuery(value: Boolean | (MatchBy[StringDictionary[_], StringDictionary[_]])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryFunction2(value: (StringDictionary[_], /* req */ Request) => StringDictionary[_]): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setUsername(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameFunction2(value: (String, /* req */ Request) => String): Self = StObject.set(x, "username", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var key: js.UndefOr[String] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait Page extends StObject {
    
    var page: js.UndefOr[js.Any] = js.native
    
    var requestResourceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object Page {
    
    @scala.inline
    def apply(): Page = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Page]
    }
    
    @scala.inline
    implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage(value: js.Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setRequestResourceTypes(value: js.Array[String]): Self = StObject.set(x, "requestResourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestResourceTypesUndefined: Self = StObject.set(x, "requestResourceTypes", js.undefined)
      
      @scala.inline
      def setRequestResourceTypesVarargs(value: String*): Self = StObject.set(x, "requestResourceTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RecordingsDir extends StObject {
    
    var recordingsDir: js.UndefOr[String] = js.native
  }
  object RecordingsDir {
    
    @scala.inline
    def apply(): RecordingsDir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingsDir]
    }
    
    @scala.inline
    implicit class RecordingsDirMutableBuilder[Self <: RecordingsDir] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
  
  @js.native
  trait TypeofPersister extends Instantiable0[default] {
    
    val id: String = js.native
    
    val `type`: String = js.native
  }
}
