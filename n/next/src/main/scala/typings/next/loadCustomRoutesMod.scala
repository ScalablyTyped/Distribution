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
  
  inline def default(config: js.Any): js.Promise[CustomRoutes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CustomRoutes]]
  
  @JSImport("next/dist/lib/load-custom-routes", "allowedStatusCodes")
  @js.native
  val allowedStatusCodes: Set[Double] = js.native
  
  inline def getRedirectStatus(route: Permanent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRedirectStatus")(route.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def normalizeRouteRegex(regex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRouteRegex")(regex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CustomRoutes extends StObject {
    
    var headers: js.Array[Header]
    
    var redirects: js.Array[Redirect]
    
    var rewrites: js.Array[Rewrite]
  }
  object CustomRoutes {
    
    inline def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: js.Array[Rewrite]): CustomRoutes = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRoutes]
    }
    
    extension [Self <: CustomRoutes](x: Self) {
      
      inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value :_*))
      
      inline def setRewrites(value: js.Array[Rewrite]): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
      
      inline def setRewritesVarargs(value: Rewrite*): Self = StObject.set(x, "rewrites", js.Array(value :_*))
    }
  }
  
  trait Header extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var headers: js.Array[Key]
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var source: String
  }
  object Header {
    
    inline def apply(headers: js.Array[Key], source: String): Header = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setHeaders(value: js.Array[Key]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Key*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Redirect
    extends StObject
       with Rewrite {
    
    var permanent: js.UndefOr[Boolean] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object Redirect {
    
    inline def apply(destination: String, source: String): Redirect = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Redirect]
    }
    
    extension [Self <: Redirect](x: Self) {
      
      inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
      
      inline def setPermanentUndefined: Self = StObject.set(x, "permanent", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait Rewrite extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var destination: String
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var source: String
  }
  object Rewrite {
    
    inline def apply(destination: String, source: String): Rewrite = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rewrite]
    }
    
    extension [Self <: Rewrite](x: Self) {
      
      inline def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.rewrite
    - typings.next.nextStrings.redirect
    - typings.next.nextStrings.header
  */
  trait RouteType extends StObject
  object RouteType {
    
    inline def header: typings.next.nextStrings.header = "header".asInstanceOf[typings.next.nextStrings.header]
    
    inline def redirect: typings.next.nextStrings.redirect = "redirect".asInstanceOf[typings.next.nextStrings.redirect]
    
    inline def rewrite: typings.next.nextStrings.rewrite = "rewrite".asInstanceOf[typings.next.nextStrings.rewrite]
  }
}
