package typings.pathjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pathjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pathjs", "Path")
  @js.native
  def Path: IPath = js.native
  @scala.inline
  def Path_=(x: IPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
  
  type IDictionary[T] = StringDictionary[T]
  
  trait IPath extends StObject {
    
    var core: IPathCore
    
    def dispatch(passed_route: String): Unit
    
    var history: IPathHistory
    
    def listen(): Unit
    
    def map(path: String): IPathRoute
    
    def `match`(path: String, parameterize: Boolean): IPathRoute | Null
    
    def rescue(fn: js.Function): Unit
    
    def root(path: String): Unit
    
    var routes: IPathRoutes
  }
  object IPath {
    
    @scala.inline
    def apply(
      core: IPathCore,
      dispatch: String => Unit,
      history: IPathHistory,
      listen: () => Unit,
      map: String => IPathRoute,
      `match`: (String, Boolean) => IPathRoute | Null,
      rescue: js.Function => Unit,
      root: String => Unit,
      routes: IPathRoutes
    ): IPath = {
      val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), history = history.asInstanceOf[js.Any], listen = js.Any.fromFunction0(listen), map = js.Any.fromFunction1(map), rescue = js.Any.fromFunction1(rescue), root = js.Any.fromFunction1(root), routes = routes.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.asInstanceOf[IPath]
    }
    
    @scala.inline
    implicit class IPathMutableBuilder[Self <: IPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCore(value: IPathCore): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatch(value: String => Unit): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHistory(value: IPathHistory): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: () => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMap(value: String => IPathRoute): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMatch(value: (String, Boolean) => IPathRoute | Null): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRescue(value: js.Function => Unit): Self = StObject.set(x, "rescue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoot(value: String => Unit): Self = StObject.set(x, "root", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRoutes(value: IPathRoutes): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPathCore extends StObject {
    
    var route: IPathRouteConstructor
  }
  object IPathCore {
    
    @scala.inline
    def apply(route: IPathRouteConstructor): IPathCore = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPathCore]
    }
    
    @scala.inline
    implicit class IPathCoreMutableBuilder[Self <: IPathCore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoute(value: IPathRouteConstructor): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPathHistory extends StObject {
    
    var initial: js.Any
    
    def listen(fallback: js.Any): Unit
    
    def popState(event: js.Any): Unit
    
    def pushState(state: js.Any, title: String, path: String): Unit
  }
  object IPathHistory {
    
    @scala.inline
    def apply(
      initial: js.Any,
      listen: js.Any => Unit,
      popState: js.Any => Unit,
      pushState: (js.Any, String, String) => Unit
    ): IPathHistory = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any], listen = js.Any.fromFunction1(listen), popState = js.Any.fromFunction1(popState), pushState = js.Any.fromFunction3(pushState))
      __obj.asInstanceOf[IPathHistory]
    }
    
    @scala.inline
    implicit class IPathHistoryMutableBuilder[Self <: IPathHistory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(value: js.Any => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPopState(value: js.Any => Unit): Self = StObject.set(x, "popState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPushState(value: (js.Any, String, String) => Unit): Self = StObject.set(x, "pushState", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait IPathRoute extends StObject {
    
    def enter(fns: js.Array[js.Function]): IPathRoute = js.native
    def enter(fns: js.Function): IPathRoute = js.native
    
    def exit(fn: js.Function0[Unit]): IPathRoute = js.native
    
    def partition(): js.Array[String] = js.native
    
    def run(): Unit = js.native
    
    def to(fn: js.Function0[Unit]): IPathRoute = js.native
  }
  
  @js.native
  trait IPathRouteConstructor
    extends StObject
       with Instantiable1[/* path */ String, IPathRoute]
  
  trait IPathRoutes extends StObject {
    
    var current: js.UndefOr[String] = js.undefined
    
    var defined: IDictionary[IPathRoute]
    
    var previous: js.UndefOr[String] = js.undefined
    
    var rescue: js.UndefOr[js.Function] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object IPathRoutes {
    
    @scala.inline
    def apply(defined: IDictionary[IPathRoute]): IPathRoutes = {
      val __obj = js.Dynamic.literal(defined = defined.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPathRoutes]
    }
    
    @scala.inline
    implicit class IPathRoutesMutableBuilder[Self <: IPathRoutes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDefined(value: IDictionary[IPathRoute]): Self = StObject.set(x, "defined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      @scala.inline
      def setRescue(value: js.Function): Self = StObject.set(x, "rescue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRescueUndefined: Self = StObject.set(x, "rescue", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
