package typings.next

import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientRouteLoaderMod {
  
  @JSImport("next/dist/client/route-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRouteLoader(assetPrefix: String): RouteLoader = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouteLoader")(assetPrefix.asInstanceOf[js.Any]).asInstanceOf[RouteLoader]
  
  inline def getClientBuildManifest(): js.Promise[Record[String, js.Array[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientBuildManifest")().asInstanceOf[js.Promise[Record[String, js.Array[String]]]]
  
  inline def isAssetError(): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssetError")().asInstanceOf[js.UndefOr[Boolean]]
  inline def isAssetError(err: js.Error): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isAssetError")(err.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def markAssetError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("markAssetError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  trait LoadedEntrypointFailure
    extends StObject
       with RouteEntrypoint {
    
    var error: Any
  }
  object LoadedEntrypointFailure {
    
    inline def apply(error: Any): LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointFailure]
    }
    
    extension [Self <: LoadedEntrypointFailure](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedEntrypointSuccess
    extends StObject
       with RouteEntrypoint {
    
    var component: ComponentType[js.Object]
    
    var exports: Any
  }
  object LoadedEntrypointSuccess {
    
    inline def apply(component: ComponentType[js.Object], exports: Any): LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedEntrypointSuccess]
    }
    
    extension [Self <: LoadedEntrypointSuccess](x: Self) {
      
      inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedRouteFailure
    extends StObject
       with RouteLoaderEntry {
    
    var error: Any
  }
  object LoadedRouteFailure {
    
    inline def apply(error: Any): LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteFailure]
    }
    
    extension [Self <: LoadedRouteFailure](x: Self) {
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadedRouteSuccess
    extends StObject
       with LoadedEntrypointSuccess
       with RouteLoaderEntry {
    
    var styles: js.Array[RouteStyleSheet]
  }
  object LoadedRouteSuccess {
    
    inline def apply(component: ComponentType[js.Object], exports: Any, styles: js.Array[RouteStyleSheet]): LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadedRouteSuccess]
    }
    
    extension [Self <: LoadedRouteSuccess](x: Self) {
      
      inline def setStyles(value: js.Array[RouteStyleSheet]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesVarargs(value: RouteStyleSheet*): Self = StObject.set(x, "styles", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distClientRouteLoaderMod.LoadedEntrypointSuccess
    - typings.next.distClientRouteLoaderMod.LoadedEntrypointFailure
  */
  trait RouteEntrypoint extends StObject
  object RouteEntrypoint {
    
    inline def LoadedEntrypointFailure(error: Any): typings.next.distClientRouteLoaderMod.LoadedEntrypointFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientRouteLoaderMod.LoadedEntrypointFailure]
    }
    
    inline def LoadedEntrypointSuccess(component: ComponentType[js.Object], exports: Any): typings.next.distClientRouteLoaderMod.LoadedEntrypointSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientRouteLoaderMod.LoadedEntrypointSuccess]
    }
  }
  
  @js.native
  trait RouteLoader extends StObject {
    
    def loadRoute(route: String): js.Promise[RouteLoaderEntry] = js.native
    def loadRoute(route: String, prefetch: Boolean): js.Promise[RouteLoaderEntry] = js.native
    
    def onEntrypoint(route: String, execute: js.Function0[Any]): Unit = js.native
    
    def prefetch(route: String): js.Promise[Unit] = js.native
    
    def whenEntrypoint(route: String): js.Promise[RouteEntrypoint] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distClientRouteLoaderMod.LoadedRouteSuccess
    - typings.next.distClientRouteLoaderMod.LoadedRouteFailure
  */
  trait RouteLoaderEntry extends StObject
  object RouteLoaderEntry {
    
    inline def LoadedRouteFailure(error: Any): typings.next.distClientRouteLoaderMod.LoadedRouteFailure = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientRouteLoaderMod.LoadedRouteFailure]
    }
    
    inline def LoadedRouteSuccess(component: ComponentType[js.Object], exports: Any, styles: js.Array[RouteStyleSheet]): typings.next.distClientRouteLoaderMod.LoadedRouteSuccess = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.distClientRouteLoaderMod.LoadedRouteSuccess]
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
      
      var __BUILD_MANIFEST: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
      
      var __BUILD_MANIFEST_CB: js.UndefOr[js.Function] = js.undefined
      
      var __MIDDLEWARE_MANIFEST_CB: js.UndefOr[js.Function] = js.undefined
      
      var __MIDDLEWARE_MATCHERS: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
    }
    object Window {
      
      inline def apply(): typings.next.distClientRouteLoaderMod.global.Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.next.distClientRouteLoaderMod.global.Window]
      }
      
      extension [Self <: typings.next.distClientRouteLoaderMod.global.Window](x: Self) {
        
        inline def set__BUILD_MANIFEST(value: Record[String, js.Array[String]]): Self = StObject.set(x, "__BUILD_MANIFEST", value.asInstanceOf[js.Any])
        
        inline def set__BUILD_MANIFESTUndefined: Self = StObject.set(x, "__BUILD_MANIFEST", js.undefined)
        
        inline def set__BUILD_MANIFEST_CB(value: js.Function): Self = StObject.set(x, "__BUILD_MANIFEST_CB", value.asInstanceOf[js.Any])
        
        inline def set__BUILD_MANIFEST_CBUndefined: Self = StObject.set(x, "__BUILD_MANIFEST_CB", js.undefined)
        
        inline def set__MIDDLEWARE_MANIFEST_CB(value: js.Function): Self = StObject.set(x, "__MIDDLEWARE_MANIFEST_CB", value.asInstanceOf[js.Any])
        
        inline def set__MIDDLEWARE_MANIFEST_CBUndefined: Self = StObject.set(x, "__MIDDLEWARE_MANIFEST_CB", js.undefined)
        
        inline def set__MIDDLEWARE_MATCHERS(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "__MIDDLEWARE_MATCHERS", value.asInstanceOf[js.Any])
        
        inline def set__MIDDLEWARE_MATCHERSUndefined: Self = StObject.set(x, "__MIDDLEWARE_MATCHERS", js.undefined)
        
        inline def set__MIDDLEWARE_MATCHERSVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "__MIDDLEWARE_MATCHERS", js.Array(value*))
      }
    }
  }
}
