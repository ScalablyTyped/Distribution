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
  val AppRouterContext: Context[AppRouterInstance | Null] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "GlobalLayoutRouterContext")
  @js.native
  val GlobalLayoutRouterContext: Context[ChangeByServerResponse] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "LayoutRouterContext")
  @js.native
  val LayoutRouterContext: Context[Tree] = js.native
  
  @JSImport("next/dist/shared/lib/app-router-context", "TemplateContext")
  @js.native
  val TemplateContext: Context[ReactNode] = js.native
  
  @js.native
  trait AppRouterInstance extends StObject {
    
    /**
      * Navigate to the previous history entry.
      */
    def back(): Unit = js.native
    
    /**
      * Navigate to the next history entry.
      */
    def forward(): Unit = js.native
    
    /**
      * Prefetch the provided href.
      */
    def prefetch(href: String): Unit = js.native
    
    /**
      * Navigate to the provided href.
      * Pushes a new history entry.
      */
    def push(href: String): Unit = js.native
    def push(href: String, options: NavigateOptions): Unit = js.native
    
    /**
      * Refresh the current page.
      */
    def refresh(): Unit = js.native
    
    /**
      * Navigate to the provided href.
      * Replaces the current history entry.
      */
    def replace(href: String): Unit = js.native
    def replace(href: String, options: NavigateOptions): Unit = js.native
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
          js.Promise[
            js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
          ]
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
                js.Promise[
                  js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
                ]
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
