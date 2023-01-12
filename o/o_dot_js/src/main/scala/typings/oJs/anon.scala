package typings.oJs

import typings.oJs.distTypesOdataConfigMod.OdataBatchConfig
import typings.oJs.distTypesOdataQueryMod.OdataQuery
import typings.oJs.distTypesOhandlerMod.OHandler
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<o.js.o.js/dist/types/OdataConfig.OdataConfig> */
  trait PartialOdataConfig extends StObject {
    
    var batch: js.UndefOr[OdataBatchConfig] = js.undefined
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var disablePolyfill: js.UndefOr[Boolean] = js.undefined
    
    var fragment: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* oHandler */ OHandler, /* res */ Response, Null]] = js.undefined
    
    var onFinish: js.UndefOr[js.Function2[/* oHandler */ OHandler, /* res */ js.UndefOr[Response], Null]] = js.undefined
    
    var onStart: js.UndefOr[js.Function1[/* oHandler */ OHandler, Null]] = js.undefined
    
    var query: js.UndefOr[URLSearchParams | OdataQuery] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var rootUrl: js.UndefOr[URL | String] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object PartialOdataConfig {
    
    inline def apply(): PartialOdataConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOdataConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOdataConfig] (val x: Self) extends AnyVal {
      
      inline def setBatch(value: OdataBatchConfig): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDisablePolyfill(value: Boolean): Self = StObject.set(x, "disablePolyfill", value.asInstanceOf[js.Any])
      
      inline def setDisablePolyfillUndefined: Self = StObject.set(x, "disablePolyfill", js.undefined)
      
      inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnError(value: (/* oHandler */ OHandler, /* res */ Response) => Null): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFinish(value: (/* oHandler */ OHandler, /* res */ js.UndefOr[Response]) => Null): Self = StObject.set(x, "onFinish", js.Any.fromFunction2(value))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      inline def setOnStart(value: /* oHandler */ OHandler => Null): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setQuery(value: URLSearchParams | OdataQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setRootUrl(value: URL | String): Self = StObject.set(x, "rootUrl", value.asInstanceOf[js.Any])
      
      inline def setRootUrlUndefined: Self = StObject.set(x, "rootUrl", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
}
