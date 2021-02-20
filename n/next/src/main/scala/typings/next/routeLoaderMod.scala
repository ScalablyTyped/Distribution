package typings.next

import typings.next.buildManifestPluginMod.ClientBuildManifest
import typings.react.mod.ComponentType
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeLoaderMod {
  
  @JSImport("next/dist/client/route-loader", JSImport.Default)
  @js.native
  def default(assetPrefix: String): RouteLoader = js.native
  
  @JSImport("next/dist/client/route-loader", "getClientBuildManifest")
  @js.native
  def getClientBuildManifest(): js.Promise[ClientBuildManifest] = js.native
  
  @JSImport("next/dist/client/route-loader", "isAssetError")
  @js.native
  def isAssetError(): js.UndefOr[Boolean] = js.native
  @JSImport("next/dist/client/route-loader", "isAssetError")
  @js.native
  def isAssetError(err: Error): js.UndefOr[Boolean] = js.native
  
  @JSImport("next/dist/client/route-loader", "markAssetError")
  @js.native
  def markAssetError(err: Error): Error = js.native
  
  @js.native
  trait Future[V] extends StObject {
    
    var future: js.Promise[V] = js.native
    
    def resolve(entrypoint: V): Unit = js.native
  }
  object Future {
    
    @scala.inline
    def apply[V](future: js.Promise[V], resolve: V => Unit): Future[V] = {
      val __obj = js.Dynamic.literal(future = future.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Future[V]]
    }
    
    @scala.inline
    implicit class FutureMutableBuilder[Self <: Future[_], V] (val x: Self with Future[V]) extends AnyVal {
      
      @scala.inline
      def setFuture(value: js.Promise[V]): Self = StObject.set(x, "future", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolve(value: V => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LoadedEntrypointFailure extends RouteEntrypoint {
    
    var error: js.Any = js.native
  }
  object LoadedEntrypointFailure {
    
    @scala.inline
    def apply(error: js.Any): LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointFailure]
    }
    
    @scala.inline
    implicit class LoadedEntrypointFailureMutableBuilder[Self <: LoadedEntrypointFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadedEntrypointSuccess extends RouteEntrypoint {
    
    var component: ComponentType[js.Object] = js.native
    
    var exports: js.Any = js.native
  }
  object LoadedEntrypointSuccess {
    
    @scala.inline
    def apply(component: ComponentType[js.Object], exports: js.Any): LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointSuccess]
    }
    
    @scala.inline
    implicit class LoadedEntrypointSuccessMutableBuilder[Self <: LoadedEntrypointSuccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadedRouteFailure extends RouteLoaderEntry {
    
    var error: js.Any = js.native
  }
  object LoadedRouteFailure {
    
    @scala.inline
    def apply(error: js.Any): LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteFailure]
    }
    
    @scala.inline
    implicit class LoadedRouteFailureMutableBuilder[Self <: LoadedRouteFailure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadedRouteSuccess
    extends LoadedEntrypointSuccess
       with RouteLoaderEntry {
    
    var styles: js.Array[RouteStyleSheet] = js.native
  }
  object LoadedRouteSuccess {
    
    @scala.inline
    def apply(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteSuccess]
    }
    
    @scala.inline
    implicit class LoadedRouteSuccessMutableBuilder[Self <: LoadedRouteSuccess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: js.Array[RouteStyleSheet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesVarargs(value: RouteStyleSheet*): Self = StObject.set(x, "styles", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.routeLoaderMod.LoadedEntrypointSuccess
    - typings.next.routeLoaderMod.LoadedEntrypointFailure
  */
  trait RouteEntrypoint extends StObject
  object RouteEntrypoint {
    
    @scala.inline
    def LoadedEntrypointFailure(error: js.Any): typings.next.routeLoaderMod.LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedEntrypointFailure]
    }
    
    @scala.inline
    def LoadedEntrypointSuccess(component: ComponentType[js.Object], exports: js.Any): typings.next.routeLoaderMod.LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedEntrypointSuccess]
    }
  }
  
  @js.native
  trait RouteLoader extends StObject {
    
    def loadRoute(route: String): js.Promise[RouteLoaderEntry] = js.native
    
    def onEntrypoint(route: String, execute: js.Function0[_]): Unit = js.native
    
    def prefetch(route: String): js.Promise[Unit] = js.native
    
    def whenEntrypoint(route: String): js.Promise[RouteEntrypoint] = js.native
  }
  object RouteLoader {
    
    @scala.inline
    def apply(
      loadRoute: String => js.Promise[RouteLoaderEntry],
      onEntrypoint: (String, js.Function0[_]) => Unit,
      prefetch: String => js.Promise[Unit],
      whenEntrypoint: String => js.Promise[RouteEntrypoint]
    ): RouteLoader = {
      val __obj = js.Dynamic.literal(loadRoute = js.Any.fromFunction1(loadRoute), onEntrypoint = js.Any.fromFunction2(onEntrypoint), prefetch = js.Any.fromFunction1(prefetch), whenEntrypoint = js.Any.fromFunction1(whenEntrypoint))
      __obj.asInstanceOf[RouteLoader]
    }
    
    @scala.inline
    implicit class RouteLoaderMutableBuilder[Self <: RouteLoader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadRoute(value: String => js.Promise[RouteLoaderEntry]): Self = StObject.set(x, "loadRoute", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEntrypoint(value: (String, js.Function0[_]) => Unit): Self = StObject.set(x, "onEntrypoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPrefetch(value: String => js.Promise[Unit]): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhenEntrypoint(value: String => js.Promise[RouteEntrypoint]): Self = StObject.set(x, "whenEntrypoint", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.routeLoaderMod.LoadedRouteSuccess
    - typings.next.routeLoaderMod.LoadedRouteFailure
  */
  trait RouteLoaderEntry extends StObject
  object RouteLoaderEntry {
    
    @scala.inline
    def LoadedRouteFailure(error: js.Any): typings.next.routeLoaderMod.LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedRouteFailure]
    }
    
    @scala.inline
    def LoadedRouteSuccess(component: ComponentType[js.Object], exports: js.Any, styles: js.Array[RouteStyleSheet]): typings.next.routeLoaderMod.LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.routeLoaderMod.LoadedRouteSuccess]
    }
  }
  
  @js.native
  trait RouteStyleSheet extends StObject {
    
    var content: String = js.native
    
    var href: String = js.native
  }
  object RouteStyleSheet {
    
    @scala.inline
    def apply(content: String, href: String): RouteStyleSheet = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteStyleSheet]
    }
    
    @scala.inline
    implicit class RouteStyleSheetMutableBuilder[Self <: RouteStyleSheet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    @js.native
    trait Window extends StObject {
      
      var __BUILD_MANIFEST: js.UndefOr[ClientBuildManifest] = js.native
      
      var __BUILD_MANIFEST_CB: js.UndefOr[js.Function] = js.native
    }
    object Window {
      
      @scala.inline
      def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set__BUILD_MANIFEST(value: ClientBuildManifest): Self = StObject.set(x, "__BUILD_MANIFEST", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set__BUILD_MANIFESTUndefined: Self = StObject.set(x, "__BUILD_MANIFEST", js.undefined)
        
        @scala.inline
        def set__BUILD_MANIFEST_CB(value: js.Function): Self = StObject.set(x, "__BUILD_MANIFEST_CB", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set__BUILD_MANIFEST_CBUndefined: Self = StObject.set(x, "__BUILD_MANIFEST_CB", js.undefined)
      }
    }
  }
}
