package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojrouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters extends StObject {
  
  var direction: String
  
  var parameters: js.Object
  
  var parentRouter: Router
}
object Parameters {
  
  inline def apply(direction: String, parameters: js.Object, parentRouter: Router): Parameters = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parentRouter = parentRouter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
  
  extension [Self <: Parameters](x: Self) {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParentRouter(value: Router): Self = StObject.set(x, "parentRouter", value.asInstanceOf[js.Any])
  }
}
