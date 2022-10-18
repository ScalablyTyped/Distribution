package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.As
import typings.next.anon.Component
import typings.next.anon.Data
import typings.next.anon.Destination
import typings.next.anon.Errorcodeanyundefinedcanc
import typings.next.anon.NewAs
import typings.next.anon.ParamsResult
import typings.next.anon.PickCompletePrivateRouteI
import typings.next.anon.X
import typings.next.distClientPageLoaderMod.GoodPageCache
import typings.next.distClientPageLoaderMod.StyleSheetTuple
import typings.next.distClientRouterMod.RouterEvent
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.next.distSharedLibMittMod.MittEmitter
import typings.next.distSharedLibUtilsMod.NEXT_DATA
import typings.next.distSharedLibUtilsMod.NextPageContext
import typings.next.nextBooleans.`false`
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.std.PopStateEvent
import typings.std.Record
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibRouterRouterMod {
  
  @JSImport("next/dist/shared/lib/router/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/shared/lib/router/router", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Router {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallbackLocaleLocalesDefaultLocaleDomainLocalesIsPreview: Component
    ) = this()
    
    /* CompleteClass */
    var asPath: String = js.native
    
    /* CompleteClass */
    var basePath: String = js.native
    
    /* CompleteClass */
    var isLocaleDomain: Boolean = js.native
    
    /* CompleteClass */
    var pathname: String = js.native
    
    /* CompleteClass */
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any = js.native
    
    /* CompleteClass */
    var route: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("next/dist/shared/lib/router/router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/shared/lib/router/router", "default.events")
    @js.native
    def events: MittEmitter[RouterEvent] = js.native
    inline def events_=(x: MittEmitter[RouterEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def createKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createKey")().asInstanceOf[String]
  
  inline def interpolateAs(
    route: String,
    asPathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  ): ParamsResult = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateAs")(route.asInstanceOf[js.Any], asPathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[ParamsResult]
  
  inline def isLocalURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def matchesMiddleware[T /* <: FetchDataOutput */](options: MiddlewareEffectParams[T]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("matchesMiddleware")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def resolveHref(router: NextRouter, href: Url): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHref")(router.asInstanceOf[js.Any], href.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveHref(router: NextRouter, href: Url, resolveAs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHref")(router.asInstanceOf[js.Any], href.asInstanceOf[js.Any], resolveAs.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AppComponent = ComponentType[AppProps]
  
  type AppProps = PickCompletePrivateRouteI & typings.next.anon.Router & (Record[String, Any])
  
  trait BaseRouter extends StObject {
    
    var asPath: String
    
    var basePath: String
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var isLocaleDomain: Boolean
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var pathname: String
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var route: String
  }
  object BaseRouter {
    
    inline def apply(
      asPath: String,
      basePath: String,
      isLocaleDomain: Boolean,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      route: String
    ): BaseRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], isLocaleDomain = isLocaleDomain.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRouter]
    }
    
    extension [Self <: BaseRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setIsLocaleDomain(value: Boolean): Self = StObject.set(x, "isLocaleDomain", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type BeforePopStateCallback = js.Function1[/* state */ NextHistoryState, Boolean]
  
  trait CompletePrivateRouteInfo
    extends StObject
       with PrivateRouteInfo {
    
    var Component: ComponentType[js.Object]
    
    var __N_SSG: js.UndefOr[Boolean] = js.undefined
    
    var __N_SSP: js.UndefOr[Boolean] = js.undefined
    
    var err: js.UndefOr[js.Error] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var props: js.UndefOr[Record[String, Any]] = js.undefined
    
    var query: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ] = js.undefined
    
    var resolvedAs: js.UndefOr[String] = js.undefined
    
    var route: js.UndefOr[String] = js.undefined
    
    var styleSheets: js.Array[StyleSheetTuple]
  }
  object CompletePrivateRouteInfo {
    
    inline def apply(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): CompletePrivateRouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletePrivateRouteInfo]
    }
    
    extension [Self <: CompletePrivateRouteInfo](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProps(value: Record[String, Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setResolvedAs(value: String): Self = StObject.set(x, "resolvedAs", value.asInstanceOf[js.Any])
      
      inline def setResolvedAsUndefined: Self = StObject.set(x, "resolvedAs", js.undefined)
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = StObject.set(x, "styleSheets", js.Array(value*))
      
      inline def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
      
      inline def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
      
      inline def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
      
      inline def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
    }
  }
  
  type ComponentLoadCancel = js.Function0[Unit] | Null
  
  trait FetchDataOutput extends StObject {
    
    var cacheKey: String
    
    var dataHref: String
    
    var json: (Record[String, Any]) | Null
    
    var response: Response
    
    var text: String
  }
  object FetchDataOutput {
    
    inline def apply(cacheKey: String, dataHref: String, response: Response, text: String): FetchDataOutput = {
      val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], dataHref = dataHref.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], json = null)
      __obj.asInstanceOf[FetchDataOutput]
    }
    
    extension [Self <: FetchDataOutput](x: Self) {
      
      inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
      
      inline def setDataHref(value: String): Self = StObject.set(x, "dataHref", value.asInstanceOf[js.Any])
      
      inline def setJson(value: Record[String, Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonNull: Self = StObject.set(x, "json", null)
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.replaceState
    - typings.next.nextStrings.pushState
  */
  trait HistoryMethod extends StObject
  object HistoryMethod {
    
    inline def pushState: typings.next.nextStrings.pushState = "pushState".asInstanceOf[typings.next.nextStrings.pushState]
    
    inline def replaceState: typings.next.nextStrings.replaceState = "replaceState".asInstanceOf[typings.next.nextStrings.replaceState]
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.next.anon.N
    - typings.next.anon.NA
    - typings.next.anon.NAfalseundefinedNtruekeys
  */
  type HistoryState = _HistoryState | Null
  
  trait MiddlewareEffectParams[T /* <: FetchDataOutput */] extends StObject {
    
    var asPath: String
    
    var fetchData: js.UndefOr[js.Function0[js.Promise[T]]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var router: Router
  }
  object MiddlewareEffectParams {
    
    inline def apply[T /* <: FetchDataOutput */](asPath: String, router: Router): MiddlewareEffectParams[T] = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiddlewareEffectParams[T]]
    }
    
    extension [Self <: MiddlewareEffectParams[?], T /* <: FetchDataOutput */](x: Self & MiddlewareEffectParams[T]) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setFetchData(value: () => js.Promise[T]): Self = StObject.set(x, "fetchData", js.Any.fromFunction0(value))
      
      inline def setFetchDataUndefined: Self = StObject.set(x, "fetchData", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setRouter(value: Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
  
  type NextDataCache = StringDictionary[js.Promise[FetchDataOutput]]
  
  trait NextHistoryState extends StObject {
    
    var as: String
    
    var options: TransitionOptions
    
    var url: String
  }
  object NextHistoryState {
    
    inline def apply(as: String, options: TransitionOptions, url: String): NextHistoryState = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextHistoryState]
    }
    
    extension [Self <: NextHistoryState](x: Self) {
      
      inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: TransitionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined next.next/dist/shared/lib/router/router.BaseRouter & std.Pick<next.next/dist/shared/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events' | 'isFallback' | 'isReady' | 'isPreview'> */
  trait NextRouter extends StObject {
    
    var asPath: String
    
    var back: js.Function0[Unit]
    
    var basePath: String
    
    var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var domainLocales: js.UndefOr[js.Array[DomainLocale]] = js.undefined
    
    var events: MittEmitter[RouterEvent]
    
    var isFallback: js.Function0[Boolean]
    
    var isLocaleDomain: Boolean
    
    var isPreview: js.Function0[Boolean]
    
    var isReady: Boolean
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var pathname: String
    
    var prefetch: js.Function3[
        /* url */ String, 
        /* asPath */ js.UndefOr[String], 
        /* options */ js.UndefOr[PrefetchOptions], 
        js.Promise[Unit]
      ]
    
    var push: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[TransitionOptions], 
        js.Promise[Boolean]
      ]
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var reload: js.Function0[Unit]
    
    var replace: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[TransitionOptions], 
        js.Promise[Boolean]
      ]
    
    var route: String
  }
  object NextRouter {
    
    inline def apply(
      asPath: String,
      back: () => Unit,
      basePath: String,
      beforePopState: /* cb */ BeforePopStateCallback => Unit,
      events: MittEmitter[RouterEvent],
      isFallback: () => Boolean,
      isLocaleDomain: Boolean,
      isPreview: () => Boolean,
      isReady: Boolean,
      pathname: String,
      prefetch: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit],
      push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      reload: () => Unit,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      route: String
    ): NextRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), basePath = basePath.asInstanceOf[js.Any], beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], isFallback = js.Any.fromFunction0(isFallback), isLocaleDomain = isLocaleDomain.asInstanceOf[js.Any], isPreview = js.Any.fromFunction0(isPreview), isReady = isReady.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction3(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRouter]
    }
    
    extension [Self <: NextRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = StObject.set(x, "beforePopState", js.Any.fromFunction1(value))
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setDomainLocales(value: js.Array[DomainLocale]): Self = StObject.set(x, "domainLocales", value.asInstanceOf[js.Any])
      
      inline def setDomainLocalesUndefined: Self = StObject.set(x, "domainLocales", js.undefined)
      
      inline def setDomainLocalesVarargs(value: DomainLocale*): Self = StObject.set(x, "domainLocales", js.Array(value*))
      
      inline def setEvents(value: MittEmitter[RouterEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setIsFallback(value: () => Boolean): Self = StObject.set(x, "isFallback", js.Any.fromFunction0(value))
      
      inline def setIsLocaleDomain(value: Boolean): Self = StObject.set(x, "isLocaleDomain", value.asInstanceOf[js.Any])
      
      inline def setIsPreview(value: () => Boolean): Self = StObject.set(x, "isPreview", js.Any.fromFunction0(value))
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPrefetch(
        value: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit]
      ): Self = StObject.set(x, "prefetch", js.Any.fromFunction3(value))
      
      inline def setPush(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setReplace(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrefetchOptions extends StObject {
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var priority: js.UndefOr[Boolean] = js.undefined
    
    var unstable_skipClientCache: js.UndefOr[Boolean] = js.undefined
  }
  object PrefetchOptions {
    
    inline def apply(): PrefetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrefetchOptions]
    }
    
    extension [Self <: PrefetchOptions](x: Self) {
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPriority(value: Boolean): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setUnstable_skipClientCache(value: Boolean): Self = StObject.set(x, "unstable_skipClientCache", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipClientCacheUndefined: Self = StObject.set(x, "unstable_skipClientCache", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.OmitCompletePrivateRouteI
    - typings.next.distSharedLibRouterRouterMod.CompletePrivateRouteInfo
  */
  trait PrivateRouteInfo extends StObject
  object PrivateRouteInfo {
    
    inline def CompletePrivateRouteInfo(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): typings.next.distSharedLibRouterRouterMod.CompletePrivateRouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distSharedLibRouterRouterMod.CompletePrivateRouteInfo]
    }
    
    inline def OmitCompletePrivateRouteI(Component: ComponentType[js.Object]): typings.next.anon.OmitCompletePrivateRouteI = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = true)
      __obj.asInstanceOf[typings.next.anon.OmitCompletePrivateRouteI]
    }
  }
  
  trait RouteProperties extends StObject {
    
    var shallow: Boolean
  }
  object RouteProperties {
    
    inline def apply(shallow: Boolean): RouteProperties = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProperties]
    }
    
    extension [Self <: RouteProperties](x: Self) {
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router
    extends StObject
       with BaseRouter {
    
    var _bps: js.UndefOr[BeforePopStateCallback] = js.native
    
    def _getData[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    def _getFlightData(dataHref: String): js.Promise[Data] = js.native
    
    var _inFlightRoute: js.UndefOr[String] = js.native
    
    var _initialMatchesMiddlewarePromise: js.Promise[Boolean] = js.native
    
    /* private */ var _key: Any = js.native
    
    var _shallow: js.UndefOr[Boolean] = js.native
    
    def _wrapApp(App: AppComponent): Any = js.native
    
    @JSName("asPath")
    def asPath_MRouter: String = js.native
    
    /**
      * Go back in history
      */
    def back(): Unit = js.native
    
    /**
      * Callback to execute before replacing router state
      * @param cb callback to be executed
      */
    def beforePopState(cb: BeforePopStateCallback): Unit = js.native
    
    /* private */ var change: Any = js.native
    
    def changeState(method: HistoryMethod, url: String, as: String): Unit = js.native
    def changeState(method: HistoryMethod, url: String, as: String, options: TransitionOptions): Unit = js.native
    
    var clc: ComponentLoadCancel = js.native
    
    /**
      * Map of all components loaded in `Router`
      */
    var components: StringDictionary[PrivateRouteInfo] = js.native
    
    var events: MittEmitter[RouterEvent] = js.native
    
    def fetchComponent(route: String): js.Promise[GoodPageCache] = js.native
    
    def getInitialProps(Component: ComponentType[js.Object], ctx: NextPageContext): js.Promise[Any] = js.native
    
    def getRouteInfo(
      hasRequestedRoutePathnameQueryAsResolvedAsRoutePropsLocaleHasMiddlewareIsPreviewUnstable_skipClientCache: As
    ): js.Promise[PrivateRouteInfo | Destination | NewAs] = js.native
    
    def handleRouteInfoError(
      err: Errorcodeanyundefinedcanc,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      routeProps: RouteProperties
    ): js.Promise[CompletePrivateRouteInfo] = js.native
    def handleRouteInfoError(
      err: Errorcodeanyundefinedcanc,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      routeProps: RouteProperties,
      loadErrorFail: Boolean
    ): js.Promise[CompletePrivateRouteInfo] = js.native
    
    def isFallback: Boolean = js.native
    
    var isFirstPopStateEvent: Boolean = js.native
    
    def isPreview: Boolean = js.native
    
    var isReady: Boolean = js.native
    
    var isSsr: Boolean = js.native
    
    @JSName("locale")
    def locale_MRouter: js.UndefOr[String] = js.native
    
    def onPopState(e: PopStateEvent): Unit = js.native
    
    def onlyAHashChange(as: String): Boolean = js.native
    
    var pageLoader: typings.next.distClientPageLoaderMod.default = js.native
    
    @JSName("pathname")
    def pathname_MRouter: String = js.native
    
    /**
      * Prefetch page code, you may wait for the data during page rendering.
      * This feature only works in production!
      * @param url the href of prefetched page
      * @param asPath the as path of the prefetched page
      */
    def prefetch(url: String): js.Promise[Unit] = js.native
    def prefetch(url: String, asPath: String): js.Promise[Unit] = js.native
    def prefetch(url: String, asPath: String, options: PrefetchOptions): js.Promise[Unit] = js.native
    def prefetch(url: String, asPath: Unit, options: PrefetchOptions): js.Promise[Unit] = js.native
    
    /**
      * Performs a `pushState` with arguments
      * @param url of the route
      * @param as masks `url` for the browser
      * @param options object you can define `shallow` and other options
      */
    def push(url: Url): js.Promise[Boolean] = js.native
    def push(url: Url, as: Unit, options: TransitionOptions): js.Promise[Boolean] = js.native
    def push(url: Url, as: Url): js.Promise[Boolean] = js.native
    def push(url: Url, as: Url, options: TransitionOptions): js.Promise[Boolean] = js.native
    
    @JSName("query")
    def query_MRouter: Any = js.native
    
    def reload(): Unit = js.native
    
    /**
      * Performs a `replaceState` with arguments
      * @param url of the route
      * @param as masks `url` for the browser
      * @param options object you can define `shallow` and other options
      */
    def replace(url: Url): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Unit, options: TransitionOptions): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Url): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Url, options: TransitionOptions): js.Promise[Boolean] = js.native
    
    @JSName("route")
    def route_MRouter: String = js.native
    
    def scrollToHash(as: String): Unit = js.native
    
    var sdc: NextDataCache = js.native
    
    /* private */ var set: Any = js.native
    
    /* private */ var state: Any = js.native
    
    var sub: Subscription = js.native
    
    def urlIsNew(asPath: String): Boolean = js.native
  }
  
  type Subscription = js.Function3[
    /* data */ PrivateRouteInfo, 
    /* App */ AppComponent, 
    /* resetScroll */ X | Null, 
    js.Promise[Unit]
  ]
  
  trait TransitionOptions extends StObject {
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
    
    var shallow: js.UndefOr[Boolean] = js.undefined
    
    var unstable_skipClientCache: js.UndefOr[Boolean] = js.undefined
  }
  object TransitionOptions {
    
    inline def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    extension [Self <: TransitionOptions](x: Self) {
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
      
      inline def setUnstable_skipClientCache(value: Boolean): Self = StObject.set(x, "unstable_skipClientCache", value.asInstanceOf[js.Any])
      
      inline def setUnstable_skipClientCacheUndefined: Self = StObject.set(x, "unstable_skipClientCache", js.undefined)
    }
  }
  
  type Url = UrlObject | String
  
  trait _HistoryState extends StObject
  object _HistoryState {
    
    inline def N(): typings.next.anon.N = {
      val __obj = js.Dynamic.literal(__NA = true)
      __obj.asInstanceOf[typings.next.anon.N]
    }
    
    inline def NA(): typings.next.anon.NA = {
      val __obj = js.Dynamic.literal(__N = false)
      __obj.asInstanceOf[typings.next.anon.NA]
    }
    
    inline def NAfalseundefinedNtruekeys(as: String, key: String, options: TransitionOptions, url: String): typings.next.anon.NAfalseundefinedNtruekeys = {
      val __obj = js.Dynamic.literal(__N = true, as = as.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.NAfalseundefinedNtruekeys]
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var __NEXT_DATA__ : NEXT_DATA
    }
    object Window {
      
      inline def apply(__NEXT_DATA__ : NEXT_DATA): typings.next.distSharedLibRouterRouterMod.global.Window = {
        val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.next.distSharedLibRouterRouterMod.global.Window]
      }
      
      extension [Self <: typings.next.distSharedLibRouterRouterMod.global.Window](x: Self) {
        
        inline def set__NEXT_DATA__(value: NEXT_DATA): Self = StObject.set(x, "__NEXT_DATA__", value.asInstanceOf[js.Any])
      }
    }
  }
}
