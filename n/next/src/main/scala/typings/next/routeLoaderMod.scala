package typings.next

import typings.next.buildManifestPluginMod.ClientBuildManifest
import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeLoaderMod {
  
  @JSImport("next/dist/client/route-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(assetPrefix: String): RouteLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(assetPrefix.asInstanceOf[js.Any]).asInstanceOf[RouteLoader]
  
  inline def getClientBuildManifest(): js.Promise[ClientBuildManifest] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientBuildManifest")().asInstanceOf[js.Promise[ClientBuildManifest]]
  
  inline def isAssetError(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssetError")().asInstanceOf[js.UndefOr[Boolean]]
  inline def isAssetError(err: Error): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssetError")(err.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def markAssetError(err: Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("markAssetError")(err.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  trait Future[V] extends StObject {
    
    var future: js.Promise[V]
    
    def resolve(entrypoint: V): Unit
  }
  object Future {
    
    inline def apply[V](future: js.Promise[V], resolve: V => Unit): Future[V] = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Future[V]]
    }
    
    extension [Self <: Future[?], V](x: Self & Future[V]) {
      
      inline def setFuture(value: js.Promise[V]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: V => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  trait LoadedEntrypointFailure
    extends StObject
       with RouteEntrypoint {
    
    var error: js.Any
  }
  object LoadedEntrypointFailure {
    
    inline def apply(error: js.Any): LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointFailure]
    }
    
    extension [Self <: LoadedEntrypointFailure](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedEntrypointSuccess
    extends StObject
       with RouteEntrypoint {
    
    var component: ComponentType[js.Object]
    
    var exports: js.Any
  }
  object LoadedEntrypointSuccess {
    
    inline def apply(component: ComponentType[js.Object], exports: js.Any): LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointSuccess]
    }
    
    extension [Self <: LoadedEntrypointSuccess](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedRouteFailure
    extends StObject
       with RouteLoaderEntry {
    
    var error: js.Any
  }
  object LoadedRouteFailure {
    
    inline def apply(error: js.Any): LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteFailure]
    }
    
    extension [Self <: LoadedRouteFailure](x: Self) {
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedRouteSuccess
    extends StObject
       with LoadedEntrypointSuccess
       with RouteLoaderEntry {
    
    var styles: js.Array[RouteStyleSheet]
  }
  object LoadedRouteSuccess {
    
    inline def apply(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteSuccess]
    }
    
    extension [Self <: LoadedRouteSuccess](x: Self) {
      
      inline def setStyles(value: js.Array[RouteStyleSheet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: RouteStyleSheet*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.routeLoaderMod.LoadedEntrypointSuccess
    - typings.next.routeLoaderMod.LoadedEntrypointFailure
  */
  trait RouteEntrypoint extends StObject
  object RouteEntrypoint {
    
    inline def LoadedEntrypointFailure(error: js.Any): typings.next.routeLoaderMod.LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedEntrypointFailure]
    }
    
    inline def LoadedEntrypointSuccess(component: ComponentType[js.Object], exports: js.Any): typings.next.routeLoaderMod.LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedEntrypointSuccess]
    }
  }
  
  trait RouteLoader extends StObject {
    
    def loadRoute(route: String): js.Promise[RouteLoaderEntry]
    
    def onEntrypoint(route: String, execute: js.Function0[js.Any]): Unit
    
    def prefetch(route: String): js.Promise[Unit]
    
    def whenEntrypoint(route: String): js.Promise[RouteEntrypoint]
  }
  object RouteLoader {
    
    inline def apply(
      loadRoute: String => js.Promise[RouteLoaderEntry],
      onEntrypoint: (String, js.Function0[js.Any]) => Unit,
      prefetch: String => js.Promise[Unit],
      whenEntrypoint: String => js.Promise[RouteEntrypoint]
    ): RouteLoader = {
      val __obj = js.Dynamic.literal(loadRoute = js.Any.fromFunction1(loadRoute), onEntrypoint = js.Any.fromFunction2(onEntrypoint), prefetch = js.Any.fromFunction1(prefetch), whenEntrypoint = js.Any.fromFunction1(whenEntrypoint))
      __obj.asInstanceOf[RouteLoader]
    }
    
    extension [Self <: RouteLoader](x: Self) {
      
      inline def setLoadRoute(value: String => js.Promise[RouteLoaderEntry]): Self = StObject.set(x, "loadRoute", js.Any.fromFunction1(value))
      
      inline def setOnEntrypoint(value: (String, js.Function0[js.Any]) => Unit): Self = StObject.set(x, "onEntrypoint", js.Any.fromFunction2(value))
      
      inline def setPrefetch(value: String => js.Promise[Unit]): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      inline def setWhenEntrypoint(value: String => js.Promise[RouteEntrypoint]): Self = StObject.set(x, "whenEntrypoint", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.routeLoaderMod.LoadedRouteSuccess
    - typings.next.routeLoaderMod.LoadedRouteFailure
  */
  trait RouteLoaderEntry extends StObject
  object RouteLoaderEntry {
    
    inline def LoadedRouteFailure(error: js.Any): typings.next.routeLoaderMod.LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedRouteFailure]
    }
    
    inline def LoadedRouteSuccess(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): typings.next.routeLoaderMod.LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedRouteSuccess]
    }
  }
  
  trait RouteStyleSheet extends StObject {
    
    var content: String
    
    var href: String
  }
  object RouteStyleSheet {
    
    inline def apply(content: String, href: String): RouteStyleSheet = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteStyleSheet]
    }
    
    extension [Self <: RouteStyleSheet](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var __BUILD_MANIFEST: js.UndefOr[ClientBuildManifest] = js.undefined
      
      var __BUILD_MANIFEST_CB: js.UndefOr[js.Function] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def set__BUILD_MANIFEST(value: ClientBuildManifest): Self = StObject.set(x, "__BUILD_MANIFEST", value.asInstanceOf[js.Any])
        
        inline def set__BUILD_MANIFESTUndefined: Self = StObject.set(x, "__BUILD_MANIFEST", js.undefined)
        
        inline def set__BUILD_MANIFEST_CB(value: js.Function): Self = StObject.set(x, "__BUILD_MANIFEST_CB", value.asInstanceOf[js.Any])
        
        inline def set__BUILD_MANIFEST_CBUndefined: Self = StObject.set(x, "__BUILD_MANIFEST_CB", js.undefined)
      }
    }
  }
}
