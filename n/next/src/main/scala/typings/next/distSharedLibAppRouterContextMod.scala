package typings.next

import typings.next.anon.ChangeByServerResponse
import typings.next.anon.Tree
import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.nextBooleans.`true`
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.std.Map
import typings.std.ReturnType
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSharedLibAppRouterContextMod {
  
  @JSImport("next/dist/shared/lib/app-router-context", "AppRouterContext")
  @js.native
  val AppRouterContext: Context[AppRouterInstance] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "GlobalLayoutRouterContext")
  @js.native
  val GlobalLayoutRouterContext: Context[ChangeByServerResponse] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "LayoutRouterContext")
  @js.native
  val LayoutRouterContext: Context[Tree] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "TemplateContext")
  @js.native
  val TemplateContext: Context[ReactNode] = js.native
  
  trait AppRouterInstance extends StObject {
    
    /**
      * Soft prefetch the provided href. Does not fetch data from the server if it was already fetched.
      */
    def prefetch(href: String): Unit
    
    /**
      * Hard navigate to the provided href. Fetches new data from the server.
      * Pushes a new history entry.
      */
    def push(href: String, options: NavigateOptions): Unit
    
    /**
      * Reload the current page. Fetches new data from the server.
      */
    def reload(): Unit
    
    /**
      * Hard navigate to the provided href. Does not fetch data from the server if it was already fetched.
      * Replaces the current history entry.
      */
    def replace(href: String, options: NavigateOptions): Unit
  }
  object AppRouterInstance {
    
    inline def apply(
      prefetch: String => Unit,
      push: (String, NavigateOptions) => Unit,
      reload: () => Unit,
      replace: (String, NavigateOptions) => Unit
    ): AppRouterInstance = {
      val __obj = js.Dynamic.literal(prefetch = js.Any.fromFunction1(prefetch), push = js.Any.fromFunction2(push), reload = js.Any.fromFunction0(reload), replace = js.Any.fromFunction2(replace))
      __obj.asInstanceOf[AppRouterInstance]
    }
    
    extension [Self <: AppRouterInstance](x: Self) {
      
      inline def setPrefetch(value: String => Unit): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      inline def setPush(value: (String, NavigateOptions) => Unit): Self = StObject.set(x, "push", js.Any.fromFunction2(value))
      
      inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
      
      inline def setReplace(value: (String, NavigateOptions) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    }
  }
  
  trait CacheNode extends StObject {
    
    /**
      * In-flight request for this node.
      */
    var data: (ReturnType[
        js.Function3[
          /* url */ URL, 
          /* flightRouterState */ FlightRouterState, 
          /* prefetch */ js.UndefOr[`true`], 
          js.Promise[js.Array[/* FlightData */ FlightData]]
        ]
      ]) | Null
    
    /**
      * Child parallel routes.
      */
    var parallelRoutes: Map[String, ChildSegmentMap]
    
    /**
      * React Component for this node.
      */
    var subTreeData: ReactNode | Null
  }
  object CacheNode {
    
    inline def apply(parallelRoutes: Map[String, ChildSegmentMap]): CacheNode = {
      val __obj = js.Dynamic.literal(parallelRoutes = parallelRoutes.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[CacheNode]
    }
    
    extension [Self <: CacheNode](x: Self) {
      
      inline def setData(
        value: ReturnType[
              js.Function3[
                /* url */ URL, 
                /* flightRouterState */ FlightRouterState, 
                /* prefetch */ js.UndefOr[`true`], 
                js.Promise[js.Array[/* FlightData */ FlightData]]
              ]
            ]
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setParallelRoutes(value: Map[String, ChildSegmentMap]): Self = StObject.set(x, "parallelRoutes", value.asInstanceOf[js.Any])
      
      inline def setSubTreeData(value: ReactNode): Self = StObject.set(x, "subTreeData", value.asInstanceOf[js.Any])
      
      inline def setSubTreeDataNull: Self = StObject.set(x, "subTreeData", null)
      
      inline def setSubTreeDataUndefined: Self = StObject.set(x, "subTreeData", js.undefined)
    }
  }
  
  type ChildSegmentMap = Map[String, CacheNode]
  
  trait NavigateOptions extends StObject {
    
    var forceOptimisticNavigation: js.UndefOr[Boolean] = js.undefined
  }
  object NavigateOptions {
    
    inline def apply(): NavigateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigateOptions]
    }
    
    extension [Self <: NavigateOptions](x: Self) {
      
      inline def setForceOptimisticNavigation(value: Boolean): Self = StObject.set(x, "forceOptimisticNavigation", value.asInstanceOf[js.Any])
      
      inline def setForceOptimisticNavigationUndefined: Self = StObject.set(x, "forceOptimisticNavigation", js.undefined)
    }
  }
}
