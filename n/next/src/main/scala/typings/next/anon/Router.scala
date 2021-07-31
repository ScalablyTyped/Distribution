package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Router extends StObject {
  
  var router: typings.next.routerMod.Router
}
object Router {
  
  @scala.inline
  def apply(router: typings.next.routerMod.Router): Router = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Router]
  }
  
  @scala.inline
  implicit class RouterMutableBuilder[Self <: Router] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRouter(value: typings.next.routerMod.Router): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
  }
}
