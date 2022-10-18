package typings.next

import typings.next.anon.BaseNextRequestanyNEXTREQ
import typings.next.anon.NEXTREQUESTMETA
import typings.next.distServerBodyStreamsMod.ClonableBody
import typings.next.nextStrings.__NEXT_CLONABLE_BODY
import typings.next.nextStrings.__NEXT_INIT_QUERY
import typings.next.nextStrings.__NEXT_INIT_URL
import typings.next.nextStrings.__nextHadTrailingSlash
import typings.next.nextStrings.__nextIsLocaleDomain
import typings.next.nextStrings.__nextStrippedLocale
import typings.next.nextStrings._nextDidRewrite
import typings.next.nextStrings._nextHadBasePath
import typings.next.nextStrings._nextRewroteUrl
import typings.next.nextStrings._protocol
import typings.next.nextStrings.`1`
import typings.next.nextStrings.`true`
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.UrlWithParsedQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerRequestMetaMod {
  
  @JSImport("next/dist/server/request-meta", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/server/request-meta", "NEXT_REQUEST_META")
  @js.native
  val NEXT_REQUEST_META: js.Symbol = js.native
  
  inline def addRequestMeta_NEXTCLONABLEBODY(request: NextIncomingMessage, key: __NEXT_CLONABLE_BODY): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_NEXTCLONABLEBODY(request: NextIncomingMessage, key: __NEXT_CLONABLE_BODY, value: ClonableBody): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_NEXTINITQUERY(request: NextIncomingMessage, key: __NEXT_INIT_QUERY): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_NEXTINITQUERY(
    request: NextIncomingMessage,
    key: __NEXT_INIT_QUERY,
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_NEXTINITURL(request: NextIncomingMessage, key: __NEXT_INIT_URL): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_NEXTINITURL(request: NextIncomingMessage, key: __NEXT_INIT_URL, value: String): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextDidRewrite(request: NextIncomingMessage, key: _nextDidRewrite): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextDidRewrite(request: NextIncomingMessage, key: _nextDidRewrite, value: Boolean): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextHadBasePath(request: NextIncomingMessage, key: _nextHadBasePath): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextHadBasePath(request: NextIncomingMessage, key: _nextHadBasePath, value: Boolean): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextHadTrailingSlash(request: NextIncomingMessage, key: __nextHadTrailingSlash): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextHadTrailingSlash(request: NextIncomingMessage, key: __nextHadTrailingSlash, value: Boolean): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextIsLocaleDomain(request: NextIncomingMessage, key: __nextIsLocaleDomain): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextIsLocaleDomain(request: NextIncomingMessage, key: __nextIsLocaleDomain, value: Boolean): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextRewroteUrl(request: NextIncomingMessage, key: _nextRewroteUrl): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextRewroteUrl(request: NextIncomingMessage, key: _nextRewroteUrl, value: String): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_nextStrippedLocale(request: NextIncomingMessage, key: __nextStrippedLocale): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_nextStrippedLocale(request: NextIncomingMessage, key: __nextStrippedLocale, value: Boolean): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def addRequestMeta_protocol(request: NextIncomingMessage, key: _protocol): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  inline def addRequestMeta_protocol(request: NextIncomingMessage, key: _protocol, value: String): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("addRequestMeta")(request.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def getNextInternalQuery(query: NextParsedUrlQuery): NextQueryMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextInternalQuery")(query.asInstanceOf[js.Any]).asInstanceOf[NextQueryMetadata]
  
  inline def getRequestMeta(req: NextIncomingMessage, key: Unit): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  inline def getRequestMeta_NEXTCLONABLEBODY(req: NextIncomingMessage, key: __NEXT_CLONABLE_BODY): js.UndefOr[ClonableBody] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ClonableBody]]
  
  inline def getRequestMeta_NEXTINITQUERY(req: NextIncomingMessage, key: __NEXT_INIT_QUERY): js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ]]
  
  inline def getRequestMeta_NEXTINITURL(req: NextIncomingMessage, key: __NEXT_INIT_URL): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRequestMeta_nextDidRewrite(req: NextIncomingMessage, key: _nextDidRewrite): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getRequestMeta_nextHadBasePath(req: NextIncomingMessage, key: _nextHadBasePath): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getRequestMeta_nextHadTrailingSlash(req: NextIncomingMessage, key: __nextHadTrailingSlash): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getRequestMeta_nextIsLocaleDomain(req: NextIncomingMessage, key: __nextIsLocaleDomain): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getRequestMeta_nextRewroteUrl(req: NextIncomingMessage, key: _nextRewroteUrl): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRequestMeta_nextStrippedLocale(req: NextIncomingMessage, key: __nextStrippedLocale): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getRequestMeta_protocol(req: NextIncomingMessage, key: _protocol): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequestMeta")(req.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def setRequestMeta(req: NextIncomingMessage, meta: RequestMeta): RequestMeta = (^.asInstanceOf[js.Dynamic].applyDynamic("setRequestMeta")(req.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[RequestMeta]
  
  type NextIncomingMessage = BaseNextRequestanyNEXTREQ | (IncomingMessage & NEXTREQUESTMETA)
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery * / any */ trait NextParsedUrlQuery
    extends StObject
       with NextQueryMetadata {
    
    var amp: js.UndefOr[`1`] = js.undefined
  }
  object NextParsedUrlQuery {
    
    inline def apply(): NextParsedUrlQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextParsedUrlQuery]
    }
    
    extension [Self <: NextParsedUrlQuery](x: Self) {
      
      inline def setAmp(value: `1`): Self = StObject.set(x, "amp", value.asInstanceOf[js.Any])
      
      inline def setAmpUndefined: Self = StObject.set(x, "amp", js.undefined)
    }
  }
  
  trait NextQueryMetadata extends StObject {
    
    var __nextCustomErrorRender: js.UndefOr[`1`] = js.undefined
    
    var __nextDataReq: js.UndefOr[`1`] = js.undefined
    
    var __nextDefaultLocale: js.UndefOr[String] = js.undefined
    
    var __nextFallback: js.UndefOr[`true`] = js.undefined
    
    var __nextLocale: js.UndefOr[String] = js.undefined
    
    var __nextNotFoundSrcPage: js.UndefOr[String] = js.undefined
    
    var __nextSsgPath: js.UndefOr[String] = js.undefined
    
    var _nextBubbleNoFallback: js.UndefOr[`1`] = js.undefined
  }
  object NextQueryMetadata {
    
    inline def apply(): NextQueryMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextQueryMetadata]
    }
    
    extension [Self <: NextQueryMetadata](x: Self) {
      
      inline def set__nextCustomErrorRender(value: `1`): Self = StObject.set(x, "__nextCustomErrorRender", value.asInstanceOf[js.Any])
      
      inline def set__nextCustomErrorRenderUndefined: Self = StObject.set(x, "__nextCustomErrorRender", js.undefined)
      
      inline def set__nextDataReq(value: `1`): Self = StObject.set(x, "__nextDataReq", value.asInstanceOf[js.Any])
      
      inline def set__nextDataReqUndefined: Self = StObject.set(x, "__nextDataReq", js.undefined)
      
      inline def set__nextDefaultLocale(value: String): Self = StObject.set(x, "__nextDefaultLocale", value.asInstanceOf[js.Any])
      
      inline def set__nextDefaultLocaleUndefined: Self = StObject.set(x, "__nextDefaultLocale", js.undefined)
      
      inline def set__nextFallback(value: `true`): Self = StObject.set(x, "__nextFallback", value.asInstanceOf[js.Any])
      
      inline def set__nextFallbackUndefined: Self = StObject.set(x, "__nextFallback", js.undefined)
      
      inline def set__nextLocale(value: String): Self = StObject.set(x, "__nextLocale", value.asInstanceOf[js.Any])
      
      inline def set__nextLocaleUndefined: Self = StObject.set(x, "__nextLocale", js.undefined)
      
      inline def set__nextNotFoundSrcPage(value: String): Self = StObject.set(x, "__nextNotFoundSrcPage", value.asInstanceOf[js.Any])
      
      inline def set__nextNotFoundSrcPageUndefined: Self = StObject.set(x, "__nextNotFoundSrcPage", js.undefined)
      
      inline def set__nextSsgPath(value: String): Self = StObject.set(x, "__nextSsgPath", value.asInstanceOf[js.Any])
      
      inline def set__nextSsgPathUndefined: Self = StObject.set(x, "__nextSsgPath", js.undefined)
      
      inline def set_nextBubbleNoFallback(value: `1`): Self = StObject.set(x, "_nextBubbleNoFallback", value.asInstanceOf[js.Any])
      
      inline def set_nextBubbleNoFallbackUndefined: Self = StObject.set(x, "_nextBubbleNoFallback", js.undefined)
    }
  }
  
  trait NextUrlWithParsedQuery
    extends StObject
       with UrlWithParsedQuery {
    
    @JSName("query")
    var query_NextUrlWithParsedQuery: NextParsedUrlQuery
  }
  object NextUrlWithParsedQuery {
    
    inline def apply(href: String, query: NextParsedUrlQuery): NextUrlWithParsedQuery = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], auth = null, hash = null, host = null, hostname = null, path = null, pathname = null, port = null, protocol = null, search = null, slashes = null)
      __obj.asInstanceOf[NextUrlWithParsedQuery]
    }
    
    extension [Self <: NextUrlWithParsedQuery](x: Self) {
      
      inline def setQuery(value: NextParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestMeta extends StObject {
    
    var __NEXT_CLONABLE_BODY: js.UndefOr[ClonableBody] = js.undefined
    
    var __NEXT_INIT_QUERY: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ] = js.undefined
    
    var __NEXT_INIT_URL: js.UndefOr[String] = js.undefined
    
    var __nextHadTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var __nextIsLocaleDomain: js.UndefOr[Boolean] = js.undefined
    
    var __nextStrippedLocale: js.UndefOr[Boolean] = js.undefined
    
    var _nextDidRewrite: js.UndefOr[Boolean] = js.undefined
    
    var _nextHadBasePath: js.UndefOr[Boolean] = js.undefined
    
    var _nextRewroteUrl: js.UndefOr[String] = js.undefined
    
    var _protocol: js.UndefOr[String] = js.undefined
  }
  object RequestMeta {
    
    inline def apply(): RequestMeta = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestMeta]
    }
    
    extension [Self <: RequestMeta](x: Self) {
      
      inline def set__NEXT_CLONABLE_BODY(value: ClonableBody): Self = StObject.set(x, "__NEXT_CLONABLE_BODY", value.asInstanceOf[js.Any])
      
      inline def set__NEXT_CLONABLE_BODYUndefined: Self = StObject.set(x, "__NEXT_CLONABLE_BODY", js.undefined)
      
      inline def set__NEXT_INIT_QUERY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "__NEXT_INIT_QUERY", value.asInstanceOf[js.Any])
      
      inline def set__NEXT_INIT_QUERYUndefined: Self = StObject.set(x, "__NEXT_INIT_QUERY", js.undefined)
      
      inline def set__NEXT_INIT_URL(value: String): Self = StObject.set(x, "__NEXT_INIT_URL", value.asInstanceOf[js.Any])
      
      inline def set__NEXT_INIT_URLUndefined: Self = StObject.set(x, "__NEXT_INIT_URL", js.undefined)
      
      inline def set__nextHadTrailingSlash(value: Boolean): Self = StObject.set(x, "__nextHadTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def set__nextHadTrailingSlashUndefined: Self = StObject.set(x, "__nextHadTrailingSlash", js.undefined)
      
      inline def set__nextIsLocaleDomain(value: Boolean): Self = StObject.set(x, "__nextIsLocaleDomain", value.asInstanceOf[js.Any])
      
      inline def set__nextIsLocaleDomainUndefined: Self = StObject.set(x, "__nextIsLocaleDomain", js.undefined)
      
      inline def set__nextStrippedLocale(value: Boolean): Self = StObject.set(x, "__nextStrippedLocale", value.asInstanceOf[js.Any])
      
      inline def set__nextStrippedLocaleUndefined: Self = StObject.set(x, "__nextStrippedLocale", js.undefined)
      
      inline def set_nextDidRewrite(value: Boolean): Self = StObject.set(x, "_nextDidRewrite", value.asInstanceOf[js.Any])
      
      inline def set_nextDidRewriteUndefined: Self = StObject.set(x, "_nextDidRewrite", js.undefined)
      
      inline def set_nextHadBasePath(value: Boolean): Self = StObject.set(x, "_nextHadBasePath", value.asInstanceOf[js.Any])
      
      inline def set_nextHadBasePathUndefined: Self = StObject.set(x, "_nextHadBasePath", js.undefined)
      
      inline def set_nextRewroteUrl(value: String): Self = StObject.set(x, "_nextRewroteUrl", value.asInstanceOf[js.Any])
      
      inline def set_nextRewroteUrlUndefined: Self = StObject.set(x, "_nextRewroteUrl", js.undefined)
      
      inline def set_protocol(value: String): Self = StObject.set(x, "_protocol", value.asInstanceOf[js.Any])
      
      inline def set_protocolUndefined: Self = StObject.set(x, "_protocol", js.undefined)
    }
  }
}
