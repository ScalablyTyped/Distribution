package typings.next

import org.scalablytyped.runtime.StringDictionary
import typings.next.anon.App
import typings.next.anon.Errorcodeanycancelledbool
import typings.next.anon.Params
import typings.next.anon.PickCompletePrivateRouteI
import typings.next.libUtilsMod.NextPageContext
import typings.next.mittMod.MittEmitter
import typings.next.nextBooleans.`false`
import typings.next.pageLoaderMod.GoodPageCache
import typings.next.pageLoaderMod.StyleSheetTuple
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.std.Error
import typings.std.PopStateEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("next/dist/next-server/lib/router/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Router {
    def this(
      pathname: String,
      query: ParsedUrlQuery,
      as: String,
      hasInitialPropsPageLoaderAppWrapAppComponentErrSubscriptionIsFallbackLocaleLocalesDefaultLocale: App
    ) = this()
    
    /* CompleteClass */
    var asPath: String = js.native
    
    /* CompleteClass */
    var basePath: String = js.native
    
    /* CompleteClass */
    var pathname: String = js.native
    
    /* CompleteClass */
    var query: ParsedUrlQuery = js.native
    
    /* CompleteClass */
    var route: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("next/dist/next-server/lib/router/router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/next-server/lib/router/router", "default.events")
    @js.native
    def events: MittEmitter = js.native
    inline def events_=(x: MittEmitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def addBasePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def addLocale(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def addLocale(path: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addLocale(path: String, locale: String, defaultLocale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addLocale(path: String, locale: Unit, defaultLocale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def addLocale_false(path: String, locale: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def addLocale_false(path: String, locale: `false`, defaultLocale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], defaultLocale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def delBasePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("delBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def delLocale(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("delLocale")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def delLocale(path: String, locale: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("delLocale")(path.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hasBasePath(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBasePath")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def interpolateAs(route: String, asPathname: String, query: ParsedUrlQuery): Params = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateAs")(route.asInstanceOf[js.Any], asPathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Params]
  
  inline def isLocalURL(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocalURL")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveHref(currentPath: String, href: Url): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHref")(currentPath.asInstanceOf[js.Any], href.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveHref(currentPath: String, href: Url, resolveAs: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveHref")(currentPath.asInstanceOf[js.Any], href.asInstanceOf[js.Any], resolveAs.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type AppComponent = ComponentType[AppProps]
  
  type AppProps = PickCompletePrivateRouteI & typings.next.anon.Router & (Record[String, js.Any])
  
  trait BaseRouter extends StObject {
    
    var asPath: String
    
    var basePath: String
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var locales: js.UndefOr[js.Array[String]] = js.undefined
    
    var pathname: String
    
    var query: ParsedUrlQuery
    
    var route: String
  }
  object BaseRouter {
    
    inline def apply(asPath: String, basePath: String, pathname: String, query: ParsedUrlQuery, route: String): BaseRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRouter]
    }
    
    extension [Self <: BaseRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
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
    
    var err: js.UndefOr[Error] = js.undefined
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var props: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var styleSheets: js.Array[StyleSheetTuple]
  }
  object CompletePrivateRouteInfo {
    
    inline def apply(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): CompletePrivateRouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletePrivateRouteInfo]
    }
    
    extension [Self <: CompletePrivateRouteInfo](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setErr(value: Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProps(value: Record[String, js.Any]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = StObject.set(x, "styleSheets", js.Array(value :_*))
      
      inline def set__N_SSG(value: Boolean): Self = StObject.set(x, "__N_SSG", value.asInstanceOf[js.Any])
      
      inline def set__N_SSGUndefined: Self = StObject.set(x, "__N_SSG", js.undefined)
      
      inline def set__N_SSP(value: Boolean): Self = StObject.set(x, "__N_SSP", value.asInstanceOf[js.Any])
      
      inline def set__N_SSPUndefined: Self = StObject.set(x, "__N_SSP", js.undefined)
    }
  }
  
  type ComponentLoadCancel = js.Function0[Unit] | Null
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.replaceState
    - typings.next.nextStrings.pushState
  */
  trait HistoryMethod extends StObject
  object HistoryMethod {
    
    inline def pushState: typings.next.nextStrings.pushState = "pushState".asInstanceOf[typings.next.nextStrings.pushState]
    
    inline def replaceState: typings.next.nextStrings.replaceState = "replaceState".asInstanceOf[typings.next.nextStrings.replaceState]
  }
  
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
  
  /* Inlined next.next/dist/next-server/lib/router/router.BaseRouter & std.Pick<next.next/dist/next-server/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events' | 'isFallback'> */
  trait NextRouter extends StObject {
    
    var asPath: String
    
    var back: js.Function0[Unit]
    
    var basePath: String
    
    var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
    
    var defaultLocale: js.UndefOr[String] = js.undefined
    
    var events: MittEmitter
    
    var isFallback: Boolean
    
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
    
    var query: ParsedUrlQuery
    
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
      events: MittEmitter,
      isFallback: Boolean,
      pathname: String,
      prefetch: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit],
      push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      query: ParsedUrlQuery,
      reload: () => Unit,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      route: String
    ): NextRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), basePath = basePath.asInstanceOf[js.Any], beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], isFallback = isFallback.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction3(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRouter]
    }
    
    extension [Self <: NextRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = StObject.set(x, "beforePopState", js.Any.fromFunction1(value))
      
      inline def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
      
      inline def setDefaultLocaleUndefined: Self = StObject.set(x, "defaultLocale", js.undefined)
      
      inline def setEvents(value: MittEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setIsFallback(value: Boolean): Self = StObject.set(x, "isFallback", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setLocales(value: js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPrefetch(
        value: (/* url */ String, /* asPath */ js.UndefOr[String], /* options */ js.UndefOr[PrefetchOptions]) => js.Promise[Unit]
      ): Self = StObject.set(x, "prefetch", js.Any.fromFunction3(value))
      
      inline def setPush(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setQuery(value: ParsedUrlQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
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
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.OmitCompletePrivateRouteI
    - typings.next.routerMod.CompletePrivateRouteInfo
  */
  trait PrivateRouteInfo extends StObject
  object PrivateRouteInfo {
    
    inline def CompletePrivateRouteInfo(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): typings.next.routerMod.CompletePrivateRouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routerMod.CompletePrivateRouteInfo]
    }
    
    inline def OmitCompletePrivateRouteI(Component: ComponentType[js.Object]): typings.next.anon.OmitCompletePrivateRouteI = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], initial = true)
      __obj.asInstanceOf[typings.next.anon.OmitCompletePrivateRouteI]
    }
  }
  
  @js.native
  trait Router
    extends StObject
       with BaseRouter {
    
    var _bps: js.UndefOr[BeforePopStateCallback] = js.native
    
    def _getData[T](fn: js.Function0[js.Promise[T]]): js.Promise[T] = js.native
    
    def _getServerData(dataHref: String): js.Promise[js.Object] = js.native
    
    def _getStaticData(dataHref: String): js.Promise[js.Object] = js.native
    
    var _inFlightRoute: js.UndefOr[String] = js.native
    
    def _resolveHref(parsedHref: UrlObject, pages: js.Array[String]): UrlObject = js.native
    def _resolveHref(parsedHref: UrlObject, pages: js.Array[String], applyBasePath: Boolean): UrlObject = js.native
    
    var _shallow: js.UndefOr[Boolean] = js.native
    
    def _wrapApp(App: AppComponent): js.Any = js.native
    
    def abortComponentLoad(as: String): Unit = js.native
    
    /**
      * Go back in history
      */
    def back(): Unit = js.native
    
    /**
      * Callback to execute before replacing router state
      * @param cb callback to be executed
      */
    def beforePopState(cb: BeforePopStateCallback): Unit = js.native
    
    def change(method: HistoryMethod, url: String, as: String, options: TransitionOptions): js.Promise[Boolean] = js.native
    
    def changeState(method: HistoryMethod, url: String, as: String): Unit = js.native
    def changeState(method: HistoryMethod, url: String, as: String, options: TransitionOptions): Unit = js.native
    
    var clc: ComponentLoadCancel = js.native
    
    /**
      * Map of all components loaded in `Router`
      */
    var components: StringDictionary[PrivateRouteInfo] = js.native
    
    var events: MittEmitter = js.native
    
    def fetchComponent(route: String): js.Promise[GoodPageCache] = js.native
    
    def getInitialProps(Component: ComponentType[js.Object], ctx: NextPageContext): js.Promise[js.Any] = js.native
    
    def getRouteInfo(route: String, pathname: String, query: js.Any, as: String): js.Promise[PrivateRouteInfo] = js.native
    def getRouteInfo(route: String, pathname: String, query: js.Any, as: String, shallow: Boolean): js.Promise[PrivateRouteInfo] = js.native
    
    def handleRouteInfoError(err: Errorcodeanycancelledbool, pathname: String, query: ParsedUrlQuery, as: String): js.Promise[CompletePrivateRouteInfo] = js.native
    def handleRouteInfoError(
      err: Errorcodeanycancelledbool,
      pathname: String,
      query: ParsedUrlQuery,
      as: String,
      loadErrorFail: Boolean
    ): js.Promise[CompletePrivateRouteInfo] = js.native
    
    var isFallback: Boolean = js.native
    
    var isSsr: Boolean = js.native
    
    def notify(data: PrivateRouteInfo): js.Promise[Unit] = js.native
    
    def onPopState(e: PopStateEvent): Unit = js.native
    
    def onlyAHashChange(as: String): Boolean = js.native
    
    var pageLoader: js.Any = js.native
    
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
    
    def scrollToHash(as: String): Unit = js.native
    
    var sdc: StringDictionary[js.Object] = js.native
    
    def set(route: String, pathname: String, query: ParsedUrlQuery, as: String, data: PrivateRouteInfo): js.Promise[Unit] = js.native
    
    var sub: Subscription = js.native
    
    def urlIsNew(asPath: String): Boolean = js.native
  }
  
  type Subscription = js.Function2[/* data */ PrivateRouteInfo, /* App */ AppComponent, js.Promise[Unit]]
  
  trait TransitionOptions extends StObject {
    
    var locale: js.UndefOr[String | `false`] = js.undefined
    
    var shallow: js.UndefOr[Boolean] = js.undefined
  }
  object TransitionOptions {
    
    inline def apply(): TransitionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionOptions]
    }
    
    extension [Self <: TransitionOptions](x: Self) {
      
      inline def setLocale(value: String | `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setShallowUndefined: Self = StObject.set(x, "shallow", js.undefined)
    }
  }
  
  type Url = UrlObject | String
}
