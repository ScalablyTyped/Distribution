package typings.navigo

import org.scalablytyped.runtime.StringDictionary
import typings.navigo.navigoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigo", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Navigo {
    def this(root: String) = this()
    def this(root: String, options: RouterOptions) = this()
  }
  
  type AfterHook = js.Function1[/* match */ Match, Unit]
  
  type AlreadyHook = js.Function1[/* match */ Match, Unit]
  
  type BeforeHook = js.Function2[/* done */ js.Function, /* match */ Match, Unit]
  
  trait GenerateOptions extends StObject {
    
    var includeRoot: Boolean
  }
  object GenerateOptions {
    
    inline def apply(includeRoot: Boolean): GenerateOptions = {
      val __obj = js.Dynamic.literal(includeRoot = includeRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      inline def setIncludeRoot(value: Boolean): Self = StObject.set(x, "includeRoot", value.asInstanceOf[js.Any])
    }
  }
  
  type Handler = js.Function1[/* match */ js.UndefOr[Match], Unit]
  
  type LeaveHook = js.Function2[/* done */ js.Function, /* match */ Match | js.Array[Match], Unit]
  
  trait Match extends StObject {
    
    var data: StringDictionary[String] | Null
    
    var hashString: String
    
    var params: StringDictionary[String] | Null
    
    var queryString: String
    
    var route: Route
    
    var url: String
  }
  object Match {
    
    inline def apply(hashString: String, queryString: String, route: Route, url: String): Match = {
      val __obj = js.Dynamic.literal(hashString = hashString.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], data = null, params = null)
      __obj.asInstanceOf[Match]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setHashString(value: String): Self = StObject.set(x, "hashString", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigateOptions extends StObject {
    
    var callHandler: js.UndefOr[Boolean] = js.undefined
    
    var callHooks: js.UndefOr[Boolean] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var historyAPIMethod: js.UndefOr[String] = js.undefined
    
    var resolveOptions: js.UndefOr[ResolveOptions] = js.undefined
    
    var stateObj: js.UndefOr[js.Object] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var updateBrowserURL: js.UndefOr[Boolean] = js.undefined
    
    var updateState: js.UndefOr[Boolean] = js.undefined
  }
  object NavigateOptions {
    
    inline def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigateOptions] (val x: Self) extends AnyVal {
      
      inline def setCallHandler(value: Boolean): Self = StObject.set(x, "callHandler", value.asInstanceOf[js.Any])
      
      inline def setCallHandlerUndefined: Self = StObject.set(x, "callHandler", js.undefined)
      
      inline def setCallHooks(value: Boolean): Self = StObject.set(x, "callHooks", value.asInstanceOf[js.Any])
      
      inline def setCallHooksUndefined: Self = StObject.set(x, "callHooks", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setHistoryAPIMethod(value: String): Self = StObject.set(x, "historyAPIMethod", value.asInstanceOf[js.Any])
      
      inline def setHistoryAPIMethodUndefined: Self = StObject.set(x, "historyAPIMethod", js.undefined)
      
      inline def setResolveOptions(value: ResolveOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
      
      inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
      
      inline def setStateObj(value: js.Object): Self = StObject.set(x, "stateObj", value.asInstanceOf[js.Any])
      
      inline def setStateObjUndefined: Self = StObject.set(x, "stateObj", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUpdateBrowserURL(value: Boolean): Self = StObject.set(x, "updateBrowserURL", value.asInstanceOf[js.Any])
      
      inline def setUpdateBrowserURLUndefined: Self = StObject.set(x, "updateBrowserURL", js.undefined)
      
      inline def setUpdateState(value: Boolean): Self = StObject.set(x, "updateState", value.asInstanceOf[js.Any])
      
      inline def setUpdateStateUndefined: Self = StObject.set(x, "updateState", js.undefined)
    }
  }
  
  @js.native
  trait Navigo extends StObject {
    
    var __dirty: Boolean = js.native
    
    var __freezeListening: Boolean = js.native
    
    var __markAsClean: js.Function = js.native
    
    var __waiting: js.Array[js.Function] = js.native
    
    def _checkForAHash(path: String): String = js.native
    
    def _clean(path: String): String = js.native
    
    var _notFoundRoute: Route = js.native
    
    def _pathToMatchObject(path: String): Match = js.native
    
    def _setCurrent(current: js.Array[Match]): Unit = js.native
    
    def addAfterHook(route: String, hookFunction: js.Function): js.Function = js.native
    def addAfterHook(route: Route, hookFunction: js.Function): js.Function = js.native
    
    def addAlreadyHook(route: String, hookFunction: js.Function): js.Function = js.native
    def addAlreadyHook(route: Route, hookFunction: js.Function): js.Function = js.native
    
    def addBeforeHook(route: String, hookFunction: js.Function): js.Function = js.native
    def addBeforeHook(route: Route, hookFunction: js.Function): js.Function = js.native
    
    def addLeaveHook(route: String, hookFunction: js.Function): js.Function = js.native
    def addLeaveHook(route: Route, hookFunction: js.Function): js.Function = js.native
    
    var current: Null | js.Array[Match] = js.native
    
    def destroy(): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def generate(name: String): String = js.native
    def generate(name: String, data: js.Object): String = js.native
    def generate(name: String, data: js.Object, options: GenerateOptions): String = js.native
    def generate(name: String, data: Unit, options: GenerateOptions): String = js.native
    
    def getCurrentLocation(): Match = js.native
    
    def getLinkPath(link: js.Object): String = js.native
    
    def getRoute(nameOrHandler: String): js.UndefOr[Route] = js.native
    def getRoute(nameOrHandler: js.Function): js.UndefOr[Route] = js.native
    
    def hooks(hooks: RouteHooks): Navigo = js.native
    
    def lastResolved(): Null | js.Array[Match] = js.native
    
    def link(path: String): String = js.native
    
    def `match`(path: String): `false` | js.Array[Match] = js.native
    
    def matchLocation(path: String): `false` | Match = js.native
    def matchLocation(path: String, currentLocation: String): `false` | Match = js.native
    def matchLocation(path: String, currentLocation: String, annotatePathWithRoot: Boolean): `false` | Match = js.native
    def matchLocation(path: String, currentLocation: Unit, annotatePathWithRoot: Boolean): `false` | Match = js.native
    def matchLocation(path: js.RegExp): `false` | Match = js.native
    def matchLocation(path: js.RegExp, currentLocation: String): `false` | Match = js.native
    def matchLocation(path: js.RegExp, currentLocation: String, annotatePathWithRoot: Boolean): `false` | Match = js.native
    def matchLocation(path: js.RegExp, currentLocation: Unit, annotatePathWithRoot: Boolean): `false` | Match = js.native
    
    def navigate(to: String): Unit = js.native
    def navigate(to: String, options: NavigateOptions): Unit = js.native
    
    def navigateByName(name: String): Boolean = js.native
    def navigateByName(name: String, data: js.Object): Boolean = js.native
    def navigateByName(name: String, data: js.Object, options: NavigateOptions): Boolean = js.native
    def navigateByName(name: String, data: Unit, options: NavigateOptions): Boolean = js.native
    
    def notFound(handler: js.Function): Navigo = js.native
    def notFound(handler: js.Function, hooks: RouteHooks): Navigo = js.native
    
    def off(handler: js.Function): Navigo = js.native
    def off(path: String): Navigo = js.native
    def off(path: js.RegExp): Navigo = js.native
    
    def on(f: Handler): Navigo = js.native
    def on(f: Handler, hooks: RouteHooks): Navigo = js.native
    def on(map: js.Object): Navigo = js.native
    def on(map: js.Object, hooks: RouteHooks): Navigo = js.native
    def on(path: String, f: Handler): Navigo = js.native
    def on(path: String, f: Handler, hooks: RouteHooks): Navigo = js.native
    def on(path: js.RegExp, f: Handler): Navigo = js.native
    def on(path: js.RegExp, f: Handler, hooks: RouteHooks): Navigo = js.native
    
    def resolve(): `false` | Match = js.native
    def resolve(path: String): `false` | Match = js.native
    def resolve(path: String, resolveOptions: ResolveOptions): `false` | Match = js.native
    def resolve(path: Unit, resolveOptions: ResolveOptions): `false` | Match = js.native
    
    var root: String = js.native
    
    var routes: js.Array[Route] = js.native
    
    def updatePageLinks(): Navigo = js.native
  }
  
  trait QContext extends StObject {
    
    var currentLocationPath: String
    
    var instance: Navigo
    
    var `match`: js.UndefOr[Match] = js.undefined
    
    var matches: js.UndefOr[js.Array[Match]] = js.undefined
    
    var navigateOptions: js.UndefOr[NavigateOptions] = js.undefined
    
    var notFoundHandled: js.UndefOr[Boolean] = js.undefined
    
    var resolveOptions: js.UndefOr[ResolveOptions] = js.undefined
    
    var to: String
  }
  object QContext {
    
    inline def apply(currentLocationPath: String, instance: Navigo, to: String): QContext = {
      val __obj = js.Dynamic.literal(currentLocationPath = currentLocationPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[QContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QContext] (val x: Self) extends AnyVal {
      
      inline def setCurrentLocationPath(value: String): Self = StObject.set(x, "currentLocationPath", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Navigo): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setMatch(value: Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setMatches(value: js.Array[Match]): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      inline def setMatchesUndefined: Self = StObject.set(x, "matches", js.undefined)
      
      inline def setMatchesVarargs(value: Match*): Self = StObject.set(x, "matches", js.Array(value*))
      
      inline def setNavigateOptions(value: NavigateOptions): Self = StObject.set(x, "navigateOptions", value.asInstanceOf[js.Any])
      
      inline def setNavigateOptionsUndefined: Self = StObject.set(x, "navigateOptions", js.undefined)
      
      inline def setNotFoundHandled(value: Boolean): Self = StObject.set(x, "notFoundHandled", value.asInstanceOf[js.Any])
      
      inline def setNotFoundHandledUndefined: Self = StObject.set(x, "notFoundHandled", js.undefined)
      
      inline def setResolveOptions(value: ResolveOptions): Self = StObject.set(x, "resolveOptions", value.asInstanceOf[js.Any])
      
      inline def setResolveOptionsUndefined: Self = StObject.set(x, "resolveOptions", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResolveOptions extends StObject {
    
    var hash: js.UndefOr[Boolean] = js.undefined
    
    var noMatchWarning: js.UndefOr[Boolean] = js.undefined
    
    var strategy: js.UndefOr[ResolveStrategy] = js.undefined
  }
  object ResolveOptions {
    
    inline def apply(): ResolveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolveOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolveOptions] (val x: Self) extends AnyVal {
      
      inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setNoMatchWarning(value: Boolean): Self = StObject.set(x, "noMatchWarning", value.asInstanceOf[js.Any])
      
      inline def setNoMatchWarningUndefined: Self = StObject.set(x, "noMatchWarning", js.undefined)
      
      inline def setStrategy(value: ResolveStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.navigo.navigoStrings.ONE
    - typings.navigo.navigoStrings.ALL
  */
  trait ResolveStrategy extends StObject
  object ResolveStrategy {
    
    inline def ALL: typings.navigo.navigoStrings.ALL = "ALL".asInstanceOf[typings.navigo.navigoStrings.ALL]
    
    inline def ONE: typings.navigo.navigoStrings.ONE = "ONE".asInstanceOf[typings.navigo.navigoStrings.ONE]
  }
  
  trait Route extends StObject {
    
    def handler(): Unit
    def handler(`match`: Match): Unit
    @JSName("handler")
    var handler_Original: Handler
    
    var hooks: RouteHooksStorage
    
    var name: String
    
    var path: String | js.RegExp
  }
  object Route {
    
    inline def apply(
      handler: /* match */ js.UndefOr[Match] => Unit,
      hooks: RouteHooksStorage,
      name: String,
      path: String | js.RegExp
    ): Route = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1(handler), hooks = hooks.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
      
      inline def setHandler(value: /* match */ js.UndefOr[Match] => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHooks(value: RouteHooksStorage): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteHooks extends StObject {
    
    var after: js.UndefOr[AfterHook] = js.undefined
    
    var already: js.UndefOr[AlreadyHook] = js.undefined
    
    var before: js.UndefOr[BeforeHook] = js.undefined
    
    var leave: js.UndefOr[LeaveHook] = js.undefined
  }
  object RouteHooks {
    
    inline def apply(): RouteHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteHooks] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: /* match */ Match => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAlready(value: /* match */ Match => Unit): Self = StObject.set(x, "already", js.Any.fromFunction1(value))
      
      inline def setAlreadyUndefined: Self = StObject.set(x, "already", js.undefined)
      
      inline def setBefore(value: (/* done */ js.Function, /* match */ Match) => Unit): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setLeave(value: (/* done */ js.Function, /* match */ Match | js.Array[Match]) => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction2(value))
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  trait RouteHooksStorage extends StObject {
    
    var after: js.UndefOr[js.Array[AfterHook]] = js.undefined
    
    var already: js.UndefOr[js.Array[AlreadyHook]] = js.undefined
    
    var before: js.UndefOr[js.Array[BeforeHook]] = js.undefined
    
    var leave: js.UndefOr[js.Array[LeaveHook]] = js.undefined
  }
  object RouteHooksStorage {
    
    inline def apply(): RouteHooksStorage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteHooksStorage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteHooksStorage] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: js.Array[AfterHook]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: AfterHook*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setAlready(value: js.Array[AlreadyHook]): Self = StObject.set(x, "already", value.asInstanceOf[js.Any])
      
      inline def setAlreadyUndefined: Self = StObject.set(x, "already", js.undefined)
      
      inline def setAlreadyVarargs(value: AlreadyHook*): Self = StObject.set(x, "already", js.Array(value*))
      
      inline def setBefore(value: js.Array[BeforeHook]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: BeforeHook*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setLeave(value: js.Array[LeaveHook]): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
      
      inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
      
      inline def setLeaveVarargs(value: LeaveHook*): Self = StObject.set(x, "leave", js.Array(value*))
    }
  }
  
  trait RouterOptions
    extends StObject
       with ResolveOptions {
    
    var linksSelector: js.UndefOr[String] = js.undefined
  }
  object RouterOptions {
    
    inline def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouterOptions] (val x: Self) extends AnyVal {
      
      inline def setLinksSelector(value: String): Self = StObject.set(x, "linksSelector", value.asInstanceOf[js.Any])
      
      inline def setLinksSelectorUndefined: Self = StObject.set(x, "linksSelector", js.undefined)
    }
  }
}
