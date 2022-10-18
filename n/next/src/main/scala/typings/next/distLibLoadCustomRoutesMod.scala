package typings.next

import typings.next.anon.AfterFiles
import typings.next.anon.Key
import typings.next.distServerConfigSharedMod.NextConfig
import typings.next.nextBooleans.`false`
import typings.next.nextStrings.cookie
import typings.next.nextStrings.header
import typings.next.nextStrings.middleware
import typings.next.nextStrings.query
import typings.next.nextStrings.redirect_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLoadCustomRoutesMod {
  
  @JSImport("next/dist/lib/load-custom-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: NextConfig): js.Promise[CustomRoutes] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CustomRoutes]]
  
  inline def checkCustomRoutes(routes: js.Array[Header | Middleware | Redirect | Rewrite], `type`: RouteType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCustomRoutes")(routes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkCustomRoutes_middleware(routes: js.Array[Header | Middleware | Redirect | Rewrite], `type`: middleware): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkCustomRoutes")(routes.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def normalizeRouteRegex(regex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRouteRegex")(regex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait CustomRoutes extends StObject {
    
    var headers: js.Array[Header]
    
    var redirects: js.Array[Redirect]
    
    var rewrites: AfterFiles
  }
  object CustomRoutes {
    
    inline def apply(headers: js.Array[Header], redirects: js.Array[Redirect], rewrites: AfterFiles): CustomRoutes = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], redirects = redirects.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomRoutes]
    }
    
    extension [Self <: CustomRoutes](x: Self) {
      
      inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setRedirects(value: js.Array[Redirect]): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsVarargs(value: Redirect*): Self = StObject.set(x, "redirects", js.Array(value*))
      
      inline def setRewrites(value: AfterFiles): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    }
  }
  
  trait Header extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var has: js.UndefOr[js.Array[RouteHas]] = js.undefined
    
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
      
      inline def setHas(value: js.Array[RouteHas]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVarargs(value: RouteHas*): Self = StObject.set(x, "has", js.Array(value*))
      
      inline def setHeaders(value: js.Array[Key]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: Key*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Middleware extends StObject {
    
    var has: js.UndefOr[js.Array[RouteHas]] = js.undefined
    
    var locale: js.UndefOr[`false`] = js.undefined
    
    var source: String
  }
  object Middleware {
    
    inline def apply(source: String): Middleware = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Middleware]
    }
    
    extension [Self <: Middleware](x: Self) {
      
      inline def setHas(value: js.Array[RouteHas]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVarargs(value: RouteHas*): Self = StObject.set(x, "has", js.Array(value*))
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.statusCodeneverundefinedp
    - typings.next.anon.statusCodenumberpermanent
  */
  trait Redirect extends StObject
  object Redirect {
    
    inline def statusCodeneverundefinedp(destination: String, permanent: Boolean, source: String): typings.next.anon.statusCodeneverundefinedp = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.statusCodeneverundefinedp]
    }
    
    inline def statusCodenumberpermanent(destination: String, source: String, statusCode: Double): typings.next.anon.statusCodenumberpermanent = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.statusCodenumberpermanent]
    }
  }
  
  trait Rewrite extends StObject {
    
    var basePath: js.UndefOr[`false`] = js.undefined
    
    var destination: String
    
    var has: js.UndefOr[js.Array[RouteHas]] = js.undefined
    
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
      
      inline def setHas(value: js.Array[RouteHas]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setHasVarargs(value: RouteHas*): Self = StObject.set(x, "has", js.Array(value*))
      
      inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.Type
    - typings.next.anon.KeyType
  */
  trait RouteHas extends StObject
  object RouteHas {
    
    inline def KeyType(key: Unit, value: String): typings.next.anon.KeyType = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("host")
      __obj.asInstanceOf[typings.next.anon.KeyType]
    }
    
    inline def Type(key: String, `type`: header | query | cookie): typings.next.anon.Type = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.next.anon.Type]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.rewrite
    - typings.next.nextStrings.redirect_
    - typings.next.nextStrings.header
  */
  trait RouteType extends StObject
  object RouteType {
    
    inline def header: typings.next.nextStrings.header = "header".asInstanceOf[typings.next.nextStrings.header]
    
    inline def redirect: redirect_ = "redirect".asInstanceOf[redirect_]
    
    inline def rewrite: typings.next.nextStrings.rewrite = "rewrite".asInstanceOf[typings.next.nextStrings.rewrite]
  }
}
