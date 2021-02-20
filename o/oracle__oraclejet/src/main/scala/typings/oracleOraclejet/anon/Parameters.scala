package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parameters extends StObject {
  
  var direction: String = js.native
  
  var parameters: js.Object = js.native
  
  var parentRouter: Router = js.native
}
object Parameters {
  
  @scala.inline
  def apply(direction: String, parameters: js.Object, parentRouter: Router): Parameters = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  @scala.inline
  implicit class ParametersMutableBuilder[Self <: Parameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRouter(value: Router): Self = StObject.set(x, "parentRouter", value.asInstanceOf[js.Any])
  }
}
