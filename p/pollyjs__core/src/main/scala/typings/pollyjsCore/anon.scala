package typings.pollyjsCore

import org.scalablytyped.runtime.StringDictionary
import typings.loglevel.mod.LogLevelDesc
import typings.pollyjsCore.mod.EXPIRY_STRATEGY
import typings.pollyjsCore.mod.Headers
import typings.pollyjsCore.mod.MODE
import typings.pollyjsCore.mod.MatchBy
import typings.pollyjsCore.mod.Newable
import typings.pollyjsCore.mod.Request
import typings.pollyjsPersister.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    }
  }
  
  trait ApiNamespace extends StObject {
    
    var apiNamespace: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
  }
  object ApiNamespace {
    
    inline def apply(): ApiNamespace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiNamespace]
    }
    
    extension [Self <: ApiNamespace](x: Self) {
      
      inline def setApiNamespace(value: String): Self = StObject.set(x, "apiNamespace", value.asInstanceOf[js.Any])
      
      inline def setApiNamespaceUndefined: Self = StObject.set(x, "apiNamespace", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    }
  }
  
  trait Body extends StObject {
    
    var body: js.UndefOr[Boolean | (MatchBy[Any, Any])] = js.undefined
    
    var headers: js.UndefOr[Boolean | Exclude | (MatchBy[Headers, Headers])] = js.undefined
    
    var method: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var order: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[Boolean | (MatchBy[String, String]) | Hash] = js.undefined
  }
  object Body {
    
    inline def apply(): Body = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setBody(value: Boolean | (MatchBy[Any, Any])): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyFunction2(value: (Any, /* req */ Request[js.Object]) => Any): Self = StObject.set(x, "body", js.Any.fromFunction2(value))
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: Boolean | Exclude | (MatchBy[Headers, Headers])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersFunction2(value: (Headers, /* req */ Request[js.Object]) => Headers): Self = StObject.set(x, "headers", js.Any.fromFunction2(value))
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setOrder(value: Boolean): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setUrl(value: Boolean | (MatchBy[String, String]) | Hash): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "url", js.Any.fromFunction2(value))
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: js.UndefOr[Any] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var disableSortingHarEntries: js.UndefOr[Boolean] = js.undefined
    
    var fs: js.UndefOr[RecordingsDir] = js.undefined
    
    var keepUnusedRequests: js.UndefOr[Boolean] = js.undefined
    
    var `local-storage`: js.UndefOr[Context] = js.undefined
    
    var rest: js.UndefOr[ApiNamespace] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setDisableSortingHarEntries(value: Boolean): Self = StObject.set(x, "disableSortingHarEntries", value.asInstanceOf[js.Any])
      
      inline def setDisableSortingHarEntriesUndefined: Self = StObject.set(x, "disableSortingHarEntries", js.undefined)
      
      inline def setFs(value: RecordingsDir): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
      
      inline def setKeepUnusedRequests(value: Boolean): Self = StObject.set(x, "keepUnusedRequests", value.asInstanceOf[js.Any])
      
      inline def setKeepUnusedRequestsUndefined: Self = StObject.set(x, "keepUnusedRequests", js.undefined)
      
      inline def `setLocal-storage`(value: Context): Self = StObject.set(x, "local-storage", value.asInstanceOf[js.Any])
      
      inline def `setLocal-storageUndefined`: Self = StObject.set(x, "local-storage", js.undefined)
      
      inline def setRest(value: ApiNamespace): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    }
  }
  
  trait Exclude extends StObject {
    
    var exclude: js.Array[String]
  }
  object Exclude {
    
    inline def apply(exclude: js.Array[String]): Exclude = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exclude]
    }
    
    extension [Self <: Exclude](x: Self) {
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    }
  }
  
  trait Fetch
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var fetch: js.UndefOr[`0`] = js.undefined
    
    var puppeteer: js.UndefOr[Page] = js.undefined
    
    var xhr: js.UndefOr[`0`] = js.undefined
  }
  object Fetch {
    
    inline def apply(): Fetch = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fetch]
    }
    
    extension [Self <: Fetch](x: Self) {
      
      inline def setFetch(value: `0`): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setPuppeteer(value: Page): Self = StObject.set(x, "puppeteer", value.asInstanceOf[js.Any])
      
      inline def setPuppeteerUndefined: Self = StObject.set(x, "puppeteer", js.undefined)
      
      inline def setXhr(value: `0`): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait Hash extends StObject {
    
    var hash: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var hostname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var password: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var pathname: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var port: js.UndefOr[Boolean | (MatchBy[Double, Double])] = js.undefined
    
    var protocol: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
    
    var query: js.UndefOr[Boolean | (MatchBy[StringDictionary[Any], StringDictionary[Any]])] = js.undefined
    
    var username: js.UndefOr[Boolean | (MatchBy[String, String])] = js.undefined
  }
  object Hash {
    
    inline def apply(): Hash = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hash]
    }
    
    extension [Self <: Hash](x: Self) {
      
      inline def setHash(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHostname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "hostname", js.Any.fromFunction2(value))
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setPassword(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "password", js.Any.fromFunction2(value))
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPathname(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "pathname", js.Any.fromFunction2(value))
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPort(value: Boolean | (MatchBy[Double, Double])): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortFunction2(value: (Double, /* req */ Request[js.Object]) => Double): Self = StObject.set(x, "port", js.Any.fromFunction2(value))
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "protocol", js.Any.fromFunction2(value))
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setQuery(value: Boolean | (MatchBy[StringDictionary[Any], StringDictionary[Any]])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryFunction2(value: (StringDictionary[Any], /* req */ Request[js.Object]) => StringDictionary[Any]): Self = StObject.set(x, "query", js.Any.fromFunction2(value))
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setUsername(value: Boolean | (MatchBy[String, String])): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameFunction2(value: (String, /* req */ Request[js.Object]) => String): Self = StObject.set(x, "username", js.Any.fromFunction2(value))
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Page extends StObject {
    
    var page: js.UndefOr[Any] = js.undefined
    
    var requestResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Page {
    
    inline def apply(): Page = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Page]
    }
    
    extension [Self <: Page](x: Self) {
      
      inline def setPage(value: Any): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRequestResourceTypes(value: js.Array[String]): Self = StObject.set(x, "requestResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setRequestResourceTypesUndefined: Self = StObject.set(x, "requestResourceTypes", js.undefined)
      
      inline def setRequestResourceTypesVarargs(value: String*): Self = StObject.set(x, "requestResourceTypes", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<@pollyjs/core.@pollyjs/core.PollyConfig> */
  trait PartialPollyConfig extends StObject {
    
    var adapterOptions: js.UndefOr[Fetch] = js.undefined
    
    var adapters: js.UndefOr[
        js.Array[
          String | (Newable[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Adapter */ Any
          ])
        ]
      ] = js.undefined
    
    var expiresIn: js.UndefOr[String | Null] = js.undefined
    
    var expiryStrategy: js.UndefOr[EXPIRY_STRATEGY] = js.undefined
    
    var flushRequestsOnStop: js.UndefOr[Boolean] = js.undefined
    
    var logLevel: js.UndefOr[LogLevelDesc] = js.undefined
    
    var matchRequestsBy: js.UndefOr[Body] = js.undefined
    
    var mode: js.UndefOr[MODE] = js.undefined
    
    var persister: js.UndefOr[String | Newable[default[js.Object]]] = js.undefined
    
    var persisterOptions: js.UndefOr[Dictkey] = js.undefined
    
    var recordFailedRequests: js.UndefOr[Boolean] = js.undefined
    
    var recordIfMissing: js.UndefOr[Boolean] = js.undefined
    
    var timing: js.UndefOr[
        (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]
      ] = js.undefined
  }
  object PartialPollyConfig {
    
    inline def apply(): PartialPollyConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPollyConfig]
    }
    
    extension [Self <: PartialPollyConfig](x: Self) {
      
      inline def setAdapterOptions(value: Fetch): Self = StObject.set(x, "adapterOptions", value.asInstanceOf[js.Any])
      
      inline def setAdapterOptionsUndefined: Self = StObject.set(x, "adapterOptions", js.undefined)
      
      inline def setAdapters(
        value: js.Array[
              String | (Newable[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Adapter */ Any
              ])
            ]
      ): Self = StObject.set(x, "adapters", value.asInstanceOf[js.Any])
      
      inline def setAdaptersUndefined: Self = StObject.set(x, "adapters", js.undefined)
      
      inline def setAdaptersVarargs(
        value: (String | (Newable[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Adapter */ Any
            ]))*
      ): Self = StObject.set(x, "adapters", js.Array(value*))
      
      inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
      
      inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      inline def setExpiryStrategy(value: EXPIRY_STRATEGY): Self = StObject.set(x, "expiryStrategy", value.asInstanceOf[js.Any])
      
      inline def setExpiryStrategyUndefined: Self = StObject.set(x, "expiryStrategy", js.undefined)
      
      inline def setFlushRequestsOnStop(value: Boolean): Self = StObject.set(x, "flushRequestsOnStop", value.asInstanceOf[js.Any])
      
      inline def setFlushRequestsOnStopUndefined: Self = StObject.set(x, "flushRequestsOnStop", js.undefined)
      
      inline def setLogLevel(value: LogLevelDesc): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMatchRequestsBy(value: Body): Self = StObject.set(x, "matchRequestsBy", value.asInstanceOf[js.Any])
      
      inline def setMatchRequestsByUndefined: Self = StObject.set(x, "matchRequestsBy", js.undefined)
      
      inline def setMode(value: MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPersister(value: String | Newable[default[js.Object]]): Self = StObject.set(x, "persister", value.asInstanceOf[js.Any])
      
      inline def setPersisterOptions(value: Dictkey): Self = StObject.set(x, "persisterOptions", value.asInstanceOf[js.Any])
      
      inline def setPersisterOptionsUndefined: Self = StObject.set(x, "persisterOptions", js.undefined)
      
      inline def setPersisterUndefined: Self = StObject.set(x, "persister", js.undefined)
      
      inline def setRecordFailedRequests(value: Boolean): Self = StObject.set(x, "recordFailedRequests", value.asInstanceOf[js.Any])
      
      inline def setRecordFailedRequestsUndefined: Self = StObject.set(x, "recordFailedRequests", js.undefined)
      
      inline def setRecordIfMissing(value: Boolean): Self = StObject.set(x, "recordIfMissing", value.asInstanceOf[js.Any])
      
      inline def setRecordIfMissingUndefined: Self = StObject.set(x, "recordIfMissing", js.undefined)
      
      inline def setTiming(value: (js.Function1[/* ms */ Double, js.Promise[Unit]]) | js.Function0[js.Promise[Unit]]): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      inline def setTimingFunction0(value: () => js.Promise[Unit]): Self = StObject.set(x, "timing", js.Any.fromFunction0(value))
      
      inline def setTimingFunction1(value: /* ms */ Double => js.Promise[Unit]): Self = StObject.set(x, "timing", js.Any.fromFunction1(value))
      
      inline def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    }
  }
  
  trait RecordingsDir extends StObject {
    
    var recordingsDir: js.UndefOr[String] = js.undefined
  }
  object RecordingsDir {
    
    inline def apply(): RecordingsDir = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecordingsDir]
    }
    
    extension [Self <: RecordingsDir](x: Self) {
      
      inline def setRecordingsDir(value: String): Self = StObject.set(x, "recordingsDir", value.asInstanceOf[js.Any])
      
      inline def setRecordingsDirUndefined: Self = StObject.set(x, "recordingsDir", js.undefined)
    }
  }
}
