package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentRouter extends StObject {
  
  var direction: String
  
  var parentRouter: Router
}
object ParentRouter {
  
  inline def apply(direction: String, parentRouter: Router): ParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentRouter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentRouter] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setParentRouter(value: Router): Self = StObject.set(x, "parentRouter", value.asInstanceOf[js.Any])
  }
}
