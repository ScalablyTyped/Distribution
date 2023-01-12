package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OjRouterParentRouter extends StObject {
  
  var ojRouter: ParentRouter
}
object OjRouterParentRouter {
  
  inline def apply(ojRouter: ParentRouter): OjRouterParentRouter = {
    val __obj = js.Dynamic.literal(ojRouter = ojRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[OjRouterParentRouter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OjRouterParentRouter] (val x: Self) extends AnyVal {
    
    inline def setOjRouter(value: ParentRouter): Self = StObject.set(x, "ojRouter", value.asInstanceOf[js.Any])
  }
}
