package typings.next

import typings.next.anon.AsPath
import typings.next.anon.PagesArray
import typings.next.distBuildAnalysisGetPageStaticInfoMod.MiddlewareMatcher
import typings.next.distClientRouteLoaderMod.RouteLoader
import typings.react.mod.ComponentType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientPageLoaderMod {
  
  @JSImport("next/dist/client/page-loader", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with PageLoader {
    def this(buildId: String, assetPrefix: String) = this()
    
    /**
      * @param {string} route - the route (file-system path)
      */
    /* CompleteClass */
    override def _isSsg(route: String): js.Promise[Boolean] = js.native
    
    /* private */ /* CompleteClass */
    var assetPrefix: Any = js.native
    
    /* private */ /* CompleteClass */
    var buildId: Any = js.native
    
    /* CompleteClass */
    override def getDataHref(params: AsPath): String = js.native
    
    /* CompleteClass */
    override def getMiddleware(): js.UndefOr[js.Array[MiddlewareMatcher] | js.Promise[js.Array[MiddlewareMatcher]]] = js.native
    
    /* CompleteClass */
    override def getPageList(): js.Array[String] | js.Promise[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def loadPage(route: String): js.Promise[GoodPageCache] = js.native
    
    /* CompleteClass */
    override def prefetch(route: String): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var promisedDevPagesManifest: Any = js.native
    
    /* private */ /* CompleteClass */
    var promisedMiddlewareMatchers: Any = js.native
    
    /* private */ /* CompleteClass */
    var promisedSsgManifest: Any = js.native
    
    /* CompleteClass */
    var routeLoader: RouteLoader = js.native
  }
  
  trait GoodPageCache extends StObject {
    
    var mod: Any
    
    var page: ComponentType[js.Object]
    
    var styleSheets: js.Array[StyleSheetTuple]
  }
  object GoodPageCache {
    
    inline def apply(mod: Any, page: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): GoodPageCache = {
      val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoodPageCache]
    }
    
    extension [Self <: GoodPageCache](x: Self) {
      
      inline def setMod(value: Any): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      inline def setPage(value: ComponentType[js.Object]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
      
      inline def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = StObject.set(x, "styleSheets", js.Array(value*))
    }
  }
  
  trait PageLoader extends StObject {
    
    /**
      * @param {string} route - the route (file-system path)
      */
    def _isSsg(route: String): js.Promise[Boolean]
    
    /* private */ var assetPrefix: Any
    
    /* private */ var buildId: Any
    
    def getDataHref(params: AsPath): String
    
    def getMiddleware(): js.UndefOr[js.Array[MiddlewareMatcher] | js.Promise[js.Array[MiddlewareMatcher]]]
    
    def getPageList(): js.Array[String] | js.Promise[js.Array[String]]
    
    def loadPage(route: String): js.Promise[GoodPageCache]
    
    def prefetch(route: String): js.Promise[Unit]
    
    /* private */ var promisedDevPagesManifest: Any
    
    /* private */ var promisedMiddlewareMatchers: Any
    
    /* private */ var promisedSsgManifest: Any
    
    var routeLoader: RouteLoader
  }
  object PageLoader {
    
    inline def apply(
      _isSsg: String => js.Promise[Boolean],
      assetPrefix: Any,
      buildId: Any,
      getDataHref: AsPath => String,
      getMiddleware: () => js.UndefOr[js.Array[MiddlewareMatcher] | js.Promise[js.Array[MiddlewareMatcher]]],
      getPageList: () => js.Array[String] | js.Promise[js.Array[String]],
      loadPage: String => js.Promise[GoodPageCache],
      prefetch: String => js.Promise[Unit],
      promisedDevPagesManifest: Any,
      promisedMiddlewareMatchers: Any,
      promisedSsgManifest: Any,
      routeLoader: RouteLoader
    ): PageLoader = {
      val __obj = js.Dynamic.literal(_isSsg = js.Any.fromFunction1(_isSsg), assetPrefix = assetPrefix.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], getDataHref = js.Any.fromFunction1(getDataHref), getMiddleware = js.Any.fromFunction0(getMiddleware), getPageList = js.Any.fromFunction0(getPageList), loadPage = js.Any.fromFunction1(loadPage), prefetch = js.Any.fromFunction1(prefetch), promisedDevPagesManifest = promisedDevPagesManifest.asInstanceOf[js.Any], promisedMiddlewareMatchers = promisedMiddlewareMatchers.asInstanceOf[js.Any], promisedSsgManifest = promisedSsgManifest.asInstanceOf[js.Any], routeLoader = routeLoader.asInstanceOf[js.Any])
      __obj.asInstanceOf[PageLoader]
    }
    
    extension [Self <: PageLoader](x: Self) {
      
      inline def setAssetPrefix(value: Any): Self = StObject.set(x, "assetPrefix", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: Any): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setGetDataHref(value: AsPath => String): Self = StObject.set(x, "getDataHref", js.Any.fromFunction1(value))
      
      inline def setGetMiddleware(value: () => js.UndefOr[js.Array[MiddlewareMatcher] | js.Promise[js.Array[MiddlewareMatcher]]]): Self = StObject.set(x, "getMiddleware", js.Any.fromFunction0(value))
      
      inline def setGetPageList(value: () => js.Array[String] | js.Promise[js.Array[String]]): Self = StObject.set(x, "getPageList", js.Any.fromFunction0(value))
      
      inline def setLoadPage(value: String => js.Promise[GoodPageCache]): Self = StObject.set(x, "loadPage", js.Any.fromFunction1(value))
      
      inline def setPrefetch(value: String => js.Promise[Unit]): Self = StObject.set(x, "prefetch", js.Any.fromFunction1(value))
      
      inline def setPromisedDevPagesManifest(value: Any): Self = StObject.set(x, "promisedDevPagesManifest", value.asInstanceOf[js.Any])
      
      inline def setPromisedMiddlewareMatchers(value: Any): Self = StObject.set(x, "promisedMiddlewareMatchers", value.asInstanceOf[js.Any])
      
      inline def setPromisedSsgManifest(value: Any): Self = StObject.set(x, "promisedSsgManifest", value.asInstanceOf[js.Any])
      
      inline def setRouteLoader(value: RouteLoader): Self = StObject.set(x, "routeLoader", value.asInstanceOf[js.Any])
      
      inline def set_isSsg(value: String => js.Promise[Boolean]): Self = StObject.set(x, "_isSsg", js.Any.fromFunction1(value))
    }
  }
  
  trait StyleSheetTuple extends StObject {
    
    var href: String
    
    var text: String
  }
  object StyleSheetTuple {
    
    inline def apply(href: String, text: String): StyleSheetTuple = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetTuple]
    }
    
    extension [Self <: StyleSheetTuple](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var __DEV_MIDDLEWARE_MATCHERS: js.UndefOr[js.Array[MiddlewareMatcher]] = js.undefined
      
      var __DEV_PAGES_MANIFEST: js.UndefOr[PagesArray] = js.undefined
      
      var __SSG_MANIFEST: js.UndefOr[Set[String]] = js.undefined
      
      var __SSG_MANIFEST_CB: js.UndefOr[js.Function0[Unit]] = js.undefined
    }
    object Window {
      
      inline def apply(): typings.next.distClientPageLoaderMod.global.Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.next.distClientPageLoaderMod.global.Window]
      }
      
      extension [Self <: typings.next.distClientPageLoaderMod.global.Window](x: Self) {
        
        inline def set__DEV_MIDDLEWARE_MATCHERS(value: js.Array[MiddlewareMatcher]): Self = StObject.set(x, "__DEV_MIDDLEWARE_MATCHERS", value.asInstanceOf[js.Any])
        
        inline def set__DEV_MIDDLEWARE_MATCHERSUndefined: Self = StObject.set(x, "__DEV_MIDDLEWARE_MATCHERS", js.undefined)
        
        inline def set__DEV_MIDDLEWARE_MATCHERSVarargs(value: MiddlewareMatcher*): Self = StObject.set(x, "__DEV_MIDDLEWARE_MATCHERS", js.Array(value*))
        
        inline def set__DEV_PAGES_MANIFEST(value: PagesArray): Self = StObject.set(x, "__DEV_PAGES_MANIFEST", value.asInstanceOf[js.Any])
        
        inline def set__DEV_PAGES_MANIFESTUndefined: Self = StObject.set(x, "__DEV_PAGES_MANIFEST", js.undefined)
        
        inline def set__SSG_MANIFEST(value: Set[String]): Self = StObject.set(x, "__SSG_MANIFEST", value.asInstanceOf[js.Any])
        
        inline def set__SSG_MANIFESTUndefined: Self = StObject.set(x, "__SSG_MANIFEST", js.undefined)
        
        inline def set__SSG_MANIFEST_CB(value: () => Unit): Self = StObject.set(x, "__SSG_MANIFEST_CB", js.Any.fromFunction0(value))
        
        inline def set__SSG_MANIFEST_CBUndefined: Self = StObject.set(x, "__SSG_MANIFEST_CB", js.undefined)
      }
    }
  }
}
