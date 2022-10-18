package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router extends StObject {
  
  var router: typings.next.distSharedLibRouterRouterMod.Router
}
object Router {
  
  inline def apply(router: typings.next.distSharedLibRouterRouterMod.Router): Router = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router]
  }
  
  extension [Self <: Router](x: Self) {
    
    inline def setRouter(value: typings.next.distSharedLibRouterRouterMod.Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
