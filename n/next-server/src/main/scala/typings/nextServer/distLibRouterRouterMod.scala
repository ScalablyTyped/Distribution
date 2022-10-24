package typings.nextServer

import org.scalablytyped.runtime.StringDictionary
import typings.nextServer.anon.App
import typings.nextServer.distLibMittMod.MittEmitter
import typings.nextServer.distLibUtilsMod.NextPageContext
import typings.node.urlMod.UrlObject
import typings.react.mod.ComponentType
import typings.std.PopStateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibRouterRouterMod {
  
  @JSImport("next-server/dist/lib/router/router", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Router {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      param3: App
    ) = this()
    
    /* CompleteClass */
    var asPath: String = js.native
    
    /* CompleteClass */
    var pathname: String = js.native
    
    /* CompleteClass */
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any = js.native
    
    /* CompleteClass */
    var route: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("next-server/dist/lib/router/router", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def _rewriteUrlForNextExport(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_rewriteUrlForNextExport")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("next-server/dist/lib/router/router", "default.events")
    @js.native
    def events: MittEmitter = js.native
    inline def events_=(x: MittEmitter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  trait BaseRouter extends StObject {
    
    var asPath: String
    
    var pathname: String
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var route: String
  }
  object BaseRouter {
    
    inline def apply(
      asPath: String,
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      route: String
    ): BaseRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRouter]
    }
    
    extension [Self <: BaseRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  type BeforePopStateCallback = js.Function1[/* state */ Any, Boolean]
  
  type ComponentLoadCancel = js.Function0[Unit] | Null
  
  /* Inlined next-server.next-server/dist/lib/router/router.BaseRouter & std.Pick<next-server.next-server/dist/lib/router/router.Router, 'push' | 'replace' | 'reload' | 'back' | 'prefetch' | 'beforePopState' | 'events'> */
  trait NextRouter extends StObject {
    
    var asPath: String
    
    var back: js.Function0[Unit]
    
    var beforePopState: js.Function1[/* cb */ BeforePopStateCallback, Unit]
    
    var events: MittEmitter
    
    var pathname: String
    
    var prefetch: js.Function1[/* url */ String, js.Promise[Unit]]
    
    var push: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Boolean]
      ]
    
    var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    
    var reload: js.Function0[Unit]
    
    var replace: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[js.Object], 
        js.Promise[Boolean]
      ]
    
    var route: String
  }
  object NextRouter {
    
    inline def apply(
      asPath: String,
      back: () => Unit,
      beforePopState: /* cb */ BeforePopStateCallback => Unit,
      events: MittEmitter,
      pathname: String,
      prefetch: /* url */ String => js.Promise[Unit],
      push: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      reload: () => Unit,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean],
      route: String
    ): NextRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction1(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextRouter]
    }
    
    extension [Self <: NextRouter](x: Self) {
      
      inline def setAsPath(value: String): Self = StObject.set(x, "asPath", value.asInstanceOf[js.Any])
      
      inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
      
      inline def setBeforePopState(value: /* cb */ BeforePopStateCallback => Unit): Self = StObject.set(x, "beforePopState", js.Any.fromFunction1(value))
      
      inline def setEvents(value: MittEmitter): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPrefetch(value: /* url */ String => js.Promise[Unit]): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      inline def setPush(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "push", js.Any.fromFunction3(value))
      
      inline def setQuery(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
      ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setReplace(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[js.Object]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteInfo extends StObject {
    
    var Component: ComponentType[js.Object]
    
    var err: js.UndefOr[js.Error] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var props: js.UndefOr[Any] = js.undefined
  }
  object RouteInfo {
    
    inline def apply(Component: ComponentType[js.Object]): RouteInfo = {
      val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo]
    }
    
    extension [Self <: RouteInfo](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  @js.native
  trait Router
    extends StObject
       with BaseRouter {
    
    var _bps: js.UndefOr[BeforePopStateCallback] = js.native
    
    def _wrapApp(App: ComponentType[js.Object]): Any = js.native
    
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
    
    def change(method: String, _url: Url, _as: Url, options: Any): js.Promise[Boolean] = js.native
    
    def changeState(method: String, url: String, as: String): Unit = js.native
    def changeState(method: String, url: String, as: String, options: js.Object): Unit = js.native
    
    var clc: ComponentLoadCancel = js.native
    
    /**
      * Map of all components loaded in `Router`
      */
    var components: StringDictionary[RouteInfo] = js.native
    
    var events: MittEmitter = js.native
    
    def fetchComponent(route: String): js.Promise[ComponentType[js.Object]] = js.native
    
    def getInitialProps(Component: ComponentType[js.Object], ctx: NextPageContext): js.Promise[Any] = js.native
    
    def getRouteInfo(route: String, pathname: String, query: Any, as: String): js.Promise[RouteInfo] = js.native
    def getRouteInfo(route: String, pathname: String, query: Any, as: String, shallow: Boolean): js.Promise[RouteInfo] = js.native
    
    def notify(data: RouteInfo): Unit = js.native
    
    def onPopState(e: PopStateEvent): Unit = js.native
    
    def onlyAHashChange(as: String): Boolean = js.native
    
    var pageLoader: Any = js.native
    
    /**
      * Prefetch `page` code, you may wait for the data during `page` rendering.
      * This feature only works in production!
      * @param url of prefetched `page`
      */
    def prefetch(url: String): js.Promise[Unit] = js.native
    
    /**
      * Performs a `pushState` with arguments
      * @param url of the route
      * @param as masks `url` for the browser
      * @param options object you can define `shallow` and other options
      */
    def push(url: Url): js.Promise[Boolean] = js.native
    def push(url: Url, as: Unit, options: js.Object): js.Promise[Boolean] = js.native
    def push(url: Url, as: Url): js.Promise[Boolean] = js.native
    def push(url: Url, as: Url, options: js.Object): js.Promise[Boolean] = js.native
    
    def reload(): Unit = js.native
    
    /**
      * Performs a `replaceState` with arguments
      * @param url of the route
      * @param as masks `url` for the browser
      * @param options object you can define `shallow` and other options
      */
    def replace(url: Url): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Unit, options: js.Object): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Url): js.Promise[Boolean] = js.native
    def replace(url: Url, as: Url, options: js.Object): js.Promise[Boolean] = js.native
    
    def scrollToHash(as: String): Unit = js.native
    
    def set(route: String, pathname: String, query: Any, as: String, data: RouteInfo): Unit = js.native
    
    var sub: Subscription = js.native
    
    def update(route: String, Component: ComponentType[js.Object]): Unit = js.native
    
    def urlIsNew(asPath: String): Boolean = js.native
  }
  
  type Subscription = js.Function2[/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]], Unit]
  
  type Url = UrlObject | String
}
