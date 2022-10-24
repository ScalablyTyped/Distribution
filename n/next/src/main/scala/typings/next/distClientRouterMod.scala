package typings.next

import typings.next.anon.Component
import typings.next.distClientWithRouterMod.ExcludeRouterProps
import typings.next.distClientWithRouterMod.WithRouterProps
import typings.next.distServerConfigSharedMod.DomainLocale
import typings.next.distSharedLibMittMod.MittEmitter
import typings.next.distSharedLibRouterRouterMod.BeforePopStateCallback
import typings.next.distSharedLibRouterRouterMod.NextRouter
import typings.next.distSharedLibRouterRouterMod.PrefetchOptions
import typings.next.distSharedLibRouterRouterMod.TransitionOptions
import typings.next.distSharedLibRouterRouterMod.Url
import typings.next.distSharedLibUtilsMod.BaseContext
import typings.next.distSharedLibUtilsMod.NextComponentType
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRouterMod {
  
  @JSImport("next/dist/client/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/router", JSImport.Default)
  @js.native
  val default: SingletonRouter = js.native
  
  @JSImport("next/dist/client/router", "Router")
  @js.native
  open class Router protected ()
    extends typings.next.distSharedLibRouterRouterMod.default {
    def this(
      pathname: String,
      query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
      as: String,
      param3: Component
    ) = this()
  }
  /* static members */
  object Router {
    
    @JSImport("next/dist/client/router", "Router")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("next/dist/client/router", "Router.events")
    @js.native
    def events: MittEmitter[RouterEvent] = js.native
    inline def events_=(x: MittEmitter[RouterEvent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("events")(x.asInstanceOf[js.Any])
  }
  
  inline def useRouter(): NextRouter = ^.asInstanceOf[js.Dynamic].applyDynamic("useRouter")().asInstanceOf[NextRouter]
  
  inline def withRouter[P /* <: WithRouterProps */, C /* <: BaseContext */](ComposedComponent: NextComponentType[C, Any, P]): ComponentType[ExcludeRouterProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRouter")(ComposedComponent.asInstanceOf[js.Any]).asInstanceOf[ComponentType[ExcludeRouterProps[P]]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.routeChangeStart
    - typings.next.nextStrings.beforeHistoryChange
    - typings.next.nextStrings.routeChangeComplete
    - typings.next.nextStrings.routeChangeError
    - typings.next.nextStrings.hashChangeStart
    - typings.next.nextStrings.hashChangeComplete
  */
  trait RouterEvent extends StObject
  
  /* Inlined next.next/dist/client/router.SingletonRouterBase & next.next/dist/shared/lib/router/router.NextRouter */
  trait SingletonRouter extends StObject {
    
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
    
    def ready(cb: js.Function0[Any]): Unit
    
    var readyCallbacks: js.Array[js.Function0[Any]]
    
    var reload: js.Function0[Unit]
    
    var replace: js.Function3[
        /* url */ Url, 
        /* as */ js.UndefOr[Url], 
        /* options */ js.UndefOr[TransitionOptions], 
        js.Promise[Boolean]
      ]
    
    var route: String
    
    var router: typings.next.distSharedLibRouterRouterMod.default | Null
  }
  object SingletonRouter {
    
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
      ready: js.Function0[Any] => Unit,
      readyCallbacks: js.Array[js.Function0[Any]],
      reload: () => Unit,
      replace: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean],
      route: String
    ): SingletonRouter = {
      val __obj = js.Dynamic.literal(asPath = asPath.asInstanceOf[js.Any], back = js.Any.fromFunction0(back), basePath = basePath.asInstanceOf[js.Any], beforePopState = js.Any.fromFunction1(beforePopState), events = events.asInstanceOf[js.Any], isFallback = js.Any.fromFunction0(isFallback), isLocaleDomain = isLocaleDomain.asInstanceOf[js.Any], isPreview = js.Any.fromFunction0(isPreview), isReady = isReady.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], prefetch = js.Any.fromFunction3(prefetch), push = js.Any.fromFunction3(push), query = query.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), readyCallbacks = readyCallbacks.asInstanceOf[js.Any], reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction3(replace), route = route.asInstanceOf[js.Any], router = null)
      __obj.asInstanceOf[SingletonRouter]
    }
    
    extension [Self <: SingletonRouter](x: Self) {
      
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
      
      inline def setReady(value: js.Function0[Any] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyCallbacks(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "readyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setReadyCallbacksVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "readyCallbacks", js.Array(value*))
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setReplace(
        value: (/* url */ Url, /* as */ js.UndefOr[Url], /* options */ js.UndefOr[TransitionOptions]) => js.Promise[Boolean]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction3(value))
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: typings.next.distSharedLibRouterRouterMod.default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterNull: Self = StObject.set(x, "router", null)
    }
  }
  
  trait SingletonRouterBase extends StObject {
    
    def ready(cb: js.Function0[Any]): Unit
    
    var readyCallbacks: js.Array[js.Function0[Any]]
    
    var router: typings.next.distSharedLibRouterRouterMod.default | Null
  }
  object SingletonRouterBase {
    
    inline def apply(ready: js.Function0[Any] => Unit, readyCallbacks: js.Array[js.Function0[Any]]): SingletonRouterBase = {
      val __obj = js.Dynamic.literal(ready = js.Any.fromFunction1(ready), readyCallbacks = readyCallbacks.asInstanceOf[js.Any], router = null)
      __obj.asInstanceOf[SingletonRouterBase]
    }
    
    extension [Self <: SingletonRouterBase](x: Self) {
      
      inline def setReady(value: js.Function0[Any] => Unit): Self = StObject.set(x, "ready", js.Any.fromFunction1(value))
      
      inline def setReadyCallbacks(value: js.Array[js.Function0[Any]]): Self = StObject.set(x, "readyCallbacks", value.asInstanceOf[js.Any])
      
      inline def setReadyCallbacksVarargs(value: js.Function0[Any]*): Self = StObject.set(x, "readyCallbacks", js.Array(value*))
      
      inline def setRouter(value: typings.next.distSharedLibRouterRouterMod.default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setRouterNull: Self = StObject.set(x, "router", null)
    }
  }
}
