package typings.next

import typings.next.anon.FlightSegmentPath
import typings.next.anon.PatchedTree
import typings.next.anon.PreviousTree
import typings.next.anon.ReadonlyAppRouterState
import typings.next.anon.`0`
import typings.next.distServerAppRenderMod.FlightData
import typings.next.distServerAppRenderMod.FlightDataPath
import typings.next.distServerAppRenderMod.FlightRouterState
import typings.next.distSharedLibAppRouterContextMod.CacheNode
import typings.next.nextStrings.push
import typings.next.nextStrings.replace
import typings.std.Map
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsReducerMod {
  
  @JSImport("next/dist/client/components/reducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_NAVIGATE")
  @js.native
  val ACTION_NAVIGATE: /* "navigate" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_PREFETCH")
  @js.native
  val ACTION_PREFETCH: /* "prefetch" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_RELOAD")
  @js.native
  val ACTION_RELOAD: /* "reload" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_RESTORE")
  @js.native
  val ACTION_RESTORE: /* "restore" */ String = js.native
  
  @JSImport("next/dist/client/components/reducer", "ACTION_SERVER_PATCH")
  @js.native
  val ACTION_SERVER_PATCH: /* "server-patch" */ String = js.native
  
  inline def reducer(
    state: ReadonlyAppRouterState,
    action: ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction
  ): AppRouterState = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[AppRouterState]
  
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
    var prefetchCache: Map[String, FlightSegmentPath]
    
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
      prefetchCache: Map[String, FlightSegmentPath],
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
      
      inline def setPrefetchCache(value: Map[String, FlightSegmentPath]): Self = StObject.set(x, "prefetchCache", value.asInstanceOf[js.Any])
      
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
    
    var mutable: PatchedTree
    
    var navigateType: push | replace
    
    var `type`: /* "navigate" */ String
    
    var url: URL
  }
  object NavigateAction {
    
    inline def apply(
      cache: CacheNode,
      forceOptimisticNavigation: Boolean,
      mutable: PatchedTree,
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
      
      inline def setMutable(value: PatchedTree): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setNavigateType(value: push | replace): Self = StObject.set(x, "navigateType", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "navigate" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrefetchAction extends StObject {
    
    var flightData: FlightData
    
    var `type`: /* "prefetch" */ String
    
    var url: URL
  }
  object PrefetchAction {
    
    inline def apply(flightData: FlightData, `type`: /* "prefetch" */ String, url: URL): PrefetchAction = {
      val __obj = js.Dynamic.literal(flightData = flightData.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrefetchAction]
    }
    
    extension [Self <: PrefetchAction](x: Self) {
      
      inline def setFlightData(value: FlightData): Self = StObject.set(x, "flightData", value.asInstanceOf[js.Any])
      
      inline def setFlightDataVarargs(value: FlightDataPath*): Self = StObject.set(x, "flightData", js.Array(value*))
      
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
    * Reload triggers a reload of the full page data.
    * - fetches the Flight data and fills subTreeData at the root of the cache.
    * - The router state is updated at the root of the state tree.
    */
  trait ReloadAction extends StObject {
    
    var cache: CacheNode
    
    var mutable: PreviousTree
    
    var `type`: /* "reload" */ String
  }
  object ReloadAction {
    
    inline def apply(cache: CacheNode, mutable: PreviousTree, `type`: /* "reload" */ String): ReloadAction = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], mutable = mutable.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReloadAction]
    }
    
    extension [Self <: ReloadAction](x: Self) {
      
      inline def setCache(value: CacheNode): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setMutable(value: PreviousTree): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "reload" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    var mutable: `0`
    
    var previousTree: FlightRouterState
    
    var `type`: /* "server-patch" */ String
  }
  object ServerPatchAction {
    
    inline def apply(
      cache: CacheNode,
      flightData: FlightData,
      mutable: `0`,
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
      
      inline def setMutable(value: `0`): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setPreviousTree(value: FlightRouterState): Self = StObject.set(x, "previousTree", value.asInstanceOf[js.Any])
      
      inline def setType(value: /* "server-patch" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
