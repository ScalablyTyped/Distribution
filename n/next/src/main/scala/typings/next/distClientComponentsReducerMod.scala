package typings.next

import typings.next.anon.CanonicalUrlOverride
import typings.next.anon.CanonicalUrlOverrideMpaNavigation
import typings.next.anon.MpaNavigation
import typings.next.anon.PatchedTree
import typings.next.anon.ReadonlyAppRouterState
import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightDataPath
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.distSharedLibAppRouterContextMod.CacheNode
import typings.next.nextBooleans.`true`
import typings.next.nextStrings.push
import typings.next.nextStrings.replace
import typings.std.Awaited
import typings.std.Map
import typings.std.ReturnType
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReducerMod {
  
  @JSImport("next/dist/client/components/reducer", "ACTION_NAVIGATE")
  @js.native
  val ACTION_NAVIGATE: /* "navigate" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_PREFETCH")
  @js.native
  val ACTION_PREFETCH: /* "prefetch" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_REFRESH")
  @js.native
  val ACTION_REFRESH: /* "refresh" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_RESTORE")
  @js.native
  val ACTION_RESTORE: /* "restore" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_SERVER_PATCH")
  @js.native
  val ACTION_SERVER_PATCH: /* "server-patch" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "reducer")
  @js.native
  val reducer: js.Function2[
    /* state */ ReadonlyAppRouterState, 
    /* _action */ RefreshAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
    AppRouterState
  ] = js.native
  
  /**
    * Handles keeping the state of app-router.
    */
  trait AppRouterState extends StObject {
    
    /**
      * The cache holds React nodes for every segment that is shown on screen as well as previously shown segments and prefetched segments.
      * It also holds in-progress data requests.
      */
    var cache: CacheNode
    
    /**
      * The canonical url that is pushed/replaced
      */
    var canonicalUrl: String
    
    /**
      * Decides if the update should apply scroll and focus management.
      */
    var focusAndScrollRef: FocusAndScrollRef
    
    /**
      * Cache that holds prefetched Flight responses keyed by url
      */
    var prefetchCache: Map[String, CanonicalUrlOverride]
    
    /**
      * Decides if the update should create a new history entry and if the navigation can't be handled by app-router.
      */
    var pushRef: PushRef
    
    /**
      * The router state, this is written into the history state in app-router using replaceState/pushState.
      * - Has to be serializable as it is written into the history state.
      * - Holds which segments are shown on the screen.
      * - Holds where loading states (loading.js) exists.
      */
    var tree: FlightRouterState
  }
  object AppRouterState {
    
    inline def apply(
      cache: CacheNode,
      canonicalUrl: String,
      focusAndScrollRef: FocusAndScrollRef,
      prefetchCache: Map[String, CanonicalUrlOverride],
      pushRef: PushRef,
      tree: FlightRouterState
    ): AppRouterState = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], canonicalUrl = canonicalUrl.asInstanceOf[js.Any], focusAndScrollRef = focusAndScrollRef.asInstanceOf[js.Any], prefetchCache = prefetchCache.asInstanceOf[js.Any], pushRef = pushRef.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppRouterState]
    }
    
    extension [Self <: AppRouterState](x: Self) {
      
      inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
      
      inline def setFocusAndScrollRef(value: FocusAndScrollRef): Self = StObject.set(x, "focusAndScrollRef", value.asInstanceOf[js.Any])
      
      inline def setPrefetchCache(value: Map[String, CanonicalUrlOverride]): Self = StObject.set(x, "prefetchCache", value.asInstanceOf[js.Any])
      
      inline def setPushRef(value: PushRef): Self = StObject.set(x, "pushRef", value.asInstanceOf[js.Any])
      
      inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusAndScrollRef extends StObject {
    
    /**
      * If focus and scroll should be set in the layout-router's useEffect()
      */
    @JSName("apply")
    var apply: Boolean
  }
  object FocusAndScrollRef {
    
    inline def apply(apply: Boolean): FocusAndScrollRef = {
      val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusAndScrollRef]
    }
    
    extension [Self <: FocusAndScrollRef](x: Self) {
      
      inline def setApply(value: Boolean): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Navigate triggers a navigation to the provided url. It supports a combination of `cacheType` (`hard` and `soft`) and `navigateType` (`push` and `replace`).
    *
    * `navigateType`:
    * - `push` - pushes a new history entry in the browser history
    * - `replace` - replaces the current history entry in the browser history
    *
    * `cacheType`:
    * - `hard` - Creates a new cache in one of two ways:
    *   - Not optimistic
    *      - Default if there is no loading.js.
    *      - Fetch data in the reducer and suspend there.
    *      - Copies the previous cache nodes as far as possible and applies new subTreeData.
    *      - Applies the new router state.
    *   - optimistic
    *      - Enabled when somewhere in the router state path to the page there is a loading.js.
    *      - Similar to `soft` but kicks off the data fetch in the reducer and applies `data` in the spot that should suspend.
    *      - This enables showing loading states while navigating.
    *      - Will trigger fast path or server-patch case in layout-router.
    * - `soft`
    *   - Reuses the existing cache.
    *   - Creates an optimistic router state that causes the fetch to start in layout-router when there is missing data.
    *   - If there is no missing data the existing cache data is rendered.
    */
  trait NavigateAction extends StObject {
    
    var cache: CacheNode
    
    var forceOptimisticNavigation: Boolean
    
    var mutable: MpaNavigation
    
    var navigateType: push | replace
    
    var `type`: /* "navigate" */ String
    
    var url: URL
  }
  object NavigateAction {
    
    inline def apply(
      cache: CacheNode,
      forceOptimisticNavigation: Boolean,
      mutable: MpaNavigation,
      navigateType: push | replace,
      `type`: /* "navigate" */ String,
      url: URL
    ): NavigateAction = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], forceOptimisticNavigation = forceOptimisticNavigation.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any], navigateType = navigateType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateAction]
    }
    
    extension [Self <: NavigateAction](x: Self) {
      
      inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setForceOptimisticNavigation(value: Boolean): Self = StObject.set(x, "forceOptimisticNavigation", value.asInstanceOf[js.Any])
      
      inline def setMutable(value: MpaNavigation): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setNavigateType(value: push | replace): Self = StObject.set(x, "navigateType", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "navigate" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrefetchAction extends StObject {
    
    var serverResponse: Awaited[
        ReturnType[
          js.Function3[
            /* url */ URL, 
            /* flightRouterState */ FlightRouterState, 
            /* prefetch */ js.UndefOr[`true`], 
            js.Promise[
              js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
            ]
          ]
        ]
      ]
    
    var tree: FlightRouterState
    
    var `type`: /* "prefetch" */ String
    
    var url: URL
  }
  object PrefetchAction {
    
    inline def apply(
      serverResponse: Awaited[
          ReturnType[
            js.Function3[
              /* url */ URL, 
              /* flightRouterState */ FlightRouterState, 
              /* prefetch */ js.UndefOr[`true`], 
              js.Promise[
                js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
              ]
            ]
          ]
        ],
      tree: FlightRouterState,
      `type`: /* "prefetch" */ String,
      url: URL
    ): PrefetchAction = {
      val __obj = js.Dynamic.literal(serverResponse = serverResponse.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefetchAction]
    }
    
    extension [Self <: PrefetchAction](x: Self) {
      
      inline def setServerResponse(
        value: Awaited[
              ReturnType[
                js.Function3[
                  /* url */ URL, 
                  /* flightRouterState */ FlightRouterState, 
                  /* prefetch */ js.UndefOr[`true`], 
                  js.Promise[
                    js.Tuple2[/* FlightData */ FlightData, /* canonicalUrlOverride */ js.UndefOr[URL]]
                  ]
                ]
              ]
            ]
      ): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "prefetch" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PushRef extends StObject {
    
    /**
      * Multi-page navigation through location.href.
      */
    var mpaNavigation: Boolean
    
    /**
      * If the app-router should push a new history entry in app-router's useEffect()
      */
    var pendingPush: Boolean
  }
  object PushRef {
    
    inline def apply(mpaNavigation: Boolean, pendingPush: Boolean): PushRef = {
      val __obj = js.Dynamic.literal(mpaNavigation = mpaNavigation.asInstanceOf[js.Any], pendingPush = pendingPush.asInstanceOf[js.Any])
      __obj.asInstanceOf[PushRef]
    }
    
    extension [Self <: PushRef](x: Self) {
      
      inline def setMpaNavigation(value: Boolean): Self = StObject.set(x, "mpaNavigation", value.asInstanceOf[js.Any])
      
      inline def setPendingPush(value: Boolean): Self = StObject.set(x, "pendingPush", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Refresh triggers a refresh of the full page data.
    * - fetches the Flight data and fills subTreeData at the root of the cache.
    * - The router state is updated at the root of the state tree.
    */
  trait RefreshAction extends StObject {
    
    var cache: CacheNode
    
    var mutable: PatchedTree
    
    var `type`: /* "refresh" */ String
  }
  object RefreshAction {
    
    inline def apply(cache: CacheNode, mutable: PatchedTree, `type`: /* "refresh" */ String): RefreshAction = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshAction]
    }
    
    extension [Self <: RefreshAction](x: Self) {
      
      inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setMutable(value: PatchedTree): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "refresh" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Restore applies the provided router state.
    * - Only used for `popstate` (back/forward navigation) where a known router state has to be applied.
    * - Router state is applied as-is from the history state.
    * - If any data is missing it will be fetched in layout-router during rendering and trigger fast path or server-patch case.
    * - If no data is missing the existing cached data is rendered.
    */
  trait RestoreAction extends StObject {
    
    var tree: FlightRouterState
    
    var `type`: /* "restore" */ String
    
    var url: URL
  }
  object RestoreAction {
    
    inline def apply(tree: FlightRouterState, `type`: /* "restore" */ String, url: URL): RestoreAction = {
      val __obj = js.Dynamic.literal(tree = tree.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestoreAction]
    }
    
    extension [Self <: RestoreAction](x: Self) {
      
      inline def setTree(value: FlightRouterState): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "restore" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Server-patch applies the provided Flight data to the cache and router tree.
    * - Only triggered in layout-router when the data can't be handled in the fast path.
    * - Main case where this is triggered is when a rewrite applies and Flight data for a different path is returned from the server.
    * - Creates a new cache and router state with the Flight data applied.
    */
  trait ServerPatchAction extends StObject {
    
    var cache: CacheNode
    
    var flightData: FlightData
    
    var mutable: CanonicalUrlOverrideMpaNavigation
    
    var overrideCanonicalUrl: js.UndefOr[URL] = js.undefined
    
    var previousTree: FlightRouterState
    
    var `type`: /* "server-patch" */ String
  }
  object ServerPatchAction {
    
    inline def apply(
      cache: CacheNode,
      flightData: FlightData,
      mutable: CanonicalUrlOverrideMpaNavigation,
      previousTree: FlightRouterState,
      `type`: /* "server-patch" */ String
    ): ServerPatchAction = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], flightData = flightData.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any], previousTree = previousTree.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerPatchAction]
    }
    
    extension [Self <: ServerPatchAction](x: Self) {
      
      inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setFlightData(value: FlightData): Self = StObject.set(x, "flightData", value.asInstanceOf[js.Any])
      
      inline def setFlightDataVarargs(value: FlightDataPath*): Self = StObject.set(x, "flightData", js.Array(value*))
      
      inline def setMutable(value: CanonicalUrlOverrideMpaNavigation): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setOverrideCanonicalUrl(value: URL): Self = StObject.set(x, "overrideCanonicalUrl", value.asInstanceOf[js.Any])
      
      inline def setOverrideCanonicalUrlUndefined: Self = StObject.set(x, "overrideCanonicalUrl", js.undefined)
      
      inline def setPreviousTree(value: FlightRouterState): Self = StObject.set(x, "previousTree", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "server-patch" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
