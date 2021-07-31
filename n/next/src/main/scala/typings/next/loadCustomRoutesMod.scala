package typings.next

import typings.next.anon.Key
import typings.next.anon.Permanent
import typings.next.nextBooleans.`false`
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadCustomRoutesMod {
  
  @JSImport("next/dist/lib/load-custom-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: js.Any): js.Promise[CustomRoutes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CustomRoutes]]
  
  @JSImport("next/dist/lib/load-custom-routes", "allowedStatusCodes")
  @js.native
  val allowedStatusCodes: Set[Double] = js.native
  
  @scala.inline
  def getRedirectStatus(route: Permanent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectStatus")(route.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def normalizeRouteRegex(regex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRouteRegex")(regex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CustomRoutes extends StObject {
    
    var headers: js.Array[Header]
    
    var redirects: js.Array[Redirect]
    
    var rewrites: js.Array[Rewrite]
  }
  object CustomRoutes {
    
    @scala.inline
    def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): CustomRoutes = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRoutes]
    }
    
    @scala.inline
    implicit class CustomRoutesMutableBuilder[Self <: CustomRoutes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
      
      @scala.inline
      def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
    }
  }
  
  trait Header extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var headers: js.Array[Key]
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var source: String
  }
  object Header {
    
    @scala.inline
    def apply(headers: js.Array[Key], source: String): Header = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    @scala.inline
    implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Array[Key]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: Key*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Redirect
    extends StObject
       with Rewrite {
    
    var permanent: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object Redirect {
    
    @scala.inline
    def apply(destination: String, source: String): Redirect = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    @scala.inline
    implicit class RedirectMutableBuilder[Self <: Redirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
      
      @scala.inline
      def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait Rewrite extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var destination: String
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var source: String
  }
  object Rewrite {
    
    @scala.inline
    def apply(destination: String, source: String): Rewrite = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rewrite]
    }
    
    @scala.inline
    implicit class RewriteMutableBuilder[Self <: Rewrite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.rewrite
    - typings.next.nextStrings.redirect
    - typings.next.nextStrings.header
  */
  trait RouteType extends StObject
  object RouteType {
    
    @scala.inline
    def header: typings.next.nextStrings.header = "header".asInstanceOf[typings.next.nextStrings.header]
    
    @scala.inline
    def redirect: typings.next.nextStrings.redirect = "redirect".asInstanceOf[typings.next.nextStrings.redirect]
    
    @scala.inline
    def rewrite: typings.next.nextStrings.rewrite = "rewrite".asInstanceOf[typings.next.nextStrings.rewrite]
  }
}
