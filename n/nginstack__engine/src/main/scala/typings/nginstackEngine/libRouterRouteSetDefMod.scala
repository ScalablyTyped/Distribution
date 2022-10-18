package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterRouteSetDefMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/router/RouteSetDef", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with RouteSetDef {
    
    /* CompleteClass */
    var allowedOrigins: js.Array[String] = js.native
    
    /* CompleteClass */
    var apiHelp: ResourceString = js.native
    
    /* CompleteClass */
    var apiName: String = js.native
    
    /* CompleteClass */
    var basePath: String = js.native
    
    /* CompleteClass */
    var controller: String | Double = js.native
    
    /* CompleteClass */
    var debug: Boolean = js.native
    
    /* CompleteClass */
    var groupHelp: ResourceString = js.native
    
    /* CompleteClass */
    var groupName: String = js.native
    
    /* CompleteClass */
    var order: Double = js.native
    
    /* CompleteClass */
    var realm: String | Double = js.native
    
    /* CompleteClass */
    var requiresAuth: Boolean = js.native
    
    /* CompleteClass */
    var routes: js.Array[RouteDef | RouteSetDef] = js.native
    
    /* CompleteClass */
    var scope: String | js.Array[String] = js.native
  }
  @JSImport("@nginstack/engine/lib/router/RouteSetDef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLike(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLike")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ResourceString = typings.nginstackEngine.libI18nResourceStringMod.^
  
  type RouteDef = typings.nginstackEngine.libRouterRouteDefMod.^
  
  trait RouteSetDef extends StObject {
    
    var allowedOrigins: js.Array[String]
    
    var apiHelp: ResourceString
    
    var apiName: String
    
    var basePath: String
    
    var controller: String | Double
    
    var debug: Boolean
    
    var groupHelp: ResourceString
    
    var groupName: String
    
    var order: Double
    
    var realm: String | Double
    
    var requiresAuth: Boolean
    
    var routes: js.Array[RouteDef | RouteSetDef]
    
    var scope: String | js.Array[String]
  }
  object RouteSetDef {
    
    inline def apply(
      allowedOrigins: js.Array[String],
      apiHelp: ResourceString,
      apiName: String,
      basePath: String,
      controller: String | Double,
      debug: Boolean,
      groupHelp: ResourceString,
      groupName: String,
      order: Double,
      realm: String | Double,
      requiresAuth: Boolean,
      routes: js.Array[RouteDef | RouteSetDef],
      scope: String | js.Array[String]
    ): RouteSetDef = {
      val __obj = js.Dynamic.literal(allowedOrigins = allowedOrigins.asInstanceOf[js.Any], apiHelp = apiHelp.asInstanceOf[js.Any], apiName = apiName.asInstanceOf[js.Any], basePath = basePath.asInstanceOf[js.Any], controller = controller.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], groupHelp = groupHelp.asInstanceOf[js.Any], groupName = groupName.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], requiresAuth = requiresAuth.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteSetDef]
    }
    
    extension [Self <: RouteSetDef](x: Self) {
      
      inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
      
      inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
      
      inline def setApiHelp(value: ResourceString): Self = StObject.set(x, "apiHelp", value.asInstanceOf[js.Any])
      
      inline def setApiName(value: String): Self = StObject.set(x, "apiName", value.asInstanceOf[js.Any])
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setController(value: String | Double): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setGroupHelp(value: ResourceString): Self = StObject.set(x, "groupHelp", value.asInstanceOf[js.Any])
      
      inline def setGroupName(value: String): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String | Double): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRequiresAuth(value: Boolean): Self = StObject.set(x, "requiresAuth", value.asInstanceOf[js.Any])
      
      inline def setRoutes(value: js.Array[RouteDef | RouteSetDef]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesVarargs(value: (RouteDef | RouteSetDef)*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    }
  }
}
