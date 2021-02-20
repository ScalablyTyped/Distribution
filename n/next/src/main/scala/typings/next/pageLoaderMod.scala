package typings.next

import typings.next.nextBooleans.`false`
import typings.next.routeLoaderMod.RouteLoader
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageLoaderMod {
  
  @JSImport("next/dist/client/page-loader", JSImport.Default)
  @js.native
  class default protected () extends PageLoader {
    def this(buildId: String, assetPrefix: String) = this()
  }
  
  @js.native
  trait GoodPageCache extends StObject {
    
    var mod: js.Any = js.native
    
    var page: ComponentType[js.Object] = js.native
    
    var styleSheets: js.Array[StyleSheetTuple] = js.native
  }
  object GoodPageCache {
    
    @scala.inline
    def apply(mod: js.Any, page: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): GoodPageCache = {
      val __obj = js.Dynamic.literal(mod = mod.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
      __obj.asInstanceOf[GoodPageCache]
    }
    
    @scala.inline
    implicit class GoodPageCacheMutableBuilder[Self <: GoodPageCache] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMod(value: js.Any): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage(value: ComponentType[js.Object]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = StObject.set(x, "styleSheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = StObject.set(x, "styleSheets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait PageLoader extends StObject {
    
    /**
      * @param {string} href the route href (file-system path)
      */
    def _isSsg(href: String): js.Promise[Boolean] = js.native
    
    var assetPrefix: js.Any = js.native
    
    var buildId: js.Any = js.native
    
    /**
      * @param {string} href the route href (file-system path)
      * @param {string} asPath the URL as shown in browser (virtual path); used for dynamic routes
      */
    def getDataHref(href: String, asPath: String, ssg: Boolean): String = js.native
    def getDataHref(href: String, asPath: String, ssg: Boolean, locale: String): String = js.native
    @JSName("getDataHref")
    def getDataHref_false(href: String, asPath: String, ssg: Boolean, locale: `false`): String = js.native
    
    def getPageList(): js.Any = js.native
    
    def loadPage(route: String): js.Promise[GoodPageCache] = js.native
    
    def prefetch(route: String): js.Promise[Unit] = js.native
    
    var promisedDevPagesManifest: js.Any = js.native
    
    var promisedSsgManifest: js.Any = js.native
    
    var routeLoader: RouteLoader = js.native
  }
  
  @js.native
  trait StyleSheetTuple extends StObject {
    
    var href: String = js.native
    
    var text: String = js.native
  }
  object StyleSheetTuple {
    
    @scala.inline
    def apply(href: String, text: String): StyleSheetTuple = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleSheetTuple]
    }
    
    @scala.inline
    implicit class StyleSheetTupleMutableBuilder[Self <: StyleSheetTuple] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
