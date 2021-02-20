package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentRouter extends StObject {
  
  var direction: String = js.native
  
  var parentRouter: Router = js.native
}
object ParentRouter {
  
  @scala.inline
  def apply(direction: String, parentRouter: Router): ParentRouter = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentRouter]
  }
  
  @scala.inline
  implicit class ParentRouterMutableBuilder[Self <: ParentRouter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRouter(value: Router): Self = StObject.set(x, "parentRouter", value.asInstanceOf[js.Any])
  }
}
