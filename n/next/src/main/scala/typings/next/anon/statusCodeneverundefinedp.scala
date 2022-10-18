package typings.next.anon

import typings.next.distLibLoadCustomRoutesMod.RouteHas
import typings.next.nextBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  statusCode :never | undefined,   permanent :boolean} & {  source :string,   destination :string,   basePath :false | undefined,   locale :false | undefined,   has :std.Array<next.next/dist/lib/load-custom-routes.RouteHas> | undefined} */
trait statusCodeneverundefinedp
  extends StObject
     with typings.next.distLibLoadCustomRoutesMod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.undefined
  
  var destination: String
  
  var has: js.UndefOr[js.Array[RouteHas]] = js.undefined
  
  var locale: js.UndefOr[`false`] = js.undefined
  
  var permanent: Boolean
  
  var source: String
  
  var statusCode: js.UndefOr[scala.Nothing] = js.undefined
}
object statusCodeneverundefinedp {
  
  inline def apply(destination: String, permanent: Boolean, source: String): statusCodeneverundefinedp = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[statusCodeneverundefinedp]
  }
  
  extension [Self <: statusCodeneverundefinedp](x: Self) {
    
    inline def setBasePath(value: `false`): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setHas(value: js.Array[RouteHas]): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
    
    inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    inline def setHasVarargs(value: RouteHas*): Self = StObject.set(x, "has", js.Array(value*))
    
    inline def setLocale(value: `false`): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPermanent(value: Boolean): Self = StObject.set(x, "permanent", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
