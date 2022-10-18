package typings.next.anon

import typings.next.distSharedLibRouterRouterMod.RouteProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As extends StObject {
  
  var as: String
  
  var hasMiddleware: js.UndefOr[Boolean] = js.undefined
  
  var isPreview: Boolean
  
  var locale: js.UndefOr[String] = js.undefined
  
  var pathname: String
  
  var query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
  
  var resolvedAs: String
  
  var route: String
  
  var routeProps: RouteProperties
  
  var unstable_skipClientCache: js.UndefOr[Boolean] = js.undefined
}
object As {
  
  inline def apply(
    as: String,
    isPreview: Boolean,
    pathname: String,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any,
    resolvedAs: String,
    route: String,
    routeProps: RouteProperties
  ): As = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], resolvedAs = resolvedAs.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], routeProps = routeProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[As]
  }
  
  extension [Self <: As](x: Self) {
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setHasMiddleware(value: Boolean): Self = StObject.set(x, "hasMiddleware", value.asInstanceOf[js.Any])
    
    inline def setHasMiddlewareUndefined: Self = StObject.set(x, "hasMiddleware", js.undefined)
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setQuery(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResolvedAs(value: String): Self = StObject.set(x, "resolvedAs", value.asInstanceOf[js.Any])
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteProps(value: RouteProperties): Self = StObject.set(x, "routeProps", value.asInstanceOf[js.Any])
    
    inline def setUnstable_skipClientCache(value: Boolean): Self = StObject.set(x, "unstable_skipClientCache", value.asInstanceOf[js.Any])
    
    inline def setUnstable_skipClientCacheUndefined: Self = StObject.set(x, "unstable_skipClientCache", js.undefined)
  }
}
