package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterRouteDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/RouteDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RouteDef {
    
    /* CompleteClass */
    var action: String = js.native
    
    /* CompleteClass */
    var allowedOrigins: js.Array[String] = js.native
    
    /* CompleteClass */
    var controller: String | Double = js.native
    
    /* CompleteClass */
    var debug: Boolean = js.native
    
    /* CompleteClass */
    var method: Method | js.Array[Method] = js.native
    
    /* CompleteClass */
    var order: Double = js.native
    
    /* CompleteClass */
    var path: String = js.native
    
    /* CompleteClass */
    var realm: String | Double = js.native
    
    /* CompleteClass */
    var requiresAuth: Boolean = js.native
    
    /* CompleteClass */
    var scope: String | js.Array[String] = js.native
  }
  @JSImport("@nginstack/engine/lib/router/RouteDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLike(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLike")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type Method = typings.nginstackEngine.libHttpMethodMod.Method
  
  trait RouteDef extends StObject {
    
    var action: String
    
    var allowedOrigins: js.Array[String]
    
    var controller: String | Double
    
    var debug: Boolean
    
    var method: Method | js.Array[Method]
    
    var order: Double
    
    var path: String
    
    var realm: String | Double
    
    var requiresAuth: Boolean
    
    var scope: String | js.Array[String]
  }
  object RouteDef {
    
    inline def apply(
      action: String,
      allowedOrigins: js.Array[String],
      controller: String | Double,
      debug: Boolean,
      method: Method | js.Array[Method],
      order: Double,
      path: String,
      realm: String | Double,
      requiresAuth: Boolean,
      scope: String | js.Array[String]
    ): RouteDef = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], requiresAuth = requiresAuth.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDef]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteDef] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
      
      inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
      
      inline def setController(value: String | Double): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: Method | js.Array[Method]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodVarargs(value: Method*): Self = StObject.set(x, "method", js.Array(value*))
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String | Double): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRequiresAuth(value: Boolean): Self = StObject.set(x, "requiresAuth", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
