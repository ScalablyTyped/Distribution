package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: String
  
  var allowedOrigins: js.Array[String]
  
  var controller: String
  
  var debug: Boolean
  
  var path: String
  
  var realm: String
  
  var requiresAuth: Boolean
}
object Action {
  
  inline def apply(
    action: String,
    allowedOrigins: js.Array[String],
    controller: String,
    debug: Boolean,
    path: String,
    realm: String,
    requiresAuth: Boolean
  ): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], requiresAuth = requiresAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
    
    inline def setController(value: String): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRequiresAuth(value: Boolean): Self = StObject.set(x, "requiresAuth", value.asInstanceOf[js.Any])
  }
}
